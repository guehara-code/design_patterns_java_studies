interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through a Monitor");
    }
}

class Project implements displayModule {
    public void display() {
        System.out.println("Display through Projector");
    }
}

public class Computer {
    displayModule dm;

    public void setDisplayModule(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String args[]) {
        Computer cm = new Computer();
        displayModule dm = new Monitor();
        displayModule dm1 = new Project();

        cm.setDisplayModule(dm);
        dm.display();
        cm.setDisplayModule(dm1);
        cm.display();
    }
}