package com.jzp.manager.service.impl;

import com.jzp.manager.mapper.TbItemMapper;
import com.jzp.manager.pojo.TbItem;
import com.jzp.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/6/9.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    public TbItem queryItemById(Long itemId) {
        if (itemId == null){
            return null;
        }
        return itemMapper.selectByPrimaryKey(itemId);
    }
}
