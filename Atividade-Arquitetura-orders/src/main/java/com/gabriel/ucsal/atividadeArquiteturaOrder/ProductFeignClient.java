package com.gabriel.ucsal.atividadeArquiteturaOrder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "product-service", url = "http://localhost:8081")
@Component
public interface ProductFeignClient {
    @GetMapping("/products/{productId}")
    Map<String, Object> getProductById(@PathVariable("productId") Long productId);
}
