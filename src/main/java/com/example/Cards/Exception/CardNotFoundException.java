package com.example.Cards.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CardNotFoundException  extends RuntimeException{
    public CardNotFoundException(String message)
    {
        super(message);
    }
}
