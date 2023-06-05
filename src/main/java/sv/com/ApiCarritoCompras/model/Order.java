package sv.com.ApiCarritoCompras.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "Order")
@Table(name = "orders")
@Data @AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorder")
    private Integer idOrder;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;

    @Column(name = "order_status")
    private String orderStat;

    @Column(name = "totalm")
    private double totalamount;

    public Order(int i, User user, String orderStat, double totalamount) {

    }

    public Order() {
    }

    public Integer getIdOrder() {
        return idOrder;
    }
}
