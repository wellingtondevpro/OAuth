package br.com.tropicalsoftware.oauth.repository;

import br.com.tropicalsoftware.oauth.entities.Role;
import br.com.tropicalsoftware.oauth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
