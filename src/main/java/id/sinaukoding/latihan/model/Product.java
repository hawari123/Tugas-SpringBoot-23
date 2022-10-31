package id.sinaukoding.latihan.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer productId;

    @Column
    private String productName;

    @Column
    private String modelYears;

    @Column
    private String listPrice;


}