package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser>mapOfUser = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> ChronoUnit.YEARS.between(user.getBirthdayDate(), LocalDate.now())>=20)
                .filter(user -> user.getNumberOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getIdOfUser, user -> user));

        mapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}