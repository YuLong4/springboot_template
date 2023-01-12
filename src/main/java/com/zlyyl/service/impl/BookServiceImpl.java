package com.zlyyl.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlyyl.dao.BookDao;
import com.zlyyl.enetity.Book;
import com.zlyyl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {

    @Autowired
    private BookDao bookDao;

//    public Boolean save(Book book) {
//        bookDao.insert(book);
//        return true;
//    }

    public Boolean update(Book book) {
        bookDao.update(book, null);
        return true;
    }

    public Boolean delete(Long id) {
        bookDao.deleteById(id);
        return true;
    }

    public Book getById(Long id) {
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
