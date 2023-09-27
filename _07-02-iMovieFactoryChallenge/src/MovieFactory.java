public interface MovieFactory {
    public TollywoodMovie getTollywoodMovie(String movieType);
    public BollywoodMovie getBollywoodMovie(String movieType);
}

class ActionMovieFactory implements MovieFactory {

    @Override
    public TollywoodMovie getTollywoodMovie(String movieType) {
        if (movieType.equalsIgnoreCase("TOLLYWOOD")) {
            return new ActionTollywoodMovie();
        }
        return null;
    }

    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        if (movieType.equalsIgnoreCase("BOLLYWOOD")) {
            return new ActionBollywoodMovie();
        }
        return null;
    }
}


class ComedyMovieFactory implements MovieFactory {

    @Override
    public TollywoodMovie getTollywoodMovie(String movieType) {
        if (movieType.equalsIgnoreCase("TOLLYWOOD")) {
            return new ComedyTollywoodMovie();
        }
        return null;
    }

    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        if (movieType.equalsIgnoreCase("BOLLYWOOD")) {
            return new ComedyBollywoodMovie();
        }
        return null;
    }
}