package com.StarkIndustries.SpringWebMark1.Controller;

import com.StarkIndustries.SpringWebMark1.Model.Product;
import com.StarkIndustries.SpringWebMark1.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ProductsService service;

    @RequestMapping("/")
    public String indexPage(){
        return "Welcome!!!";
    }

    @RequestMapping("/home")
    public String homePage(){
        return "This is home page";
    }

    @RequestMapping("/products")
    public List<Product> productsPage(){
        return service.getProductList();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProduct(@PathVariable("prodId") int prodId){
        return service.getProduct(prodId);
    }

    @PostMapping("/products")
    public int addProduct(@RequestBody Product product){
        if(service.addProduct(product)==1)
            return 1;
        return 0;
    }

    @PutMapping("/products")
    public int updateProduct(@RequestBody Product product){
        if(service.updateProduct(product)==1)
            return 1;
        return 0;

    }

    @DeleteMapping("/products/{prodId}")
    public int deleteProduct(@PathVariable("prodId") int prodId){
        if(service.deleteProduct(prodId)==1)
            return 1;
        return 0;
    }
}
