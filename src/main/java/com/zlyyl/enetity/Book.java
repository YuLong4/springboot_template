package com.zlyyl.enetity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
    private Long id;        //需要数据表id类型为bigint 长度20
    private String name;
    private Double price;
    private Integer bookcount;
    private String author;
    @TableLogic(value = "0", delval = "1")  //乐观锁
    private Integer deleted;
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


