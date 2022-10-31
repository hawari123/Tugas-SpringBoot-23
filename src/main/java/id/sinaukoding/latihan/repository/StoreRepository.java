package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {
}