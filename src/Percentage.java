
class Percentage extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Percentage";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        if (candidate.getPercentage() >= job.getMinimumPercentage()) {
            return true;
        } else {
            return false;
        }
    }

}
