package dumbways.ways.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dumbways.ways.todo.entity.Category;
import dumbways.ways.todo.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findOne(long id) {
        return categoryRepository.findById(id);
    }

    public void removeOne(long id) {
        categoryRepository.deleteById(id);
    }

}
