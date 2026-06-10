package com.example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatis.entity.Book;

@Mapper
public interface BookMapper {
    List<Book> findAllBooks();

    Book getBookById(int id);

    void save(Book book);

    void update(Book book);

    void delete(int id);
}
