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
}
