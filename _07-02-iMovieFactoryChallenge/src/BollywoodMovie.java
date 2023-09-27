
public interface BollywoodMovie {
    void displayMovieName();
}

class ActionBollywoodMovie implements BollywoodMovie {

    @Override
    public void displayMovieName() {
        System.out.println("This is the action Bollywood movie: Speed");
    }
}


class ComedyBollywoodMovie implements BollywoodMovie {

    @Override
    public void displayMovieName() {
        System.out.println("This is the comedy Bollywood movie: Happy");
    }
}
