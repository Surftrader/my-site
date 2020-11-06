package ua.com.poseal.mysite.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.poseal.mysite.model.Card;

@Repository
public interface CardRepo extends JpaRepository<Card, Long> {

    Card findByCardNumber(Integer cardNumber);

}
