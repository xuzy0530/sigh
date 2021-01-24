package com.sigh.core.controller;

import com.sigh.core.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author
 * @version 0.0.1
 * @params
 * @date
 */
@Controller
public class BaseController {

    @Autowired
    private BaseService baseService;

    public BaseController(){

    }
}
