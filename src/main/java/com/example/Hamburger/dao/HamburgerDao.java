package com.example.Hamburger.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.Hamburger.entity.Hamburger;

@Mapper
public interface HamburgerDao {
	@Select ("Select * from hamburger")
		List<Hamburger> getHamburgerList();
}
