package main.business;

import main.core.loging.Logger;
import main.dataAccess.ICourseDao;
import main.entities.Instructor;

public class InstructorManager {

    private ICourseDao iCourseDao;
    private Logger[] loggers;

    public InstructorManager(ICourseDao iCourseDao, Logger[] loggers) {
        this.iCourseDao = iCourseDao;
        this.loggers = loggers;
    }


    public void add(Instructor instructor) {
    }
}
