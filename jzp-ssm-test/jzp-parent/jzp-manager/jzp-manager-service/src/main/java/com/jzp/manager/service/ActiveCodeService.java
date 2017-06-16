package com.jzp.manager.service;

import com.jzp.manager.pojo.ActiveCodeEntity;

/**
 * Created by lenovo on 2017/6/15.
 */
public interface ActiveCodeService {
    public ActiveCodeEntity selectCodeById(Integer id);

    public void updateActiveCodePhone(String phone);
}
