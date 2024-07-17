package org.example.dreambungeo.도감조회;

import lombok.RequiredArgsConstructor;
import org.example.dreambungeo.게시판.request.BookReqDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecom0n/main")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    //CompletableFuture<ResponseEntity<BookEntity>>

    @GetMapping("/book")
    public List findBookAll(BookReqDTO bookreqDTO) {
        List<BookResDTO> bookResdDTOList = bookService.findBookAll(bookreqDTO);
        return bookResdDTOList;
    }

    @GetMapping("/book/{id}")
    public BookResDTO findById(BookReqDTO bookreqDTO) {
        BookResDTO bookresDTO = bookService.findById(bookreqDTO.getEco_index());
        return bookresDTO;
    }
}