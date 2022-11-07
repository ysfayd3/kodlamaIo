package main.dataAccess;

import main.entities.Category;
import main.entities.Course;

public class JdbcCourseDao implements ICourseDao {


    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına kurs ismi eklebdİ eklendi");
    }
}
