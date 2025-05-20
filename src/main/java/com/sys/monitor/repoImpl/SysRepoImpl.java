package com.sys.monitor.repoImpl;

import com.sys.monitor.models.System;
import com.sys.monitor.repository.SysRepo;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicReference;

@Component
public class SysRepoImpl implements SysRepo {
    private final AtomicReference<System> currentSystem = new AtomicReference<>();

    @Override
    public System getSystemData() {
        return currentSystem.get();
    }

    @Override
    public void setSystemData(System system) {
        currentSystem.set(system);
    }
}
