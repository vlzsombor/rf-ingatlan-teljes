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
    private String cim;


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

    @Column
    //@NotNull
    private Long hazszam;

    @Column
    @NotBlank
    private String megye;

    @Column
    @NotBlank
    private String telepulesNev;

    @Column
    @NotNull
    private Long iranyitoSzam;

    @Column
    @NotBlank
    private String ingatlanTipus;
    @Column
    @NotBlank
    private String hirdetesTipus;


    public RealEstate() {   }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RealEstate(Long id, @NotBlank String cim, User user, @NotBlank String hirdetesTipus, @NotBlank String ingatlanTipus,  @NotNull Long price, @NotBlank String megye,@NotNull Long iranyitoSzam, @NotBlank String telepulesNev, @NotBlank String address, @NotNull Long hazszam, @NotBlank String description) {
        this.id = id;
        this.cim = cim;
        this.ingatlanTipus = ingatlanTipus;
        this.hirdetesTipus = hirdetesTipus;
        this.user = user;
        this.iranyitoSzam=iranyitoSzam;
        this.address = address;
        this.description = description;
        this.price = price;
        this.hazszam = hazszam;
        this.megye = megye;
        this.telepulesNev = telepulesNev;
    }

    public void setHazszam(Long hazszam) {
        this.hazszam = hazszam;
    }

    public void setMegye(String megye) {
        this.megye = megye;
    }

    public String getIngatlanTipus() {
        return ingatlanTipus;
    }

    public void setIngatlanTipus(String ingatlanTipus) {
        this.ingatlanTipus = ingatlanTipus;
    }

    public String getHirdetesTipus() {
        return hirdetesTipus;
    }

    public void setHirdetesTipus(String hirdetesTipus) {
        this.hirdetesTipus = hirdetesTipus;
    }

    public Long getIranyitoSzam() {
        return iranyitoSzam;
    }

    public void setIranyitoSzam(Long iranyitoSzam) {
        this.iranyitoSzam = iranyitoSzam;
    }

    public void setTelepulesNev(String telepulesNev) {
        this.telepulesNev = telepulesNev;
    }

    public Long getHazszam() {
        return hazszam;
    }

    public String getMegye() {
        return megye;
    }

    public String getTelepulesNev() {
        return telepulesNev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
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
                ", cim='" + cim + '\'' +
                ", user=" + user +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", hazszam=" + hazszam +
                ", megye='" + megye + '\'' +
                ", telepulesNev='" + telepulesNev + '\'' +
                ", iranyitoSzam=" + iranyitoSzam +
                ", ingatlanTipus='" + ingatlanTipus + '\'' +
                ", hirdetesTipus='" + hirdetesTipus + '\'' +
                '}';
    }
}
