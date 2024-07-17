package org.example.dreambungeo.도감조회;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
//@Table(name = "board_table")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email; // user email

    @Column
    private int index; // 환경몬 번호

    @Column
    private String eco_img; // 환경몬 img (url)

    @Column
    private String name; // 환경몬 이름

    @Column
    private String eco_content; // 환경몬 설명

//    @Column
//    private String eco_img; // 환경몬 img (url)
//
//    @Column
//    private String eco_name; // 환경몬 이름
//
//    @Column
//    private String eco_content; // 환경몬 설명

//    @Column
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int book_total; // user가 뽑은 환경몬 총 개수 (종류 기준)

}
