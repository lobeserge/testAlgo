package dto;

import java.util.Map;

public class FilterDTO {
    Map<String, Long> names;
    Map<String,Long> passwords;
    Map<Double,Long> scores;

    public Map<String, Long> getNames() {
        return names;
    }

    public void setNames(Map<String, Long> names) {
        this.names = names;
    }

    public Map<String, Long> getPasswords() {
        return passwords;
    }

    public void setPasswords(Map<String, Long> passwords) {
        this.passwords = passwords;
    }

    public Map<Double, Long> getScores() {
        return scores;
    }

    public void setScores(Map<Double, Long> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "FilterDTO{" +
                "names=" + names +
                ", passwords=" + passwords +
                ", scores=" + scores +
                '}';
    }
}
