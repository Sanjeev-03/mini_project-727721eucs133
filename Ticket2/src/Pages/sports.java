package Pages;

import java.util.Scanner;

class SportsEvent {
    private String eventName;
    private int premiumTicketCost;
    private int normalTicketCost;

    public SportsEvent(String eventName, int premiumTicketCost, int normalTicketCost) {
        this.eventName = eventName;
        this.premiumTicketCost = premiumTicketCost;
        this.normalTicketCost = normalTicketCost;
    }

    public String getEventName() {
        return eventName;
    }

    public int getPremiumTicketCost() {
        return premiumTicketCost;
    }

    public int getNormalTicketCost() {
        return normalTicketCost;
    }

    public void displayCostForSeats() {
        System.out.println("            Cost for Seats      ");
        System.out.println(" Premium ticket : Rs " + premiumTicketCost);
        System.out.println(" Normal ticket : Rs " + normalTicketCost);
    }
}

class CricketEvent extends SportsEvent {
    public CricketEvent() {
        super("Cricket Match", 1500, 800);
    }

    @Override
    public void displayCostForSeats() {
        System.out.println("            Cost for Cricket Match Seats      ");
        System.out.println(" Premium ticket : Rs " + getPremiumTicketCost());
        System.out.println(" Normal ticket : Rs " + getNormalTicketCost());
    }
}

class FootballEvent extends SportsEvent {
    public FootballEvent() {
        super("Football Match", 1200, 700);
    }

    @Override
    public void displayCostForSeats() {
        System.out.println("            Cost for Football Match Seats      ");
        System.out.println(" Premium ticket : Rs " + getPremiumTicketCost());
        System.out.println(" Normal ticket : Rs " + getNormalTicketCost());
    }
}

public class sports {
    public static void sport(String username, String choice) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the sports event:");
        System.out.println("1. Cricket Match");
        System.out.println("2. Football Match");
        System.out.print("Enter your choice: ");
        int eventChoice = sc.nextInt();
        sc.nextLine();

        SportsEvent sportsEvent;

        switch (eventChoice) {
            case 1:
                sportsEvent = new CricketEvent();
                break;
            case 2:
                sportsEvent = new FootballEvent();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        sportsEvent.displayCostForSeats();

        System.out.print("Are you sure to buy Tickets (yes/no) : ");
        String ans = sc.nextLine().toLowerCase();

        if (ans.equals("yes") || ans.equals("y")) {
            Seats.seat(username, choice);
        } else {
            System.out.println("Thank You For Visiting");
        }

        sc.close();
    }
}
