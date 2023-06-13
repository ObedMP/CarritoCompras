package sv.com.ApiCarritoCompras.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity(name = "User")
@Table(name = "users")
@Data
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name="idUser",
            updatable = false
    )
    private Integer idUser;

    @Column(
            name = "userName",
            nullable = false
    )
    private String username;

    @Column(
            name = "password",
            nullable = false
    )
    private String pass;

    @Column(name = "role")
    private String Role;

    public User(){}

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
