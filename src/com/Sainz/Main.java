package com.Sainz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean eventDone = false;
        boolean speakerDone = false;
        Speaker newSpeaker;
        // Institution anInstitution;
        Event newEvent;
        String name="";
        String eventAnswer = "";
        String speakerAnswer = "";

        ArrayList<Event> allEvents = new ArrayList<>();


        do {

            newEvent = new Event();
            System.out.println("Enter the event number: ");
            newEvent.setEventNumber(keyboard.nextInt());
            eventAnswer = keyboard.nextLine();

            System.out.println("Enter the event name: ");
            newEvent.setEventName(keyboard.nextLine());

            System.out.println("Enter the event start date: ");
            newEvent.setStartDate(keyboard.nextLine());

            System.out.println("Enter the event end date: ");
            newEvent.setEndDate(keyboard.nextLine());

            //System.out.println("Your institution is called:"+anInstitution.getName());


            System.out.println("Your event information: ");
            System.out.println("Event number: " + newEvent.getEventNumber() + '\n' + "Event name: " + newEvent.getEventName()
                    + '\n' + "Event start date: " + newEvent.getStartDate() + '\n' + "Event end date: " + newEvent.getEndDate());


            do {
                newSpeaker = new Speaker();
                System.out.println('\n' + "Enter information for a speaker: ");


                System.out.println('\n' + "Enter the speaker's name: ");
                newSpeaker.setSpeakerName(keyboard.nextLine());

                newEvent.addSpeaker(newSpeaker);

                System.out.println("Do you want to enter information for another speaker? (Y/N)");
                speakerAnswer = keyboard.nextLine();
                if (speakerAnswer.equalsIgnoreCase("y")) {
                    speakerDone = true;
                } else {
                    speakerDone = false;
                }
            } while (speakerDone);

            allEvents.add(newEvent);
            //System.out.println(newEvent.getTheSpeakers());

            System.out.println("Do you want to enter another event? (Y/N)");
            eventAnswer = keyboard.nextLine();
            if (eventAnswer.equalsIgnoreCase("y")) {
                eventDone = true;
            } else {
                eventDone = false;
            }
        } while (eventDone);


        for (Event eachEvent : allEvents) {
            System.out.println('\n' + "Event: " + "" + eachEvent.getEventName() + '\n' + "Event number: " + eachEvent.getEventNumber());
            for (Speaker eachSpeaker : eachEvent.getTheSpeakers()) {
                System.out.println('\n' + "These are the speakers for: " + "" + eachEvent.getEventName() + '\n' + "Speaker name:" + eachSpeaker.getSpeakerName());
            }
        }

        System.out.println('\n' + "What event number would you like to get information about?");
        Integer x;
        x = keyboard.nextInt();
        keyboard.nextLine();

            for (Event eachEvent : allEvents) {
                // System.out.println(eachEvent.getEventNumber());
                if (eachEvent.getEventNumber() == x) {
                    for (Speaker eachSpeaker : eachEvent.getTheSpeakers()) {
                        System.out.println('\n' + "These are the speakers for: " + "" + eachEvent.getEventName() + '\n' + "Speaker name:" + eachSpeaker.getSpeakerName());

                    }
                }

            }

        System.out.println('\n' + "What Speaker would you like to get information about?");
        name = keyboard.nextLine();
        for (Event eachEvent : allEvents) {
            if (eachEvent.getTheSpeakers().equals(name)){
                for (Speaker eachSpeaker : eachEvent.getTheSpeakers()) {
                    System.out.println('\n' + "These are the speakers for: " + "" + eachEvent.getEventName() + '\n' + "Speaker name:" + eachSpeaker.getSpeakerName());

                }
            }

        }

        }

}



