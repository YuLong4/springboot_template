package com.zlyyl.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zlyyl.enetity.Book;

import java.util.List;

public interface BookService {

    public Boolean save(Book book);

    public Boolean update(Book book);

    public Boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();

    public Page<Book> selectPage(int toPage, int pageSize);
}
