package org.example.dreambungeo.게시판;

import lombok.RequiredArgsConstructor;
import org.example.dreambungeo.게시판.request.BoardReqDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecom0n/main")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

//    UserEntity user = userRepository.findByEmail(request.getEmail())
//            .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다."));

    // 0~100
    @GetMapping("/board")
    public CalculationResult board(BoardReqDTO boardReqDTO) {
        CalculationResult result = boardService.calculation(boardReqDTO);

//        Integer minus = result.getMinus();
//        Integer remain = result.getRemain();
        Integer minus = 30;
        Integer remain = 70;
        return result;
    }

}
