package com.gabriel.ucsal.atividadeArquiteturaOrder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import java.util.Map;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final ProductFeignClient productFeignClient;

    @GetMapping("/{orderId}/product")
    public Map<String, Object> getProductForOrder(@PathVariable Long orderId) {
        Long productId = getProductIdForOrder(orderId);
        return productFeignClient.getProductById(productId);
    }

    private Long getProductIdForOrder(Long orderId) {
        return orderId + 100L;
    }
}
