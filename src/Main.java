
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        int skillCount = scanner.nextInt();

        String[] skills = new String[skillCount];

        for (int i = 0; i < skillCount; i++) {
            skills[i] = scanner.next();
        }

        Candidate candidate = new Candidate(backlogs, graduationYear, name, percentage, skills);
        //String[] requiredSkills = {"Java", "SQL"};

        int jobCount = scanner.nextInt();
        Job[] jobs = new Job[jobCount];

        for (int i = 0; i < jobCount; i++) {
            String company = scanner.next();
            String role = scanner.next();
            double minimumPercentage = scanner.nextDouble();
            int maximumBacklogs = scanner.nextInt();
            int requiredGraduationYear = scanner.nextInt();

            int requiredSkillsCount = scanner.nextInt();
            String[] requiredSkills = new String[requiredSkillsCount];

            for (int j = 0; j < requiredSkillsCount; j++) {
                requiredSkills[j] = scanner.next();
            }

            jobs[i] = new Job(company, maximumBacklogs, minimumPercentage, requiredGraduationYear, role, requiredSkills);

        }

        //Job job = new Job("infosys", 0, 65.0, 2026, "Java Developer", requiredSkills);
        System.out.println();
        System.out.println("AVAILABLE JOBS");
        for (int i = 0; i < jobCount; i++) {
            System.out.println((i + 1) + "." + jobs[i].getCompany() + " - " + jobs[i].getRole());
        }

        int selectJobNumber = scanner.nextInt();

        Job selecteJob = jobs[selectJobNumber - 1];
        System.out.println("======================================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("======================================================");
        System.out.println();
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + selecteJob.getCompany());
        System.out.println("Role: " + selecteJob.getRole());
        System.out.println();

        EligibilityChecker checker = new EligibilityChecker();
        boolean eligible = checker.evaluate(candidate, selecteJob);
        System.out.println();

        if (eligible) {
            System.out.println("FINAL RESULT : ELIGIBLE");
        } else {
            System.out.println("FINAL RESULT : NOT ELIGIBLE");
        }

        System.out.println("======================================================");

        scanner.close();

    }
}
