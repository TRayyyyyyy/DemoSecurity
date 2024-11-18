package service;

import entity.Product;
import repository.ProductRepository;

import java.util.List;

public class ProductServiceImp implements ProductServices{

    private ProductRepository repo;

    public ProductServiceImp(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Product get(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> listAll() {
        return repo.findAll();
    }
}
