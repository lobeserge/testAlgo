package repository;

import model.User;

import java.util.*;

public class UserRepository {
    List<User> users  = new ArrayList<>();

    public void checkUserAlreadyExist(User user){
        try {
            if(users.contains(user)){
                throw new Exception("User already exist");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveUser(User user){
        checkUserAlreadyExist(user);
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }

    public void deleteUser(Long userId){
        users.removeIf(user -> user.getUserId().equals(userId));
    }

    public void updateUser(Long userId, String name){
        users.stream().filter(e->e.getUserId().equals(userId)).findFirst().get().setUserName(name);
    }

    public User getUser(Long userId) throws Exception {
          Optional<User>  user = users.stream().filter(e->e.getUserId() == userId).findFirst();
          if(!user.isPresent()){
              throw new Exception("User not found");
          }
          return user.get();

    }

    public double getTotalScores(){
       // users.stream().map(e->e.getScore()).reduce(0.0,Double::sum);
        return users.stream().mapToDouble(User::getUserId).sum();
    }

    public Map<Long,Double> getStudentScore(){
        Map<Long,Double> userMap = new HashMap<>();
        for(User user:users){
            userMap.put(user.getUserId(),user.getScore());
        }
        //return users.stream().collect(Collectors.toMap(User::getUserId,User::getScore));
        return userMap;
    }

}
