package com.kce.main;

import com.kce.service.mediaservice;

public class main {

    public static void main(String[] args) {

        mediaservice service = new mediaservice();

        service.signup("Alice", 25, "New York", "Engineer");
        service.signup("Bob", 25, "San Francisco", "Designer");

        service.addFriend(1, 2);

        service.createPost(1, "Enjoying the sunny day in New York! #blessed");

        service.viewPosts();
        service.likePost(1);
    }
}