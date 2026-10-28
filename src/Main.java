
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(backlogs, graduationYear, name, percentage);

        Job job = new Job("infosys", 0, 65.0, 2026, "Java Developer");

        // boolean percentagePass = candidate.getPercentage() >= job.getMinimumPercentage();
        // boolean backlogPass = candidate.getBacklogs() <= job.getMaximumBacklogs();
        // boolean yearPass = candidate.getGraduationYear() == job.getRequiredGraduationYear();
        // System.out.println("======================================================");
        // System.out.println("PLACEMENT ELIGIBILITY RESULT");
        // System.out.println("======================================================");
        // System.out.println();
        // System.out.println("Candidate: " + candidate.getName());
        // System.out.println("Company: " + job.getCompany());
        // System.out.println("Role: " + job.getRole());
        // System.out.println();
        // System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        // System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        // System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());
        // System.out.println("Percentage: " + candidate.getPercentage());
        // System.out.println("Backlogs: " + candidate.getBacklogs());
        // System.out.println("Graduation Year: " + candidate.getGraduationYear());
        boolean eligible = check(new Percentage(), candidate, job) && check(new Backlogs(), candidate, job) && check(new GraduationYear(), candidate, job);

        if (check(new Percentage(), candidate, job)) {
            System.out.println(getName(new Percentage()) + "  :PASS");
        } else {
            System.out.println(getName(new Percentage()) + "  :FAIL");
        }
        if (check(new Backlogs(), candidate, job)) {
            System.out.println(getName(new Backlogs()) + "  :PASS");
        } else {
            System.out.println(getName(new Backlogs()) + "  :FAIL");
        }
        if (check(new GraduationYear(), candidate, job)) {
            System.out.println(getName(new GraduationYear()) + "  :PASS");
        } else {
            System.out.println(getName(new GraduationYear()) + "  :FAIL");
        }
        // if (percentagePass) {
        //     System.out.println("Percentage  :PASS");
        // } else {
        //     System.out.println("Percentage  :FAIL");
        // }
        // if (backlogPass) {
        //     System.out.println("Backlogs  :PASS");
        // } else {
        //     System.out.println("Backlogs  :FAIL");
        // }
        // if (yearPass) {
        //     System.out.println("Graduation Year  :PASS");
        // } else {
        //     System.out.println("Graduation Year  :FAIL");
        // }
        System.out.println();
        if (eligible) {
            System.out.println("Final Result:ELIGIBLE");
        } else {
            System.out.println("Final Result:NOT ELIGIBLE");
        }
        //System.out.println("======================================================");
        scanner.close();
    }

    public static boolean check(EligibilityRule rule, Candidate candidate, Job job) {
        return rule.check(candidate, job);
    }

    public static String getName(EligibilityRule rule) {

        return rule.getRuleName();
    }
}
