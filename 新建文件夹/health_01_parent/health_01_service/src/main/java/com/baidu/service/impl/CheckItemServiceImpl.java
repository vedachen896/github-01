package com.baidu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baidu.health.dao.CheckItemDao;
import com.baidu.health.pojo.CheckItem;
import com.baidu.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 检查项服务
 * </p>
 *
 * @author: Eric
 * @since: 2021/1/5
 */
// 使用alibaba的包，发布服务 interfaceClass指定服务的接口类
@Service(interfaceClass = CheckItemService.class)
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public List<CheckItem> findAll() {
        return checkItemDao.findAll();
    }


}
