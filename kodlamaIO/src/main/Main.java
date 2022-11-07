package main;

import main.business.CategoryManager;
import main.business.CourseManeger;
import main.business.InstructorManager;
import main.core.loging.DataBaseLogger;
import main.core.loging.FileLogger;
import main.core.loging.Logger;
import main.core.loging.MailLogger;
import main.dataAccess.*;
import main.entities.Category;
import main.entities.Course;
import main.entities.Instructor;

public class Main {



    public static void main(String[] args) throws Exception {


        Course course=new Course(4,356,"Java 301");
        Logger[] logger= {new DataBaseLogger(),new FileLogger(),new MailLogger()};
        CourseManeger courseManeger=new CourseManeger( new JdbcCourseDao(),logger);
        courseManeger.add(course);



        Category category=new Category(5,"Programlama");

        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),logger);
        categoryManager.add(category);


        Instructor instructor=new Instructor(4,"Java");






    }
}
