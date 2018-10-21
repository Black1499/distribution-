package com.lzx.entity;

import java.util.Date;

public class DisCustomer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.customer_id
     *
     * @mbg.generated
     */
    private String customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.customer_name
     *
     * @mbg.generated
     */
    private String customerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.customer_sex
     *
     * @mbg.generated
     */
    private String customerSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.customer_psd
     *
     * @mbg.generated
     */
    private String customerPsd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.birthday
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.tel
     *
     * @mbg.generated
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_customer.comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.customer_id
     *
     * @return the value of dis_customer.customer_id
     *
     * @mbg.generated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.customer_id
     *
     * @param customerId the value for dis_customer.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.customer_name
     *
     * @return the value of dis_customer.customer_name
     *
     * @mbg.generated
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.customer_name
     *
     * @param customerName the value for dis_customer.customer_name
     *
     * @mbg.generated
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.customer_sex
     *
     * @return the value of dis_customer.customer_sex
     *
     * @mbg.generated
     */
    public String getCustomerSex() {
        return customerSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.customer_sex
     *
     * @param customerSex the value for dis_customer.customer_sex
     *
     * @mbg.generated
     */
    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.customer_psd
     *
     * @return the value of dis_customer.customer_psd
     *
     * @mbg.generated
     */
    public String getCustomerPsd() {
        return customerPsd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.customer_psd
     *
     * @param customerPsd the value for dis_customer.customer_psd
     *
     * @mbg.generated
     */
    public void setCustomerPsd(String customerPsd) {
        this.customerPsd = customerPsd == null ? null : customerPsd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.birthday
     *
     * @return the value of dis_customer.birthday
     *
     * @mbg.generated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.birthday
     *
     * @param birthday the value for dis_customer.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.tel
     *
     * @return the value of dis_customer.tel
     *
     * @mbg.generated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.tel
     *
     * @param tel the value for dis_customer.tel
     *
     * @mbg.generated
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.address
     *
     * @return the value of dis_customer.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.address
     *
     * @param address the value for dis_customer.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_customer.comment
     *
     * @return the value of dis_customer.comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_customer.comment
     *
     * @param comment the value for dis_customer.comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}