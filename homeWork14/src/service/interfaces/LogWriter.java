package service.interfaces;

import java.io.File;

public interface LogWriter {
    void writeLog(File oldFile, File newFile);
}
