
import java.util.ArrayList;
import java.util.List;

public class MusicAlbumFilteringLambdaStreams {

	public static void main(String[] args) {
		List<Album> albums = new ArrayList<>();
		albums.add(new Album("Pink Floyd", "The Division Bell", 1994,
		         "Cluster One",
		         "What Do You Want from Me",
		         "Poles Apart",
		         "Marooned",
		         "A Great Day for Freedom",
		         "Wearing the Inside Out",
		         "Take It Back",
		         "Coming Back to Life",
		         "Keep Talking",
		         "Lost for Words",
		         "High Hopes"));

		for(Album album : albums) {
			if(album.getYear() < 2000) {
				System.out.println("Album name: "+album.getTitle());
			}
		}

		albums.stream()
		.filter(album -> album.getYear() < 2000)
		.map(Album::getAuthor)
		.forEach(System.out::print);
	}

}
