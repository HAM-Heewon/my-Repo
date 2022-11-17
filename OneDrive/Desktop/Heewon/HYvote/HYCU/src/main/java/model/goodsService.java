package model;

import java.util.ArrayList;

public class goodsService {
	goodsDAO dao;
	
	public goodsService() {}
	
	public goodsService(goodsDAO dao) {
		super();
		this.dao = dao;
	}

	public void insert(goodsmanageDTO dto) {
		dao.insert(dto);
	}
	
	public ArrayList<goodsmanageDTO> goods_list(){
		return dao.goods_list();
	}
}
