package com.jsh.model.vo.materials;

import java.io.InputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class AccountItemModel implements Serializable {
    private AccountItemShowModel showModel = new AccountItemShowModel();

    /**
     * ======开始接受页面参数=================
     **/
    private Long HeaderId;
    private Long AccountId;
    private Long InOutItemId;
    private Double EachAmount;
    private String Remark = "";

    private String Inserted = "";   //json插入记录
    private String Deleted = "";    //json删除记录
    private String Updated = "";    //json修改记录

    private String HeadIds = "";    //表头集合列表
    private String ListType = "";   //单据类型
    private String MonthTime = "";  //月份
    private String browserType = "";
    /**
     * 文件名称
     */
    private String fileName = "";
    /**
     * 分类ID
     */
    private Long accountItemID = 0l;

    /**
     * 分类IDs 批量操作使用
     */
    private String accountItemIDs = "";

    /**
     * 每页显示的个数
     */
    private int pageSize = 800;

    /**
     * 当前页码
     */
    private int pageNo = 1;

    /**
     * 用户IP，用户记录操作日志
     */
    private String clientIp = "";


    /**
     * 输入流，导出excel文件
     */
    private InputStream excelStream;

    public AccountItemShowModel getShowModel() {
        return showModel;
    }

    public void setShowModel(AccountItemShowModel showModel) {
        this.showModel = showModel;
    }

    public Long getHeaderId() {
        return HeaderId;
    }

    public void setHeaderId(Long headerId) {
        HeaderId = headerId;
    }

    public Long getAccountId() {
        return AccountId;
    }

    public void setAccountId(Long accountId) {
        AccountId = accountId;
    }

    public Long getInOutItemId() {
        return InOutItemId;
    }

    public void setInOutItemId(Long inOutItemId) {
        InOutItemId = inOutItemId;
    }

    public Double getEachAmount() {
        return EachAmount;
    }

    public void setEachAmount(Double eachAmount) {
        EachAmount = eachAmount;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getInserted() {
        return Inserted;
    }

    public void setInserted(String inserted) {
        Inserted = inserted;
    }

    public String getDeleted() {
        return Deleted;
    }

    public void setDeleted(String deleted) {
        Deleted = deleted;
    }

    public String getUpdated() {
        return Updated;
    }

    public void setUpdated(String updated) {
        Updated = updated;
    }

    public String getHeadIds() {
        return HeadIds;
    }

    public void setHeadIds(String headIds) {
        HeadIds = headIds;
    }

    public String getListType() {
        return ListType;
    }

    public void setListType(String listType) {
        ListType = listType;
    }

    public String getMonthTime() {
        return MonthTime;
    }

    public void setMonthTime(String monthTime) {
        MonthTime = monthTime;
    }

    public String getBrowserType() {
        return browserType;
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getAccountItemID() {
        return accountItemID;
    }

    public void setAccountItemID(Long accountItemID) {
        this.accountItemID = accountItemID;
    }

    public String getAccountItemIDs() {
        return accountItemIDs;
    }

    public void setAccountItemIDs(String accountItemIDs) {
        this.accountItemIDs = accountItemIDs;
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

    public InputStream getExcelStream() {
        return excelStream;
    }

    public void setExcelStream(InputStream excelStream) {
        this.excelStream = excelStream;
    }
}
