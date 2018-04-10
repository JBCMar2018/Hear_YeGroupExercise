package com.Sainz;

import java.util.ArrayList;

public class Speaker {
    private String speakerName;

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    //default constructor
    public Speaker () {
    }

    //overloaded constructor
    public Speaker(String speakerName) {
        this.speakerName = speakerName;
    }
}




    /*

    public ArrayList<Event> getTheEvents() {
        return theEvents;
    }

    public void setTheEvents(ArrayList<Event> theEvents) {
        this.theEvents = theEvents;
    }

    //add private Array List
    private ArrayList<Event> theEvents;


    //default constructor
    public Speaker() {

    theEvents = new ArrayList<>();
}
    //overloaded constructor
    public Speaker(String speakerName) {
        this.speakerName = speakerName;
        theEvents = new ArrayList<>();
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public void addEvent(Event event)
    {
        theEvents.add(event);
    }
}
*/