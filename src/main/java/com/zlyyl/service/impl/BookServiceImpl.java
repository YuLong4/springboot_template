package com.zlyyl.service.impl;

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
}
