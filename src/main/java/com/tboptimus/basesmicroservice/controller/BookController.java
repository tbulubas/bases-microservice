package com.tboptimus.basesmicroservice.controller;

import com.tboptimus.basesmicroservice.domain.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Book> findAll() {
        List<Book> books=new ArrayList<>();
        books.add(new Book("Pilot Pirx", "Stanislaw Lem"));
        books.add(new Book("Catch 22", "Joseph Heller"));
        books.add(new Book("The Gulag Archipelago", "Aleksandr Solzhenitsyn"));
        return books;
    }

    @GetMapping(path="/any", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Book getBook() {
        return new Book("Pilot Pirx", "Stanislaw Lem");
    }

}
