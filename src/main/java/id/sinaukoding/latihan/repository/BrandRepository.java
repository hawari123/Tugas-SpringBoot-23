package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}