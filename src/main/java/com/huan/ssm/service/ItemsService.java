package com.huan.ssm.service;

import com.huan.ssm.entity.ItemsCustom;
import com.huan.ssm.entity.ItemsQueryVo;

import java.util.List;

/**
 * Created by ubuntu on 17-7-7.
 */
public interface ItemsService {

   List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo)throws Exception;

}
