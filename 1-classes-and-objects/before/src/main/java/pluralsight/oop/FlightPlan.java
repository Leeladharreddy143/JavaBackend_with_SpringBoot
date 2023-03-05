package pluralsight.oop;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


/*
We are modeling a flight plan class.
A flight plan is a document filled by a flight dispatcher prior to departure.
It contains lots of useful information,such as the departure and destination airports or the flight route.
 */

public class FlightPlan {
    //Fields

    String id;
    String departure;
    String destination;
    LocalDateTime departureTime;
    List<String> route;

//I want to always initialize the id, so we will use a no-argument constructor.

   /*
   I am using a private access modifier,because I don't want to instantiate classes using this constructor,
   I just want to make sure it is called internally,so it can set up the id.
    */

private FlightPlan(){
    System.out.println("FlightPlan()");
    this.id = UUID.randomUUID().toString();

}

FlightPlan(String departure, String destination){

    /*
    we also need to generate the id,so we can call the first constructor by using "this" keyword.
     */
    this();

    //checking the arguments
    if (departure == null || destination == null) {
        throw new IllegalArgumentException();
    }

    System.out.println(String.format("FlightPlan(%s, %s)", departure, destination));

    //we are initializing departure and destination.

    this.departure = departure;
    this.destination = destination;

}

//What if we want to initialize all the fields?

    FlightPlan(String departure, String destination, LocalDateTime departureTime, List<String> route) {
        this(departure, destination);

        if (departureTime == null || route == null) {
            throw new IllegalArgumentException();
        }

        System.out.println(String.format("FlightPlan(%s, %s, %s, %s)",
                departure,
                destination,
                departureTime.toLocalTime(),
                route.toString()));

        this.route = route;
        this.departureTime = departureTime;
    }
        public void print() {
            String msg = "{"+
                    " id='" + this.id + '\'' +
                    ", departure='" + this.departure + '\''+
                    ", destination='" + this.destination + '\''+
                    ", departureDateTime=" + this.departureTime+
                    ", route="+ this.route +
                    "}";

                System.out.println(msg);
        }



    }

