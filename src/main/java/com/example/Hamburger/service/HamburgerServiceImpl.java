package com.example.Hamburger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hamburger.dao.HamburgerDao;
import com.example.Hamburger.entity.Hamburger;

@Service
public class HamburgerServiceImpl implements HamburgerService{
	@Autowired private HamburgerDao hamburgerDao;
	@Override
	public List<Hamburger> getHamburgerList() {
		return hamburgerDao.getHamburgerList();
	}
}
