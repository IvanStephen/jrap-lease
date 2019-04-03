package com.jingrui.jrap.product.dto;

/**
 * Auto Generated By Jrap Code Generator
 **/

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Table;

import com.jingrui.jrap.system.dto.BaseDTO;

import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "pro_product_config")
public class ProductConfig extends BaseDTO {
    public static final String FIELD_CONFIG_ID = "configId";
    public static final String FIELD_PRODUCT_CODE = "productCode";
    public static final String FIELD_CONFIG_TYPE = "configType";
    public static final String FIELD_COLUMN_NAME = "columnName";
    public static final String FIELD_COLUMN_CODE = "columnCode";
    public static final String FIELD_CF_TYPE = "cfType";
    public static final String FIELD_DATA_TYPE = "dataType";
    public static final String FIELD_SYSTEM_FLAG = "systemFlag";
    public static final String FIELD_DISPLAY_FLAG = "displayFlag";
    public static final String FIELD_DISPLAY_ORDER = "displayOrder";
    public static final String FIELD_PROMPT = "prompt";
    public static final String FIELD_REQUIRE_FLAG = "requireFlag";
    public static final String FIELD_READONLY_FLAG = "readonlyFlag";
    public static final String FIELD_DATA_PRECISION = "dataPrecision";
    public static final String FIELD_DEFAULT_VALUE = "defaultValue";
    public static final String FIELD_DATA_STATUS = "dataStatus";
    public static final String FIELD_ENABLED_FLAG = "enabledFlag";
    public static final String FIELD_REMARK = "remark";
    public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
    public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


    @Id
    @GeneratedValue
    private Long configId;

    @Length(max = 100)
    private String productCode; //产品表Code

    @Length(max = 1)
    private String configType; //字段类型

    @Length(max = 100)
    private String columnName; //案件表字段

    @Length(max = 60)
    private String columnCode; //字典编码

    @Length(max = 60)
    private String cfType; //现金流类型

    @Length(max = 60)
    private String dataType; //数据类型

    @Length(max = 1)
    private String systemFlag; //系统标识

    @Length(max = 1)
    private String displayFlag; //展示标识

    private Long displayOrder; //展示顺序

    @Length(max = 100)
    private String prompt; //描述

    @Length(max = 1)
    private String requireFlag; //必输标识

    @Length(max = 1)
    private String readonlyFlag; //只读标识

    private Long dataPrecision; //精度

    @Length(max = 100)
    private String defaultValue; //默认值

    @Length(max = 1)
    private String dataStatus; //状态

    @Length(max = 1)
    private String enabledFlag; //启用标识

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public Long getConfigId() {
        return configId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public String getConfigType() {
        return configType;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    public String getColumnCode() {
        return columnCode;
    }

    public void setCfType(String cfType) {
        this.cfType = cfType;
    }

    public String getCfType() {
        return cfType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setSystemFlag(String systemFlag) {
        this.systemFlag = systemFlag;
    }

    public String getSystemFlag() {
        return systemFlag;
    }

    public void setDisplayFlag(String displayFlag) {
        this.displayFlag = displayFlag;
    }

    public String getDisplayFlag() {
        return displayFlag;
    }

    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Long getDisplayOrder() {
        return displayOrder;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setRequireFlag(String requireFlag) {
        this.requireFlag = requireFlag;
    }

    public String getRequireFlag() {
        return requireFlag;
    }

    public void setReadonlyFlag(String readonlyFlag) {
        this.readonlyFlag = readonlyFlag;
    }

    public String getReadonlyFlag() {
        return readonlyFlag;
    }

    public void setDataPrecision(Long dataPrecision) {
        this.dataPrecision = dataPrecision;
    }

    public Long getDataPrecision() {
        return dataPrecision;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

}
