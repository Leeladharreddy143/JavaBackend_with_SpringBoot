package pluralsight.oop;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP"
        );
        berlinToBucharest.print();

        System.out.println();

        //Complete flight plan
        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2023, 03, 05,10,26),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")

        );

        parisToLondon.print();

    }
}
