public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Asan", 20, 3.65);
        Student student2 = new Student("Merey", 22, 2.28);
        Student student3 = new Student("Asan", 20, 3.65);

        Teachers teacher1 = new Teachers("Mrs.Orazova", "OOP", 6);
        Teachers teacher2 = new Teachers("Ms.Khaimuldin", "OOP", 12);

        Student[] students = { student1, student2 };
        Teachers[] teachers = { teacher1, teacher2 };
        Institution institution = new Institution("Astana IT University", "Astana", students, teachers);

        institution.displayInfo();


        System.out.println("\nComparing Student 1 and Student 3: " + student1.equals(student3));
        System.out.println("Comparing Student 1 and Student 2: " + student1.equals(student2));

        System.out.println("\nComparing Teacher 1 and Teacher 2: " + teacher1.equals(teacher2));

        Institution institution2 = new Institution("Astana IT University", "Astana", students, teachers);
        System.out.println("\nComparing Institution 1 and Institution 2: " + institution.equals(institution2));
    }

}