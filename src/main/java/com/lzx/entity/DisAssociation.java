package com.lzx.entity;

public class DisAssociation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_association.ord_order_id
     *
     * @mbg.generated
     */
    private String ordOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_association.del_delivery_receipt_id
     *
     * @mbg.generated
     */
    private String delDeliveryReceiptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_association.order_id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_association.delivery_receipt_id
     *
     * @mbg.generated
     */
    private String deliveryReceiptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_association.ord_order_id
     *
     * @return the value of dis_association.ord_order_id
     *
     * @mbg.generated
     */
    public String getOrdOrderId() {
        return ordOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_association.ord_order_id
     *
     * @param ordOrderId the value for dis_association.ord_order_id
     *
     * @mbg.generated
     */
    public void setOrdOrderId(String ordOrderId) {
        this.ordOrderId = ordOrderId == null ? null : ordOrderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_association.del_delivery_receipt_id
     *
     * @return the value of dis_association.del_delivery_receipt_id
     *
     * @mbg.generated
     */
    public String getDelDeliveryReceiptId() {
        return delDeliveryReceiptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_association.del_delivery_receipt_id
     *
     * @param delDeliveryReceiptId the value for dis_association.del_delivery_receipt_id
     *
     * @mbg.generated
     */
    public void setDelDeliveryReceiptId(String delDeliveryReceiptId) {
        this.delDeliveryReceiptId = delDeliveryReceiptId == null ? null : delDeliveryReceiptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_association.order_id
     *
     * @return the value of dis_association.order_id
     *
     * @mbg.generated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_association.order_id
     *
     * @param orderId the value for dis_association.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_association.delivery_receipt_id
     *
     * @return the value of dis_association.delivery_receipt_id
     *
     * @mbg.generated
     */
    public String getDeliveryReceiptId() {
        return deliveryReceiptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_association.delivery_receipt_id
     *
     * @param deliveryReceiptId the value for dis_association.delivery_receipt_id
     *
     * @mbg.generated
     */
    public void setDeliveryReceiptId(String deliveryReceiptId) {
        this.deliveryReceiptId = deliveryReceiptId == null ? null : deliveryReceiptId.trim();
    }
}