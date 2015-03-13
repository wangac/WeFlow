package com.etoc.weflow.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table FREQUENT_QQ.
 */
public class FrequentQQ {

    private Long id;
    /** Not-null value. */
    private String qq_num;

    public FrequentQQ() {
    }

    public FrequentQQ(Long id) {
        this.id = id;
    }

    public FrequentQQ(Long id, String qq_num) {
        this.id = id;
        this.qq_num = qq_num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getQq_num() {
        return qq_num;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setQq_num(String qq_num) {
        this.qq_num = qq_num;
    }

}