package com.jsh.model.vo.materials;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AccountHeadModel implements Serializable {
    private AccountHeadShowModel showModel = new AccountHeadShowModel();

    /**
     * ======开始接受页面参数=================
     **/
    private String Type;
    private Long OrganId;
    private Long HandsPersonId;
    private Double ChangeAmount;
    private Double TotalPrice;
    private Long AccountId;
    private String BillNo;
    private String BillTime;
    private String Remark;
    private String BeginTime; //查询开始时间
    private String EndTime;  //查询结束时间
    private String MonthTime;  //查询月份

    private String supplierId; //单位Id，用于查询单位的收付款

    private String supType; //单位类型，客户、供应商
    /**
     * 分类ID
     */
    private Long accountHeadID = 0l;

    /**
     * 分类IDs 批量操作使用
     */
    private String accountHeadIDs = "";

    /**
     * 每页显示的个数
     */
    private int pageSize = 10;

    /**
     * 当前页码
     */
    private int pageNo = 1;

    /**
     * 用户IP，用户记录操作日志
     */
    private String clientIp = "";

    public AccountHeadShowModel getShowModel() {
        return showModel;
    }

    public void setShowModel(AccountHeadShowModel showModel) {
        this.showModel = showModel;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Long getOrganId() {
        return OrganId;
    }

    public void setOrganId(Long organId) {
        OrganId = organId;
    }

    public Long getHandsPersonId() {
        return HandsPersonId;
    }

    public void setHandsPersonId(Long handsPersonId) {
        HandsPersonId = handsPersonId;
    }

    public Double getChangeAmount() {
        return ChangeAmount;
    }

    public void setChangeAmount(Double changeAmount) {
        ChangeAmount = changeAmount;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }

    public Long getAccountId() {
        return AccountId;
    }

    public void setAccountId(Long accountId) {
        AccountId = accountId;
    }

    public String getBillNo() {
        return BillNo;
    }

    public void setBillNo(String billNo) {
        BillNo = billNo;
    }

    public String getBillTime() {
        return BillTime;
    }

    public void setBillTime(String billTime) {
        BillTime = billTime;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getMonthTime() {
        return MonthTime;
    }

    public void setMonthTime(String monthTime) {
        MonthTime = monthTime;
    }

    public Long getAccountHeadID() {
        return accountHeadID;
    }

    public void setAccountHeadID(Long accountHeadID) {
        this.accountHeadID = accountHeadID;
    }

    public String getAccountHeadIDs() {
        return accountHeadIDs;
    }

    public void setAccountHeadIDs(String accountHeadIDs) {
        this.accountHeadIDs = accountHeadIDs;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupType() {
        return supType;
    }

    public void setSupType(String supType) {
        this.supType = supType;
    }
}
