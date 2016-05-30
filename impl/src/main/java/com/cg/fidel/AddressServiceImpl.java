package com.cg.fidel;

import java.util.List;

import com.cg.helix.context.annotation.InjectConstructor;
import com.cg.helix.context.annotation.SingletonScope;
import com.cg.helix.mib.server.annotation.Component;
import com.cg.helix.persistence.PersistenceService;
import com.cg.helix.persistence.transaction.annotation.ReadOnly;
import com.cg.helix.persistence.transaction.annotation.Transactional;

@Transactional
@SingletonScope
@Component
public class AddressServiceImpl implements AddressService {

    private final PersistenceService persistenceService;

    @InjectConstructor
    public AddressServiceImpl(PersistenceService persistenceService) {
        this.persistenceService = persistenceService;
    }

    @ReadOnly
    @Override
    public List<Address> findAll() {
        return persistenceService.findAll().with("person").list(Address.class);
    }

}
