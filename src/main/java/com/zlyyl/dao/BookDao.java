package com.zlyyl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zlyyl.enetity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
