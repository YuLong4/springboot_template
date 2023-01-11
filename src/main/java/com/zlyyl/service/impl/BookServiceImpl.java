package com.zlyyl.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zlyyl.dao.BookDao;
import com.zlyyl.enetity.Book;
import com.zlyyl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public Boolean save(Book book) {
        bookDao.insert(book);
        return true;
    }

    public Boolean update(Book book) {
        bookDao.update(book, null);
        return true;
    }

    public Boolean delete(Integer id) {
        bookDao.deleteById(id);
        return true;
    }

    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public Page<Book> selectPage(int toPage, int pageSize) {
        Page<Book> page = new Page<>(toPage, pageSize);
        bookDao.selectPage(page, null);
        return page;
    }
}
