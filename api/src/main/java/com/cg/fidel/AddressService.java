package com.cg.fidel;

import java.util.List;

import com.cg.helix.mib.annotation.ComponentInterface;

@ComponentInterface
public interface AddressService {

    List<Address> findAll();
}
