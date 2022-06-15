package dto;

import model.User;

import java.util.*;
import java.util.stream.Collectors;

public class Watermelon {

    public static String waterMelonDivide(int n){
        String status = "NO";
        if((n&1)== 0 && n>2){
            status = "YES";
        }
        return status;
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(e->e*e).collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(e->"y"+e+"y").collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings.stream().map(e->e.replace("x","")).collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
       return strings.stream().map(e->e.toLowerCase()).collect(Collectors.toList());
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(e->e%10).collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(e->(e+1)*10).collect(Collectors.toList());
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(e->e*2).collect(Collectors.toList());
    }

    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(e->e+e+e).collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(e->e+"*").collect(Collectors.toList());
    }








    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int value = input.nextInt();
//        System.out.println(waterMelonDivide(value));
//
//        System.out.println(rightDigit(Arrays.asList(12,34,45,43)));
//        System.out.println(copies3(Arrays.asList("bb","","ccf","ddf")));
//
        List<User> users = new ArrayList<>();
        List<Long> list = users.stream().map(e->e.getUserId()).collect(Collectors.toList());
        System.out.println(list.contains(1));
    }
}
