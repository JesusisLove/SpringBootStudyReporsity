package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.BankKouzaMst;

import java.util.List;
import java.util.Map;

public interface BankKouzaMstMapper {

    public BankKouzaMst getBankKouzaById(String id);
    public List<BankKouzaMst> getBankKouzaAll();
    public void updateBankKouza(BankKouzaMst kouza);
    public void insertBankKouza(BankKouzaMst kouza);
    public void deleteBankKouza(String id);

    //查询存储过程的方法
    public void callProcedure(Map map);
    //查询函数的方法:
    public void getNextSequence(Map map);

}
