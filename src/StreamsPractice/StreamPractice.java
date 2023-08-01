package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        StreamPractice sp = new StreamPractice();
        sp.runit();
    }

    public void runit(){

        System.out.println("Streams example here ::::");

        String[] names = {"sab", "amma" , "appa","sab", "amma" , "appa"};
        List<String> nameList = Arrays.asList(names);
        System.out.println("Length of the names array: " + names.length);
        System.out.println("Size of the List: " + nameList.size());
        nameList.stream().forEach(System.out::println);

        long size = nameList.stream().filter(name -> name.equals("sab")).count();
        System.out.println("Size is : " + size);
        System.out.println("------------------");
        List<String> filteredNames = nameList.stream().filter(name -> !name.equals("sab")).collect(Collectors.toList());
        for (String name : filteredNames) {
            System.out.println(name);
        }
        System.out.println("------------------");
        filteredNames.stream().forEach(System.out::println);
        System.out.println("------------------");
        List<String> uniqueNames = nameList.stream().sorted().distinct().collect(Collectors.toList());
        uniqueNames.stream().forEach(System.out::println);

        List<User> userList = Arrays.asList(
                new User (1, "Sabarish"),
                new User (1, "Amma"),
                new User (1, "Appa")
        );

        List<User> filteredUser = userList.stream().filter(user -> user.getName().equals("Amma")).collect(Collectors.toList());
        System.out.println("------------------");
        filteredUser.stream().forEach(user -> System.out.println(user.getName()));
    }

    class User{
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
