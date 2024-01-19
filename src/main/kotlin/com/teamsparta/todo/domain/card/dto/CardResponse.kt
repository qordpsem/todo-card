package com.teamsparta.todo.domain.card.dto

data class CardResponse (
        val cardId : Long,
        val title : String,
        val nickname : String,
        val content : String
)