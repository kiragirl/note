package course.scheduling.bean;

import course.scheduling.condition.Condition;
import course.scheduling.enums.ClassRoom;
import course.scheduling.enums.LessonTypeEnum;

import java.util.List;

public class Lesson {
    private String teacherName;
    private int period;
    private LessonTypeEnum lessonTypeEnum;
    private ClassRoom classRoom;
    private List<Condition> conditionList;

    public LessonTypeEnum getLessonTypeEnum() {
        return lessonTypeEnum;
    }

    public void setLessonTypeEnum(LessonTypeEnum lessonTypeEnum) {
        this.lessonTypeEnum = lessonTypeEnum;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public List<Condition> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<Condition> conditionList) {
        this.conditionList = conditionList;
    }
}
