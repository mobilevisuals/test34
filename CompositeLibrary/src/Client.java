
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component library=new Library("Om biblioteket","Bibliotikarien");
		Book book=new Book("Svampar","Jonas S");
		library.add(book);
		library.add(new Book("Soppar","Greta S"));
		library.add(new Book("Stenar","Nils Hult"));
		library.nameOfBooks();
		
		book.nameOfBooks();

	}

}
