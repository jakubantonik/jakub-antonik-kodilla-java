package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.List;
public class ForumUser {

    public int getPostsQuantity;
    public int getCommentsQuantity;
    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public int getPostsQuantity(){
        return posts.size();
    }

    public int getCommentsQuantity(){
        return comments.size();
    }

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }
    public void addComment(ForumPost thePost, String author, String commentBody){
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }

    public ForumPost getPost(int postNumber){
        return null;
    }

    public ForumComment getComment(int commentNumber){
        return null;
    }
    public boolean removePost(ForumPost thePost){
        return true;
    }
    public boolean removeComment(ForumComment theComment){
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
