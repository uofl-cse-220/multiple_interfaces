package io.github.nathanjrussell;

public class CloudService implements ILogging, IStorage {

    public void log(String message) {
        System.out.println("Logging: " + message);
    }


    public void store(String key, String value) {
        System.out.println("Storing: " + key + " -> " + value);
    }


    public String retrieve(String key) {
        System.out.println("Retrieving: " + key);
        return "some value";
    }
}
