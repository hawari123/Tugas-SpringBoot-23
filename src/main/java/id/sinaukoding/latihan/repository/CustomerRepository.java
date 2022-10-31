package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}