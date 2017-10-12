import java.util.ArrayList;

public class Library extends Component {
	
	ArrayList<Component> books;

	public Library(String title, String author) {
		super(title, author);
		books=new ArrayList<Component>();
	}

	@Override
	void add(Component component) {
		books.add(component);

	}

	@Override
	void remove(Component component) {
		books.remove(component);

	}

	@Override
	void nameOfBooks() {
		System.out.println(title +":" +author);
		for (Component component : books) {
			System.out.println(component.getTitle()+ " "+component.getAuthor());
		}
		

	}

}
