package com.home.controller;

import com.home.service.TestService;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/SandBox")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @RequestMapping(value = "/TestData/{collection}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<JSONObject> getData(@PathVariable("collection") String collection)
    {
        JSONObject result = testService.getData();
        return new ResponseEntity<JSONObject>(result, HttpStatus.OK);
    }

}
