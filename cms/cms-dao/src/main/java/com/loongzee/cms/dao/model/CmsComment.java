package com.loongzee.cms.dao.model;

import java.io.Serializable;

public class CmsComment implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer commentId;

    /**
     * 回复楼中楼编号回复楼中楼编号
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     * 文章编号
     *
     * @mbg.generated
     */
    private Integer articleId;

    /**
     * 用户编号
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 状态(-1:不通过,0:未审核,1:通过)
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 评论人ip地址
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * 评论人终端信息
     *
     * @mbg.generated
     */
    private String agent;

    /**
     * 所属系统
     *
     * @mbg.generated
     */
    private Integer systemId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Long ctime;

    /**
     * 评论内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_comment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.comment_id
     *
     * @return the value of cms_comment.comment_id
     *
     * @mbg.generated
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.comment_id
     *
     * @param commentId the value for cms_comment.comment_id
     *
     * @mbg.generated
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.pid
     *
     * @return the value of cms_comment.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.pid
     *
     * @param pid the value for cms_comment.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.article_id
     *
     * @return the value of cms_comment.article_id
     *
     * @mbg.generated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.article_id
     *
     * @param articleId the value for cms_comment.article_id
     *
     * @mbg.generated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.user_id
     *
     * @return the value of cms_comment.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.user_id
     *
     * @param userId the value for cms_comment.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.status
     *
     * @return the value of cms_comment.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.status
     *
     * @param status the value for cms_comment.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.ip
     *
     * @return the value of cms_comment.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.ip
     *
     * @param ip the value for cms_comment.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.agent
     *
     * @return the value of cms_comment.agent
     *
     * @mbg.generated
     */
    public String getAgent() {
        return agent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.agent
     *
     * @param agent the value for cms_comment.agent
     *
     * @mbg.generated
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.system_id
     *
     * @return the value of cms_comment.system_id
     *
     * @mbg.generated
     */
    public Integer getSystemId() {
        return systemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.system_id
     *
     * @param systemId the value for cms_comment.system_id
     *
     * @mbg.generated
     */
    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.ctime
     *
     * @return the value of cms_comment.ctime
     *
     * @mbg.generated
     */
    public Long getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.ctime
     *
     * @param ctime the value for cms_comment.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_comment.content
     *
     * @return the value of cms_comment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_comment.content
     *
     * @param content the value for cms_comment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", pid=").append(pid);
        sb.append(", articleId=").append(articleId);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", ip=").append(ip);
        sb.append(", agent=").append(agent);
        sb.append(", systemId=").append(systemId);
        sb.append(", ctime=").append(ctime);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
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
        CmsComment other = (CmsComment) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}