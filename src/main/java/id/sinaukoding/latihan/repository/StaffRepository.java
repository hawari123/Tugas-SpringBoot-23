package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}