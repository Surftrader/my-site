package ua.com.poseal.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.poseal.mysite.model.DownloadCounter;
import ua.com.poseal.mysite.repo.DownloadCounterRepo;

@Service
public class DownloadService {

    @Autowired
    private DownloadCounterRepo counterRepo;

    public void saveCounter(String fileName) {

        DownloadCounter counter = counterRepo.findByFileName(fileName);

        if (counter != null) {
            counter.setCounter(counter.getCounter() + 1);
            counterRepo.saveAndFlush(counter);
        }
    }
}
