package chapter02;

public class SongTest {
	public static void main(String[] args) {
		Song song=new Song();
		song.setArtist("아이유");
		song.setTitle("좋은 날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack(3);
		song.setComposer("이민수");
		
		song.show();
		
		Song song2=new Song("Love Shot", "EXO", null, null, 0,0);
		song2.show();
		
		Song song3=new Song("Tempo", "EXO");
		song3.show();
	}
}
