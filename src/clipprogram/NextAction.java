package clipprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NextAction {

    public  static  ActionEnum selectNextAction (Action[] actions){
        Action action1 = actions[0];
        Action action2 = actions[1];

        List<ActionEnum> nextActionList = new ArrayList<>();

        Long action1Count = 0L;
        while (action1Count < action1.getChance()){
            nextActionList.add(action1.getActionEnum());
            action1Count++;
        }

        Long action2Count = 0L;
        while (action2Count < action2.getChance()){
            nextActionList.add(action2.getActionEnum());
            action1Count++;
        }

        Random random = new Random();
        return nextActionList.get(random.nextInt(nextActionList.size()));

    }
}
