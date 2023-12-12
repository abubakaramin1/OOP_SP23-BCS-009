package Music;

import java.util.Objects;

public class Music {
    private String title;
    private String duration;
    private String genre;
    private Dates releaseDate;
    private Singer singer;

    Music(String title, String duration, String genre, Dates releaseDate, Singer singer) {
        setTitle(title);
        setDuration(duration);
        setGenre(genre);
        setReleaseDate(releaseDate);
        setSinger(singer);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Dates getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Dates releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String toString() {
        return String.format("Title: %s\tDuration: %s\tGenre: %s\tRelease date: %s\tMusic.Music.Singer: %s", title, duration, genre, releaseDate, singer);
    }

    public boolean equals(Music o) {
        if (this.title == o.title && this.genre == o.genre && this.duration == o.duration && this.releaseDate == o.releaseDate && this.singer == o.singer)
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {

        Music music = (Music) o;
        return Objects.equals(title, music.title) && Objects.equals(duration, music.duration) && Objects.equals(genre, music.genre) && Objects.equals(releaseDate, music.releaseDate) && Objects.equals(singer, music.singer);
    }


}
