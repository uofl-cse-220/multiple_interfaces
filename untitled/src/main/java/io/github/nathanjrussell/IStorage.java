package io.github.nathanjrussell;

public interface IStorage {
    void store(String key, String value);

    String retrieve(String key);
}
