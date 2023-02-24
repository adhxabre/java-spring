package dumbways.ways.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dumbways.ways.todo.entity.Category;
import dumbways.ways.todo.repository.CategoryRepository;
import dumbways.ways.todo.service.CategoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public Iterable<Category> findAll() {
        return categoryService.findAll();
    };

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Category findOne(@PathVariable("id") long id) {
        return categoryService.findOne(id);
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Category> findById(@PathVariable("id") long id, @RequestBody Category category) {
        Category getCategory = categoryRepository.findById(id);

        getCategory.setCategory(category.getCategory());

        Category updateCategory = categoryRepository.save(getCategory);

        return ResponseEntity.ok().body(updateCategory);
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
    public void removeOne(@PathVariable("id") long id) {
        categoryService.removeOne(id);
    }

}
