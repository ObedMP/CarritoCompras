package sv.com.ApiCarritoCompras.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="Prodcuts")
@Table(name="products")
@Getter @Setter
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id",
            updatable = false
    )
    private Integer id;

    @Column(
            name = "product_name",
            nullable = false
    )
    private String productName;

    @Column(name = "product_desc")
    private String productDesc;

    @Column(name = "price")
    private double price;

    public Products(int i, String s) {

    }

    public Products() {

    }

    public void setName(String productName) {

    }

    public void setProductDescription(String productDesc) {

    }

}
