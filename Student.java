public class Student {
    String name;
    int age;

    public Student() {
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Era";
        s.age = 20;

        s.introduce();
    }
}
