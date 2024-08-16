package com.example.Cards.service;

import com.example.Cards.Exception.CardAlreadyExistException;
import com.example.Cards.dto.CardsDto;
import com.example.Cards.entity.Cards;
import com.example.Cards.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class CardServiceImpl implements ICardService{
    private final CardRepository cardRepository;

    public CardServiceImpl( CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void createCard(String mobileNumber) {
        Cards card=cardRepository.findByMobileNumber(mobileNumber).orElseThrow(
                ()->new CardAlreadyExistException("card already exist")
        );
      cardRepository.save(createCardDetails(mobileNumber));
    }

    @Override
    public CardsDto fetchCard(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateCard(CardsDto cardsDto) {
        return false;
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        return false;
    }

    private Cards createCardDetails(String mobileNumber)
    {
        Cards newCard = new Cards();
        long randomCardNumber = 100000000000L + new Random().nextInt(900000000);
        newCard.setCardNumber(Long.toString(randomCardNumber));
        newCard.setMobileNumber(mobileNumber);
        newCard.setCardType("debit");
        newCard.setTotalLimit(1000000);
        newCard.setAmountUsed(0);
        newCard.setAvailableAmount(90000);
        return newCard;
    }
}
