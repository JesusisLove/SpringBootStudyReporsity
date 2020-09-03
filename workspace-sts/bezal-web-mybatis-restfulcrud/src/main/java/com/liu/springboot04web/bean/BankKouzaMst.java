package com.liu.springboot04web.bean;

import java.util.Date;

public class BankKouzaMst {

    private String sysId;
    private String bankAccountMngNo;
    private String bankName;
    private String branchNo;
    private String branchName;
    private Integer yokinType;
    private String bankAccountNo;
    private String bankAccountOwnName;
    private Date timeStampNew;
    private Date timeStampUpdate;
    private String tantoshaCode;
    private Integer delFlg;

    public BankKouzaMst() {
    }

    public BankKouzaMst(String sysId, String bankAccountMngNo, String bankName, String branchNo, String branchName, Integer yokinType, String bankAccountNo, String bankAccountOwnName, Date timeStampNew, Date timeStampUpdate, String tantoshaCode, Integer delFlg) {
        this.sysId = sysId;
        this.bankAccountMngNo = bankAccountMngNo;
        this.bankName = bankName;
        this.branchNo = branchNo;
        this.branchName = branchName;
        this.yokinType = yokinType;
        this.bankAccountNo = bankAccountNo;
        this.bankAccountOwnName = bankAccountOwnName;
        this.timeStampNew = timeStampNew;
        this.timeStampUpdate = timeStampUpdate;
        this.tantoshaCode = tantoshaCode;
        this.delFlg = delFlg;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getBankAccountMngNo() {
        return bankAccountMngNo;
    }

    public void setBankAccountMngNo(String bankAccountMngNo) {
        this.bankAccountMngNo = bankAccountMngNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getYokinType() {
        return yokinType;
    }

    public void setYokinType(Integer yokinType) {
        this.yokinType = yokinType;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountOwnName() {
        return bankAccountOwnName;
    }

    public void setBankAccountOwnName(String bankAccountOwnName) {
        this.bankAccountOwnName = bankAccountOwnName;
    }

    public Date getTimeStampNew() {
        return timeStampNew;
    }

    public void setTimeStampNew(Date timeStampNew) {
        this.timeStampNew = timeStampNew;
    }

    public Date getTimeStampUpdate() {
        return timeStampUpdate;
    }

    public void setTimeStampUpdate(Date timeStampUpdate) {
        this.timeStampUpdate = timeStampUpdate;
    }

    public String getTantoshaCode() {
        return tantoshaCode;
    }

    public void setTantoshaCode(String tantoshaCode) {
        this.tantoshaCode = tantoshaCode;
    }

    public Integer getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    @Override
    public String toString() {
        return "BankKouzaMst{" +
                "sysId='" + sysId + '\'' +
                ", bankAccountMngNo='" + bankAccountMngNo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branchNo='" + branchNo + '\'' +
                ", branchName='" + branchName + '\'' +
                ", yokinType=" + yokinType +
                ", bankAccountNo='" + bankAccountNo + '\'' +
                ", bankAccountOwnName='" + bankAccountOwnName + '\'' +
                ", timeStampNew=" + timeStampNew +
                ", timeStampUpdate=" + timeStampUpdate +
                ", tantoshaCode='" + tantoshaCode + '\'' +
                ", delFlg=" + delFlg +
                '}';
    }
}
