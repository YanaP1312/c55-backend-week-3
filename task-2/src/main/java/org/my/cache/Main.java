package org.my.cache;

public class Main {
    public static void main(String[] args) {
Cache<String> cacheUsers = new Cache<>();
cacheUsers.put("user1", "Anna");
cacheUsers.put("user2", "Alex");
System.out.println("User 1 is " + cacheUsers.get("user1"));
System.out.println("User 2 is " + cacheUsers.get("user2"));
System.out.println("Cache user size is " + cacheUsers.size());
System.out.println(cacheUsers.remove("user1") + " is removed");
cacheUsers.clear();
System.out.println("Cache user size is " + cacheUsers.size());


Cache<Double> cacheWeight = new Cache<>();
cacheWeight.put("Anna", 53.7);
cacheWeight.put("Alex", 68.5);
System.out.println("Alex weight is " + cacheWeight.get("Alex"));
System.out.println("Anna weight is " + cacheWeight.get("Anna"));
System.out.println("Cache weight size is " + cacheWeight.size());
System.out.println("Anna's weight " + cacheWeight.remove("Anna") + " is removed");
cacheWeight.clear();
System.out.println("Cache weight size is " + cacheWeight.size());
    }
}