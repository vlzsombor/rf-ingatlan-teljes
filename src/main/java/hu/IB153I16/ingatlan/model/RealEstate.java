package hu.IB153I16.ingatlan.model;

import hu.IB153I16.ingatlan.utils.constant.URLPATH;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

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
    @NotNull
    private Long meret;

    @Column
    @NotNull
    private Long szobakSzama;

    @Column
    @NotBlank
    private String ingatlanTipus;
    @Column
    @NotBlank
    private String hirdetesTipus;

    @Column
    //@NotBlank
    private Long telekMeret;

    @Column
    //@NotBlank
    private String hazTipus;

    @Column
    //@NotBlank
    private Long felszobakSzama;

    @Column
    //@NotBlank
    private Long lakasTipusa;

    @Column
    //@NotBlank
    private Boolean isGepesitett;

    @Column
    //@NotBlank
    private Boolean isPanelprogram;

    @Column(nullable = true, length = 64)
    private String photos;

    public RealEstate() {   }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RealEstate(Long id, @NotBlank String cim, User user, @NotBlank String hirdetesTipus, @NotBlank String ingatlanTipus,String hazTipus,  @NotNull Long price, @NotNull Long meret,  @NotNull Long szobakSzama,@NotNull Long felszobakSzama ,@NotBlank String megye,@NotNull Long iranyitoSzam, @NotBlank String telepulesNev, @NotBlank String address, @NotNull Long hazszam, @NotBlank String description) {
        this.id = id;
        this.cim = cim;
        this.szobakSzama = szobakSzama;
        this.meret = meret;
        this.hazTipus = hazTipus;
        this.felszobakSzama = felszobakSzama;
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

    public Long getMeret() {
        return meret;
    }

    public void setMeret(Long meret) {
        this.meret = meret;
    }

    public Long getTelekMeret() {
        return telekMeret;
    }

    public void setTelekMeret(Long telekMeret) {
        this.telekMeret = telekMeret;
    }

    public Long getSzobakSzama() {
        return szobakSzama;
    }

    public String getHazTipus() {
        return hazTipus;
    }

    public void setHazTipus(String hazTipus) {
        this.hazTipus = hazTipus;
    }

    public Long getFelszobakSzama() {
        return felszobakSzama;
    }

    public void setFelszobakSzama(Long felszobakSzama) {
        this.felszobakSzama = felszobakSzama;
    }

    public Long getLakasTipusa() {
        return lakasTipusa;
    }

    public void setLakasTipusa(Long lakasTipusa) {
        this.lakasTipusa = lakasTipusa;
    }

    public Boolean getGepesitett() {
        return isGepesitett;
    }

    public void setGepesitett(Boolean gepesitett) {
        isGepesitett = gepesitett;
    }

    public Boolean getPanelprogram() {
        return isPanelprogram;
    }

    public void setPanelprogram(Boolean panelprogram) {
        isPanelprogram = panelprogram;
    }

    public void setSzobakSzama(Long szobakSzama) {
        this.szobakSzama = szobakSzama;
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

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    @Transient
    public String getPhotosImagePath() {
        if (photos == null || id == null) return null;

        return "/" + URLPATH.PHOTOS_RELATIVE_PATH + id + "/" + photos;
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
                ", meret=" + meret +
                ", szobakSzama=" + szobakSzama +
                ", ingatlanTipus='" + ingatlanTipus + '\'' +
                ", hirdetesTipus='" + hirdetesTipus + '\'' +
                ", telekMeret=" + telekMeret +
                ", hazTipus='" + hazTipus + '\'' +
                ", felszobakSzama=" + felszobakSzama +
                ", lakasTipusa=" + lakasTipusa +
                ", isGepesitett=" + isGepesitett +
                ", isPanelprogram=" + isPanelprogram +
                ", photos='" + photos + '\'' +
                '}';
    }
}
