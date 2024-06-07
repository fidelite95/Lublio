package dev.inje.lublio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Record {

    @Id
    @GeneratedValue
    private int id;

    private boolean isCompleted = false;
    private int countCorrect;
    private int countIncorrect;
    private int winningRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getCountCorrect() {
        return countCorrect;
    }

    public void setCountCorrect(int countCorrect) {
        this.countCorrect = countCorrect;
    }

    public int getCountIncorrect() {
        return countIncorrect;
    }

    public void setCountIncorrect(int countIncorrect) {
        this.countIncorrect = countIncorrect;
    }

    public int getWinningRate() {
        return winningRate;
    }

    public void setWinningRate(int winningRate) {
        this.winningRate = winningRate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", isCompleted=" + isCompleted +
                ", countCorrect=" + countCorrect +
                ", countIncorrect=" + countIncorrect +
                ", winningRate=" + winningRate +
                '}';
    }

}
