package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Notice;

public interface Noticemapper {
	
	@Select("select * from notice")
	List<Notice>  selAll();
	@Insert("insert into notice values(#{0},#{1},#{2},#{3})")
	int  insnotice();

}
