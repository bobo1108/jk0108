package cn.itcast.jk.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.pagination.Page;

public interface FactoryService {
	public List<Factory> findPage(Page page); //分页查询
	public List<Factory> find(Map paraMap); //带条件查询，条件可以为null，既没有条件
	public Factory get(Serializable id); //只查询一个，常用语修改
	public void insert(Factory factory); //插入，用实体作为参数
	public void update(Factory factory); //修改，用实体作为参数
	public void delete(Serializable id); //按id删除，删除一条，支持整数型和字符串
	public void delete(Serializable[] ids); //批量删除，支持整数型和字符串型
}
