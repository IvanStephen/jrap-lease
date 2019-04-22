package com.jingrui.jrap.order.dto;

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

import org.hibernate.validator.constraints.NotEmpty;

@ExtensionAttribute(disable = true)
@Table(name = "con_order")
public class Order extends BaseDTO {

    public static final String FIELD_ORDER_ID = "orderId";
    public static final String FIELD_ORDER_CODE = "orderCode";
    public static final String FIELD_DOCUMENT_CATEGORY = "documentCategory";
    public static final String FIELD_DOCUMENT_TYPE = "documentType";
    public static final String FIELD_ORDER_STATUS = "orderStatus";
    public static final String FIELD_PRODUCT_CODE = "productCode";
    public static final String FIELD_BUSINESS_TYPE = "businessType";
    public static final String FIELD_CHANGE_ID = "changeId";
    public static final String FIELD_CUSTOMER_ID = "customerId";
    public static final String FIELD_ITEM_ID = "itemId";
    public static final String FIELD_AGENT_ID = "agentId";
    public static final String FIELD_COMPANY_ID = "companyId";
    public static final String FIELD_UNIT_ID = "unitId";
    public static final String FIELD_EMPLOYEE_ID = "employeeId";
    public static final String FIELD_RISK_EMPLOYEE_ID = "riskEmployeeId";
    public static final String FIELD_GUIDE_PRICE = "guidePrice";
    public static final String FIELD_EVALUATION_AMOUNT = "evaluationAmount";
    public static final String FIELD_LEASE_AMOUNT = "leaseAmount";
    public static final String FIELD_FINANCE_AMOUNT = "financeAmount";
    public static final String FIELD_CONTRACT_AMOUNT = "contractAmount";
    public static final String FIELD_NET_FINANCE_AMOUNT = "netFinanceAmount";
    public static final String FIELD_VAT_FINANCE_AMOUNT = "vatFinanceAmount";
    public static final String FIELD_DOWN_PAYMENT = "downPayment";
    public static final String FIELD_NET_DOWN_PAYMENT = "netDownPayment";
    public static final String FIELD_VAT_DOWN_PAYMENT = "vatDownPayment";
    public static final String FIELD_FINAL_PAYMENT = "finalPayment";
    public static final String FIELD_RESIDUAL_VALUE = "residualValue";
    public static final String FIELD_VAT_INPUT = "vatInput";
    public static final String FIELD_LEASE_TIMES = "leaseTimes";
    public static final String FIELD_PAY_TYPE = "payType";
    public static final String FIELD_PAY_TIMES = "payTimes";
    public static final String FIELD_ANNUAL_PAY_TIMES = "annualPayTimes";
    public static final String FIELD_LEASE_TERM = "leaseTerm";
    public static final String FIELD_BASE_RATE = "baseRate";
    public static final String FIELD_INT_RATE = "intRate";
    public static final String FIELD_INT_RATE_IMPLICIT = "intRateImplicit";
    public static final String FIELD_INT_RATE_REAL = "intRateReal";
    public static final String FIELD_INT_RATE_TYPE = "intRateType";
    public static final String FIELD_PLATE_PRICE = "platePrice";
    public static final String FIELD_INSURANCE_AMOUNT = "insuranceAmount";
    public static final String FIELD_MORTGAGE_FEE = "mortgageFee";
    public static final String FIELD_CHARGE = "charge";
    public static final String FIELD_GPS_FEE = "gpsFee";
    public static final String FIELD_PARKING_FEE = "parkingFee";
    public static final String FIELD_PROPERTY_FEE = "propertyFee";
    public static final String FIELD_DOCUMENT_FEE = "documentFee";
    public static final String FIELD_PURCHASE_TAX = "purchaseTax";
    public static final String FIELD_NOTARIAL_FEE = "notarialFee";
    public static final String FIELD_CREDIT_FEE = "creditFee";
    public static final String FIELD_LICENSE_FEE = "licenseFee";
    public static final String FIELD_OTHER_FEE_01 = "otherFee01";
    public static final String FIELD_OTHER_FEE_02 = "otherFee02";
    public static final String FIELD_OTHER_FEE_03 = "otherFee03";
    public static final String FIELD_OTHER_FEE_04 = "otherFee04";
    public static final String FIELD_OTHER_FEE_05 = "otherFee05";
    public static final String FIELD_TOTAL_FEE = "totalFee";
    public static final String FIELD_NET_TOTAL_FEE = "netTotalFee";
    public static final String FIELD_VAT_TOTAL_FEE = "vatTotalFee";
    public static final String FIELD_VIOLATION_DEPOSIT = "violationDeposit";
    public static final String FIELD_INSURANCE_DEPOSIT = "insuranceDeposit";
    public static final String FIELD_ANNUAL_SURVEY_DEPOSIT = "annualSurveyDeposit";
    public static final String FIELD_OTHER_DEPOSIT_01 = "otherDeposit01";
    public static final String FIELD_OTHER_DEPOSIT_02 = "otherDeposit02";
    public static final String FIELD_OTHER_DEPOSIT_03 = "otherDeposit03";
    public static final String FIELD_OTHER_DEPOSIT_04 = "otherDeposit04";
    public static final String FIELD_OTHER_DEPOSIT_05 = "otherDeposit05";
    public static final String FIELD_TOTAL_DEPOSIT = "totalDeposit";
    public static final String FIELD_TOTAL_RENTAL = "totalRental";
    public static final String FIELD_NET_TOTAL_RENTAL = "netTotalRental";
    public static final String FIELD_VAT_TOTAL_RENTAL = "vatTotalRental";
    public static final String FIELD_TOTAL_INTEREST = "totalInterest";
    public static final String FIELD_NET_TOTAL_INTEREST = "netTotalInterest";
    public static final String FIELD_VAT_TOTAL_INTEREST = "vatTotalInterest";
    public static final String FIELD_FINANCE_INCOME = "financeIncome";
    public static final String FIELD_NET_FINANCE_INCOME = "netFinanceIncome";
    public static final String FIELD_VAT_FINANCE_INCOME = "vatFinanceIncome";
    public static final String FIELD_RECEIVE_RENTAL = "receiveRental";
    public static final String FIELD_RECEIVE_PRINCIPAL = "receivePrincipal";
    public static final String FIELD_RECEIVE_INTEREST = "receiveInterest";
    public static final String FIELD_DEPOSIT_BALANCE = "depositBalance";
    public static final String FIELD_SUBMIT_DATE = "submitDate";
    public static final String FIELD_APPROVED_DATE = "approvedDate";
    public static final String FIELD_REFUSE_DATE = "refuseDate";
    public static final String FIELD_SIGNING_DATE = "signingDate";
    public static final String FIELD_SIGNED_DATE = "signedDate";
    public static final String FIELD_PAYMENT_DATE = "paymentDate";
    public static final String FIELD_DELIVERY_DATE = "deliveryDate";
    public static final String FIELD_INCEPT_DATE = "inceptDate";
    public static final String FIELD_FINISHED_DATE = "finishedDate";
    public static final String FIELD_START_DATE = "startDate";
    public static final String FIELD_END_DATE = "endDate";
    public static final String FIELD_OVERDUE_FLAG = "overdueFlag";
    public static final String FIELD_TOTAL_OVERDUE = "totalOverdue";
    public static final String FIELD_BILL_STATUS = "billStatus";
    public static final String FIELD_DELIVERY_STATUS = "deliveryStatus";
    public static final String FIELD_INT_RATE_PRECISION = "intRatePrecision";
    public static final String FIELD_IRR = "irr";
    public static final String FIELD_IRR_AFTER_TAX = "irrAfterTax";
    public static final String FIELD_PMT = "pmt";
    public static final String FIELD_PMT_FIRST = "pmtFirst";
    public static final String FIELD_CALC_PROMPT = "calcPrompt";
    public static final String FIELD_CALC_PROMPT_MSG = "calcPromptMsg";
    public static final String FIELD_SOURCE_TYPE = "sourceType";
    public static final String FIELD_SOURCE_ID = "sourceId";
    public static final String FIELD_USER_STATUS_1 = "userStatus1";
    public static final String FIELD_USER_STATUS_2 = "userStatus2";
    public static final String FIELD_DATA_CLASS = "dataClass";


