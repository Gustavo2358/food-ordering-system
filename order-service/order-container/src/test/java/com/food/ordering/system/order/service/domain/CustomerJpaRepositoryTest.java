package com.food.ordering.system.order.service.domain;


import com.food.ordering.system.order.service.dataaccess.customer.entity.CustomerEntity;
import com.food.ordering.system.order.service.dataaccess.customer.repository.CustomerJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = OrderServiceApplication.class)
class CustomerJpaRepositoryTest {

    @Autowired
    CustomerJpaRepository customerJpaRepository;

    @Test
    public void shouldFindCustomerById(){
        Optional<CustomerEntity> byId = customerJpaRepository.findById(UUID.fromString("d215b5f8-0249-4dc5-89a3-51fd148cfb41"));
//        Optional<CustomerEntity> byId = customerJpaRepository.findByUsername("user_1");
        assertTrue(byId.isPresent());
    }
}