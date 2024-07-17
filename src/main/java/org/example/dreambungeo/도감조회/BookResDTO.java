package org.example.dreambungeo.도감조회;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index; // 환경몬 번호

    @Column
    private String eco_img; // 환경몬 img (url)

    @Column
    private String eco_name; // 환경몬 이름

    @Column
    private String eco_content; // 환경몬 설명


    public static BookResDTO toDTO(BookEntity bookentity) {
        BookResDTO bookResdDTO = new BookResDTO();

        bookResdDTO.setIndex(bookentity.getIndex());
        bookResdDTO.setEco_img(bookResdDTO.getEco_img());
        bookResdDTO.setEco_name(bookResdDTO.getEco_name());
        bookResdDTO.setEco_content(bookResdDTO.getEco_content());

        return bookResdDTO;
    }
}
