package work;


public class Song {
	String title;
	String artist;
	int year;
	String country;
	void show() {
		System.out.println(year+"��"+country+"������"+artist+"�� �θ�"+title);
	}
		public Song(String title,String artist, int year, String country) {
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
		
	}

	public static void main(String[] args) {
	Song sg=new Song("Dancing Queen","ABBA",1978,"������");	

		sg.show();
	}

}