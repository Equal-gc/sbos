package com.xe.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Table(name = "jy_goods")

public class JyGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 物品名称
     */
    private String goods;

    /**
     * 数量
     */
    private String qualtity;

    /**
     * 物品状态
     */
    private String states;

    private String person;

    /**
     * 购买时间
     */
    private String buytime;

    private String isdelete;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 入库时间
     */
    private String entrytime;

    /**
     * 出库时间
     */
    private String deliverytime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取物品名称
     *
     * @return goods - 物品名称
     */
    public String getGoods() {
        return goods;
    }

    /**
     * 设置物品名称
     *
     * @param goods 物品名称
     */
    public void setGoods(String goods) {
        this.goods = goods;
    }

    /**
     * 获取数量
     *
     * @return qualtity - 数量
     */
    public String getQualtity() {
        return qualtity;
    }

    /**
     * 设置数量
     *
     * @param qualtity 数量
     */
    public void setQualtity(String qualtity) {
        this.qualtity = qualtity;
    }

    /**
     * 获取物品状态
     *
     * @return states - 物品状态
     */
    public String getStates() {
        return states;
    }

    /**
     * 设置物品状态
     *
     * @param states 物品状态
     */
    public void setStates(String states) {
        this.states = states;
    }

    /**
     * @return person
     */
    public String getPerson() {
        return person;
    }

    /**
     * @param person
     */
    public void setPerson(String person) {
        this.person = person;
    }

    /**
     * 获取购买时间
     *
     * @return buytime - 购买时间
     */
    public String getBuytime() {
        return buytime;
    }

    /**
     * 设置购买时间
     *
     * @param buytime 购买时间
     */
    public void setBuytime(String buytime) {
        this.buytime = buytime;
    }

    /**
     * @return isdelete
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * @param isdelete
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取品牌
     *
     * @return brand - 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌
     *
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取入库时间
     *
     * @return entrytime - 入库时间
     */
    public String getEntrytime() {
        return entrytime;
    }

    /**
     * 设置入库时间
     *
     * @param entrytime 入库时间
     */
    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    /**
     * 获取出库时间
     *
     * @return deliverytime - 出库时间
     */
    public String getDeliverytime() {
        return deliverytime;
    }

    /**
     * 设置出库时间
     *
     * @param deliverytime 出库时间
     */
    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }
}