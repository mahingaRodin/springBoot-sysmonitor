package com.sys.monitor.repository;

import com.sys.monitor.models.System;

public interface SysRepo {
    System getSystemData();
    void setSystemData(System system); //directly storing system metrics
}
