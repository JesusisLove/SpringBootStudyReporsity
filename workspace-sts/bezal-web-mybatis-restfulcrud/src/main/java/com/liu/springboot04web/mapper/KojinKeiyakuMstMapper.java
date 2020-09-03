package com.liu.springboot04web.mapper;

import com.liu.springboot04web.bean.BankKouzaMst;
import com.liu.springboot04web.bean.KojinKeiyakuMst;

import java.util.List;
import java.util.Map;

public interface KojinKeiyakuMstMapper {

    public KojinKeiyakuMst getInfoById(String id);
    public List<KojinKeiyakuMst> getInfoList();
    public void updateInfo(KojinKeiyakuMst kouza);
    public void insertInfo(KojinKeiyakuMst kouza);
    public void deleteInfo(String id);

    //查询存储过程的方法
    public void callProcedure(Map map);
    //查询函数的方法:
    public void getNextSequence(Map map);

}
