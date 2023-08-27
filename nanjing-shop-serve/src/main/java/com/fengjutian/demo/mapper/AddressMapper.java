package com.fengjutian.demo.mapper;

import com.fengjutian.demo.entity.Address;
import com.fengjutian.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressMapper {
    int insertAddress(Address address);

    int delAddress(Address address);
}
