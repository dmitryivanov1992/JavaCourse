package Day9.Task1;

//в методах printInfo() для учителя и студента сделал обращения к имени разными способами. В одном случае через геттер,
// а во втором сделал полю name в классе Human модификатор доступа protected и обратился через suoer.
// как правильнее?

public class Task1 {
    public static void main(String[] args){
        Student student = new Student("John", "BIO23");
        Teacher teacher = new Teacher("Bob", "Physics");
        System.out.println("Студент обучается в группе: "+student.getGroupName());
        System.out.println("Преподаватель ведет предмет: "+teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
