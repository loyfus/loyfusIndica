package online.loyfus.loyfus_online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import online.loyfus.loyfus_online.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}