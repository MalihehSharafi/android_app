package com.example.app;

public class User
{
    private String userName;
    private Integer userID;
    private long sessionID;
    private String userRole;


    public User(String userName, String userRole, Integer userID,long sessionID)
    {
        this.userName=userName;
        this.userID=userID;
        this.sessionID=sessionID;
        this.userRole=userRole;
    }

    public User(String userName, String userRole, long sessionID)
    {
        this.userName = userName;
        this.userRole = userRole;
        this.sessionID = sessionID;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public Integer getUserID()
    {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public long getSessionID() {
        return sessionID;
    }

    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    public String getUserRole()
    {
        return userRole;
    }

    public void setUserRole(String userRole) 
    {
        this.userRole = userRole;
    }


}
