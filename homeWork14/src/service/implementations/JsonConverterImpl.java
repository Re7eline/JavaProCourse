package service.implementations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.yaml.snakeyaml.Yaml;
import service.interfaces.Converter;

import java.util.Map;

public class JsonConverterImpl implements Converter {
    @Override
    public String convert(String data) {
        try {
            return new Yaml().dump(new ObjectMapper().readValue(data, Map[].class));
        } catch (JsonProcessingException e) {
            System.err.println("Json convertation fault!");
            throw new RuntimeException(e);
        }
    }
}
