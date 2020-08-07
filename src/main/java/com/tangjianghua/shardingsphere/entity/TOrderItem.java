package com.tangjianghua.shardingsphere.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-30
 */
public class TOrderItem implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer orderId;

    private String item;

    private Integer orderItemId;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    @Override
    public String toString() {
        return "TOrderItem{" +
        "orderId=" + orderId +
        ", item=" + item +
        ", orderItemId=" + orderItemId +
        "}";
    }
}
