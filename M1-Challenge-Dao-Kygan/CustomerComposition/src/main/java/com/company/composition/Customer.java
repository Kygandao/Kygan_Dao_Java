package com.company.composition;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    private Address shippingAddress;
    private Address homeAddress;

    private RewardsMember rewardsMember;


    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public RewardsMember getRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(RewardsMember rewardsMember) {
        this.rewardsMember = rewardsMember;
    }
}
