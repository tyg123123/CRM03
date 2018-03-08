package com.zking.crm.mappel;

import com.zking.crm.model.Yh;

public interface YhMapper {
    int deleteByPrimaryKey(Integer yhbh);

    int insert(Yh record);

    int insertSelective(Yh record);

    Yh selectByPrimaryKey(Integer yhbh);

    int updateByPrimaryKeySelective(Yh record);

    int updateByPrimaryKey(Yh record);
}