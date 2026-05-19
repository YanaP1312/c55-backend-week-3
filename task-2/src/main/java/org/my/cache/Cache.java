package org.my.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache<T> {
  private final Map<String, T> cacheInfo = new HashMap<>();

  public void put(String key, T value) {
    cacheInfo.put(key, value);
  }

  public T get(String key) {
    return cacheInfo.get(key);

  }

  public T remove(String key) {
    return cacheInfo.remove(key);
  }

  public int size() {
    return cacheInfo.size();
  }

  public void clear() {
    cacheInfo.clear();
  }

}

