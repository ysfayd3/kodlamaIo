package main.dataAccess;

import main.entities.Category;
import main.entities.Course;

public class HibernateCourseDao  implements ICourseDao {


    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına kurs ismi eklebdİ eklendi");

    }


}
