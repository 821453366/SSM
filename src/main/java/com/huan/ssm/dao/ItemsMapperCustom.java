package com.huan.ssm.dao;

import com.huan.ssm.entity.ItemsCustom;
import com.huan.ssm.entity.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo)throws Exception;


}