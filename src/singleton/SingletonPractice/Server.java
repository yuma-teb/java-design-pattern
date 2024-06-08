package src.singleton.SingletonPractice;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class Server {

    private ArrayList<String> lazyServers = new ArrayList<String>();

    private static Server server;

    private Server() {
    }

    // Create a function which return object of the class
    public static Server getServerInstance() {
        if (server == null) {
            server = new Server();
        }
        return server;
    }

    public boolean isHTTP(URL url) throws IOException {
        System.out.println("http".equals(url.getProtocol()));
        return "http".equals(url.getProtocol());
    }

    // Create a funnction for add element to the server
    public void addServers(String serverName) {
        lazyServers.add(serverName);
        System.out.println("Server has been added successfully!");
    }

    // Create a function for displaying http server
    public ArrayList<String> getHttpServer() {
        ArrayList<String> httpServers = new ArrayList<String>();

        for (int i = 0; i < lazyServers.size(); i++) {
            if (isHTTP(lazyServers.get(i))) {

                // Add http server to new list
                httpServers.add(lazyServers.get(i));
            }
        }

        System.out.println("Server result" + httpServers);
        return httpServers;
    }

    // Create a funciton for display https sever
    public ArrayList<String> getHttpsSever() {

        ArrayList<String> httpsSever = new ArrayList<String>();

        for (int i = 0; i < lazyServers.size(); i++) {
            if (!isHTTP(lazyServers.get(i))) {
                httpsSever.add(lazyServers.get(i));
            }
        }

        return httpsSever;
    }
}
