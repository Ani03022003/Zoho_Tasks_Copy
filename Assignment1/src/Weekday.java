import java.util.Scanner;

public class Weekday {
    enum weekdays{
        SUNDAY(0),
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(10),
        THURSDAY(11),
        FRIDAY(12),
        SATURDAY(13);

        private final int index ;

        weekdays(int i) {
            index=i;
        }
    }

    // public static void getWeekday(int choice){
    //     switch (choice) {
    //         case 1: System.out.println(weekdays.SUNDAY);
    //             break;
    //         case 2: System.out.println(weekdays.MONDAY);
    //             break;
    //         case 3: System.out.println(weekdays.TUESDAY);
    //             break;
    //         case 4: System.out.println(weekdays.WEDNESDAY);
    //             break;
    //         case 5: System.out.println(weekdays.THURSDAY);
    //             break;
    //         case 6: System.out.println(weekdays.FRIDAY);
    //             break;
    //         case 7: System.out.println(weekdays.SATURDAY);
    //             break;
    //         default: System.out.println("Select 1 to 7 only.");
    //     }
    // }
    public static void main(String[] args) {
        weekdays[] week=weekdays.values();
        Scanner s=new Scanner(System.in);
        //System.out.println(week[(s.nextInt())-1]);
        System.out.println(weekdays.SATURDAY.ordinal());
        s.close();
    }
}
