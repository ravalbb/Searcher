package main.java;

import main.java.dto.DirectoryFileCountDTO;
import main.java.dto.ResultFilesDTO;
import main.java.search.DirectoryFileCounter;
import org.apache.log4j.Logger;

import java.io.File;

public class FileSearcher {
    private final static Logger LOGGER = Logger.getLogger(FileSearcher.class);

    public static void main(String[] args) {

        DirectoryFileCounter searcher = new DirectoryFileCounter();
        File directoryContent = new File("./search_dir/");

        ResultFilesDTO fileCounterResult =
                searcher.countFilesForDirectories(directoryContent);

        for(DirectoryFileCountDTO fileCountDTO : fileCounterResult.getResultFiles()) {
            LOGGER.info(fileCountDTO.getDirectoryName() + " " + fileCountDTO.getFileCount());
        }

        LOGGER.info("\nAll files: " + fileCounterResult.getAllFiles());

    }
}