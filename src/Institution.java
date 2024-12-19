public class Institution {
    public String name;
    public String location;
    public Student[] student;
    public Teachers[] teachers;

    public Institution(String name, String location, Student[] student, Teachers[] teachers) {
        this.name = name;
        this.location = location;
        this.student = student;
        this.teachers = teachers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Teachers[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers[] teachers) {
        this.teachers = teachers;
    }

    public void displayInfo() {
        System.out.println("Institution [Name: " + name + ", Location: " + location + "]");
        System.out.println("Students:");
        for (Student student : student) {
            System.out.println(student.displayInfo());
        }
        System.out.println("Teachers:");
        for (Teachers teacher : teachers) {
            System.out.println(teacher.displayInfo());
        }
    }
}


