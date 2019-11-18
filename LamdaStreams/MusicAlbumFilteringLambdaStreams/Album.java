import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Album {

	private String author;
	private List<String> songs;
	private int year;
	private String title;


	public Album(String author, String title, int year, String... songs) {
		super();
		this.author = author;
		this.songs = new ArrayList<>(Arrays.asList(songs));
		this.year = year;
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public List<String> getSongs() {
		return songs;
	}


	public int getYear() {
		return year;
	}


	public String getTitle() {
		return title;
	}
}
