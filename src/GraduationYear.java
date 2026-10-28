
class GraduationYear extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Graduation Year";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        if (candidate.getGraduationYear() == job.getRequiredGraduationYear()) {
            return true;
        } else {
            return false;
        }
    }

}
