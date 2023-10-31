package Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        String mark="";
        switch (new Random().nextInt(4) + 2) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName()
                + " по предмету " + this.subject + " на оценку " + mark + ".");


    }

}
