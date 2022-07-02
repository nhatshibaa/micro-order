package com.example.demo_order_choreogrphy.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")  // Nếu ko cho thì tên default sẽ là Order
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String thumbnails;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(columnDefinition = "TEXT")
    private String detail;
    private Integer quantity;
    private Integer price;
    private Integer status;

    public Product(String name, String thumbnails, Integer quantity, Integer price, Integer status) {
        this.name = name;
        this.thumbnails = thumbnails;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }
}
