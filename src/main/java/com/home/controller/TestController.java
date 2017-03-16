package com.home.controller;

import com.home.domain.Customer;
import com.home.service.TestService;
import com.home.service.TestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/SandBox/TestData")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/{collection}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Customer> getData(@PathVariable("collection") String collection)
    {
        TestService testService = new TestServiceImpl();
        Customer result = testService.getData();
        return new ResponseEntity<Customer>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST )
    @ResponseStatus( HttpStatus.CREATED )
    public void create( @RequestBody Customer input ){
        TestService testService = new TestServiceImpl();
        testService.saveData( input );
    }

}
