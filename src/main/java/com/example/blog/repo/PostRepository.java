package com.example.blog.repo;

import com.example.blog.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
