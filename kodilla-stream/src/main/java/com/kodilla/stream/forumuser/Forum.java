package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(01, "Kuba", 'M', LocalDate.of(1999, 1, 18), 5));
        theUserList.add(new ForumUser(02, "Karolina", 'F', LocalDate.of(2002, 5, 23), 2));
        theUserList.add(new ForumUser(03, "Bartek", 'M', LocalDate.of(2006, 3, 15), 20));
        theUserList.add(new ForumUser(04, "Magda", 'F', LocalDate.of(1999, 3, 1), 5));
        theUserList.add(new ForumUser(05, "Andrzej", 'M', LocalDate.of(1999, 6, 19), 0));
        theUserList.add(new ForumUser(06, "Damian", 'M', LocalDate.of(1999, 5, 26), 1));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUserList);
    }
}
