package clipprogram;

public class Action {

    private ActionEnum actionEnum;
    private Long chance;

    public Action(ActionEnum actionEnum, Long chance) {
        this.actionEnum = actionEnum;
        this.chance = chance;
    }

    public ActionEnum getActionEnum() {
        return actionEnum;
    }

    public void setActionEnum(ActionEnum actionEnum) {
        this.actionEnum = actionEnum;
    }

    public Long getChance() {
        return chance;
    }

    public void setChance(Long chance) {
        this.chance = chance;
    }
}
