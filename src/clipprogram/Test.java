package clipprogram;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
             Action action = new Action(ActionEnum.next, 1L);
             Action action1 = new Action(ActionEnum.none, 0L);
             Clip clip1 = new Clip("hello", 2L, new Action[]{action, action1});

            Action action3 = new Action(ActionEnum.previous, 1L);
            Action action4 = new Action(ActionEnum.none, 0L);
            Clip clip2 = new Clip("hello", 2L, new Action[]{action3, action4});

            PlayClip playClip = new PlayClip(Arrays.asList(clip1), 10);
            playClip.nextClip();

    }
}
