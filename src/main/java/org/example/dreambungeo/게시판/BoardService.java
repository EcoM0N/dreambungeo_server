package org.example.dreambungeo.게시판;

import lombok.RequiredArgsConstructor;
import org.example.dreambungeo.게시판.request.BoardReqDTO;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public CalculationResult calculation(BoardReqDTO boardReqDTO) {

        Integer shower = (boardReqDTO.getShower()) - 5;
        Integer cloth = boardReqDTO.getCloth() -5;
        Integer dish = boardReqDTO.getDish() -5;

        Integer minus = shower + cloth + dish;

        if (minus >= 100) {
            minus = 100;
        }
        Integer remain = 100 - minus;

        return new CalculationResult(minus, remain);



//        BoardEntity boardEntity = BoardEntity.builder()
//                .shower(shower)
//                .cloth(cloth)
//                .dish(dish)
//                .build();
//
//        boardRepository.save(boardEntity);
    }
}
