package com.example.demo_order_choreogrphy.entity.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemDTO {
    private Integer id;
    private Integer quantity;
    private Integer price;
}
