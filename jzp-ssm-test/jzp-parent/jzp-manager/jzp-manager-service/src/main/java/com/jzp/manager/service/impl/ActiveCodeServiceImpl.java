package com.jzp.manager.service.impl;

import com.jzp.manager.mapper.ActiveCodeMapper;
import com.jzp.manager.pojo.ActiveCodeEntity;
import com.jzp.manager.service.ActiveCodeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2017/6/15.
 */
public class ActiveCodeServiceImpl implements ActiveCodeService {

    @Autowired
    private ActiveCodeMapper activeCodeMapper;

    public ActiveCodeEntity selectCodeById(Integer id) {
        return activeCodeMapper.selectCodeById(id);
    }

    public void updateActiveCodePhone(String phone) {
        activeCodeMapper.updateActiveCodePhone(phone);
    }
}
