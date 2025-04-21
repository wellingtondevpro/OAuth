package br.com.tropicalsoftware.oauth.repository;

import br.com.tropicalsoftware.oauth.entities.Role;
import br.com.tropicalsoftware.oauth.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
