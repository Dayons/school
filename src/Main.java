import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many lessons do you have? ");
        int lessons = scanner.nextInt();
        if(lessons < 4){
            System.out.println("Error, put more than 3 lessons");
            return;
        }
        System.out.print("How many minutes does 1 lesson goes? ");
        int time = scanner.nextInt();
        System.out.println("At what time does your school starts?");
        System.out.print("hours: ");
        int hours = scanner.nextInt();
        System.out.print("minutes: ");
        int minutes = scanner.nextInt();

        int tem = (((lessons - 1) - 2) * 5) + 20;

        int temp = lessons * time + tem;
        int temp2 = temp / 60;
        int temp3 = temp % 60;
        int temp4 = minutes + temp3;
        if(temp4 > 60) {
            int temp5 = temp4 / 60;
            int temp6 = temp4 % 60;
            int temp7 = hours + temp2 + temp5;
            int temp8 = temp6;
            System.out.println("Your all lessons will finish at " + temp7 + ":" + temp8);
        }
        else {
            System.out.println("Your all lessons will finish at " + (hours + temp2) + ":" + temp4);
        }
    }
}