    @Id
    @GeneratedValue
    private Long orderId;

    @NotEmpty
    @Length(max = 60)
    private String orderCode; //订单编号

    @NotEmpty
    @Length(max = 60)
    private String documentCategory; //单据类别

    @NotEmpty
    @Length(max = 60)
    private String documentType; //单据类型

    @NotEmpty
    @Length(max = 60)
    private String orderStatus; //订单状态

    @Length(max = 60)
    private String productCode; //产品编号

    @Length(max = 60)
    private String businessType; //业务类型

    private Long changeId; //商机ID

    private Long customerId; //客户ID

    private Long itemId; //租赁物ID

    private Long agentId; //供应商ID

    private Long companyId; //公司ID

    private Long unitId; //机构ID

    private Long employeeId; //业务员ID

    private Long riskEmployeeId; //风控员ID

    private Double guidePrice; //建议价

    private Double evaluationAmount; //评估价

    private Double leaseAmount; //租赁物价款

    private Double financeAmount; //融资金额

    private Double contractAmount; //合同总额（首付+各项费用+租金+尾款+留购价款)

    private Double netFinanceAmount; //不含税融资额

    private Double vatFinanceAmount; //融资额增值税

    private Double downPayment; //首付款

    private Double netDownPayment; //不含税首付金额

