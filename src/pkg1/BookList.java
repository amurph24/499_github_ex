package pkg1;

public class BookList {

	public static void main(String[] args) {
		ObjectList<String> Books = new ObjectList<String>();
		Books.add("J.R.R Tolkein, LOTR");
		Books.add("J.K Rowling, Harry Potter");
		Books.add("K. Jackson, A Celtic Miscellany");
		Books.add("A. Kay, This is Going to Hurt");
		Books.add("C. Cowell, How to Train Your Dragon");
		Books.add("N. Gill, Your Soul Is A River");
		// this is a comment
		System.out.println(Books.show());
		Books.StringSortAlphabet();
		System.out.println(Books.show());
		
	}

}