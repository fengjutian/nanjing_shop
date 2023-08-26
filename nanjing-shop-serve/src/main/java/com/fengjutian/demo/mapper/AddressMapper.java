package com.fengjutian.demo.mapper;

import com.fengjutian.demo.entity.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressMapper {
    int insertAddress(Address address);
}
