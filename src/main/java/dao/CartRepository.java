package dao;

import entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200") // Allow Angular to access this endpoint
public interface CartRepository extends JpaRepository<Cart, Long> {
}
