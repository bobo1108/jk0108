package cn.itcast.jk.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.pagination.Page;
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao{

	@Override
	public List<Factory> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Factory> find(Map paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

}
