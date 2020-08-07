package com.tangjianghua.shardingsphere.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tangjianghua
 * @since 2020-07-29
 */
public class Merchant implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String platCode;

    private String orgId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlatCode() {
        return platCode;
    }

    public void setPlatCode(String platCode) {
        this.platCode = platCode;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public String toString() {
        return "Merchant{" +
        "id=" + id +
        ", platCode=" + platCode +
        ", orgId=" + orgId +
        "}";
    }
}
