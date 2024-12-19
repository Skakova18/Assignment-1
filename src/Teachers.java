public class Teachers {
    public String name;
    public String subject;
    public int experience;

    public Teachers(String name, String subject, int experience) {
        this.name=name;
        this.subject=subject;
        this.experience=experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String displayInfo() {
        return "Teacher [Name: " + name + ", subject: " + subject + ", experience : " + experience + "]";
    }
    public int equals(Teachers otherTeachers) {
        return this.experience;
    }
}
