package course.scheduling.condition;

import course.scheduling.bean.ClassGrade;
import course.scheduling.bean.Courses;
import course.scheduling.bean.Lesson;
import course.scheduling.enums.ClassRoom;

import java.util.List;

/**
 * 教室限定，很特殊的限制，教室需要互斥使用，例如音乐教室，只能一个班级使用
 */
public class ClassRoomCondition implements SingleCondition<ClassRoom> {
    private List<ClassRoom> conditions;


    @Override
    public boolean isMatch(List<ClassGrade> classes, ClassGrade classGrade, Courses courses, Lesson lesson) {
        if (conditions.contains(lesson.getClassRoom())) {
            boolean isRoomBooked = classes.stream().anyMatch(it -> it.getList().stream().anyMatch(currentCourses ->
                    currentCourses.getDayOfWeek().equals(courses.getDayOfWeek())
                            && currentCourses.getList().get(courses.getIndex()) != null));
            return !isRoomBooked;
        }
        return true;
    }

    @Override
    public void setCondition(List<ClassRoom> o) {
        conditions.addAll(o);
    }
}
