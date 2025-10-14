package study03;

public class BookTest {

	public static void main(String[] args) {
//		Book myBook = new Book("삼국지","일연");
//		Book myBook1 = new Book("홍길동","허균");
//		
//		System.out.println(myBook.getBookName());
//		System.out.println(myBook.getAuthor());

		Book[] bookList = new Book[5];

		bookList[0] = new Book("삼국지", "일연");
		bookList[1] = new Book("홍길동", "허균");

		for (Book item : bookList) {
			if (item != null) {
				System.out.println(item.getBookName());
			}
		}

	}

}
