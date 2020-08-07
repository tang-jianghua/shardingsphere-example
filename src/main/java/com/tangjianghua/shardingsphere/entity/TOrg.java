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
public class TOrg implements Serializable {

    private static final long serialVersionUID=1L;

    private String platCode;

    private String orgId;

    private String orgName;


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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "TOrg{" +
        "platCode=" + platCode +
        ", orgId=" + orgId +
        ", orgName=" + orgName +
        "}";
    }
}
