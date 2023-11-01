package Day6;

import java.util.Random;

public class Teacher {
    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        String mark = switch (new Random().nextInt(4) + 2) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            default -> "отлично";
        };

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName()
                + " по предмету " + this.subject + " на оценку " + mark + ".");


    }

}
