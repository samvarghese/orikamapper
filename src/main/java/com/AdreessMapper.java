package com;

import com.dato.AddressDto;
import com.model.Address;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;


public class AdreessMapper extends CustomMapper<Address, AddressDto> {


    public void mapAtoB(Address a, AddressDto b, MappingContext context) {
        System.out.println("hai");
        b.setCity(a.getHouseName());
        b.setHouse(a.getHouseName());
        b.setPlace(a.getPlace());
        b.setZipCode(a.getZipCode());
    }

}
