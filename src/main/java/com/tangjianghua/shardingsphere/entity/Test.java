package com.tangjianghua.shardingsphere.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-31
 */
public class Test implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("NAME")
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
        "id=" + id +
        ", name=" + name +
        "}";
    }
}
