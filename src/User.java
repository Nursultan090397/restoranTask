public class User {
    private String jobTitle;

    public User(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "User{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
