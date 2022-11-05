package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<Stocks, Integer> {
    Stocks findByProduct_ProductId(Integer id);
}