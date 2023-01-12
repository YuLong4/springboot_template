package com.zlyyl.enetity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("tb_books")
public class Book {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;        //需要数据表id类型为bigint 长度20
    private String name;
    private Double price;
    private Integer bookcount;
    private String author;
    @TableLogic(value = "0", delval = "1")  //逻辑删除
    private Integer deleted;
    @Version
    private Integer version;       //乐观锁
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


