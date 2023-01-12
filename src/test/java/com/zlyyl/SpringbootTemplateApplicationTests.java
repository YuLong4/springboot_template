package com.zlyyl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zlyyl.dao.BookDao;
import com.zlyyl.enetity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTemplateApplicationTests {

    @Autowired
    BookDao bookDao;

    /**
     * 测试分页
     */
    @Test
    void testPage(){
        Page<Book> page = new Page<>(1,3);
        bookDao.selectPage(page, null);
        System.out.println(page);
    }

    /**
     * 测试id生成策略
     */
    @Test
    void testSave(){
        Book book = new Book();
        book.setName("新增测试书");
        book.setBookcount(90);
        book.setAuthor("Yulong");
        book.setPrice(89.2);
        bookDao.insert(book);
    }

    /**
     * 测试逻辑删除
     */
    @Test
    void testDel(){
        bookDao.deleteById(2L);
    }

    /**
     * 测试乐观锁
     */
//    @Test
//    void testLock(){
//        Book book1 = bookDao.selectById(1L);
//        Book book2 = bookDao.selectById(1L);
//        book1.setPrice(60.1);
//        bookDao.updateById(book1);
//        book2.setPrice(70.2);
//        bookDao.updateById(book2);
//    }
}
