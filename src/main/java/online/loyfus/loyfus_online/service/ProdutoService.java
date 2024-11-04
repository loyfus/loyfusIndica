package online.loyfus.loyfus_online.service;

import online.loyfus.loyfus_online.entity.Produto;
import online.loyfus.loyfus_online.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> list() {
        return produtoRepository.findAll();
    }

    public List<Produto> create(Produto produto) {
        produtoRepository.save(produto);
        return list();
    }

    public List<Produto> update(Produto produto){
        produtoRepository.save(produto);
        return list();
    }

    public List<Produto> delete(Long id){
        produtoRepository.deleteById(id);
        return list();
    }

}
