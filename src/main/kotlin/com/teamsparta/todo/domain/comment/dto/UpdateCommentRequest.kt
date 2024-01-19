package com.teamsparta.todo.domain.comment.dto

data class UpdateCommentRequest (
        val commentContent: String,
        val password: Long
)