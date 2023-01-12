package com.zlyyl.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zlyyl.enetity.Book;

import java.util.List;

public interface BookService extends IService<Book> {

//    public Boolean save(Book book);

    public Boolean update(Book book);

    public Boolean delete(Long id);

    public Book getById(Long id);

    public List<Book> getAll();

    public Page<Book> selectPage(int toPage, int pageSize);
}
