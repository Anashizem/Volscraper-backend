package com.example.VolScraper.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "demandes_de_recherche_de_vols")

public class Searchs {
    @Id
    private String id;
    private String user_id;
    private String tripType;
    private String from;
    private String to;
    private String startDateRoundTrip;
    private String endDateValueRoundTrip;
    private String startDateOneWay;

    public Searchs() {
    }

    public Searchs(String id, String user_id, String tripType, String from, String to, String startDateRoundTrip, String endDateValueRoundTrip, String startDateOneWay) {
        this.id = id;
        this.user_id = user_id;
        this.tripType = tripType;
        this.from = from;
        this.to = to;
        this.startDateRoundTrip = startDateRoundTrip;
        this.endDateValueRoundTrip = endDateValueRoundTrip;
        this.startDateOneWay = startDateOneWay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getStartDateRoundTrip() {
        return startDateRoundTrip;
    }

    public void setStartDateRoundTrip(String startDateRoundTrip) {
        this.startDateRoundTrip = startDateRoundTrip;
    }

    public String getEndDateValueRoundTrip() {
        return endDateValueRoundTrip;
    }

    public void setEndDateValueRoundTrip(String endDateValueRoundTrip) {
        this.endDateValueRoundTrip = endDateValueRoundTrip;
    }

    public String getStartDateOneWay() {
        return startDateOneWay;
    }

    public void setStartDateOneWay(String startDateOneWay) {
        this.startDateOneWay = startDateOneWay;
    }

    @Override
    public String toString() {
        return "Search{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", tripType='" + tripType + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", startDateRoundTrip='" + startDateRoundTrip + '\'' +
                ", endDateValueRoundTrip='" + endDateValueRoundTrip + '\'' +
                ", startDateOneWay='" + startDateOneWay + '\'' +
                '}';
    }
}