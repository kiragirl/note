package course.scheduling.condition;

import course.scheduling.bean.ClassGrade;
import course.scheduling.bean.Courses;
import course.scheduling.bean.Lesson;

import java.util.List;

public interface Condition {
    boolean isMatch(List<ClassGrade> classes, ClassGrade classGrade, Courses courses, Lesson o);

}
