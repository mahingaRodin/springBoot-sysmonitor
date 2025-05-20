package com.sys.monitor.controllers;

import com.sys.monitor.models.System;
import com.sys.monitor.service.SysService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DataController {
    private final Logger log = LoggerFactory.getLogger(DataController.class);

    @Autowired
    private SysService service;
    @Autowired
    private SysService sysService;

    @GetMapping("/os-metrics")
    public System getSystemMetrics(HttpServletRequest request,
                                   @RequestParam(value = "id", required = false, defaultValue = "noId") String id
                                   ) {
        String guid = UUID.randomUUID().toString();
        log.info("GUID: " + guid + ", ID: " + id + ", Request from IP: " + request.getRemoteAddr());
        return sysService.fetchAndUpdateMetrics(guid,id);
    }
}
