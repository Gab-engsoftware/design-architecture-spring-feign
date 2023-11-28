package com.gabriel.ucsal.atividadeArquiteturaOrder;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderService {

    private final ProductFeignClient productFeignClient;

    public Order getOrderById(Long orderId) {
        return new Order(orderId, "Descrição do Pedido " + orderId);
    }
    public OrderService(ProductFeignClient productFeignClient) {
        this.productFeignClient = productFeignClient;
    }

    public Map<String, Object> getProductForOrder(Long productId) {
        return productFeignClient.getProductById(productId);
    }
}
