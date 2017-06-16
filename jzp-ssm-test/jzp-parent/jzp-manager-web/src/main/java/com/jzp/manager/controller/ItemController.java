package com.jzp.manager.controller;

import com.jzp.manager.pojo.TbItem;
import com.jzp.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2017/6/9.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/test/{itemId}")
    @ResponseBody
    public TbItem queryItemById(@PathVariable Long itemId){

        return  itemService.queryItemById(itemId);
    }
}
