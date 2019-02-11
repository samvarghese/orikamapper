package com.dato.com.convertor;

import com.dato.AddressDto;
import com.model.Address;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

public class AddressConvertor extends CustomConverter<Address, AddressDto> {

    public AddressDto convert(Address address, Type<? extends AddressDto> type, MappingContext mappingContext) {
        AddressDto addressDto = new AddressDto();
        addressDto.setCity(address.getCity());
        addressDto.setHouse(address.getHouseName());
        addressDto.setPlace(address.getPlace());
        addressDto.setZipCode(address.getZipCode());
        return addressDto;
    }
}
