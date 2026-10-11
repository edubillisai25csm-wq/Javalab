
class Reservation {
    int seats = 10;

    synchronized void reserve(int requested, String name) {
        System.out.println(name + " entered.");
        System.out.println("Available seats: " + seats
                + " Requested seats: " + requested);

        if (seats >= requested) {
            System.out.println("Seat Available. Reserve now :-)");
            seats -= requested;
            System.out.println(requested + " seats reserved.");
        } else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(name + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread {
    Reservation r;
    int requested;
    String name;

    Person(Reservation r, int requested, String name) {
        this.r = r;
        this.requested = requested;
        this.name = name;
    }

    public void run() {
        r.reserve(requested, name);
    }
}

public class Week12 {
    public static void main(String[] args) {
        Reservation r = new Reservation();

        Person p1 = new Person(r, 5, "Person-1");
        Person p2 = new Person(r, 2, "Person-2");
        Person p3 = new Person(r, 4, "Person-3");

        p1.start();
        try {
            p1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        p2.start();
        try {
            p2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        p3.start();
    }
}

