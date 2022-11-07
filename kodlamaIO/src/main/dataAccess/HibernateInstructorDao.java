package main.dataAccess;

import main.entities.Category;
import main.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına egitim  ismi eklebdİ eklendi");
    }
}
