package io.github.nathanjrussell;

public class FileSystem implements IStorage{
    public void store(String key, String value) {
        System.out.println("Storing: " + key + " -> " + value);
    }

    public String retrieve(String key) {
        System.out.println("Retrieving: " + key);
        return "some value";
    }
}
