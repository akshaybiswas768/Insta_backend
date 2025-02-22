package com.geekster.InstaBackend.repository;

import com.geekster.InstaBackend.model.Like;
import com.geekster.InstaBackend.model.Post;
import com.geekster.InstaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {


    List<Like> findByInstaPost(Post myPost);

    List<Like> findByInstaPostAndLiker(Post instaPostToBeLiked, User liker);
}
