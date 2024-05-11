package org.example.behavioural.command;

public class EwsService implements Service {


    @Override
    public void addMember(String member, String memberGroup) {
        System.out.println("The following member : " + member + "has been added to the : " + memberGroup);
    }

    @Override
    public void removeMember(String member, String memberGroup) {
        System.out.println("The following member : " + member + "has been removed from the : " + memberGroup);


    }

    @Override
    public void sendEmail() {

    }

    @Override
    public void sendForLater() {

    }

    static class EwsServiceSingleton{
        private static final EwsService INSTANCE = new EwsService();
    }

    public static EwsService getInstance(){
        return EwsServiceSingleton.INSTANCE;
    }

}
