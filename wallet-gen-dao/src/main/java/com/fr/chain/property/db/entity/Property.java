package com.fr.chain.property.db.entity;

import com.fr.chain.utils.CustomDateSerializer;
import com.fr.chain.web.bean.Tab;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="PROPERTY")
public class Property extends PropertyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.ORDER_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.MERCHANT_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String merchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.APP_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.OPEN_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.PRODUCT_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.PROPERTY_TYPE
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.ADDRESS
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.ORIGIN_OPENID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String originOpenid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.IS_SELF_SUPPORT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String isSelfSupport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.PRODUCT_DESC
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String productDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.IS_DIGIT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String isDigit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.SIGN_TYPE
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String signType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.PROPERTY_NAME
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String propertyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.UNIT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.MIN_COUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String minCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.COUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.URL
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.AMOUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.DESCRIPTION
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.CREATE_TIME
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PROPERTY.STATUS
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.ORDER_ID
     *
     * @return the value of PROPERTY.ORDER_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.ORDER_ID
     *
     * @param orderId the value for PROPERTY.ORDER_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.MERCHANT_ID
     *
     * @return the value of PROPERTY.MERCHANT_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.MERCHANT_ID
     *
     * @param merchantId the value for PROPERTY.MERCHANT_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.APP_ID
     *
     * @return the value of PROPERTY.APP_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.APP_ID
     *
     * @param appId the value for PROPERTY.APP_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.OPEN_ID
     *
     * @return the value of PROPERTY.OPEN_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.OPEN_ID
     *
     * @param openId the value for PROPERTY.OPEN_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.PRODUCT_ID
     *
     * @return the value of PROPERTY.PRODUCT_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.PRODUCT_ID
     *
     * @param productId the value for PROPERTY.PRODUCT_ID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.PROPERTY_TYPE
     *
     * @return the value of PROPERTY.PROPERTY_TYPE
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.PROPERTY_TYPE
     *
     * @param propertyType the value for PROPERTY.PROPERTY_TYPE
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.ADDRESS
     *
     * @return the value of PROPERTY.ADDRESS
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.ADDRESS
     *
     * @param address the value for PROPERTY.ADDRESS
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.ORIGIN_OPENID
     *
     * @return the value of PROPERTY.ORIGIN_OPENID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getOriginOpenid() {
        return originOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.ORIGIN_OPENID
     *
     * @param originOpenid the value for PROPERTY.ORIGIN_OPENID
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setOriginOpenid(String originOpenid) {
        this.originOpenid = originOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.IS_SELF_SUPPORT
     *
     * @return the value of PROPERTY.IS_SELF_SUPPORT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getIsSelfSupport() {
        return isSelfSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.IS_SELF_SUPPORT
     *
     * @param isSelfSupport the value for PROPERTY.IS_SELF_SUPPORT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setIsSelfSupport(String isSelfSupport) {
        this.isSelfSupport = isSelfSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.PRODUCT_DESC
     *
     * @return the value of PROPERTY.PRODUCT_DESC
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.PRODUCT_DESC
     *
     * @param productDesc the value for PROPERTY.PRODUCT_DESC
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.IS_DIGIT
     *
     * @return the value of PROPERTY.IS_DIGIT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getIsDigit() {
        return isDigit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.IS_DIGIT
     *
     * @param isDigit the value for PROPERTY.IS_DIGIT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setIsDigit(String isDigit) {
        this.isDigit = isDigit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.SIGN_TYPE
     *
     * @return the value of PROPERTY.SIGN_TYPE
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getSignType() {
        return signType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.SIGN_TYPE
     *
     * @param signType the value for PROPERTY.SIGN_TYPE
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.PROPERTY_NAME
     *
     * @return the value of PROPERTY.PROPERTY_NAME
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.PROPERTY_NAME
     *
     * @param propertyName the value for PROPERTY.PROPERTY_NAME
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.UNIT
     *
     * @return the value of PROPERTY.UNIT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.UNIT
     *
     * @param unit the value for PROPERTY.UNIT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.MIN_COUNT
     *
     * @return the value of PROPERTY.MIN_COUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getMinCount() {
        return minCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.MIN_COUNT
     *
     * @param minCount the value for PROPERTY.MIN_COUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setMinCount(String minCount) {
        this.minCount = minCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.COUNT
     *
     * @return the value of PROPERTY.COUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.COUNT
     *
     * @param count the value for PROPERTY.COUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.URL
     *
     * @return the value of PROPERTY.URL
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.URL
     *
     * @param url the value for PROPERTY.URL
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.AMOUNT
     *
     * @return the value of PROPERTY.AMOUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.AMOUNT
     *
     * @param amount the value for PROPERTY.AMOUNT
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.DESCRIPTION
     *
     * @return the value of PROPERTY.DESCRIPTION
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.DESCRIPTION
     *
     * @param description the value for PROPERTY.DESCRIPTION
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.CREATE_TIME
     *
     * @return the value of PROPERTY.CREATE_TIME
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.CREATE_TIME
     *
     * @param createTime the value for PROPERTY.CREATE_TIME
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PROPERTY.STATUS
     *
     * @return the value of PROPERTY.STATUS
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PROPERTY.STATUS
     *
     * @param status the value for PROPERTY.STATUS
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
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
        Property other = (Property) that;
        return (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getPropertyType() == null ? other.getPropertyType() == null : this.getPropertyType().equals(other.getPropertyType()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getOriginOpenid() == null ? other.getOriginOpenid() == null : this.getOriginOpenid().equals(other.getOriginOpenid()))
            && (this.getIsSelfSupport() == null ? other.getIsSelfSupport() == null : this.getIsSelfSupport().equals(other.getIsSelfSupport()))
            && (this.getProductDesc() == null ? other.getProductDesc() == null : this.getProductDesc().equals(other.getProductDesc()))
            && (this.getIsDigit() == null ? other.getIsDigit() == null : this.getIsDigit().equals(other.getIsDigit()))
            && (this.getSignType() == null ? other.getSignType() == null : this.getSignType().equals(other.getSignType()))
            && (this.getPropertyName() == null ? other.getPropertyName() == null : this.getPropertyName().equals(other.getPropertyName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getMinCount() == null ? other.getMinCount() == null : this.getMinCount().equals(other.getMinCount()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getPropertyType() == null) ? 0 : getPropertyType().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getOriginOpenid() == null) ? 0 : getOriginOpenid().hashCode());
        result = prime * result + ((getIsSelfSupport() == null) ? 0 : getIsSelfSupport().hashCode());
        result = prime * result + ((getProductDesc() == null) ? 0 : getProductDesc().hashCode());
        result = prime * result + ((getIsDigit() == null) ? 0 : getIsDigit().hashCode());
        result = prime * result + ((getSignType() == null) ? 0 : getSignType().hashCode());
        result = prime * result + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getMinCount() == null) ? 0 : getMinCount().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Thu Feb 23 16:37:02 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", appId=").append(appId);
        sb.append(", openId=").append(openId);
        sb.append(", productId=").append(productId);
        sb.append(", propertyType=").append(propertyType);
        sb.append(", address=").append(address);
        sb.append(", originOpenid=").append(originOpenid);
        sb.append(", isSelfSupport=").append(isSelfSupport);
        sb.append(", productDesc=").append(productDesc);
        sb.append(", isDigit=").append(isDigit);
        sb.append(", signType=").append(signType);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", unit=").append(unit);
        sb.append(", minCount=").append(minCount);
        sb.append(", count=").append(count);
        sb.append(", url=").append(url);
        sb.append(", amount=").append(amount);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}