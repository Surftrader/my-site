package ua.com.poseal.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.poseal.mysite.model.DownloadCounter;
import ua.com.poseal.mysite.repo.DownloadCounterRepo;

import java.time.LocalDateTime;

@Service
public class DownloadService {

    private final DownloadCounterRepo counterRepo;

    @Autowired
    public DownloadService(DownloadCounterRepo counterRepo) {
        this.counterRepo = counterRepo;
    }

    public void saveCounter(String fileName) {

        DownloadCounter counter = counterRepo.findByFileName(fileName);

        if (counter != null) {
            counter.setCounter(counter.getCounter() + 1);
            counter.setLocalDateTime(LocalDateTime.now());
            counterRepo.saveAndFlush(counter);
        }
    }
}
