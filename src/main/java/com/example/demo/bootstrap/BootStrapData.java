package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class BootStrapData implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(BootStrapData.class);

    // Repositories for accessing Customer and Division data
    private CustomerRepository customerRepository;
    private DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Load customer data if customer count equals 1
        if (customerRepository.count() == 1) {

            Customer customer1 = new Customer();
            customer1.setFirstName("Natalie");
            customer1.setLastName("Appl");
            customer1.setPostal_code("12345");
            customer1.setAddress("222 Street");
            customer1.setPhone("(555)555-1234");
            customer1.setDivision(divisionRepository.findAll().get(7));

            Customer customer2 = new Customer();
            customer2.setFirstName("Hannah");
            customer2.setLastName("Banana");
            customer2.setPostal_code("12345");
            customer2.setAddress("333 Street");
            customer2.setPhone("(555)555-5678");
            customer2.setDivision(divisionRepository.findAll().get(7));

            Customer customer3 = new Customer();
            customer3.setFirstName("John");
            customer3.setLastName("Smith");
            customer3.setPostal_code("12345");
            customer3.setAddress("444 Street");
            customer3.setPhone("(555)555-9101");
            customer3.setDivision(divisionRepository.findAll().get(5));

            Customer customer4 = new Customer();
            customer4.setFirstName("Aria");
            customer4.setLastName("Auditore");
            customer4.setPostal_code("12345");
            customer4.setPhone("(555)555-1121");
            customer4.setAddress("111 Street");
            customer4.setDivision(divisionRepository.findAll().get(2));

            Customer customer5 = new Customer();
            customer5.setFirstName("Freya");
            customer5.setLastName("Thorsdottir");
            customer5.setPostal_code("12345");
            customer5.setAddress("555 Street");
            customer5.setPhone("(555)555-3141");
            customer5.setDivision(divisionRepository.findAll().get(3));

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            logger.info("Sample customers loaded");
        } else {
            logger.info("Customers already loaded");
        }
    }
}
