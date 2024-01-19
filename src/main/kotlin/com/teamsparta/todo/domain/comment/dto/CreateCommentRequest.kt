package com.teamsparta.todo.domain.comment.dto

data class CreateCommentRequest (
        val commentContent: String,
        val password: Long
)