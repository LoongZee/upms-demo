package com.loongzee.cms.dao.model;

import java.io.Serializable;

public class CmsMenu implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer menuId;

    /**
     * 父菜单
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 链接
     *
     * @mbg.generated
     */
    private String url;

    /**
     * 打开方式
     *
     * @mbg.generated
     */
    private String target;

    /**
     * 排序
     *
     * @mbg.generated
     */
    private Long orders;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_menu.menu_id
     *
     * @return the value of cms_menu.menu_id
     *
     * @mbg.generated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_menu.menu_id
     *
     * @param menuId the value for cms_menu.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_menu.pid
     *
     * @return the value of cms_menu.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_menu.pid
     *
     * @param pid the value for cms_menu.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_menu.name
     *
     * @return the value of cms_menu.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_menu.name
     *
     * @param name the value for cms_menu.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_menu.url
     *
     * @return the value of cms_menu.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_menu.url
     *
     * @param url the value for cms_menu.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_menu.target
     *
     * @return the value of cms_menu.target
     *
     * @mbg.generated
     */
    public String getTarget() {
        return target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_menu.target
     *
     * @param target the value for cms_menu.target
     *
     * @mbg.generated
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_menu.orders
     *
     * @return the value of cms_menu.orders
     *
     * @mbg.generated
     */
    public Long getOrders() {
        return orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_menu.orders
     *
     * @param orders the value for cms_menu.orders
     *
     * @mbg.generated
     */
    public void setOrders(Long orders) {
        this.orders = orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_menu
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", target=").append(target);
        sb.append(", orders=").append(orders);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_menu
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
        CmsMenu other = (CmsMenu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTarget() == null ? other.getTarget() == null : this.getTarget().equals(other.getTarget()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_menu
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTarget() == null) ? 0 : getTarget().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        return result;
    }
}