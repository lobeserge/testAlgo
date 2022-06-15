package model;

import repository.UserRepository;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserChallenges {

    public static void main(String[] args) {

        User user = new User();
        user.setUserName("Lobe Serge");
        user.setUserPassword("passSerge");
        user.setScore(10);
        user.setUserId(1L);

        User user1 = new User();
        user1.setUserName("Bryan Scott");
        user1.setUserPassword("bryanscott");
        user1.setScore(30);
        user1.setUserId(2L);

        User user2 = new User();
        user2.setUserName("River Luke");
        user2.setUserPassword("riverLuke");
        user2.setScore(34.5);
        user2.setUserId(3L);

        User user3 = new User();
        user3.setUserName("Semaphore Lilian");
        user3.setUserPassword("lilian");
        user3.setScore(38.99);
        user3.setUserId(4L);

        User user4 = new User();
        user4.setUserName("Four Mike");
        user4.setUserPassword("mike");
        user4.setScore(38.99);
        user4.setUserId(5L);

        User user5 = new User();
        user5.setUserName("Ricardo Five");
        user5.setUserPassword("passSerge");
        user5.setScore(10);
        user5.setUserId(6L);

        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(user);
        userRepository.saveUser(user1);
        userRepository.saveUser(user2);
        userRepository.saveUser(user3);
        userRepository.saveUser(user4);
        userRepository.saveUser(user5);

        List<User> users = userRepository.getUsers();
        List<User> users1  = new ArrayList<>();
        users1.add(user);
        users1.add(user2);

       // users.forEach(e->System.out.println(e));

        // count number of users
        System.out.println(users.size());

        //return a list of the scores of users
        users.stream().map(User::getUserName).forEach(e->System.out.print(e+" "));
        System.out.println();

        //get users and score hashmap
        users.stream().collect(Collectors.toMap(User::getUserName,User::getUserId)).entrySet().stream().forEach(e->System.out.print(e+" "));
        System.out.println();

        //get sum of all user scores
        double total = users.stream().mapToDouble(User::getScore).sum();
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println(decimalFormat.format(total));
        double totalScore = users.stream().mapToDouble(User::getScore).reduce(0.0,Double::sum);
        System.out.println(totalScore);

        //get a list of distinct scores
        users.stream().map(e->e.getScore()).distinct().collect(Collectors.toList()).forEach(e->System.out.print(e+" "));
        System.out.println();
        users.stream().map(e->e.getScore()).collect(Collectors.toSet()).forEach(e->System.out.print(e+" "));
        System.out.println();

        // Flat map users
        List<List<User>> values = new ArrayList<>();
        values.add(users);
        values.add(users1);
        System.out.println(values);

        List<User> valuesFlat = values.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(valuesFlat);

        //filter elements with scores greater than 30
        users.stream().filter(e->e.getScore()>30).filter(e->e.getUserName().contains("a")).forEach(e->System.out.print(e.getUserId()+" "));

        // Sort the users according to their scores
        System.out.println();
        users.stream().sorted(Comparator.comparing(User::getScore).thenComparing(User::getUserId)).forEach(e->System.out.print(e.getUserId()+" "));

    }

}
