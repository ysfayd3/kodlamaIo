package main.business;

import main.core.loging.Logger;
import main.dataAccess.ICategoryDao;
import main.entities.Category;
import main.entities.Course;

public class CategoryManager {

    private ICategoryDao iCategoryDao;
    private Logger[] loggers;

    public CategoryManager(ICategoryDao iCategoryDao, Logger[] loggers) {
        this.iCategoryDao = iCategoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws  Exception{


        if(category.getCategoryName() != category.getCategoryName()){
            throw  new Exception("Kategori ismi tekrar edemez");
        }
        for(Logger logger:loggers){
            logger.log(category.getCategoryName());
        }
    }


}
