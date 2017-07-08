package com.huan.ssm.service.impl;

import com.huan.ssm.entity.ItemsCustom;
import com.huan.ssm.dao.ItemsMapperCustom;
import com.huan.ssm.entity.ItemsQueryVo;
import com.huan.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ubuntu on 17-7-7.
 */
@Service
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception {

        return itemsMapperCustom.findItemList(itemsQueryVo);
    }
}
