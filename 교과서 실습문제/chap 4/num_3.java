package chap4;
import java.util.*;
class Song{
	String title, artist, country;
	int year;
	Song(int year, String country, String artist, String title){
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	void show() {
		System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
}
public class num_3 {
	public static void main(String[] args) {
		Song s = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		s.show();
	}
}
