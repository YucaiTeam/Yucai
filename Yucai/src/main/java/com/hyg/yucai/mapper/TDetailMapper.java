package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TDetail;
import com.hyg.yucai.model.TDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDetailMapper {
    long countByExample(TDetailExample example);

    int deleteByExample(TDetailExample example);

    int deleteByPrimaryKey(Integer detailid);

    int insert(TDetail record);

    int insertSelective(TDetail record);

    List<TDetail> selectByExample(TDetailExample example);

    TDetail selectByPrimaryKey(Integer detailid);

    int updateByExampleSelective(@Param("record") TDetail record, @Param("example") TDetailExample example);

    int updateByExample(@Param("record") TDetail record, @Param("example") TDetailExample example);

    int updateByPrimaryKeySelective(TDetail record);

    int updateByPrimaryKey(TDetail record);
}