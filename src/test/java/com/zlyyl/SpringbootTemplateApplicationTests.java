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

    @Test
    void testPage(){
        Page<Book> page = new Page<>(3,3);
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
}
