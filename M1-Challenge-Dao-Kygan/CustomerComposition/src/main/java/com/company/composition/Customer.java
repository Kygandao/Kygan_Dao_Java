package com.company.composition;

import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    private Address shippingAddress;
    private Address homeAddress;

    private RewardsMember rewardsMember;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, int phoneNumber, Address shippingAddress, Address homeAddress, RewardsMember rewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.homeAddress = homeAddress;
        this.rewardsMember = rewardsMember;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber == customer.phoneNumber && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(shippingAddress, customer.shippingAddress) && Objects.equals(homeAddress, customer.homeAddress) && Objects.equals(rewardsMember, customer.rewardsMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, shippingAddress, homeAddress, rewardsMember);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shippingAddress=" + shippingAddress +
                ", homeAddress=" + homeAddress +
                ", rewardsMember=" + rewardsMember +
                '}';
    }
}
