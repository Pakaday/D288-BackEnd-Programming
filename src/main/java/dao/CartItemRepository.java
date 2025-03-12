package dao;

import entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200") // Allow Angular to access this endpoint
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
