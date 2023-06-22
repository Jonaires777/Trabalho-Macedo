public class songModel {

    String title;
    String album;
    String artist;
    String genre;
    String year;
   

    void setSongDeets(String title, album, artist, genre, year){
        this.title = title;
        this.album = album;
        this.genre = genre;
        this.artist = artist;
        this.year = year;
    }

    String getTitle(String title){
        return this.title;
    }

    String getAlbum(String album){
        return this.album;
    }

    String getArtist(String artist){
        return this.artist;
    }

    String getGenre(String genre){
        return this.genre;
    }

    String getYear(String year){
        return this.year;
    }



}