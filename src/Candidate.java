
class Candidate {

    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;
    private String[] skills;

    public Candidate(int backlogs, int graduationYear, String name, double percentage, String[] skills) {
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.name = name;
        this.percentage = percentage;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public boolean hasSkills(String requiredSkills) {

        for (int i = 0; i < skills.length; i++) {
            if (requiredSkills.equalsIgnoreCase(skills[i])) {
                return true;
            }
        }
        return false;
    }
}
