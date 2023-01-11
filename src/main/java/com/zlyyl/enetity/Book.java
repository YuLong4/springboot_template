package com.zlyyl.enetity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("tb_books")
public class Book {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Double price;
    private Integer bookcount;
    private String author;
}

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//public class Book {
//    private Integer id;
//    private String type;
//    private String name;
//    private String description;
//}


