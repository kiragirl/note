package course.scheduling.condition;

import course.scheduling.bean.ClassGrade;
import course.scheduling.bean.Courses;
import course.scheduling.bean.Lesson;

import java.time.DayOfWeek;
import java.util.List;

/**
 * 日期限制，例如周一不能排课
 */
public class DateCondition implements SingleCondition<DayOfWeek> {

    private List<DayOfWeek> conditions;

    @Override
    public boolean isMatch(List<ClassGrade> classes, ClassGrade classGrade, Courses courses, Lesson lesson) {
        return conditions.contains(courses.getDayOfWeek());
    }

    @Override
    public void setCondition(List<DayOfWeek> o) {
        this.conditions.addAll(o);
    }
}
