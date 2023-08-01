package filterMapSamples;

import java.util.Objects;


public class Movie {

    private String movieName;
    private int releaseYear;
    private int moviePrice;
    private String movieLanguage;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public Movie() {
    }

    public Movie(String movieName, int releaseYear, int moviePrice, String movieLanguage) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.moviePrice = moviePrice;
        this.movieLanguage = movieLanguage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", releaseYear=" + releaseYear +
                ", moviePrice=" + moviePrice +
                ", movieLanguage='" + movieLanguage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return releaseYear == movie.releaseYear && moviePrice == movie.moviePrice && Objects.equals(movieName, movie.movieName) && Objects.equals(movieLanguage, movie.movieLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, releaseYear, moviePrice, movieLanguage);
    }
}
