package dev.inje.lublio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Progress {

    @Id
    @GeneratedValue
    private long id;

    private String progressEng;
    private String progressFra;
    private String progressDeu;
    private String progressSpa;
    private String progressRus;
    private String progressTur;

    public Progress() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProgressEng() {
        return progressEng;
    }

    public void setProgressEng(String progressEng) {
        this.progressEng = progressEng;
    }

    public String getProgressFra() {
        return progressFra;
    }

    public void setProgressFra(String progressFra) {
        this.progressFra = progressFra;
    }

    public String getProgressDeu() {
        return progressDeu;
    }

    public void setProgressDeu(String progressDeu) {
        this.progressDeu = progressDeu;
    }

    public String getProgressSpa() {
        return progressSpa;
    }

    public void setProgressSpa(String progressSpa) {
        this.progressSpa = progressSpa;
    }

    public String getProgressRus() {
        return progressRus;
    }

    public void setProgressRus(String progressRus) {
        this.progressRus = progressRus;
    }

    public String getProgressTur() {
        return progressTur;
    }

    public void setProgressTur(String progressTur) {
        this.progressTur = progressTur;
    }

    @Override
    public String toString() {
        return "Progress{" +
                "id=" + id +
                ", progressEng='" + progressEng + '\'' +
                ", progressFra='" + progressFra + '\'' +
                ", progressDeu='" + progressDeu + '\'' +
                ", progressSpa='" + progressSpa + '\'' +
                ", progressRus='" + progressRus + '\'' +
                ", progressTur='" + progressTur + '\'' +
                '}';
    }

}
