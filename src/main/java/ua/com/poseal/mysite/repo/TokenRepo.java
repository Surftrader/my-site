package ua.com.poseal.mysite.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.poseal.mysite.model.Token;

@Repository
public interface TokenRepo extends JpaRepository<Token, Long> {

    Token findByToken(String token);

//    @Modifying
//    @Query(name = "INSERT INTO Token (token, time_creation) VALUES(:?, :?)", nativeQuery = true)
    Token save(Token token);
//    void saveToken(@Param("token") String token, @Param("time_creation") LocalDateTime timeCreation);
}
