package com.mindata.blockmanager.model;

import com.mindata.blockmanager.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 联盟的成员
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "member")
public class Member extends BaseEntity {
    /**
     * 成员id，用于校验该客户是否合法，客户端启动时需要带着该值
     */
    private String memberId;
    /**
     * 成员名
     */
    private String name;
    /**
     * ip（可不设置，由该成员客户端启动后自行检测）
     */
    private String ip;
    /**
     * 成员客户端端口号
     */
    private Integer port;

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}