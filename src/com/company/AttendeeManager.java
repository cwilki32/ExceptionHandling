package com.company;

public class AttendeeManager {//method

    public Attendee createByID(String id) throws InvalidIDNumberException {//throws add to method signature
        if (id.length() == 8) {
            Attendee attendee = new Attendee(id);
            System.out.println(attendee.getIdNumber() + " created.");
            return attendee;
        } else {
            throw new InvalidIDNumberException("Error creating attendee.Invalid ID Number.");
        }
    }
}
