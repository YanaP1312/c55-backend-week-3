package org.my.cache;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CacheTests {

  @Test
  void addPairKeyAndStringValueInCache() {
    //Arrange
    Cache<String> cache = new Cache<>();

    //Act
    cache.put("box1", "yellow");
    String value = cache.get("box1");

    //Assert
    assertEquals("yellow", value);
  }

  @Test
  void returnNullWhenKeyDoesNotExist(){
    //Arrange
    Cache<String> cache = new Cache<>();

    //Act
    String value = cache.get("year");

    //Assert
    assertNull(value);
  }

  @Test
  void returnDoubleValueOfKeyCache() {
    //Arrange
    Cache<Double> cache = new Cache<>();

    //Act
    cache.put("height", 1.64);
    double value = cache.get("height");

    //Assert
    assertEquals(1.64, value);
  }

  @Test
  void returnRemovedIntegerValueOfCache() {
    //Arrange
    Cache<Integer> cache = new Cache<>();

    //Act
    cache.put("year", 23);
    int removedValue = cache.remove("year");

    //Assert
    assertEquals(23, removedValue);
  }

  @Test
  void returnSizeOfCache() {
    //Arrange
    Cache<String> cache = new Cache<>();

    //Act
    cache.put("user1", "Alex");
    cache.put("user2", "Daniel");
    int size = cache.size();

    //Assert
    assertEquals(2, size);

  }

  @Test
  void clearAllCache() {
    //Arrange
    Cache<Integer> cache = new Cache<>();

    //Act
    cache.put("followers", 1992);
    cache.put("posts", 202);
    cache.put("comments", 24);
    cache.clear();

    //Assert
    assertEquals(0, cache.size());
  }
}
