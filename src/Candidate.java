
class Candidate {

    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;

    public Candidate(int backlogs, int graduationYear, String name, double percentage) {
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.name = name;
        this.percentage = percentage;
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

}
