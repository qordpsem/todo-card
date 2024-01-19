package com.teamsparta.todo.domain.comment.controller

import com.teamsparta.todo.domain.comment.dto.CommentResponse
import com.teamsparta.todo.domain.comment.dto.CreateCommentRequest
import com.teamsparta.todo.domain.comment.dto.DeleteCommentRequest
import com.teamsparta.todo.domain.comment.dto.UpdateCommentRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/cards/{cardId}/comments")
@RestController
class CommentController {

    @GetMapping("/{commentId}")
    fun getComment(@PathVariable cardId: Long, @PathVariable commentId: Long) : ResponseEntity<CommentResponse>{
        TODO("not implemented")
    }

    @PostMapping()
    fun createComment( @PathVariable cardId:Long, @RequestBody createcommentRequest: CreateCommentRequest) : ResponseEntity<CommentResponse>{
        TODO("not implemented")
    }

    @PutMapping("/{commentId}")
    fun updateComment(@PathVariable cardId:Long, @PathVariable commentId: Long,
                      @RequestBody updateCommentRequest: UpdateCommentRequest) : ResponseEntity<CommentResponse>{
        TODO("not implemented")
    }

    @DeleteMapping("/{commentId}")
    fun deleteComment(@PathVariable cardId: Long, @PathVariable commentId: Long,
                      @RequestBody deleteCommentRequest: DeleteCommentRequest) : ResponseEntity<CommentResponse>{
        TODO("not implemented")
    }

}