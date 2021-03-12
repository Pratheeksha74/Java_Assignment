package Lab;

abstract class Item {
	private int ID_Number;
	private String title;
	private int noc;
	int check = 0;
	
//	String item = "books" + "journal articles" + "videos" + "CDs";
//	StringBuffer items = new StringBuffer(item);
	
	public Item(int ID_Number, String title, int noc) {
		this.ID_Number = ID_Number;
		this.title = title;
		this.noc = noc;
	}
	
	public int getID_Number() {
		return ID_Number;
	}
	
	public void setID_Number(int iD_Number) {
		ID_Number = iD_Number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNoc() {
		return noc;
	}
	
	public void setNoc(int noc) {
		this.noc = noc;
	}
	
//	public StringBuffer getItem() {
//		return items;
//	}
	
//	public void addItem(String s) {
//		items.append(s);
//	}
	
	public void addItem(int copy) {
		++noc;
	}
	
	public String toString() {
		return "Identification number is "+ID_Number+"\nTitle is "+title+"\nNumber of copies are "+noc+".";
	}
	public void checkIn() {
		if(check == 0) {
			System.out.println("You have successfully checked In");
			check = 1;
		} else {
			System.out.println("You haven't checked out from the previous transaction!!");
		}
	}
	
	public void checkOut() {
		if(check == 1) {
			System.out.println("You have successfully checked out");
			check = 0;
		} else {
			System.out.println("You haven't checked in at all!!");
		}
	}
	
	public String print() {
		return "Identification number is "+ID_Number+"\nTitle is "+title+"\nNumber of copies are "+noc+".";
	}
}


abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int ID_Number, String title, int noc,String author) {
		super(ID_Number, title, noc);
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

class Book extends WrittenItem{

	public Book(int ID_Number, String title, int noc, String author) {
		super(ID_Number, title, noc, author);
	}	
}

class JournalPaper extends WrittenItem{
	private int year_of_publ;

	public JournalPaper(int ID_Number, String title, int noc, String author, int year_of_publ) {
		super(ID_Number, title, noc, author);
		this.year_of_publ = year_of_publ;
	}

	public int getYear_of_publ() {
		return year_of_publ;
	}

	public void setYear_of_publ(int year_of_publ) {
		this.year_of_publ = year_of_publ;
	}
}

abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int ID_Number, String title, int noc, int runtime) {
		super(ID_Number, title, noc);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}
}

class Video extends MediaItem {
	private String director;
	private int year;
	private String genre;
	
	public Video(int ID_Number, String title, int noc, int runtime, String director, int year,String genre) {
		super(ID_Number, title, noc, runtime);
		this.director = director;
		this.year = year;
		this.genre = genre;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", year=" + year + ", genre=" + genre + "]";
	}
		
	
}


class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD(int ID_Number, String title, int noc, int runtime, String artist, String genre) {
		super(ID_Number, title, noc, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}
}


public class Lab_4_4 {

	public static void main(String[] args) {
		
	}

}
