package com.study.jpa.chap01_basic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private long id;

    @Column(name = "prod_nm", nullable = false, length = 30)
    private String name;

    @Builder.Default // 초기화 하면 builder 관련하여 설정 해줘야 함
    private int price = 0; // default 값 설정 방법

    @Enumerated(EnumType.STRING) // Enum을 문자열로 사용하는 방법
    private Category category;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;


    public enum Category {
        FOOD, FASHION, ELECTRONIC
    }
}
