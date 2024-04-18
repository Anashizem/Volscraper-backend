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

    public String getId() {
        return id;
    }

    public String getTripType() {
        return tripType;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getStartDateRoundTrip() {
        return startDateRoundTrip;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getEndDateValueRoundTrip() {
        return endDateValueRoundTrip;
    }

    public String getStartDateOneWay() {
        return startDateOneWay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setStartDateRoundTrip(String startDateRoundTrip) {
        this.startDateRoundTrip = startDateRoundTrip;
    }

    public void setEndDateValueRoundTrip(String endDateValueRoundTrip) {
        this.endDateValueRoundTrip = endDateValueRoundTrip;
    }

    public void setStartDateOneWay(String startDateOneWay) {
        this.startDateOneWay = startDateOneWay;
    }



}
