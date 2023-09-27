public class Client {
    public static void main(String[] args) {

        MovieFactory actionMovieFactory1 = new ActionMovieFactory();
        TollywoodMovie actionTollywoodMovie = actionMovieFactory1.getTollywoodMovie("TOLLYWOOD");
        actionTollywoodMovie.displayMovieName();

        BollywoodMovie actionBollywoodMovie = actionMovieFactory1.getBollywoodMovie("BOLLYWOOD");
        actionBollywoodMovie.displayMovieName();

        MovieFactory comedyMovieFactory1 = new ComedyMovieFactory();
        TollywoodMovie comedyTollywoodMovie = comedyMovieFactory1.getTollywoodMovie("TOLLYWOOD");
        comedyTollywoodMovie.displayMovieName();

        BollywoodMovie comedyBollywoodMovie = comedyMovieFactory1.getBollywoodMovie("BOLLYWOOD");
        comedyBollywoodMovie.displayMovieName();
    }
}
