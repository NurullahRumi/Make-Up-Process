/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import com.mu.cmt.pfs.pfsdb.service.PfsdbQueryExecutorService;
import com.mu.cmt.pfs.pfsdb.models.query.*;

@RestController(value = "Pfsdb.QueryExecutionController")
@RequestMapping("/pfsdb/queryExecutor")
@Api(value = "QueryExecutionController", description = "controller class for query execution")
public class QueryExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

    @Autowired
    private PfsdbQueryExecutorService queryService;

    @Autowired
	private ExportedFileManager exportedFileManager;

    @RequestMapping(value = "/queries/qryCanViewOrdStake", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "user can view order stake")
    public QryCanViewOrdStakeResponse executeQryCanViewOrdStake(HttpServletRequest _request) {
        LOGGER.debug("Executing named query: qryCanViewOrdStake");
        QryCanViewOrdStakeResponse _result = queryService.executeQryCanViewOrdStake();
        LOGGER.debug("got the result for named query: qryCanViewOrdStake, result:{}", _result);
        return _result;
    }

    @RequestMapping(value = "/queries/qrySy9200pk0CallOR210", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "call or210oc0")
    public QrySy9200pk0callOr210Response executeQrySy9200pk0CallOR210(@RequestParam(value = "pOtherParams", required = false) String potherParams, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: qrySy9200pk0CallOR210");
        QrySy9200pk0callOr210Response _result = queryService.executeQrySy9200pk0CallOR210(potherParams);
        LOGGER.debug("got the result for named query: qrySy9200pk0CallOR210, result:{}", _result);
        return _result;
    }

    @RequestMapping(value = "/queries/qrySy9200pk0GetOrdRoutingUrl", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "get form URL or210oc0")
    public QrySy9200pk0getOrdRoutingUrlResponse executeQrySy9200pk0GetOrdRoutingUrl(@RequestParam(value = "pOtherParams") String potherParams, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: qrySy9200pk0GetOrdRoutingUrl");
        QrySy9200pk0getOrdRoutingUrlResponse _result = queryService.executeQrySy9200pk0GetOrdRoutingUrl(potherParams);
        LOGGER.debug("got the result for named query: qrySy9200pk0GetOrdRoutingUrl, result:{}", _result);
        return _result;
    }

}