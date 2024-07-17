package org.example.dreambungeo.도감조회;

import lombok.RequiredArgsConstructor;
import org.example.dreambungeo.db.Fish;
import org.example.dreambungeo.db.FishDB;
import org.example.dreambungeo.게시판.request.BookReqDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecom0n/main")
@RequiredArgsConstructor
public class BookController_real {
//    private final BookService_real bookService;
    FishDB fishDB = new FishDB();

    //CompletableFuture<ResponseEntity<BookEntity>>

    @GetMapping("/book")
    public List findBookAll() {
        return fishDB.getAllFish();
    }

    @GetMapping("/book/{id}")
    public Fish findById(BookReqDTO bookreqDTO) {
        return fishDB.getFishByIndex(bookreqDTO.getEco_index());
    }
}