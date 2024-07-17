//package org.example.dreambungeo.도감조회;
//
//import lombok.RequiredArgsConstructor;
//import org.example.dreambungeo.게시판.request.BookReqDTO;
//
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class BookService {
//    private final BookRepository bookRepository;
//
//
//    public List<BookResDTO> findBookAll(BookReqDTO bookreqDTO) {
//        String email = bookreqDTO.getEmail();
//
//        List<BookEntity> bookEntityList = bookRepository.findByEmail(email);
//        List<BookEntity> bookEntityList = bookRepository.findAll();
//        List<BookResDTO> bookResdDTOList = new ArrayList<>();
//
//        for (BookEntity bookentity : bookEntityList) {
//            bookResdDTOList.add(BookResDTO.toDTO(bookentity));
//        }
//
//        return bookResdDTOList;
//    }
//
//    public BookResDTO findById(int ecoIndex) {
//        Optional<BookEntity> bookEntity = bookRepository.findByIndex(ecoIndex);
//        if (bookEntity.isPresent()) {
//            return BookResDTO.toDTO(bookEntity.get());
//        } else {
////            BookResDTO bookresDTO = new BookResDTO();
//             return null;
//        }
//    }
//}
