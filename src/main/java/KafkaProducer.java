import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Value("${general.kafka-topic}")
    private String kafkaTopic;
    // ... rest of the code
}