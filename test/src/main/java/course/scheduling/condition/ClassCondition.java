package course.scheduling.condition;

import course.scheduling.bean.ClassGrade;
import course.scheduling.bean.Courses;
import course.scheduling.bean.Lesson;

import java.time.DayOfWeek;
import java.util.List;

/**
 * 班级限制
 */
public class ClassCondition implements SingleCondition<Integer> {

    private List<Integer> conditions;

    @Override
    public boolean isMatch(List<ClassGrade> classes,ClassGrade classGrade, Courses courses, Lesson o) {
        return conditions.contains(classGrade.getNumber());
    }

    @Override
    public void setCondition(List<Integer> o) {
        this.conditions.addAll(o);
    }
}
