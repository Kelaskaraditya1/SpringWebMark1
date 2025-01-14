package com.StarkIndustries.SpringWebMark1.Service;

import com.StarkIndustries.SpringWebMark1.Model.Product;
import com.StarkIndustries.SpringWebMark1.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class ProductsService {

    @Autowired
    private ProductRepository productRepository;

    List<Product> productList = new ArrayList<>(List.of(
            new Product(101,"Mobile-Phone","One Plus",30000)
            ,new Product(102,"Watch","Boat",50000)
            ,new Product(103,"Laptop","Lenovo",70000)
            ,new Product(104,"Tablet","Samsung",60000)
    ));

    public List<Product> getProductList(){
//        return productList;

        return productRepository.findAll();
    }

    public Product getProduct(int prodId){

//        return
//                productList
//                            .stream()
//                            .filter(product->
//                                product.getProductId()==prodId)
//                            .findFirst()
//                            .orElse(new Product(100,"No Item","Company",0));

        return productRepository.findById(prodId).orElse(new Product());
    }

    public int addProduct(Product product){
//        productList.add(product);
        productRepository.save(product);
        return 1;
    }

    public int updateProduct(Product product){
//        int index=0;
//        for(int i =0;i<productList.size();i++){
//            if(product.getProductId()==productList.get(i).getProductId())
//                productList.set(i,product);
//        }
        productRepository.save(product);
        return 1;
    }

    public int deleteProduct(int prodId){

//        for(int i=0;i<productList.size();i++){
//            if(productList.get(i).getProductId()==prodId){
//                productList.remove(i);
//            }
//        }

        productRepository.deleteById(prodId);

        return 1;
    }
}
