package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}