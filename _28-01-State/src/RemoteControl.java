abstract class RemoteControl {
    public abstract void pressSwitch(TV context);
}

class On extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already ON. Going to be OFF now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already OFF. Going to be ON now");
        context.setState(new On());
    }
}



