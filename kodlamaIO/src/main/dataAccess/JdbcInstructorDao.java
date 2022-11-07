package main.dataAccess;

import main.entities.Category;
import main.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("jdbc ile veritabanına egitim ismi eklebdİ eklendi");
    }
}
