package com;

import com.dato.EmployeeDto;
import com.dato.com.convertor.AddressConvertor;
import com.model.Employee;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class myConfiguration extends ConfigurableMapper {
    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(Employee.class, EmployeeDto.class)
                .byDefault()//name wise mapping
                .register();

        //sub object ,due to direct name and type we need a custom mapper
        //Address -->  AddressDto
        ConverterFactory fact = factory.getConverterFactory();
        fact.registerConverter(new AddressConvertor());

    }
}
