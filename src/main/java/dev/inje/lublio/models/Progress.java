package dev.inje.lublio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long progressId;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private String progressEng;

    private String progressFra;

    private String progressDeu;

    private String progressSpa;

    private String progressIta;

    private String progressRus;

    private String progressTur;

    @Override
    public String toString() {
        return "Progress{" +
                "progressId=" + progressId +
                ", progressEng='" + progressEng + '\'' +
                ", progressFra='" + progressFra + '\'' +
                ", progressDeu='" + progressDeu + '\'' +
                ", progressSpa='" + progressSpa + '\'' +
                ", progressIta='" + progressIta + '\'' +
                ", progressRus='" + progressRus + '\'' +
                ", progressTur='" + progressTur + '\'' +
                '}';
    }

}
