package ua.com.poseal.mysite.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.poseal.mysite.model.DownloadCounter;

@Repository
public interface DownloadCounterRepo  extends JpaRepository<DownloadCounter, Long> {

    DownloadCounter findByFileName(String fileName);

    DownloadCounter saveAndFlush(DownloadCounter entity);
}
