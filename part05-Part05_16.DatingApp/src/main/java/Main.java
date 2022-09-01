
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is ");

        SimpleDate newDate = date.afterNumberOfDays(7);
        System.out.println("Now: " + date);
        System.out.println("After one week: " + newDate);
    }
}

