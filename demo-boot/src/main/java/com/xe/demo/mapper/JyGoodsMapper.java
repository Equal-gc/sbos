package com.xe.demo.mapper;

import com.xe.demo.common.dao.MyMapper;
import com.xe.demo.model.AuthUser;
import com.xe.demo.model.JyGoods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface JyGoodsMapper extends MyMapper<JyGoods> {
    List<JyGoods> queryList(@Param("id")JyGoods id);
}