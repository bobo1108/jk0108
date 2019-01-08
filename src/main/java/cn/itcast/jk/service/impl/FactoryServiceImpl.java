package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.FactoryService;

@Service
public class FactoryServiceImpl implements FactoryService{
	
	@Resource
	FactoryDao factoryDao;

	public List<Factory> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Factory> find(Map paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public Factory get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Factory factory) {
		// TODO Auto-generated method stub
		
	}

	public void update(Factory factory) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}
	
	
}
