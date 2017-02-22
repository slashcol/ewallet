package com.fr.chain.property.db.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.fr.chain.property.db.entity.Property;
import com.fr.chain.property.db.entity.PropertyExample.Criteria;
import com.fr.chain.property.db.entity.PropertyExample.Criterion;
import com.fr.chain.property.db.entity.PropertyExample;
import java.util.List;
import java.util.Map;

public class PropertySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    public String countByExample(PropertyExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("PROPERTY");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    public String deleteByExample(PropertyExample example) {
        BEGIN();
        DELETE_FROM("PROPERTY");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    public String insertSelective(Property record) {
        BEGIN();
        INSERT_INTO("PROPERTY");
        
        if (record.getPropertyId() != null) {
            VALUES("PROPERTY_ID", "#{propertyId,jdbcType=CHAR}");
        }
        
        if (record.getMerchantId() != null) {
            VALUES("MERCHANT_ID", "#{merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            VALUES("APP_ID", "#{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            VALUES("OPEN_ID", "#{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            VALUES("PRODUCT_ID", "#{productId,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyType() != null) {
            VALUES("PROPERTY_TYPE", "#{propertyType,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginOpenid() != null) {
            VALUES("ORIGIN_OPENID", "#{originOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getIsSelfSupport() != null) {
            VALUES("IS_SELF_SUPPORT", "#{isSelfSupport,jdbcType=VARCHAR}");
        }
        
        if (record.getProductDesc() != null) {
            VALUES("PRODUCT_DESC", "#{productDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDigit() != null) {
            VALUES("IS_DIGIT", "#{isDigit,jdbcType=VARCHAR}");
        }
        
        if (record.getSignType() != null) {
            VALUES("SIGN_TYPE", "#{signType,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyName() != null) {
            VALUES("PROPERTY_NAME", "#{propertyName,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            VALUES("UNIT", "#{unit,jdbcType=VARCHAR}");
        }
        
        if (record.getMinCount() != null) {
            VALUES("MIN_COUNT", "#{minCount,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            VALUES("COUNT", "#{count,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            VALUES("URL", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            VALUES("AMOUNT", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getDescription() != null) {
            VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    public String selectByExample(PropertyExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("PROPERTY_ID");
        } else {
            SELECT("PROPERTY_ID");
        }
        SELECT("MERCHANT_ID");
        SELECT("APP_ID");
        SELECT("OPEN_ID");
        SELECT("PRODUCT_ID");
        SELECT("PROPERTY_TYPE");
        SELECT("ADDRESS");
        SELECT("ORIGIN_OPENID");
        SELECT("IS_SELF_SUPPORT");
        SELECT("PRODUCT_DESC");
        SELECT("IS_DIGIT");
        SELECT("SIGN_TYPE");
        SELECT("PROPERTY_NAME");
        SELECT("UNIT");
        SELECT("MIN_COUNT");
        SELECT("COUNT");
        SELECT("URL");
        SELECT("AMOUNT");
        SELECT("DESCRIPTION");
        SELECT("CREATE_TIME");
        SELECT("STATUS");
        FROM("PROPERTY");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example != null){
            return SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Property record = (Property) parameter.get("record");
        PropertyExample example = (PropertyExample) parameter.get("example");
        
        BEGIN();
        UPDATE("PROPERTY");
        
        if (record.getPropertyId() != null) {
            SET("PROPERTY_ID = #{record.propertyId,jdbcType=CHAR}");
        }
        
        if (record.getMerchantId() != null) {
            SET("MERCHANT_ID = #{record.merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            SET("APP_ID = #{record.appId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            SET("OPEN_ID = #{record.openId,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            SET("PRODUCT_ID = #{record.productId,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyType() != null) {
            SET("PROPERTY_TYPE = #{record.propertyType,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginOpenid() != null) {
            SET("ORIGIN_OPENID = #{record.originOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getIsSelfSupport() != null) {
            SET("IS_SELF_SUPPORT = #{record.isSelfSupport,jdbcType=VARCHAR}");
        }
        
        if (record.getProductDesc() != null) {
            SET("PRODUCT_DESC = #{record.productDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDigit() != null) {
            SET("IS_DIGIT = #{record.isDigit,jdbcType=VARCHAR}");
        }
        
        if (record.getSignType() != null) {
            SET("SIGN_TYPE = #{record.signType,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyName() != null) {
            SET("PROPERTY_NAME = #{record.propertyName,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            SET("UNIT = #{record.unit,jdbcType=VARCHAR}");
        }
        
        if (record.getMinCount() != null) {
            SET("MIN_COUNT = #{record.minCount,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            SET("COUNT = #{record.count,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("URL = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("AMOUNT = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getDescription() != null) {
            SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("PROPERTY");
        
        SET("PROPERTY_ID = #{record.propertyId,jdbcType=CHAR}");
        SET("MERCHANT_ID = #{record.merchantId,jdbcType=VARCHAR}");
        SET("APP_ID = #{record.appId,jdbcType=VARCHAR}");
        SET("OPEN_ID = #{record.openId,jdbcType=VARCHAR}");
        SET("PRODUCT_ID = #{record.productId,jdbcType=VARCHAR}");
        SET("PROPERTY_TYPE = #{record.propertyType,jdbcType=VARCHAR}");
        SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        SET("ORIGIN_OPENID = #{record.originOpenid,jdbcType=VARCHAR}");
        SET("IS_SELF_SUPPORT = #{record.isSelfSupport,jdbcType=VARCHAR}");
        SET("PRODUCT_DESC = #{record.productDesc,jdbcType=VARCHAR}");
        SET("IS_DIGIT = #{record.isDigit,jdbcType=VARCHAR}");
        SET("SIGN_TYPE = #{record.signType,jdbcType=VARCHAR}");
        SET("PROPERTY_NAME = #{record.propertyName,jdbcType=VARCHAR}");
        SET("UNIT = #{record.unit,jdbcType=VARCHAR}");
        SET("MIN_COUNT = #{record.minCount,jdbcType=VARCHAR}");
        SET("COUNT = #{record.count,jdbcType=VARCHAR}");
        SET("URL = #{record.url,jdbcType=VARCHAR}");
        SET("AMOUNT = #{record.amount,jdbcType=DECIMAL}");
        SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("STATUS = #{record.status,jdbcType=INTEGER}");
        
        PropertyExample example = (PropertyExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    public String updateByPrimaryKeySelective(Property record) {
        BEGIN();
        UPDATE("PROPERTY");
        
        if (record.getMerchantId() != null) {
            SET("MERCHANT_ID = #{merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            SET("APP_ID = #{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            SET("OPEN_ID = #{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            SET("PRODUCT_ID = #{productId,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyType() != null) {
            SET("PROPERTY_TYPE = #{propertyType,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginOpenid() != null) {
            SET("ORIGIN_OPENID = #{originOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getIsSelfSupport() != null) {
            SET("IS_SELF_SUPPORT = #{isSelfSupport,jdbcType=VARCHAR}");
        }
        
        if (record.getProductDesc() != null) {
            SET("PRODUCT_DESC = #{productDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDigit() != null) {
            SET("IS_DIGIT = #{isDigit,jdbcType=VARCHAR}");
        }
        
        if (record.getSignType() != null) {
            SET("SIGN_TYPE = #{signType,jdbcType=VARCHAR}");
        }
        
        if (record.getPropertyName() != null) {
            SET("PROPERTY_NAME = #{propertyName,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            SET("UNIT = #{unit,jdbcType=VARCHAR}");
        }
        
        if (record.getMinCount() != null) {
            SET("MIN_COUNT = #{minCount,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            SET("COUNT = #{count,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("URL = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("AMOUNT = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getDescription() != null) {
            SET("DESCRIPTION = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=INTEGER}");
        }
        
        WHERE("PROPERTY_ID = #{propertyId,jdbcType=CHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROPERTY
     *
     * @mbggenerated Wed Feb 22 12:10:39 CST 2017
     */
    protected void applyWhere(PropertyExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}