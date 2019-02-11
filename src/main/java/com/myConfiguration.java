package com;

import com.dato.AddressDto;
import com.dato.EmployeeDto;
import com.dato.com.convertor.AddressConvertor;
import com.model.Address;
import com.model.Employee;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

import static com.oracle.jrockit.jfr.ContentType.Address;

public class myConfiguration extends ConfigurableMapper {
    @Override
    protected void configure(MapperFactory factory) {


        factory.classMap(com.model.Address.class, AddressDto.class)
                .customize(new AdreessMapper()).register();


//        factory.classMap(Employee.class, EmployeeDto.class)
//                .byDefault()//name wise mapping
//                .register();

        //sub object ,due to direct name and type we need a custom mapper
        //Address -->  AddressDto
//        ConverterFactory fact = factory.getConverterFactory();
//
//
//        MapperFacade mapper = factory.getMapperFacade();
//        mapper.map(Address, AddressDto.class);
  }
}
