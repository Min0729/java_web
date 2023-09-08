package 실습0831;

import java.util.ArrayList;

public class Service_Movies_김민지 {

	public ArrayList<Movies_김민지> getList(){
		
		ArrayList<Movies_김민지> list = new ArrayList<>();
		
		list.add(new Movies_김민지("타겟","스릴러",101,"박희곤"));
		list.add(new Movies_김민지("오펜하이머","스릴러",180,"크리스토퍼 놀란"));
		list.add(new Movies_김민지("달짝지근해: 7510","코미디",119,"이한"));
		list.add(new Movies_김민지("콘크리트 유토피아","드라마",130,"엄태화"));
		list.add(new Movies_김민지("밀수","범죄",129,"류승완"));
		
		return list;
	}
	
}
