public class AbstractDecorator extends Component {
    protected Component com;

    public void SetTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if(com != null) {
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicitly form Ex_1");
    }
}

class ConcreteDecoratorEx2 extends AbstractDecorator {
    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex_2***");

        super.doJob();

        // add additional responsibilities
        System.out.println("Explicitly from decorator Ex_2");
        System.out.println("***END. Ex_2***");
    }
}