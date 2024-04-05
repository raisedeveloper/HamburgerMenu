package com.example.Hamburger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hamburger {
	private String bid;
	private String bname;
	private String bprice;
	private String btext;
}
