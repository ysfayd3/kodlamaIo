package main.dataAccess;

import main.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("jdbc ile veritabanına kategori ismi eklebdİ eklendi");
    }
}
