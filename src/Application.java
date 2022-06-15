import dto.FilterDTO;
import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Application {
    public static void main(String[] args) {
//        String word = "This is the future of java development what do you think about that";
//        System.out.println(word.split(" ",10));
//        Arrays.stream(word.split(" ", 10)).forEach(e->System.out.println(e));
//
//
//        LocalDate localDate = LocalDate.MIN;
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        System.out.println(localDate.atStartOfDay());
//        System.out.println(localDate.plusDays(1).atStartOfDay());
//

//
//        List<String> names = new ArrayList<>(Arrays.asList("Lobe","Serge","Nyoh","Bryan"));
//        List<String> filter = new ArrayList<>(Arrays.asList("Nyoh","Brysan"));
//
//       List<String> filterNames =  names.stream().filter(e->!filter.contains(e)).collect(Collectors.toList());
//       System.out.println(filterNames);

//        String originalString1 = "                howtodoinjava.com   "; // 3 trailing spaces
//        String originalString2 = "   howtodoinjava.com   "; // 3 leading and trailing spaces
//
//        String trimmedString1 = originalString1.trim();
//        String trimmedString2 = originalString2.trim();
//        System.out.println(trimmedString1);
//        System.out.println(trimmedString2);
//

//
//        Predicate<User> userPredicate = e -> e.getUserId().equals(1L);
//        Predicate<User> userPredicate1 = e -> e.getScore() == 20L;
//
//        List<Predicate<User>> predicates = new ArrayList<>();
//        predicates.add(userPredicate);
//        predicates.add(userPredicate1);
//
//
//        users.stream().filter(predicates.stream().reduce(x -> true, Predicate::and)).forEach(e->System.out.println(e));
//
//
//        LocalDate date = LocalDate.parse("2017-06-22");
//        System.out.println("LocalDate is: "+date.atStartOfDay());
//
//        LocalDate dat2 = LocalDate.parse("2017-07-01");
//        System.out.println("LocalDate is: "+dat2.plusDays(1).atStartOfDay());
//
//        /* Converting the LocalDate to LocalDateTime using
//         * atStartOfDay() method. This method adds midnight
//         * time (start of the day time) with the local date.
//         */
//        LocalDateTime localDateTime1 = date.plusDays(1).atStartOfDay();
//        System.out.println("LocalDateTime Start of the Day: "+
//                localDateTime1);

//        LocalDate currentTime = LocalDate.now();
//        LocalDate start = currentTime.withDayOfYear(1);
//        LocalDate end = currentTime.withDayOfYear(currentTime.lengthOfYear());
//
//        System.out.println(start.atStartOfDay());
//        System.out.println(end.plusDays(1).atStartOfDay());
//        long count = 0;
//        //System.out.println(users.stream().map(e->scoresValue.put(e.getUserPassword(),count+1)).collect(Collectors.toMap(e.)));
//
//
//        System.out.println(Collections.frequency(users.stream().map(e->e.getUserPassword()).collect(Collectors.toList()), "123456"));

//        List<User> users = new ArrayList<>();
//
//        User user1 = new User();
//        user1.setUserId((long) (Math.random()+10));
//        user1.setUserName("Scott Bryan");
//        user1.setUserPassword("123456");
//        user1.setScore(20L);
//
//        User user2 = new User();
//        user2.setUserId((long) (Math.random()+4)*13);
//        user2.setUserName("Nill Bryan");
//        user2.setUserPassword("123456");
//        user2.setScore(30L);
//
//        User user3 = new User();
//        user3.setUserId((long) (Math.random()+6)*17);
//        user3.setUserName("Scott Bryan");
//        user3.setUserPassword("910112");
//        user3.setScore(30L);
//
//
//        for(int i=0; i<100000000; i++){
//            users.add(user1);
//            users.add(user2);
//            users.add(user3);
//        }
//
//
//
//        FilterDTO filterDTO = new FilterDTO();
//
//        Long startTime = System.currentTimeMillis();
//
//        Map<Double, Long> scoreCount = users.stream().collect(groupingBy(e -> e.getScore(), counting()));
//        Map<String, Long> nameCount = users.stream().collect(groupingBy(e -> e.getUserName(), counting()));
//        Map<String, Long> passwordCount = users.stream().collect(groupingBy(e -> e.getUserPassword(), counting()));
//


//
//        Map<String,Long> stringLongMap = new HashMap<>();
//        Map<String,Long> stringLongMap1 = new HashMap<>();
//        Map<Double,Long> stringLongMap2 = new HashMap<>();
//
//        users.stream().forEach( e-> {
//                    if (!stringLongMap.keySet().contains(e.getUserName())) {
//                        stringLongMap.put(e.getUserName(), 1L);
//                    } else {
//                        stringLongMap.put(e.getUserName(), stringLongMap.get(e.getUserName()) + 1);
//                    }
//
//                    if (!stringLongMap1.keySet().contains(e.getUserPassword())) {
//                        stringLongMap1.put(e.getUserPassword(), 1L);
//                    } else {
//                        stringLongMap1.put(e.getUserPassword(), stringLongMap1.get(e.getUserPassword()) + 1);
//                    }
//
//                    if (!stringLongMap2.keySet().contains(e.getScore())) {
//                        stringLongMap2.put(e.getScore(), 1L);
//                    } else {
//                        stringLongMap2.put(e.getScore(), stringLongMap2.get(e.getScore()) + 1);
//                    }
//                }
//        );
//
//        filterDTO.setPasswords(stringLongMap1);
//        filterDTO.setNames(stringLongMap);
//        filterDTO.setScores(stringLongMap2);


//        System.out.println(filterDTO);
        // FilterDTO{names={Scott Bryan=2, Nill Bryan=1}, passwords={123456=2, 910112=1}, scores={20.0=1, 30.0=2}}

//        filterDTO.setScores(scoreCount);
//        filterDTO.setNames(nameCount);
//        filterDTO.setPasswords(passwordCount);
//        Long endTime = System.currentTimeMillis();
//
//
//        System.out.println(endTime - startTime); //24068980 21928297  24292871 17838972 18698351  3062  3055 3304
//        System.out.println(filterDTO); //10587555 6823247  11360004 13768865 7627033 12434038  2980 4300 3853 2931


//        Map<String, Integer> m1 = new HashMap<>();
//        m1.put("a", 1);
//        m1.put("b", 2);
//        Map<String, Integer> m2 = new HashMap<>();
//        m2.put("a", 3);
//        m2.put("c", 10);
//
//        System.out.println(m1);
//        System.out.println(m2);

//iterate over second map and merge its elements into map 1 using
//same key and sum of values
//        m2.forEach((k, v) -> m1.merge(k, v, Integer::sum));
//
//        System.out.println("===========");
//        System.out.println(m1);
//


//        String str = "software engineer";
//        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);

//        Set<String> skills1 = new HashSet<>();
//        skills1.add("Java");
//        skills1.add("Python");
//        skills1.add("Angular");
//
//        Set<String> skills2 = new HashSet<>();
//        skills2.add("Java");
//        skills2.add("Histogram");
//        skills2.add("Angular");
//
//        Set<String> skills3 = new HashSet<>();
//        skills3.add("Java");
//        skills3.add("Python");
//        skills3.add("React");
//
//        List<Set<String>> lists = new ArrayList<>();
//        lists.add(skills1);
//        lists.add(skills2);
//        lists.add(skills3);
//
//
//
//
//        List<String> skills  = lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println(skills);

//        String name = "Lobe";
//        String sameName = "Lobe";
//        System.out.println(name.equals(sameName));
//        System.out.println(name == sameName);


//        System.out.println(System.currentTimeMillis());
//        System.out.println(UUID.randomUUID());
//        System.out.println(LocalDateTime.now());



//List<String> extensions = new ArrayList<>();
//
//        extensions.add(".pdf");
//        extensions.add(".png");
//        extensions.add(".jpeg");
//
//
//
//        if(!validateFileExtension("resume.pdf",Arrays.asList(".jpg",".pdf",".png"))){
//            System.out.println("Invalid File extension");
//        }
//
//
//    }
//
//    static boolean validateFileExtension(String filename, List<String> requiredExtensions){
//        boolean isValid = false;
//        for(String extension : requiredExtensions){
//            if(filename.endsWith(extension)){
//                System.out.println("Is Valid");
//                isValid = true;
//                break;
//            }
//            System.out.println("Not match");
//        }
//        return isValid;
//    }

 //       System.out.println("This sucks");

//     if(!(filename.endsWith(".pdf") ||
//             filename.endsWith("jpg") || filename.endsWith("png") || filename.endsWith("jpeg")))

//        1277c472-983b-4b40-ac6a-6253dc09a18f
    }
}

