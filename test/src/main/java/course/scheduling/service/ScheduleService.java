package course.scheduling.service;

import course.scheduling.bean.ClassGrade;
import course.scheduling.bean.Courses;
import course.scheduling.bean.Lesson;

import java.util.List;

public class ScheduleService {

    public List<ClassGrade> schedulingCourse(List<ClassGrade> classes, List<Lesson> lessons) {
        for (Lesson lesson : lessons) {
            for(ClassGrade classGrade :classes){
                for(Courses courses :classGrade.getList()){

                }
            }
        }
        return classes;
    }

    private void fireCondition(){

    }
}
