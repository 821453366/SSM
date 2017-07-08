package com.huan.ssm.entity;

/**
 * Created by ubuntu on 17-7-7.
 */
public class ItemsQueryVo {
//    包装查询条件
    private Items items;
    private ItemsCustom itemsCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
