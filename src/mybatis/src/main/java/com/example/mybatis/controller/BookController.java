package com.example.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.mybatis.entity.Book;
import com.example.mybatis.mapper.BookMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookMapper bookMapper;

    @GetMapping("/")
    public String showIndex() {
        return "book/index";
    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("message", "一覧表示");
        model.addAttribute("books", bookMapper.findAllBooks());
        return "book/success";
    }

    @GetMapping("/detail/{id}")
    public String showBook(@PathVariable int id, Model model) {
        model.addAttribute("message", "詳細表示");
        model.addAttribute("book", bookMapper.getBookById(id));
        return "book/success";
    }

    @GetMapping("/create")
    public String createBook(Model model) {
        Book book = new Book();
        book.setTitle("spring");
        book.setAuthor("takuya");
        bookMapper.save(book);
        model.addAttribute("message", "登録成功");
        return "book/success";
    }

    @GetMapping("/update/{id}")
    public String updateBook(@PathVariable int id, Model model) {
        Book book = new Book();
        book.setId(id);
        book.setTitle("updated");
        book.setAuthor("更新されたuser");
        bookMapper.update(book);
        model.addAttribute("message", "更新成功");
        return "book/success";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id, Model model) {
        bookMapper.delete(id);
        model.addAttribute("message", "削除成功");
        return "book/success";
    }

}
