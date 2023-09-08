package 실습0901;

import java.util.ArrayList;

public class GoodsService {

	GoodsDAO dao = new GoodsDAO();
	
	// 상품 전체 조회
	public ArrayList<Goods> getGoodsList(){
		
		ArrayList<Goods> list = dao.selectAll();
		return list;
	}
	
	// 상품 하나 조회
	public Goods getGoods(String id) {
		Goods g = dao.selectOne(id);
		return g;
	}
	
	
	// 상품 등록
	public void registerGoods(Goods g) {
		dao.insertGoods(g);
	}
	
	// 상품 삭제
	public void deleteGoods(String id) {
		dao.deleteOne(id);
	}
	
	// 상품 정보 변경
	public void modifyGoods(Goods g) {
		dao.updateGoods(g);
	}
	
}
