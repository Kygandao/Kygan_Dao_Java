package com.company.composition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
    }

    @Test
    public void shouldCreateTwoIdenticalCustomers() {
        String failMsg = "Expected to create two customers with the same information";

        Customer customer1 = new Customer();
        customer1.setFirstName("Bill");
        customer1.setLastName("Bates");
        customer1.setEmail("bill@windowsxp.com");
        customer1.setPhoneNumber(4884040);
        customer1.setHomeAddress(new Address("403 S Apple St", "", "San Francisco", "California", "94080"));
        customer1.setShippingAddress(new Address("403 S Apple St", "", "San Francisco", "California", "94080"));
        customer1.setRewardsMember(new RewardsMember(false));

        Customer customer2 = new Customer();
        customer2.setFirstName("Gill");
        customer2.setLastName("Bates");
        customer2.setEmail("bill@windowsxp.com");
        customer2.setPhoneNumber(4884040);
        customer2.setHomeAddress(new Address("403 S Apple St", "", "San Francisco", "California", "94080"));
        customer2.setShippingAddress(new Address("403 S Apple St", "", "San Francisco", "California", "94080"));
        customer2.setRewardsMember(new RewardsMember(false));

        assertEquals(failMsg, customer1, customer2);

    }
}