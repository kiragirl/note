package course.scheduling.bean;

import java.util.List;
import java.util.Objects;

public class ClassGrade {
    private int grade;
    private int number;
    private List<Courses> list;

    public List<Courses> getList() {
        return list;
    }

    public void setList(List<Courses> list) {
        this.list = list;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ClassGrade aClass = (ClassGrade) o;
        return grade == aClass.grade &&
                number == aClass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, number);
    }
}
