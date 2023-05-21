package polymorphism;

public class NextMain {
	public static void main(String[] args) {
		Movie m = Movie.getMovie("J", "Star Wars");
		Adventure a = (Adventure) m;
		a.watchMovie();
	}
}
