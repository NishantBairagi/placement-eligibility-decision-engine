
public class SkillsRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        throw new UnsupportedOperationException("Skills");
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        String[] requiredSkills = job.getRequiredSkills();

        for (int i = 0; i < requiredSkills.length; i++) {
            if (!candidate.hasSkills(requiredSkills[i])) {
                return false;
            }
        }
        return true;
    }

}
