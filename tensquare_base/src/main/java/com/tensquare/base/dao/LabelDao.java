package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <FileName> LabelDao
 * <Author>   lqz
 * <Time>  2020/5/8 20:51
 * <Desc> 持久层
 **/
public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {
}
