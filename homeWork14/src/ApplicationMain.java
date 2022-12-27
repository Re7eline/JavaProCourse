import service.implementations.FileServiceImpl;
import service.implementations.JsonConverterImpl;
import service.implementations.LogWriterImpl;
import service.implementations.YamlConverterImpl;
import service.interfaces.Converter;
import service.interfaces.FileService;
import service.interfaces.LogWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static service.implementations.FileServiceImpl.supportedFilesList;

public class ApplicationMain {

    private static final String JSON = "json";
    private static final String YAML = "yaml";

    public static void main(String[] args) {

        Path path = Path.of(System.getProperty("user.dir"));
        FileService fs = new FileServiceImpl();
        LogWriter log = new LogWriterImpl();

        if (!(args.length == 0)) {
            String fileLink = args[0].trim();
            path = Path.of(fileLink);
        }

        if (Files.isDirectory(path)) {
            System.out.println("Supported files in a directory: " + fs.supportedFiles(path));

            for (Path p : supportedFilesList) {
                if (p.getFileName().toString().endsWith(YAML)) {
                    Converter yaml = new YamlConverterImpl();
                    String str = yaml.convert(fs.readFromFile(p));

                    try {
                        log.writeLog(p.toFile(), fs.saveToFile(p, false, str, ".json"));

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                } else if (p.getFileName().toString().endsWith(JSON)) {
                    Converter json = new JsonConverterImpl();
                    String str = json.convert(fs.readFromFile(p));

                    try {
                        log.writeLog(p.toFile(), fs.saveToFile(p, false, str, ".yaml"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
