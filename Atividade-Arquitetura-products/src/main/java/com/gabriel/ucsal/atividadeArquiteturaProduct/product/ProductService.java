package com.gabriel.ucsal.atividadeArquiteturaProduct.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public Product getProductById(Long productId){
        return createFakeProduct(productId);
    }

    private Product createFakeProduct(Long productId){
        Product product = new Product();
        product.setId(productId);
        product.setName("Produto " + product);
        product.setPrice(19.99);
        return product;
    }
}
