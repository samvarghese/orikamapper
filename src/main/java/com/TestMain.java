package com;

import com.dato.AddressDto;
import com.dato.EmployeeDto;
import com.model.Address;
import com.model.Employee;
import ma.glasnost.orika.MapperFacade;


public class TestMain {
    public static void main(String[] args) {
        //mapping class field
        //my condiguration where mapper logic is wriiten
        //Employee --> EmployeeDto
        MapperFacade facade=new myConfiguration();


        Address ad=new Address("house name","city","place",456);
        Employee emp=new Employee(1,"sam","varghese",ad);

        //data to converting class ,myConfiguration() class configure method will called
        EmployeeDto dto=facade.map(ad, EmployeeDto.class);

        System.out.println(dto);
        System.out.println(dto.getAddress().getCity());

    }
}
