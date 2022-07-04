public class Movie {
    private String title, rating;
    private int year;
    private double duration;
    public Movie(String title, String rating, int year, double duration)
    {
        this.title = title;
        this.rating = rating;
        this.year = year;
        this.duration = duration;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String value)
    {
        title = value;
    }
    public String getRating()
    {
        return rating;
    }
    public void setRating(String value)
    {
        rating = value;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int value)
    {
        year = value;
    }
    public double getDuration()
    {
        return duration;
    }
    public void setDuration(double value)
    {
        duration = value;
    }
    public String toString()
    {
        return "Movie title: " + title +
                "\n Rating: " + rating +
                "\n Year: " + year +
                "\n Duration: " + duration;
    }


}