package com.StarkIndustries.SpringWebMark1.Service;

import com.StarkIndustries.SpringWebMark1.Model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class ProductsService {

    List<Product> productList = new ArrayList<>(List.of(
            new Product(101,"Mobile-Phone","One Plus",30000)
            ,new Product(102,"Watch","Boat",50000)
            ,new Product(103,"Laptop","Lenovo",70000)
            ,new Product(104,"Tablet","Samsung",60000)
    ));

    public List<Product> getProductList(){
        return productList;
    }

    public Product getProduct(int prodId){

        return
                productList
                            .stream()
                            .filter(product->
                                product.getProductId()==prodId)
                            .findFirst()
                            .orElse(new Product(100,"No Item","Company",0));
    }

    public int addProduct(Product product){
        productList.add(product);
        return 1;
    }

    public int updateProduct(Product product){
        int index=0;
        for(int i =0;i<productList.size();i++){
            if(product.getProductId()==productList.get(i).getProductId())
                productList.set(i,product);
        }
        return 1;
    }

    public int deleteProduct(int prodId){

        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getProductId()==prodId){
                productList.remove(i);
            }
        }

        return 1;
    }
}
