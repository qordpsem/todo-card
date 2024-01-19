package com.teamsparta.todo.domain.comment.dto

data class CommentResponse (
        val cardId: Long,
        val commentId: Long,
        val commentContent: String,
        val password: Long
)