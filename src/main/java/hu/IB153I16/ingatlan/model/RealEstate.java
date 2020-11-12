package hu.IB153I16.ingatlan.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class RealEstate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String name;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    @NotBlank
    private String address;

    @Column
    @NotBlank
    private String description;

    @Column
    @NotNull
    private Long price;



    public RealEstate() {   }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RealEstate(String name, User user, String address, String description, Long price) {
        this.name = name;
        this.user = user;
        this.address = address;
        this.description = description;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
