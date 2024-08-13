package poc.cbam.testdata.generator.simple.service;

import eu.europa.ec.taxud.cbam.o3ci.domain.operator.apiclient.model.Operator;
import eu.europa.ec.taxud.cbam.o3ci.operator.apiclient.model.BasicOperator;
import org.instancio.Instancio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import poc.cbam.testdata.generator.TestDataGeneratorApplication;
import poc.cbam.testdata.generator.simple.model.GenerationResponse;

import java.util.List;

import eu.europa.ec.taxud.cbam.o3ci.operator.apiclient.api.OperatorsManagementApiClient;

@Service
public class SimpleGeneratorService {

    private static Logger LOG = LoggerFactory.getLogger(TestDataGeneratorApplication.class);

    OperatorsManagementApiClient operatorsManagementApiClient;

    /**
     * Main Service method, central method that orchestrates all test data generation operations
     *
     * @param batchSize
     */
    public GenerationResponse startSimpleGenerator(int batchSize)
    {
        List<BasicOperator> lstOperators=createOperators(batchSize);
        callApi(lstOperators);
        return new GenerationResponse().completed(Boolean.TRUE);
    }


    private List<BasicOperator> createOperators(int batchSize) {
        return Instancio.ofList(BasicOperator.class).size(batchSize).create();
    }

    private void callApi(List<BasicOperator> lstOperators) {
        //use api calls to create the actual data in the target environment
        //multiple calls to create multiple operators
        for (BasicOperator basicOperator: lstOperators) {
            operatorsManagementApiClient.create(basicOperator);
        }
    }

}
