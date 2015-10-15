/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package movies;

/**
 *
 * @author Aaron
 */
public class Movies {
    
    private String MovieName;
    private int MovieRating;
    private double RunTime;
    private double Date;

    
    public Movies(){
    
    

}

    public Movies(String MovieName,int MovieRating, double RunTime, double Date ){
        
        this.MovieName = MovieName;
        this.MovieRating = MovieRating;
        this.RunTime = RunTime;
        this.Date = Date;
        
    }

    /**
     * @return the MovieName
     */
    public String getMovieName() {
        return MovieName;
    }

    /**
     * @param MovieName the MovieName to set
     */
    public void setMovieName(String MovieName) {
        this.MovieName = MovieName;
    }

    /**
     * @return the MovieRating
     */
    public int getMovieRating() {
        return MovieRating;
    }

    /**
     * @param MovieRating the MovieRating to set
     */
    public void setMovieRating(int MovieRating) {
        this.MovieRating = MovieRating;
    }

    /**
     * @return the RunTime
     */
    public double getRunTime() {
        return RunTime;
    }

    /**
     * @param RunTime the RunTime to set
     */
    public void setRunTime(double RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * @return the Date
     */
    public double getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(double Date) {
        this.Date = Date;
    }

    
    public String toString()
    {
        return "Movie Name: " + MovieName + 
                "\nMovie Rating: " + MovieRating + 
                "\nRelease Year: " + Date+ 
                "\nRutime: " + RunTime;
    }

}
    
    