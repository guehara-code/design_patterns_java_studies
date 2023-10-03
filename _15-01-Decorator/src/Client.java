public class Client {
    public static void main(String[] args) {
        System.out.println("***Decorator pattern demo");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx1 cd_1 = new ConcreteDecoratorEx1();

        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1
        cd_1.SetTheComponent(cc);
        cd_1.doJob();

        ConcreteDecoratorEx2 cd_2 = new ConcreteDecoratorEx2();

        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx1 & ConcreteDecoratorEx2
        cd_2.SetTheComponent(cd_1); // Adding results from cd_1 now
        cd_2.doJob();
    }
}
