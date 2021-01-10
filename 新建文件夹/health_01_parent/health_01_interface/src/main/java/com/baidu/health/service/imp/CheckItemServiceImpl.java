package com.baidu.health.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.baidu.health.dao.CheckItemDao;
import com.baidu.health.pojo.CheckItem;
import com.baidu.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//发布服务注解，使用Alibaba的包。interfaceclass指定服务的接口类。也可以不指定
@Service(interfaceClass = CheckItemService.class)
public class CheckItemServiceImpl implements CheckItemService {
    //注入dao
    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public List<CheckItem> findAll() {
        return checkItemDao.findAll();
    }
}
