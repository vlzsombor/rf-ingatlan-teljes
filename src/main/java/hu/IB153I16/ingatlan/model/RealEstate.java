package hu.IB153I16.ingatlan.model;

import javax.persistence.*;

@Entity
public class RealEstate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String address;

    @Column
    private String description;

    @Column
    private Long price;

    @Column(nullable = true, length = 64)
    private String photos;

    public RealEstate() {   }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RealEstate(String name, User user, String address, String description, Long price, String photos) {
        this.name = name;
        this.user = user;
        this.address = address;
        this.description = description;
        this.price = price;
        this.photos = photos;
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

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    @Transient
    public String getPhotosImagePath() {
        if (photos == null || id == null) return null;

        return "/realestate-photos/" + id + "/" + photos;
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
