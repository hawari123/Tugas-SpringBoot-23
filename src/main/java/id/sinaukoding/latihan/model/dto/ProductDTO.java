package id.sinaukoding.latihan.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO extends BaseDTO{
    private Integer productId;

    private String productName;

    private String modelYears;

    private String listPrice;
}