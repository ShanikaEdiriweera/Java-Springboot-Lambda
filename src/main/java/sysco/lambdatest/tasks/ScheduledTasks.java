package sysco.lambdatest.tasks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private final Logger logger = LoggerFactory.getLogger("lambdatest.metrics");
    @Autowired
    MetricsEndpoint metrics;

    @Scheduled(fixedRate = 60000)
    public void reportMetrics(){
        logger.info( metricsToJson() );
    }

    private String metricsToJson(){
        try {
            return "{ \"metrics\": " + new ObjectMapper().writeValueAsString(metrics.invoke())+ " }";
        } catch (JsonProcessingException e) {
         return   "{ \"metrics\":" + "\"" + e.toString()+ "\" }";
        }
    }

}
