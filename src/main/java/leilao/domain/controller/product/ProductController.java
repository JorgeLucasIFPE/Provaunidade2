package leilao.domain.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import leilao.infra.model.ProductModel;
import leilao.infra.repository.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping
    public List<ProductModel> listAll() {
        return productRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductModel addProduct(@RequestBody ProductModel product) {
        productRepo.save(product);
        return product;
    }

}
