package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int idOfUser;
    private final String nameOfUser;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int numberOfPosts;

    public ForumUser(int idOfUser, String nameOfUser, char sex, LocalDate birthdayDate, int numberOfPosts) {
        this.idOfUser = idOfUser;
        this.nameOfUser = nameOfUser;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdOfUser() {
        return idOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idOfUser=" + idOfUser +
                ", nameOfUser='" + nameOfUser + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
