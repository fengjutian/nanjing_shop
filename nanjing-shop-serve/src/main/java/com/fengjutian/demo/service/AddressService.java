package com.fengjutian.demo.service;

import com.fengjutian.demo.entity.Address;
import com.fengjutian.demo.entity.User;
import com.fengjutian.demo.mapper.AddressMapper;
import com.fengjutian.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressMapper addressMapper;

    public int insertAddress(Address address){
        return addressMapper.insertAddress(address);
    }

    public int delAddress(Address address) {
        return addressMapper.delAddress(address);
    }
}
