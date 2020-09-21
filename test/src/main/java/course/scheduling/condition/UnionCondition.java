package course.scheduling.condition;

import course.scheduling.bean.ClassGrade;
import course.scheduling.bean.Courses;
import course.scheduling.bean.Lesson;

import java.util.List;

/**
 * 联合条件, 占时无用
 */
public class UnionCondition implements Condition {

    List<Condition> conditions;

    public UnionCondition addCondition(Condition condition) {
        conditions.add(condition);
        return this;
    }

    @Override
    public boolean isMatch(List<ClassGrade> classes, ClassGrade classGrade, Courses courses, Lesson o) {
        boolean isMatch = true;
        for (Condition condition : conditions) {
            isMatch = condition.isMatch(classes, classGrade, courses, o);
            if (!isMatch) {
                break;
            }
        }
        return isMatch;
    }
}
