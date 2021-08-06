package com.techelevator.model;

import java.time.LocalDate;

public class Session {
    private Integer sessionId;
    private Integer userId;
    private Integer deckId;
    private Integer attemptedQuiz;
    private Integer markRight;
    private Integer markWrong;
    private Integer totalRight;
    private LocalDate sessionDate;

    public Session() {

    }

    public Session(Integer sessionId, Integer userId, Integer deckId, Integer attemptedQuiz, Integer markRight, Integer markWrong, Integer totalRight, LocalDate sessionDate) {
        this.sessionId = sessionId;
        this.userId = userId;
        this.deckId = deckId;
        this.attemptedQuiz = attemptedQuiz;
        this.markRight = markRight;
        this.markWrong = markWrong;
        this.totalRight = totalRight;
        this.sessionDate = sessionDate;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeckId() {
        return deckId;
    }

    public void setDeckId(Integer deckId) {
        this.deckId = deckId;
    }

    public Integer getAttemptedQuiz() {
        return attemptedQuiz;
    }

    public void setAttemptedQuiz(Integer attemptedQuiz) {
        this.attemptedQuiz = attemptedQuiz;
    }

    public Integer getMarkRight() {
        return markRight;
    }

    public void setMarkRight(Integer markRight) {
        this.markRight = markRight;
    }

    public Integer getMarkWrong() {
        return markWrong;
    }

    public void setMarkWrong(Integer markWrong) {
        this.markWrong = markWrong;
    }

    public Integer getTotalRight() {
        return totalRight;
    }

    public void setTotalRight(Integer totalRight) {
        this.totalRight = totalRight;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }
}
