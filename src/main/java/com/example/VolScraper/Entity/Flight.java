package com.example.VolScraper.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "vols_scrapées")
public class Flight {
    @Id
    private String id;
    @Field("demande")
    private String demande;
    private String agence;
    private String outward_departure_place;
    private String outward_arrival_place;
    private String outward_price;
    private String outward_time;
    private String duration_outward;
    private String outward_date;
    private String return_departure_place;
    private String return_arrival_place;
    private String return_price;
    private String return_time;
    private String duration_return;
    private String return_date;
    private String url_of_vol;

    public Flight() {
    }

    public Flight(String id, String demande, String agence, String outward_departure_place, String outward_arrival_place, String outward_price, String outward_time, String duration_outward, String outward_date, String return_departure_place, String return_arrival_place, String return_price, String return_time, String duration_return, String return_date, String url_of_vol) {
        this.id = id;
        this.demande = demande;
        this.agence = agence;
        this.outward_departure_place = outward_departure_place;
        this.outward_arrival_place = outward_arrival_place;
        this.outward_price = outward_price;
        this.outward_time = outward_time;
        this.duration_outward = duration_outward;
        this.outward_date = outward_date;
        this.return_departure_place = return_departure_place;
        this.return_arrival_place = return_arrival_place;
        this.return_price = return_price;
        this.return_time = return_time;
        this.duration_return = duration_return;
        this.return_date = return_date;
        this.url_of_vol = url_of_vol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getdemande() {
        return demande;
    }

    public void setDemande(String demande) {
        this.demande = demande;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public String getOutward_departure_place() {
        return outward_departure_place;
    }

    public void setOutward_departure_place(String outward_departure_place) {
        this.outward_departure_place = outward_departure_place;
    }

    public String getOutward_arrival_place() {
        return outward_arrival_place;
    }

    public void setOutward_arrival_place(String outward_arrival_place) {
        this.outward_arrival_place = outward_arrival_place;
    }

    public String getOutward_price() {
        return outward_price;
    }

    public void setOutward_price(String outward_price) {
        this.outward_price = outward_price;
    }

    public String getOutward_time() {
        return outward_time;
    }

    public void setOutward_time(String outward_time) {
        this.outward_time = outward_time;
    }

    public String getDuration_outward() {
        return duration_outward;
    }

    public void setDuration_outward(String duration_outward) {
        this.duration_outward = duration_outward;
    }

    public String getOutward_date() {
        return outward_date;
    }

    public void setOutward_date(String outward_date) {
        this.outward_date = outward_date;
    }

    public String getReturn_departure_place() {
        return return_departure_place;
    }

    public void setReturn_departure_place(String return_departure_place) {
        this.return_departure_place = return_departure_place;
    }

    public String getReturn_arrival_place() {
        return return_arrival_place;
    }

    public void setReturn_arrival_place(String return_arrival_place) {
        this.return_arrival_place = return_arrival_place;
    }

    public String getReturn_price() {
        return return_price;
    }

    public void setReturn_price(String return_price) {
        this.return_price = return_price;
    }

    public String getReturn_time() {
        return return_time;
    }

    public void setReturn_time(String return_time) {
        this.return_time = return_time;
    }

    public String getDuration_return() {
        return duration_return;
    }

    public void setDuration_return(String duration_return) {
        this.duration_return = duration_return;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getUrl_of_vol() {
        return url_of_vol;
    }

    public void setUrl_of_vol(String url_of_vol) {
        this.url_of_vol = url_of_vol;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", demande='" + demande + '\'' +
                ", agence='" + agence + '\'' +
                ", outward_departure_place='" + outward_departure_place + '\'' +
                ", outward_arrival_place='" + outward_arrival_place + '\'' +
                ", outward_price='" + outward_price + '\'' +
                ", outward_time='" + outward_time + '\'' +
                ", duration_outward='" + duration_outward + '\'' +
                ", outward_date='" + outward_date + '\'' +
                ", return_departure_place='" + return_departure_place + '\'' +
                ", return_arrival_place='" + return_arrival_place + '\'' +
                ", return_price='" + return_price + '\'' +
                ", return_time='" + return_time + '\'' +
                ", duration_return='" + duration_return + '\'' +
                ", return_date='" + return_date + '\'' +
                ", url_of_vol='" + url_of_vol + '\'' +
                '}';
    }
}