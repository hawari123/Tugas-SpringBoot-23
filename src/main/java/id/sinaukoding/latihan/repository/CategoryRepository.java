package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}