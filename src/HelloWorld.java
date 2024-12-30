public class HelloWorld extends  Thread {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public void printHelloWorld() {
        this.run();
    }
}
