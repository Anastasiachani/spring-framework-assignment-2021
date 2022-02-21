package gr.hua.dit.ds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")

public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "password")
    private int password;

    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User() {
    }

    public User(String email) {
        super();
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setId(int password) {

        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + password + ", email=" + email + "]";
    }
}
