package com.example.makingit.softchatapp;

/*
    Used to create individual user objects composed of name a network id(probably ip), and either the key pair the user will have or if its another member of the chat just a public key

    private variables
        name - how the user is seen in chat
        ip - what ip address messages will be sent to
        publicKey - the users public key used to encrypt messages

    methods
        public constructors
        getUserName() - returns users name as a string
        getIP() - returns the users IP as a string
        getPublicUserProfile() - returns the user profile as a string array to be sent to other users with the app running
 */


public class User{

    private String name, ip;//self explanatory
    private String publicKey;//the users public key to be sent out to other users

    //default user constructor
    public User(){
        this.name = "User";
        this.ip = "0.0.0.0";
        this.publicKey = "Default Public Key";
    }
    //specified user constructor
    public User(String n, String i, String k){
        this.name = n;
        this.ip = i;
        this.publicKey = k;
    }

    public String getUserName(){
        return this.name;
    }

    public String getIP(){
        return this.ip;
    }

    public String[] getPublicUserProfile(){
        return new String[] {this.name, this.ip, this.publicKey};
    }

}
