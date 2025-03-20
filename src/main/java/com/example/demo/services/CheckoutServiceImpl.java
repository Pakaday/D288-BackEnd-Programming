package com.example.demo.services;

import com.example.demo.dao.CartItemRepository;
import com.example.demo.dao.CartRepository;
import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.Customer;
import com.example.demo.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public CheckoutServiceImpl(CartRepository cartRepository, CartItemRepository cartItemRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // Retrieve cart info from purchase
        Cart cart = purchase.getCart();

        // Check if cart is null
        if (cart == null) {
            return new PurchaseResponse("Cart cannot be empty.");
        }

        // Populate cart with cartItems
        Set<CartItem> cartItems = purchase.getCartItems();

        // Check if cartItems is null or empty
        if (cartItems == null || cartItems.isEmpty()) {
            return new PurchaseResponse("Cart cannot be empty.");
        }

        // Generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        // Setup cart items relationships
        cartItems.forEach(item -> item.setCart(cart));
        cartItems.forEach(item -> cart.add(item));

        // Set status and save to database
        cart.setStatus(StatusType.ordered);
        cartRepository.save(cart);

        // Populate cart with customer
        Customer customer = purchase.getCustomer();
        customer.add(cart);

        // Return successful response with tracking number
        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {

        // Generate a random UUID number (UUID version-4)
        return UUID.randomUUID().toString();
    }
}