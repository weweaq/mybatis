package com.example.mybatis.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis.dao.vo.UserInfoZhangwei;

import java.util.List;

public interface UserInfoMapper extends BaseMapper<UserInfoZhangwei> {

    int insertBatchSomeColumn(List<UserInfoZhangwei> entityList);


}
