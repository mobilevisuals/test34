
public abstract class Component {
	
	protected String title,author;
	
	
	public Component(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	abstract void add(Component component);
	abstract void remove(Component component);
	abstract void nameOfBooks();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	

}
