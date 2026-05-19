package org.my.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache<T> {
  private final Map<String, T> casheInfo = new HashMap<>();

  public void put(String key, T value) {
    casheInfo.put(key, value);
  }

  public T get(String key) {
    return casheInfo.get(key);

  }

  public T remove(String key) {
    return casheInfo.remove(key);
  }

  public int size() {
    return casheInfo.size();
  }

  public void clear() {
    casheInfo.clear();
  }

}

