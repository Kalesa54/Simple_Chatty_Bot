class SimpleCounter {
    // write your code here

    private static SimpleCounter instance = new SimpleCounter();
    public int counter;

    private SimpleCounter() {
    }

    public static SimpleCounter getInstance() {
        if (instance == null) {
            instance = new SimpleCounter();
        }
        return instance;
    }

}