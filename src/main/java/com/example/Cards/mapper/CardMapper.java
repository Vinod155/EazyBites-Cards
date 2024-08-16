package com.example.Cards.mapper;

import com.example.Cards.dto.CardsDto;
import com.example.Cards.entity.Cards;

public class CardMapper {

    public static Cards mapToCards(CardsDto cardsDto,Cards card)
    {
        card.setMobileNumber(cardsDto.getMobileNumber());
        card.setCardNumber(cardsDto.getCardNumber());
        card.setCardType(cardsDto.getCardType());
        card.setAmountUsed(cardsDto.getAmountUsed());
        card.setTotalLimit(cardsDto.getTotalLimit());
        card.setAvailableAmount(cardsDto.getAvailableAmount());
        return card;
    }

    public static  CardsDto mapToCardsDto(Cards card,CardsDto cardsDto)
    {
        cardsDto.setCardNumber(card.getCardNumber());
        cardsDto.setCardType(card.getCardType());
        cardsDto.setMobileNumber(card.getMobileNumber());
        cardsDto.setAmountUsed(card.getAmountUsed());
        cardsDto.setTotalLimit(card.getTotalLimit());
        cardsDto.setAvailableAmount(card.getAvailableAmount());
        return cardsDto;
    }
}