    private Double vatDownPayment; //首付款税额

    private Double finalPayment; //尾款

    private Double residualValue; //留购价款

    private Double vatInput; //进项增值税额

    private Double leaseTimes; //租赁期数

    @Length(max = 1)
    private String payType; //支付类型（1/先付 0/后付）

    private int payTimes; //支付期数

    private int annualPayTimes; //支付频率（年）

    private int leaseTerm; //租赁期限

    private Double baseRate; //基准利率

    private Double intRate; //租赁利率

    private Double intRateImplicit; //租赁利率（实际）

    private Double intRateReal; //税后实际利率

    @Length(max = 60)
    private String intRateType; //利率类型：浮动/FLOATING 固定/FIXED

    private Double platePrice; //牌照费

    private Double insuranceAmount; //保险费

    private Double mortgageFee; //抵押费

    private Double charge; //手续费

    private Double gpsFee; //GPS费

    private Double parkingFee; //停车费

    private Double propertyFee; //产调费

    private Double documentFee; //查档费

    private Double purchaseTax; //购置税

    private Double notarialFee; //公证费

    private Double creditFee; //征信费

    private Double licenseFee; //上牌费

    private Double otherFee01; //其他费用01

    private Double otherFee02; //其他费用02

    private Double otherFee03; //其他费用03

    private Double otherFee04; //其他费用04

    private Double otherFee05; //其他费用05

    private Double totalFee; //总费用

    private Double netTotalFee; //不含税费用金额

    private Double vatTotalFee; //费用增值税额

    private Double violationDeposit; //违章押金

    private Double insuranceDeposit; //保险押金

    private Double annualSurveyDeposit; //年检押金

    private Double otherDeposit01; //其他押金01

    private Double otherDeposit02; //其他押金02

    private Double otherDeposit03; //其他押金03

    private Double otherDeposit04; //其他押金04

    private Double otherDeposit05; //其他押金05

    private Double totalDeposit; //总押金

    private Double totalRental; //总租金

    private Double netTotalRental; //不含税租金

    private Double vatTotalRental; //租金增值税额

    private Double totalInterest; //利息总额

    private Double netTotalInterest; //不含税利息

    private Double vatTotalInterest; //利息增值税额

    private Double financeIncome; //租赁收入

    private Double netFinanceIncome; //不含税租赁收入

    private Double vatFinanceIncome; //租赁收入税额

    private Double receiveRental; //已收租金

    private Double receivePrincipal; //已收本金

    private Double receiveInterest; //已收利息

    private Double depositBalance; //押金余额

    private Date submitDate; //申请日期

    private Date approvedDate; //通过日期

    private Date refuseDate; //拒绝日期

    private Date signingDate; //签约申请日期

    private Date signedDate; //签约日期

    private Date paymentDate; //放款日期

    private Date deliveryDate; //提车日期

    private Date inceptDate; //起租日期

    private Date finishedDate; //过户日期

    private Date startDate; //开始日期

    private Date endDate; //结束日期

    @Length(max = 1)
    private String overdueFlag; //逾期状态

    private Long totalOverdue; //逾期天数合计

    @Length(max = 60)
    private String billStatus; //开票状态（NOT/PARTIAL/FULL）

    @Length(max = 1)
    private String deliveryStatus; //提前状态

    private int intRatePrecision; //利率精度

    private Double irr; //内部收益率

    private Double irrAfterTax; //税后内部收益率

