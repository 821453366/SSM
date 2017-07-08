package com.huan.ssm.controller;

import com.huan.ssm.entity.ItemsCustom;
import com.huan.ssm.service.ItemsService;
import com.huan.ssm.service.impl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ubuntu on 17-7-8.
 */
@Controller
@RequestMapping()
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {
        List<ItemsCustom> list = itemsService.findItemList(null);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList", list);
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }
}
