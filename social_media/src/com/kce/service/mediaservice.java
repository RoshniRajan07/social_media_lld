package com.kce.service;

import java.util.ArrayList;
import com.kce.model.post;
import com.kce.model.admin;

public class mediaservice {

    ArrayList<admin> users = new ArrayList<>();
    ArrayList<post> posts = new ArrayList<>();

    int userId = 1;
    int postId = 1;

    public void signup(String name, int age, String location, String occupation) {

        admin u = new admin();
        u.setUserId(userId++);
        u.setName(name);
        u.setAge(age);
        u.setLocation(location);
        u.setOccupation(occupation);

        users.add(u);

        System.out.println("User created successfully.");
    }

 
    public void createPost(int userId, String content) {

        post p = new post();
        p.setPostId(postId++);
        p.setUserId(userId);
        p.setContent(content);
        p.setLikes(0);

        posts.add(p);

        System.out.println("Post created successfully.");
    }
    public void addFriend(int id1, int id2) {
        System.out.println("User " + id1 + " and User " + id2 + " are now friends.");
    }

  
    public void viewPosts() {

        for (post p : posts) {

            System.out.println("Post ID: " + p.getPostId());
            System.out.println("User ID: " + p.getUserId());
            System.out.println("Content: " + p.getContent());
            System.out.println("Likes: " + p.getLikes());
            System.out.println();
        }
    }


    public void likePost(int id) {

        for (post p : posts) {

            if (p.getPostId() == id) {

                p.setLikes(p.getLikes() + 1);
                System.out.println("Post liked.");
            }
        }
    }
}