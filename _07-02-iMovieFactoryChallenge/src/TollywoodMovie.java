

public interface TollywoodMovie {
    void displayMovieName();
}

class ActionTollywoodMovie implements TollywoodMovie {

    @Override
    public void displayMovieName() {
        System.out.println("This is the action Tollywood movie: Crash");
    }
}


class ComedyTollywoodMovie implements TollywoodMovie {

    @Override
    public void displayMovieName() {
        System.out.println("This is the comedy Tollywood movie: Smile");
    }
}
