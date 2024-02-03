package com.spring.mysql.springmysql.Controller;

import com.spring.mysql.springmysql.Entity.Product;
import com.spring.mysql.springmysql.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public Product saveProduct(@Valid @RequestBody Product product){

        return productService.saveProduct(product);
    }

    @GetMapping("/listOfProducts")
    public List<Product> listofProducts(){
        return productService.getProductsAll();
    }

    @GetMapping("/productByID/{id}")
    public Product findProductByID(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
}
