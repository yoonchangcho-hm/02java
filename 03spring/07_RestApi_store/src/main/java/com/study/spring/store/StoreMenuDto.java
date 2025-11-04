package com.study.spring.store;

import java.util.List;

import lombok.Data;

@Data
public class StoreMenuDto {
	Long id;
	String name;
	String addr;
	List<MenuDto> menus;
}
