package org.example.behavioural.command;

public interface Service {
    void addMember(String member , String memberGroup);
    void removeMember(String member , String memberGroup);
    void sendEmail();
    void sendForLater();
}
