package filterMapSamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMapSamples {

    public static void main(String[] args) {

        List<Movie> movieList = Arrays.asList(
                new Movie("Bhahubali", 2015, 210, "Telugu"),
                new Movie("BhajirangiBhaijaan", 2017, 210, "Hindi"),
                new Movie("Petta", 2018, 200, "Tamil"),
                new Movie("Thunivu", 2023, 210, "Tamil"),
                new Movie("Mersal", 2018, 200, "Tamil"),
                new Movie("Mersal", 2018, 200, "Tamil")
        );

        System.out.println("Normal Streams");
        movieList.stream()
                .filter(movie -> movie.getMovieLanguage() == "Tamil")
                .map(movie -> movie.getMovieName())
                .forEach(System.out::println);

        System.out.println("List --------- ");

        List<String> tamilMovieList = movieList.stream()
                .filter(movie -> movie.getMovieLanguage() == "Tamil")
                .map(movie -> movie.getMovieName())
                .collect(Collectors.toList());

        tamilMovieList.forEach(System.out ::println);

        System.out.println("Set --------- ");

        Set<String> tamilMovieSet = movieList.stream()
                .filter(movie -> movie.getMovieLanguage() == "Tamil")
                .map(movie -> movie.getMovieName())
                .collect(Collectors.toSet());

        tamilMovieSet.forEach(System.out ::println);

        System.out.println("joining --------- ");

        String tamilMovieString = movieList.stream()
                .filter(movie -> movie.getMovieLanguage() == "Tamil")
                .map(movie -> movie.getMovieName())
                .collect(Collectors.joining(","));

        System.out.println(tamilMovieString);

        System.out.println("Map --------- ");

        Map<Integer, List<Movie>> groupingMovieList = movieList.stream().collect(Collectors.groupingBy(Movie::getReleaseYear));
        groupingMovieList.forEach((k,v) -> System.out.println("Key :" + k+"Value: " + v));

       Map<Boolean, List<Movie>>  groupingMovieAverage = movieList.stream().collect(Collectors.partitioningBy(movie -> movie.getReleaseYear() > 2017));
       groupingMovieAverage.forEach((k, v) -> System.out.println("key :" + k + "Values :"+ v));



    }
}
