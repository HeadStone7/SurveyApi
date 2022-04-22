package com.example.demo.SurveyApi;

import javax.persistence.*;

@Entity
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "name")
    private String name;

    @Column(name = "service")
    private String service;

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "whastApp")
    private String whastApp;

    @Column(name = "fb_whst_market_use")
    private String fb_whst_market_use;

    @Column(name = "merch_up")
    private String merch_pub;

    @Column(name = "use_mosungi")
    private String use_mosungi;

    @Column(name = "paye_pub")
    private String paye_pub;

    public Survey() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getWhastApp() {
        return whastApp;
    }

    public void setWhastApp(String whastApp) {
        this.whastApp = whastApp;
    }

    public String getFb_whst_market_use() {
        return fb_whst_market_use;
    }

    public void setFb_whst_market_use(String fb_whst_market_use) {
        this.fb_whst_market_use = fb_whst_market_use;
    }

    public String getMerch_pub() {
        return merch_pub;
    }

    public void setMerch_pub(String merch_pub) {
        this.merch_pub = merch_pub;
    }

    public String getUse_mosungi() {
        return use_mosungi;
    }

    public void setUse_mosungi(String use_mosungi) {
        this.use_mosungi = use_mosungi;
    }

    public String getPaye_pub() {
        return paye_pub;
    }

    public void setPaye_pub(String paye_pub) {
        this.paye_pub = paye_pub;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", service='" + service + '\'' +
                ", facebook='" + facebook + '\'' +
                ", whastApp='" + whastApp + '\'' +
                ", fb_whst_market_use='" + fb_whst_market_use + '\'' +
                ", merch_pub='" + merch_pub + '\'' +
                ", use_mosungi='" + use_mosungi + '\'' +
                ", paye_pub='" + paye_pub + '\'' +
                '}';
    }
}
