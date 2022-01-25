package ua.com.poseal.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.poseal.mysite.model.Token;
import ua.com.poseal.mysite.repo.TokenRepo;

@Service
public class TokenService{

    private final TokenRepo tokenRepo;

    @Autowired
    public TokenService(TokenRepo tokenRepo) {
        this.tokenRepo = tokenRepo;
    }

    public Token getToken(String token) {
        return tokenRepo.findByToken(token);
    }

    public Token saveToken(Token token) {
        return tokenRepo.save(token);
    }
}
