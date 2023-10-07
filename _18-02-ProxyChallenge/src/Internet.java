interface Internet {
    public void connectTo(String serverHost) throws Exception;
}

class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}
