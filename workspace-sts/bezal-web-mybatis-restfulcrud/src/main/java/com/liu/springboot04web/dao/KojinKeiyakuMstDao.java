package com.liu.springboot04web.dao;

import com.liu.springboot04web.bean.BankKouzaMst;
import com.liu.springboot04web.bean.KojinKeiyakuMst;
import com.liu.springboot04web.constant.BezalDeclareConstant;
import com.liu.springboot04web.mapper.BankKouzaMstMapper;
import com.liu.springboot04web.mapper.KojinKeiyakuMstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class KojinKeiyakuMstDao {

	@Autowired
	private KojinKeiyakuMstMapper kojinKeiyakuMstMapper;
	
	public List<KojinKeiyakuMst> getInfoList() {
		List<KojinKeiyakuMst> list = kojinKeiyakuMstMapper.getInfoList();
		System.out.println("select的口座数据：\n" + list.toString());
		return list;
	}

	public KojinKeiyakuMst getInfoById(String id) {
		KojinKeiyakuMst kojinKeiyakuMst = kojinKeiyakuMstMapper.getInfoById(id);
		System.out.println("select的口座数据：" + kojinKeiyakuMst.toString());
		return kojinKeiyakuMst;
	}

	// 执行部门信息的保存处理
	public void save(KojinKeiyakuMst kojinKeiyakuMst) {
		if(kojinKeiyakuMst.getKeiyakuMngNo() == null
				|| kojinKeiyakuMst.getKeiyakuMngNo().isEmpty()) {

			Map map=new HashMap();
			map.put("p1", BezalDeclareConstant.CONSTANT_KOJIN_KEIYAKU_SEQ);
			// 口座管理番号的自动采番
			kojinKeiyakuMstMapper.getNextSequence(map);
			kojinKeiyakuMst.setKeiyakuMngNo(BezalDeclareConstant.CONSTANT_KOJIN_KEIYAKU_SEQ+(Integer)map.get("p2"));
			System.out.println(map.get("p2"));
			insert(kojinKeiyakuMst);
		} else {
			update(kojinKeiyakuMst);
		}
	}
	// 添加新部门
	private void insert(KojinKeiyakuMst bankKouzaMst) {
		System.out.println("insert的口座数据：" + bankKouzaMst.toString());
		kojinKeiyakuMstMapper.insertInfo(bankKouzaMst);

	}
	// 修改指定部门
	private void update(KojinKeiyakuMst bankKouzaMst) {
		System.out.println("update的口座数据：" + bankKouzaMst.toString());
		kojinKeiyakuMstMapper.updateInfo(bankKouzaMst);
	}
	// 删除指定部门
	public void delete(String id) { kojinKeiyakuMstMapper.deleteInfo(id); }


	//获取SqlSession对象
//	public SqlSession getSqlSession() throws IOException {
//		SqlSession session = null;
//		InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
//		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
//		session = sessionFactory.openSession()
//		return session;
//	}
}
