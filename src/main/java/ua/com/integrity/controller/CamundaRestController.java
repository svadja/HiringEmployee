package ua.com.integrity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CamundaRestController {
	
    @RequestMapping(value = "/positions", method = RequestMethod.GET,  produces = "application/json")
    public List<String>  getPosition() {
        List<String> positions = new ArrayList<String>() ;
        return positions;
    }	
}
