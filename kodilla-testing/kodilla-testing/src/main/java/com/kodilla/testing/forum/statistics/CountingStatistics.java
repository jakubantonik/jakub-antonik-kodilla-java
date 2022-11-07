package com.kodilla.testing.forum.statistics;

public class CountingStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageOfPostsPerUser() {
        return averageOfPostsPerUser;
    }

    public double getAverageOfCommentsPerUser() {
        return averageOfCommentsPerUser;
    }

    public double getAverageOfCommentsPerPost() {
        return averageOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageOfPostsPerUser = calculateAverageOfPostsPerUser();
        averageOfCommentsPerUser = calculateAverageOfCommentsPerUser();
        averageOfCommentsPerPost = calculateAverageOfCommentsPerPost();
    }

    public double calculateAverageOfPostsPerUser(){
        if (numberOfUsers>0){
            return numberOfPosts/numberOfUsers;
        } else {
            return 0;
        }
    }

    public double calculateAverageOfCommentsPerUser(){
        if (numberOfUsers>0) {
            return numberOfComments / numberOfUsers;
        } else {
            return 0;
        }
    }

    public double calculateAverageOfCommentsPerPost(){
        if (numberOfPosts>0) {
            return (double) numberOfComments / numberOfPosts;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Statistics :");
        System.out.println("Number of Users: " + numberOfUsers);
        System.out.println("Number of Posts: " + numberOfPosts);
        System.out.println("Number of Comments: " + numberOfComments);
        System.out.println("Average of posts per user: " + averageOfPostsPerUser);
        System.out.println("Average of comments per user: " + averageOfCommentsPerUser);
        System.out.println("Average of comments per post: " + averageOfCommentsPerPost);
    }
}
