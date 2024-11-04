package online.loyfus.loyfus_online.repository;

import online.loyfus.loyfus_online.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
