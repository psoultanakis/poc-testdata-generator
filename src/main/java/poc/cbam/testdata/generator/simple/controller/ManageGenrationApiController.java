package poc.cbam.testdata.generator.simple.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import poc.cbam.testdata.generator.simple.model.GenerationResponse;
import poc.cbam.testdata.generator.simple.service.SimpleGeneratorService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ManageGenrationApiController {

@Autowired
    SimpleGeneratorService simpleGeneratorService;


    @RequestMapping(
            method = GET,
            value = "/generateOperators/{size}",
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public GenerationResponse generateOperators(@PathVariable("size") int size)
    {
        return simpleGeneratorService.startSimpleGenerator(size);
    }
}
