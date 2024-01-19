package com.teamsparta.todo.domain.card.dto

data class CreateCardRequest (
        val title: String,
        val nickname: String,
        val content: String
)