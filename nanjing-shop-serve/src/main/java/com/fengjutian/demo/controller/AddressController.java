package com.fengjutian.demo.controller;

import com.fengjutian.demo.entity.Address;
import com.fengjutian.demo.entity.Response;
import com.fengjutian.demo.entity.User;
import com.fengjutian.demo.service.AddressService;
import com.fengjutian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("address/insert")
    public Response insertAddress(@RequestBody Address address) {
        try {
            int result = addressService.insertAddress(address);
            return Response.success(result);
        } catch(Exception e) {
            return Response.failure(500, String.valueOf(e));
        }
    }



}