    private Double pmt; //等额本息租金

    private Double pmtFirst; //等额本息租金（首期）

    @Length(max = 100)
    private String calcPrompt; //租金计算结果提示

    @Length(max = 500)
    private String calcPromptMsg; //租金计算结果提示信息

    @Length(max = 60)
    private String sourceType; //订单来源

    private Long sourceId; //源ID

    @Length(max = 60)
    private String userStatus1; //订单状态01

    @Length(max = 60)
    private String userStatus2; //订单状态01

    @Length(max = 60)
    private String dataClass; //数据种类（NORMAL/HISTORY/CHANGE）

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getDocumentCategory() {
        return documentCategory;
    }

    public void setDocumentCategory(String documentCategory) {
        this.documentCategory = documentCategory;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Long getChangeId() {
        return changeId;
    }

    public void setChangeId(Long changeId) {
        this.changeId = changeId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getRiskEmployeeId() {
        return riskEmployeeId;
    }

    public void setRiskEmployeeId(Long riskEmployeeId) {
        this.riskEmployeeId = riskEmployeeId;
    }

    public Double getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(Double guidePrice) {
        this.guidePrice = guidePrice;
    }

    public Double getEvaluationAmount() {
        return evaluationAmount;
    }

    public void setEvaluationAmount(Double evaluationAmount) {
        this.evaluationAmount = evaluationAmount;
    }

    public Double getLeaseAmount() {
        return leaseAmount;
    }

    public void setLeaseAmount(Double leaseAmount) {
        this.leaseAmount = leaseAmount;
    }

    public Double getFinanceAmount() {
        return financeAmount;
    }

    public void setFinanceAmount(Double financeAmount) {
        this.financeAmount = financeAmount;
    }

    public Double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public Double getNetFinanceAmount() {
        return netFinanceAmount;
    }

    public void setNetFinanceAmount(Double netFinanceAmount) {
        this.netFinanceAmount = netFinanceAmount;
    }

    public Double getVatFinanceAmount() {
        return vatFinanceAmount;
    }

    public void setVatFinanceAmount(Double vatFinanceAmount) {
        this.vatFinanceAmount = vatFinanceAmount;
    }

    public Double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Double downPayment) {
        this.downPayment = downPayment;
    }

    public Double getNetDownPayment() {
        return netDownPayment;
    }

    public void setNetDownPayment(Double netDownPayment) {
        this.netDownPayment = netDownPayment;
    }

    public Double getVatDownPayment() {
        return vatDownPayment;
    }

    public void setVatDownPayment(Double vatDownPayment) {
        this.vatDownPayment = vatDownPayment;
    }

    public Double getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(Double finalPayment) {
        this.finalPayment = finalPayment;
    }

    public Double getResidualValue() {
        return residualValue;
    }

    public void setResidualValue(Double residualValue) {
        this.residualValue = residualValue;
    }

    public Double getVatInput() {
        return vatInput;
    }

    public void setVatInput(Double vatInput) {
        this.vatInput = vatInput;
    }

    public Double getLeaseTimes() {
        return leaseTimes;
    }

    public void setLeaseTimes(Double leaseTimes) {
        this.leaseTimes = leaseTimes;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public int getPayTimes() {
        return payTimes;
    }

    public void setPayTimes(int payTimes) {
        this.payTimes = payTimes;
    }

    public int getAnnualPayTimes() {
        return annualPayTimes;
    }

    public void setAnnualPayTimes(int annualPayTimes) {
        this.annualPayTimes = annualPayTimes;
    }

    public int getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public Double getIntRate() {
        return intRate;
    }

    public void setIntRate(Double intRate) {
        this.intRate = intRate;
    }

    public Double getIntRateImplicit() {
        return intRateImplicit;
    }

    public void setIntRateImplicit(Double intRateImplicit) {
        this.intRateImplicit = intRateImplicit;
    }

    public Double getIntRateReal() {
        return intRateReal;
    }

    public void setIntRateReal(Double intRateReal) {
        this.intRateReal = intRateReal;
    }

    public String getIntRateType() {
        return intRateType;
    }

    public void setIntRateType(String intRateType) {
        this.intRateType = intRateType;
    }

    public Double getPlatePrice() {
        return platePrice;
    }

    public void setPlatePrice(Double platePrice) {
        this.platePrice = platePrice;
    }

    public Double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Double getMortgageFee() {
        return mortgageFee;
    }

    public void setMortgageFee(Double mortgageFee) {
        this.mortgageFee = mortgageFee;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Double getGpsFee() {
        return gpsFee;
    }

    public void setGpsFee(Double gpsFee) {
        this.gpsFee = gpsFee;
    }

    public Double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(Double parkingFee) {
        this.parkingFee = parkingFee;
    }

    public Double getPropertyFee() {
        return propertyFee;
    }

    public void setPropertyFee(Double propertyFee) {
        this.propertyFee = propertyFee;
    }

    public Double getDocumentFee() {
        return documentFee;
    }

    public void setDocumentFee(Double documentFee) {
        this.documentFee = documentFee;
    }

    public Double getPurchaseTax() {
        return purchaseTax;
    }

    public void setPurchaseTax(Double purchaseTax) {
        this.purchaseTax = purchaseTax;
    }

    public Double getNotarialFee() {
        return notarialFee;
    }

    public void setNotarialFee(Double notarialFee) {
        this.notarialFee = notarialFee;
    }

    public Double getCreditFee() {
        return creditFee;
    }

    public void setCreditFee(Double creditFee) {
        this.creditFee = creditFee;
    }

    public Double getLicenseFee() {
        return licenseFee;
    }

    public void setLicenseFee(Double licenseFee) {
        this.licenseFee = licenseFee;
    }

    public Double getOtherFee01() {
        return otherFee01;
    }

    public void setOtherFee01(Double otherFee01) {
        this.otherFee01 = otherFee01;
    }

    public Double getOtherFee02() {
        return otherFee02;
    }

    public void setOtherFee02(Double otherFee02) {
        this.otherFee02 = otherFee02;
    }

    public Double getOtherFee03() {
        return otherFee03;
    }

    public void setOtherFee03(Double otherFee03) {
        this.otherFee03 = otherFee03;
    }

    public Double getOtherFee04() {
        return otherFee04;
    }

    public void setOtherFee04(Double otherFee04) {
        this.otherFee04 = otherFee04;
    }

    public Double getOtherFee05() {
        return otherFee05;
    }

    public void setOtherFee05(Double otherFee05) {
        this.otherFee05 = otherFee05;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public Double getNetTotalFee() {
        return netTotalFee;
    }

    public void setNetTotalFee(Double netTotalFee) {
        this.netTotalFee = netTotalFee;
    }

    public Double getVatTotalFee() {
        return vatTotalFee;
    }

    public void setVatTotalFee(Double vatTotalFee) {
        this.vatTotalFee = vatTotalFee;
    }

    public Double getViolationDeposit() {
        return violationDeposit;
    }

    public void setViolationDeposit(Double violationDeposit) {
        this.violationDeposit = violationDeposit;
    }

    public Double getInsuranceDeposit() {
        return insuranceDeposit;
    }

    public void setInsuranceDeposit(Double insuranceDeposit) {
        this.insuranceDeposit = insuranceDeposit;
    }

    public Double getAnnualSurveyDeposit() {
        return annualSurveyDeposit;
    }

    public void setAnnualSurveyDeposit(Double annualSurveyDeposit) {
        this.annualSurveyDeposit = annualSurveyDeposit;
    }

    public Double getOtherDeposit01() {
        return otherDeposit01;
    }

    public void setOtherDeposit01(Double otherDeposit01) {
        this.otherDeposit01 = otherDeposit01;
    }

    public Double getOtherDeposit02() {
        return otherDeposit02;
    }

    public void setOtherDeposit02(Double otherDeposit02) {
        this.otherDeposit02 = otherDeposit02;
    }

    public Double getOtherDeposit03() {
        return otherDeposit03;
    }

    public void setOtherDeposit03(Double otherDeposit03) {
        this.otherDeposit03 = otherDeposit03;
    }

    public Double getOtherDeposit04() {
        return otherDeposit04;
    }

    public void setOtherDeposit04(Double otherDeposit04) {
        this.otherDeposit04 = otherDeposit04;
    }

    public Double getOtherDeposit05() {
        return otherDeposit05;
    }

    public void setOtherDeposit05(Double otherDeposit05) {
        this.otherDeposit05 = otherDeposit05;
    }

    public Double getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(Double totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

    public Double getTotalRental() {
        return totalRental;
    }

    public void setTotalRental(Double totalRental) {
        this.totalRental = totalRental;
    }

    public Double getNetTotalRental() {
        return netTotalRental;
    }

    public void setNetTotalRental(Double netTotalRental) {
        this.netTotalRental = netTotalRental;
    }

    public Double getVatTotalRental() {
        return vatTotalRental;
    }

    public void setVatTotalRental(Double vatTotalRental) {
        this.vatTotalRental = vatTotalRental;
    }

    public Double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(Double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public Double getNetTotalInterest() {
        return netTotalInterest;
    }

    public void setNetTotalInterest(Double netTotalInterest) {
        this.netTotalInterest = netTotalInterest;
    }

    public Double getVatTotalInterest() {
        return vatTotalInterest;
    }

    public void setVatTotalInterest(Double vatTotalInterest) {
        this.vatTotalInterest = vatTotalInterest;
    }

    public Double getFinanceIncome() {
        return financeIncome;
    }

    public void setFinanceIncome(Double financeIncome) {
        this.financeIncome = financeIncome;
    }

    public Double getNetFinanceIncome() {
        return netFinanceIncome;
    }

    public void setNetFinanceIncome(Double netFinanceIncome) {
        this.netFinanceIncome = netFinanceIncome;
    }

    public Double getVatFinanceIncome() {
        return vatFinanceIncome;
    }

    public void setVatFinanceIncome(Double vatFinanceIncome) {
        this.vatFinanceIncome = vatFinanceIncome;
    }

    public Double getReceiveRental() {
        return receiveRental;
    }

    public void setReceiveRental(Double receiveRental) {
        this.receiveRental = receiveRental;
    }

    public Double getReceivePrincipal() {
        return receivePrincipal;
    }

    public void setReceivePrincipal(Double receivePrincipal) {
        this.receivePrincipal = receivePrincipal;
    }

    public Double getReceiveInterest() {
        return receiveInterest;
    }

    public void setReceiveInterest(Double receiveInterest) {
        this.receiveInterest = receiveInterest;
    }

    public Double getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(Double depositBalance) {
        this.depositBalance = depositBalance;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getRefuseDate() {
        return refuseDate;
    }

    public void setRefuseDate(Date refuseDate) {
        this.refuseDate = refuseDate;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Date getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getInceptDate() {
        return inceptDate;
    }

    public void setInceptDate(Date inceptDate) {
        this.inceptDate = inceptDate;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOverdueFlag() {
        return overdueFlag;
    }

    public void setOverdueFlag(String overdueFlag) {
        this.overdueFlag = overdueFlag;
    }

    public Long getTotalOverdue() {
        return totalOverdue;
    }

    public void setTotalOverdue(Long totalOverdue) {
        this.totalOverdue = totalOverdue;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public int getIntRatePrecision() {
        return intRatePrecision;
    }

    public void setIntRatePrecision(int intRatePrecision) {
        this.intRatePrecision = intRatePrecision;
    }

    public Double getIrr() {
        return irr;
    }

    public void setIrr(Double irr) {
        this.irr = irr;
    }

    public Double getIrrAfterTax() {
        return irrAfterTax;
    }

    public void setIrrAfterTax(Double irrAfterTax) {
        this.irrAfterTax = irrAfterTax;
    }

    public Double getPmt() {
        return pmt;
    }

    public void setPmt(Double pmt) {
        this.pmt = pmt;
    }

    public Double getPmtFirst() {
        return pmtFirst;
    }

    public void setPmtFirst(Double pmtFirst) {
        this.pmtFirst = pmtFirst;
    }

    public String getCalcPrompt() {
        return calcPrompt;
    }

    public void setCalcPrompt(String calcPrompt) {
        this.calcPrompt = calcPrompt;
    }

    public String getCalcPromptMsg() {
        return calcPromptMsg;
    }

    public void setCalcPromptMsg(String calcPromptMsg) {
        this.calcPromptMsg = calcPromptMsg;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getUserStatus1() {
        return userStatus1;
    }

    public void setUserStatus1(String userStatus1) {
        this.userStatus1 = userStatus1;
    }

    public String getUserStatus2() {
        return userStatus2;
    }

    public void setUserStatus2(String userStatus2) {
        this.userStatus2 = userStatus2;
    }

    public String getDataClass() {
        return dataClass;
    }

    public void setDataClass(String dataClass) {
        this.dataClass = dataClass;
    }
}
