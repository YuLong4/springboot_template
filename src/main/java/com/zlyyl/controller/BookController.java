package com.zlyyl.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zlyyl.enetity.Book;
import com.zlyyl.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        System.out.println("book:"+book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        Boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败";
        return new Result(code, book, msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败";
        return new Result(code, bookList, msg);
    }

    /**
     * 分页功能
     * 接口:/api/books/page?toPage=X&pageSize=X
     * 参数:要跳转的页 和 每页的条数
     */
    @GetMapping("/page")
    public Result page(int toPage, int pageSize){
        log.info("toPage = {}, pageSize = {}", toPage, pageSize);

        Page<Book> pageResult = bookService.selectPage(toPage, pageSize);

        return new Result(Code.GET_OK, pageResult);
    }
}
