package com.bjsxt.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bjsxt.mapper.Noticemapper;
import com.bjsxt.pojo.Notice;
import com.bjsxt.service.NoticeService;
import com.bjsxt.util.MyBatisUtil;

public class NoticeServiceImpl   implements NoticeService{

	@Override
	public List<Notice> selAll() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSession();
		Noticemapper mapper = session.getMapper(Noticemapper.class);
		List<Notice> list = mapper.selAll();
		return list;
	}

	@Override
	public int insNotice() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSession();
		Noticemapper mapper = session.getMapper(Noticemapper.class);
		   return mapper.insnotice();
	}

}
