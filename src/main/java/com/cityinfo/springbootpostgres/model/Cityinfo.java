package com.cityinfo.springbootpostgres.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cityinfo")
public class Cityinfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "city")
    private String city;

    @Column(name = "startdate")
    private Date startdate;

    @Column(name = "enddate")
    private Date enddate;

    @Column(name = "color")
    private String color;

    @Column(name = "status")
    private String status;

    @Column(name = "price")
    private String price;

    public long getId() {
        return id;
    }

    public Cityinfo() {
        super();
    }

    public Cityinfo(String city, Date startdate, Date enddate, String color, String status, String price) {
        this.city = city;
        this.startdate = startdate;
        this.enddate = enddate;
        this.color = color;
        this.status = status;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
