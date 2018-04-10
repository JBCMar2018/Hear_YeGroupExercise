package com.Sainz;

import java.util.ArrayList;

public class Event {
    private Integer eventNumber;
    private String eventName;
    private String startDate;
    private String endDate;
    private ArrayList<Speaker> theSpeakers;


    //default constructor
    public Event() {
        theSpeakers = new ArrayList<>();
    }
    //overloaded constructor
    public Event(Integer eventNumber, String eventName, String startDate, String endDate) {
        this.eventNumber = eventNumber;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        theSpeakers = new ArrayList<>();
    }

    public Integer getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(Integer eventNumber) {
        this.eventNumber = eventNumber;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Speaker> getTheSpeakers() {
        return theSpeakers;
    }

    public void setTheSpeakers(ArrayList<Speaker> theSpeakers) {
        this.theSpeakers = theSpeakers;
    }

    public void addSpeaker(Speaker speaker)
    {
        theSpeakers.add(speaker);
    }
}
