package org.example.dreambungeo.도감조회;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DrawReqDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;
}
