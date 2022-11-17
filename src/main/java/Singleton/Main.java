package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Start program!");
        System.out.println("hello, enter of list the size please and value boundary.");
        logger.log("asking user to enter data");
        System.out.println("enter list size:");

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("enter value boundary:");

        int m = Integer.parseInt(scanner.nextLine());

        logger.log("create list");

        List<Integer> list = new ArrayList<>();

        System.out.print("random list:");

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(m);
            list.add(num);
            System.out.print(num + " ");
        }
        System.out.print("\n");

        logger.log("asking user to enter data for filter");
        System.out.println("enter data for filter:");

        int f = Integer.parseInt(scanner.nextLine());

        Filter filter = new Filter(f);

        logger.log("start filter:");
        List<Integer> result = filter.filterOut(list);

        logger.log("output the result");

        System.out.print("output list filter: ");
        for (Integer i : result) {
            System.out.print(i + " ");
        }

        logger.log("End program!");
    }
}
