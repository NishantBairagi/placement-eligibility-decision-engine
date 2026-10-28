
class Job {

    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear;

    public Job(String company, int maximumBacklogs, double minimumPercentage, int requiredGraduationYear, String role) {
        this.company = company;
        this.maximumBacklogs = maximumBacklogs;
        this.minimumPercentage = minimumPercentage;
        this.requiredGraduationYear = requiredGraduationYear;
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }

}
