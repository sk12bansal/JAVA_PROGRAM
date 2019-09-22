package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*To summarize, if sorting of objects needs to be based on natural order then use
Comparable whereas if you sorting needs to be done on attributes of different objects,
then use Comparator in Java.*/

class MovieDetail implements Comparable<MovieDetail> {
    private String year;
    private String name;
    private String rating;
   // int mat[2][2] = new int[2][2];

    MovieDetail(String year, String name, String rating) {
        this.year = year;
        this.name = name;
        this.rating = rating;
    }

    String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    String getRating() {
        return rating;
    }

    @Override
    public int compareTo(MovieDetail o) {
        return Integer.parseInt(this.year) - Integer.parseInt(o.year);
    }
}

class RatingComparable implements Comparator<MovieDetail> {

    @Override
    public int compare(MovieDetail o1, MovieDetail o2) {
        return o1.getRating().compareTo(o2.getRating());
    }
}

class NameComparable implements Comparator<MovieDetail> {

    @Override
    public int compare(MovieDetail o1, MovieDetail o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Movie {

    public static void main(String args[]) {
        ArrayList<MovieDetail> list = new ArrayList<MovieDetail>();
        list.add(new MovieDetail("2019", "Article 15", "4"));
        list.add(new MovieDetail("2018", "super 30", "5"));
        list.add(new MovieDetail("2015", "Kabir Singh", "3.5"));
        list.add(new MovieDetail("2017", "Bharat", "2.5"));

        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingComparable ratingCompare = new RatingComparable();
        Collections.sort(list, ratingCompare);
        for (MovieDetail movie : list)
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());


        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameComparable nameCompare = new NameComparable();
        Collections.sort(list, nameCompare);
        for (MovieDetail movie : list)
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (MovieDetail movie : list)
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName() + " ");
    }
}
