package com.study.spring.posts;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostsController {

    private static final Logger log = LoggerFactory.getLogger(PostsController.class);
    private final IPostsDao dao;

    public PostsController(IPostsDao dao) {
        this.dao = dao;
    }

    @GetMapping("/test")
    public String postsRoot() {
        return "posts";
    }

    @GetMapping("")
    public List<PostsDto> list() {
        return dao.findAll();
    }

    @GetMapping("/list")
    public ResponseEntity<?> viewData(@RequestParam("id") Long id) {
        log.info("view " + id);
        PostsDto post = dao.findById(id);
        if (post == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(post);
    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody PostsDto request) {
        try {
            log.info("title : {}, name : {}, content : {}", request.getTitle(), request.getAuthor_name(), request.getContent());
            dao.create(request);
            return ResponseEntity.ok("등록 완료");
        } catch (Exception e) {
            log.error("등록 실패", e);
            return ResponseEntity.status(500).body("등록 중 오류 발생");
        }
    }

    @PutMapping("/modify")
    public ResponseEntity<String> modify(@RequestParam("id") Long id, @RequestBody PostsDto request) {
        request.setId(id);
        int updated = dao.update(request);
        return updated > 0 ? ResponseEntity.ok("update success") : ResponseEntity.badRequest().body("update failed");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam("id") Long id) {
        int deleted = dao.delete(id);
        return deleted > 0 ? ResponseEntity.ok("delete success") : ResponseEntity.badRequest().body("delete failed");
    }
}