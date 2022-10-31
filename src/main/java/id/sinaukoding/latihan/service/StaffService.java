package id.sinaukoding.latihan.service;

import id.sinaukoding.latihan.model.Staff;
import id.sinaukoding.latihan.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository repository;

    @Transactional(readOnly = true)
    public List<Staff> findAll(){
        return repository.findAll();
    }
}