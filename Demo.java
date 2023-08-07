import java.util.Scanner;

public class Demo {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine();
        if ((name.strip().length()) <= 0 ) {
            System.out.println("\033[31m\033[1mInvalid Name Input!\033[0m");
            return;
        }
        
        System.out.print("\nEnter Your Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 10 || age > 18) {
            System.out.println("\033[31m\033[1mInvalid Age Input!\033[0m");
            return;
        }
        
        System.out.print("\nEnter Your Subject 1 (Ex -> SE-1): ");
        String subject1 = scanner.nextLine();
        if (!subject1.startsWith("SE-") || (subject1.strip().length()) <= 0 ) {
            System.out.println("\033[31m\033[1mInvalid Subject Format Input!\033[0m");
            return;
        }
        
        System.out.print("\nEnter Your Marks 1: ");
        double marks1 = scanner.nextDouble();
        scanner.nextLine();
        if (marks1 < 0 || marks1 > 100) {
            System.out.println("\033[31m\033[1mInvalid Marks Input!\033[0m");
            return;
        }
        
        System.out.print("\nEnter Your Subject 2 (Ex -> SE-2): ");
        String subject2 = scanner.nextLine();
        if (!subject2.startsWith("SE-") || (subject2.strip().length()) <= 0) {
            System.out.println("\033[31m\033[1mInvalid Subject Format Input!\033[0m");
            return;
        }
        if (subject1.equals(subject2)){
            System.out.println("\033[31m\033[1mThis Subject Name Already Entered!\033[0m");
            return;
        }
        
        System.out.print("\nEnter Your Marks 2: ");
        double marks2 = scanner.nextDouble();
        scanner.nextLine();
        if (marks2 < 0 || marks2 > 100) {
            System.out.println("\033[31m\033[1mInvalid Marks Input!\033[0m");
            return;
        }
        
        System.out.print("\nEnter Your Subject 3 (Ex -> SE-3): ");
        String subject3 = scanner.nextLine();
        if (!subject3.startsWith("SE-") || (subject3.strip().length()) <= 0){
            System.out.println("\033[31m\033[1mInvalid Subject Format Input!\033[0m");
            return;
        }
        if (subject1.equals(subject3) || subject2.equals(subject3)){
            System.out.println("\033[31m\033[1mThis Subject Name Already Entered!\033[0m");
            return;
        }

        System.out.print("\nEnter Your Marks 3: ");
        double marks3 = scanner.nextDouble();
        scanner.nextLine();
        if (marks3 < 0 || marks3 > 100) {
            System.out.println("\033[31m\033[1mInvalid Marks Input!\033[0m");
            return;
        }

        String subject1Status;
        if (marks1 >= 75){
            subject1Status = "\033[1m\033[34mDestinguished Pass(DP)\033[0m";
        }else if (marks1 >= 65){
            subject1Status = "\033[1m\033[32mCredit Pass(CP)\033[0m";
        }else if (marks1 >= 55){
            subject1Status = "\033[1m\033[33mPass(P)\033[0m";
        }else subject1Status = "\033[1m\033[31mFail(F)\033[0m"; 

        String subject2Status;
        if (marks2 >= 75){
            subject2Status = "\033[1m\033[34mDestinguished Pass(DP)\033[0m";
        }else if (marks2 >= 65){
            subject2Status = "\033[1m\033[32mCredit Pass(CP)\033[0m";
        }else if (marks2 >= 55){
            subject2Status = "\033[1m\033[33mPass(P)\033[0m";
        }else subject2Status = "\033[1m\033[31mFail(F)\033[0m"; 

        String subject3Status;
        if (marks3 >= 75){
            subject3Status = "\033[1m\033[34mDestinguished Pass(DP)\033[0m";
        }else if (marks3 >= 65){
            subject3Status = "\033[1m\033[32mCredit Pass(CP)\033[0m";
        }else if (marks3 >= 55){
            subject3Status = "\033[1m\033[33mPass(P)\033[0m";
        }else subject3Status = "\033[1m\033[31mFail(F)\033[0m";       


        Double totalMarks = marks1 + marks2 + marks3;
        double avgMarks = totalMarks / 3;
        String finalStatus;
        if (avgMarks >= 75){
            finalStatus = "\033[1m\033[34mDestinguished Pass(DP)\033[0m";
        }else if (avgMarks >= 65){
            finalStatus = "\033[1m\033[32mCredit Pass(CP)\033[0m";
        }else if (avgMarks >= 55){
            finalStatus = "\033[1m\033[33mPass(P)\033[0m";
        }else finalStatus = "\033[1m\033[31mFail(F)\033[0m";


        System.out.println("+" + "-".repeat(52) + "+");
        System.out.printf("| \033[1mName : \033[34m%-44s\033[0m|\n", name.toUpperCase());
        System.out.printf("| \033[1mAge : \033[31m%-3s\033[0m%-42s|\n", age, "years old");
        System.out.printf("| \033[1mStatus : \033[31m%-55s\033[0m|\n", finalStatus);
        System.out.printf("| \033[1mTotal :\033[0m %-15.2f \033[1mAverage :\033[0m %-6.2f%-11s\033[0m|\n", totalMarks, avgMarks, "%");
        System.out.printf("+" + "-".repeat(10) + "+" + "-".repeat(17) + "+" + "-".repeat(23) + "+\n");
        System.out.printf("| %-9s| %-16s| %-22s|\n", "Subject", "Marks", "Status");
        System.out.printf("+" + "-".repeat(10) + "+" + "-".repeat(17) + "+" + "-".repeat(23) + "+\n");
        System.out.printf("| SE- %03d  | %-16.2f| %-35s|\n", Integer.parseInt(subject1.substring(3)), marks1, subject1Status);
        System.out.printf("| SE- %03d  | %-16.2f| %-35s|\n", Integer.parseInt(subject2.substring(3)), marks2, subject2Status);
        System.out.printf("| SE- %03d  | %-16.2f| %-35s|\n", Integer.parseInt(subject3.substring(3)), marks3, subject3Status);
        System.out.printf("+" + "-".repeat(10) + "+" + "-".repeat(17) + "+" + "-".repeat(23) + "+\n");

    }
}