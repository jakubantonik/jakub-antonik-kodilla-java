package com.kodilla.good.patterns.challenges.productOrderService;

public class ClientInfoService implements InformationService {
    @Override
    public boolean inform(User user) {
        System.out.println("Message has been send to: " + user.getLastName() + user.getFirstName() + user.getIDOfClient());
        return true;
    }
}
