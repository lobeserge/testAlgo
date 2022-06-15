package clipprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PlayClip {

    private List<Clip> clipList;
    private int ticks;

    public PlayClip(List<Clip> clipList, int ticks) {
        this.clipList = clipList;
        this.ticks = ticks;
    }

    public void nextClip(){

    }

    public Clip selectNext(ActionEnum actionEnum, Clip clip){
        switch (actionEnum){
            case none:
                return clip;
            case any:
                Random random = new Random();
                return clipList.get(random.nextInt(clipList.size()));
            case other:
                Random value = new Random();
                return clipList.stream().filter(e->e!=clip).collect(Collectors.toList()).get(value.nextInt(clipList.size()));
            case next:
                if((clipList.indexOf(clip)+1) > (clipList.size()-1)){
                    return clipList.get(0);
                }
                return clipList.get(clipList.indexOf(clip)+1);
            case previous:
                if(clipList.indexOf(clip)-1<0){
                    return clipList.get(clipList.size()-1);
                }
                return clipList.get(clipList.indexOf(clip)-1);
            default:
                return null;

        }
    }



}
