public class Student {
    public String name;
    public int age;
    public double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {

        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    public String displayInfo() {
        return "Student [Name: " + name + ", Age: " + age + ", GPA: " + gpa + "]";
    }

    public double equals(Student otherStudent) {
        return this.gpa;
    }

}


