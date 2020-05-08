package com.tensquare.base.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <FileName> Label
 * <Author>   lqz
 * <Time>  2020/5/8 20:48
 * <Desc> 实体类
 **/
@Entity
@Table(name = "tb_label")
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class Label implements Serializable {
    @Id
    private String id;//
    private String labelname;// 标签名称
    private String state;// 状态
    private Long count;// 使用数量
    private Long fans;// 关注数
    private String recommend;// 是否推荐

}

