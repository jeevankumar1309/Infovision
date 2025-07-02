package callRecords_Analyzer;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Analyzer_App {

    public static void main(String[] args) {
        TelecomAnalyzer analyzer = new TelecomAnalyzer();
        Scanner scanner = new Scanner(System.in);

        
        analyzer.addCallRecord(new CallRecord("Ravi", "Sita", 200, "Jio", "Chennai", LocalDateTime.now().minusHours(2)));
        analyzer.addCallRecord(new CallRecord("Priya", "Ajith", 180, "Airtel", "Bangalore", LocalDateTime.now().minusHours(1)));
        analyzer.addCallRecord(new CallRecord("Krishna", "Lakshmi", 400, "BSNL", "Hyderabad", LocalDateTime.now().minusMinutes(30)));
        analyzer.addCallRecord(new CallRecord("Anjali", "Mohan", 250, "Idea", "Trivandrum", LocalDateTime.now().minusMinutes(15)));
        //analyzer.addCallRecord(new CallRecord("Siva", "Rajesh", 270, "Airtel", "Madurai", LocalDateTime.now().minusMinutes(45)));

        while (true) {
            System.out.println("\nTelecom Call Records Analyzer:");
            System.out.println("1. View all call records");
            System.out.println("2. View sorted by longest duration");
            System.out.println("3. View frequent callers");
            System.out.println("4. Filter calls by operator");
            System.out.println("5. Group calls by operator");
            System.out.println("6. Group calls by location");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    analyzer.printAllRecords();
                    break;
                case 2:
                    analyzer.getCallsSortedByDuration().forEach(System.out::println);
                    break;
                case 3:
                    analyzer.getFrequentCallers().forEach((caller, count) -> 
                        System.out.println(caller + " made " + count + " calls."));
                    break;
                case 4:
                    System.out.print("Enter the operator name to filter by: ");
                    String operator = scanner.nextLine();
                    analyzer.getCallsByOperator(operator).forEach(System.out::println);
                    break;
                case 5:
                    analyzer.groupCallsByOperator().forEach((operatorGroup, records) -> {
                        System.out.println("Operator: " + operatorGroup);
                        records.forEach(System.out::println);
                    });
                    break;
                case 6:
                    analyzer.groupCallsByLocation().forEach((locationGroup, records) -> {
                        System.out.println("Location: " + locationGroup);
                        records.forEach(System.out::println);
                    });
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

