package com.company;

public class AttendeeDemo {

    public static void main(String[] args) {
        // create an integer array with a size of 4
//        int[] numArray = new int[4];
//        //add code as specified
//
//        try {
//            System.out.println("Before exception is generated");
//            numArray[2] = 10;
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Index out-of-bonds!");
//        }
//        System.out.println("After catch statement is executed");
        //crate (3) classes named Attendee, attendeemanager, and invalid id number exception
        //change the name of your main class to attendee demo
        //attendee should have (1) string property: an idNumber and a constructor which accepts as parameter
        //attendeee maanger should have 1 method: create byid(stringid), which accepts a stringa nd returns an attendee
        //Invalid ID number exception should extend exception and should have a constructor which accepts a string message as a parameter,
        //the constroctur should call super(message)
        //
        //If the ID number is 8 characters in length, createByID(String id) should instantiate and return
        //a new Attendee with the specified IDnumber
        //If not 8 characters in length, message shouldbe: Error creating attendee.Invalid ID Number.")
        //NOTE: You need a throws clause un your method signature
        //In atendee Demo, instantiate a new Attendee Manager and, inside of a try block, call its creabyID method
        //Set up a catch statement to catch invalidnumberexception
        //In your catch statement, print out the exception's stack trace using the printStackTrace method

        AttendeeManager attendeeManager = new AttendeeManager();
        try {
            attendeeManager.createByID("12345678");
        } catch (InvalidIDNumberException e) {
            e.printStackTrace();
        }


    }
}
