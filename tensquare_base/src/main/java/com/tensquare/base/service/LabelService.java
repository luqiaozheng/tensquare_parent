package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * <FileName> LableService
 * <Author>   lqz
 * <Time>  2020/5/8 20:58
 * <Desc> 业务逻辑层
 **/
@Service
public class LabelService {
    @Autowired
    private LabelDao labelDao ;

    public Label getById(String id) {

        return labelDao.getOne(id);
    }

    @Modifying
    @Transactional
    public void addLabel(Label label) {
        labelDao.save(label);
    }

    public List<Label> queryAllLabelList() {
        return labelDao.findAll();
    }

    @Modifying
    @Transactional
    public Label updateById(Label label) {
        //save 判断如果id不存在，则新增， 如果id存在，则修改
        return labelDao.save(label);
    }
    @Modifying
    public void deleteById(String id) {
        labelDao.deleteById(id);
    }
}

