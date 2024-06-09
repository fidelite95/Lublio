package dev.inje.lublio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int recordId;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(nullable = false)
    private boolean isCompleted;

    @Column(nullable = false)
    private int countCorrect;

    @Column(nullable = false)
    private int countIncorrect;

    @Column(nullable = false)
    private int winningRate;

    @Column(nullable = false)
    private LocalDateTime finishedAt = LocalDateTime.now();

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", isCompleted=" + isCompleted +
                ", countCorrect=" + countCorrect +
                ", countIncorrect=" + countIncorrect +
                ", winningRate=" + winningRate +
                '}';
    }

}
