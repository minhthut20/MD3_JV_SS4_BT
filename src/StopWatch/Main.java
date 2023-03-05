package StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice!=0) {
            System.out.println("Input your choice");
            System.out.println("1. Show the start time");
            System.out.println("2. Show the end time");
            System.out.println("3. Show the difference of time");
            System.out.println("0. Exit");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    watch.start();
                    System.out.println("Start time: " + watch.getStartTime());
                    break;
                case 2:
                    watch.stop();
                    System.out.println("End time: " + watch.getEndTime());
                    break;

                case 3:
                    if(watch.getStartTime()==0||watch.getEndTime()==0) {
                        System.out.println("You have to show start time and end time");
                    } else {
                        System.out.println("Elapsed time is: " + watch.getElapsedTime());
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
