package main.business;

import main.core.loging.Logger;
import main.dataAccess.ICourseDao;
import main.entities.Category;
import main.entities.Course;

public class CourseManeger {
    private ICourseDao iCourseDao;
    private Logger[] loggers;

    public CourseManeger(ICourseDao iCourseDao, Logger[] loggers) {
        this.iCourseDao = iCourseDao;
        this.loggers = loggers;
    }


    public void  add(Course course)throws Exception{

            if (course.getCoursePrice()<0){
                throw  new Exception("Bu kursun fiyati 0 dan kucuk olamaz");
            }else if (course.getCourseName() != course.getCourseName())
            {
                throw  new Exception("Bu kursun ismi tekrar edemez");
            }






        iCourseDao.add(course);
        for(Logger logger:loggers){
            logger.log(course.getCourseName());
        }

    }
}
