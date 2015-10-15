/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class MoviesMain {

    Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nummovies;

        String MovieName;
        int MovieRating;
        int Date;
        int RunTime;

        ArrayList<Movies> movies = new ArrayList<>();
        System.out.println("How many movies do you want to enter? ");
        nummovies = in.nextInt();

        for (int i = 0; i < nummovies; i++) {
            System.out.println("Movie Name: ");
            MovieName = in.next();

            System.out.println("Movie Rating: ");
            MovieRating = in.nextInt();

            System.out.println("Movie ReleaseYear: ");
            Date = in.nextInt();

            System.out.println("Movie Runtime: ");
            RunTime = in.nextInt();

            Movies mov1 = new Movies(MovieName, MovieRating, Date, RunTime);//Enter your 4 variables.
            System.out.println(mov1.toString());//Print all information to a string.
        }
    }

}