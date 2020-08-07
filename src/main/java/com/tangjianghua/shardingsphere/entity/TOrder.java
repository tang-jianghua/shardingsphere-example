package com.tangjianghua.shardingsphere.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-30
 */
public class TOrder implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer orderId;

    private LocalDateTime created;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "TOrder{" +
        "orderId=" + orderId +
        ", created=" + created +
        "}";
    }
}
