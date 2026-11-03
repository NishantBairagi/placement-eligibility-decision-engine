
public class EligibilityChecker {

    private EligibilityRule[] rules;

    EligibilityChecker() {
        rules = new EligibilityRule[]{
            new Percentage(),
            new Backlogs(),
            new GraduationYear(),
            new SkillsRule()
        };
    }

    public boolean evaluate(Candidate candidate, Job job) {
        boolean eligible = true;

        for (int i = 0; i < rules.length; i++) {
            boolean passed = rules[i].check(candidate, job);
            if (passed) {
                System.out.println(rules[i].getRuleName() + " : PASS");
            } else {
                System.out.println(rules[i].getRuleName() + " : FAIL");
                eligible = false;
            }
        }
        return eligible;
    }
}
