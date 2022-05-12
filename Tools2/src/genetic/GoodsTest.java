package genetic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		//定义book相关的List
		List<Book> books=new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book());
//		books.add(new Shoes());
//		books.add(new Clothes());

		//定义chothes相关的List
		List<Clothes> clothes=new ArrayList<Clothes>();
		clothes.add(new Clothes());
		clothes.add(new Clothes());
		//定义shoes相关的List
		List<Shoes> shoes=new ArrayList<>();
		shoes.add(new Shoes());
		shoes.add(new Shoes());
		System.out.println("--------------");
		GoodsSeller goodsSeller=new GoodsSeller();
		goodsSeller.sellGoods(books);
		goodsSeller.sellGoods(clothes);
		goodsSeller.sellGoods(shoes);
	}

}
