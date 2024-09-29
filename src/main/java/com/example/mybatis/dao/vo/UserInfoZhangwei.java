package com.example.mybatis.dao.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user_info")
public class UserInfoZhangwei {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    public UserInfoZhangwei(String zhangwei, int i, String s) {
        this.name = zhangwei;
        this.age = i;
        this.email = s;
    }
}
