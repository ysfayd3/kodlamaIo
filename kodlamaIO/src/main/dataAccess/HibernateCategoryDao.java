package main.dataAccess;

import main.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {


    @Override
    public void add(Category category) {

        System.out.println("Hibernate ile veritabanına kategori ismi eklendİ eklendi");
    }
}
