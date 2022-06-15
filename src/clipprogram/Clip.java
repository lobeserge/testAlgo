package clipprogram;

public class Clip {

    private String name;
    private Long replayCount;
    private Action[] action;

    public Clip(String name, Long replayCount, Action[] action) {
        this.name = name;
        this.replayCount = replayCount;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Long replayCount) {
        this.replayCount = replayCount;
    }

    public Action[] getAction() {
        return action;
    }

    public void setAction(Action[] action) {
        this.action = action;
    }
}
