package com.loongzee.upms.dao.model;

import java.io.Serializable;

public class UpmsLog implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer logId;

    /**
     * 操作描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 操作用户
     *
     * @mbg.generated
     */
    private String username;

    /**
     * 操作时间
     *
     * @mbg.generated
     */
    private Long startTime;

    /**
     * 消耗时间
     *
     * @mbg.generated
     */
    private Integer spendTime;

    /**
     * 根路径
     *
     * @mbg.generated
     */
    private String basePath;

    /**
     * URI
     *
     * @mbg.generated
     */
    private String uri;

    /**
     * URL
     *
     * @mbg.generated
     */
    private String url;

    /**
     * 请求类型
     *
     * @mbg.generated
     */
    private String method;

    /**
     * 用户标识
     *
     * @mbg.generated
     */
    private String userAgent;

    /**
     * IP地址
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * 权限值
     *
     * @mbg.generated
     */
    private String permissions;

    private String parameter;

    private String result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table upms_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.log_id
     *
     * @return the value of upms_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.log_id
     *
     * @param logId the value for upms_log.log_id
     *
     * @mbg.generated
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.description
     *
     * @return the value of upms_log.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.description
     *
     * @param description the value for upms_log.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.username
     *
     * @return the value of upms_log.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.username
     *
     * @param username the value for upms_log.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.start_time
     *
     * @return the value of upms_log.start_time
     *
     * @mbg.generated
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.start_time
     *
     * @param startTime the value for upms_log.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.spend_time
     *
     * @return the value of upms_log.spend_time
     *
     * @mbg.generated
     */
    public Integer getSpendTime() {
        return spendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.spend_time
     *
     * @param spendTime the value for upms_log.spend_time
     *
     * @mbg.generated
     */
    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.base_path
     *
     * @return the value of upms_log.base_path
     *
     * @mbg.generated
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.base_path
     *
     * @param basePath the value for upms_log.base_path
     *
     * @mbg.generated
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.uri
     *
     * @return the value of upms_log.uri
     *
     * @mbg.generated
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.uri
     *
     * @param uri the value for upms_log.uri
     *
     * @mbg.generated
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.url
     *
     * @return the value of upms_log.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.url
     *
     * @param url the value for upms_log.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.method
     *
     * @return the value of upms_log.method
     *
     * @mbg.generated
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.method
     *
     * @param method the value for upms_log.method
     *
     * @mbg.generated
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.user_agent
     *
     * @return the value of upms_log.user_agent
     *
     * @mbg.generated
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.user_agent
     *
     * @param userAgent the value for upms_log.user_agent
     *
     * @mbg.generated
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.ip
     *
     * @return the value of upms_log.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.ip
     *
     * @param ip the value for upms_log.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.permissions
     *
     * @return the value of upms_log.permissions
     *
     * @mbg.generated
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.permissions
     *
     * @param permissions the value for upms_log.permissions
     *
     * @mbg.generated
     */
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.parameter
     *
     * @return the value of upms_log.parameter
     *
     * @mbg.generated
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.parameter
     *
     * @param parameter the value for upms_log.parameter
     *
     * @mbg.generated
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_log.result
     *
     * @return the value of upms_log.result
     *
     * @mbg.generated
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_log.result
     *
     * @param result the value for upms_log.result
     *
     * @mbg.generated
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_log
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", description=").append(description);
        sb.append(", username=").append(username);
        sb.append(", startTime=").append(startTime);
        sb.append(", spendTime=").append(spendTime);
        sb.append(", basePath=").append(basePath);
        sb.append(", uri=").append(uri);
        sb.append(", url=").append(url);
        sb.append(", method=").append(method);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", ip=").append(ip);
        sb.append(", permissions=").append(permissions);
        sb.append(", parameter=").append(parameter);
        sb.append(", result=").append(result);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_log
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UpmsLog other = (UpmsLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getSpendTime() == null ? other.getSpendTime() == null : this.getSpendTime().equals(other.getSpendTime()))
            && (this.getBasePath() == null ? other.getBasePath() == null : this.getBasePath().equals(other.getBasePath()))
            && (this.getUri() == null ? other.getUri() == null : this.getUri().equals(other.getUri()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getUserAgent() == null ? other.getUserAgent() == null : this.getUserAgent().equals(other.getUserAgent()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getPermissions() == null ? other.getPermissions() == null : this.getPermissions().equals(other.getPermissions()))
            && (this.getParameter() == null ? other.getParameter() == null : this.getParameter().equals(other.getParameter()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getSpendTime() == null) ? 0 : getSpendTime().hashCode());
        result = prime * result + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        result = prime * result + ((getUri() == null) ? 0 : getUri().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        result = prime * result + ((getParameter() == null) ? 0 : getParameter().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        return result;
    }
}