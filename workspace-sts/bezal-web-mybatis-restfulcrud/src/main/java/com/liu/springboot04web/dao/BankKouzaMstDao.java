package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.BankKouzaMst;
import com.liu.springboot04web.bean.Department;
import com.liu.springboot04web.constant.BezalDeclareConstant;
import com.liu.springboot04web.mapper.BankKouzaMstMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BankKouzaMstDao {

	@Autowired
	private BankKouzaMstMapper bankKouzaMstMapper;
	
	public List<BankKouzaMst> getKouzaAll() {
		List<BankKouzaMst> list = bankKouzaMstMapper.getBankKouzaAll();
		System.out.println("select的口座数据：\n" + list.toString());
		return list;
	}

	public BankKouzaMst getBankKouza(String id) {
		BankKouzaMst bankKouzaMst = bankKouzaMstMapper.getBankKouzaById(id);
		System.out.println("select的口座数据：" + bankKouzaMst.toString());
		return bankKouzaMst;
	}

	// 执行部门信息的保存处理
	public void save(BankKouzaMst bankKouzaMst) {
		if(bankKouzaMst.getBankAccountMngNo() == null
				|| bankKouzaMst.getBankAccountMngNo().isEmpty()) {
//			SqlSession session = null;
//			try {
//				session = getSqlSession();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			BankKouzaMstMapper cm=session.getMapper(BankKouzaMstMapper.class);
			Map map=new HashMap();
			map.put("p1", BezalDeclareConstant.CONSTANT_KOUZA_SEQ);
			// 口座管理番号的自动采番
			bankKouzaMstMapper.getNextSequence(map);
			bankKouzaMst.setBankAccountMngNo(BezalDeclareConstant.CONSTANT_KOUZA_SEQ+(Integer)map.get("p2"));
			System.out.println(map.get("p2"));
			insert(bankKouzaMst);
		} else {
			update(bankKouzaMst);
		}
	}
	// 添加新部门
	private void insert(BankKouzaMst bankKouzaMst) {
		System.out.println("insert的口座数据：" + bankKouzaMst.toString());
		bankKouzaMstMapper.insertBankKouza(bankKouzaMst);

	}
	// 修改指定部门
	private void update(BankKouzaMst bankKouzaMst) {
		System.out.println("update的口座数据：" + bankKouzaMst.toString());
		bankKouzaMstMapper.updateBankKouza(bankKouzaMst);
	}
	// 删除指定部门
	public void delete(String id) { bankKouzaMstMapper.deleteBankKouza(id); }


	//获取SqlSession对象
//	public SqlSession getSqlSession() throws IOException {
//		SqlSession session = null;
//		InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
//		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
//		session = sessionFactory.openSession()
//		return session;
//	}
}
