
class Backlogs extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Backlogs";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        if (candidate.getBacklogs() <= job.getMaximumBacklogs()) {
            return true;
        } else {
            return false;
        }
    }

}
