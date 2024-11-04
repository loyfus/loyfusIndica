package online.loyfus.loyfus_online.controller;


import online.loyfus.loyfus_online.entity.Produto;
import online.loyfus.loyfus_online.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    List<Produto> crete(@RequestBody Produto produto) {
        return produtoService.create(produto);
    }

    @GetMapping
    List<Produto> list() {
        return produtoService.list();
    }

    @PutMapping
    List<Produto> update(@RequestBody Produto produto) {
        return produtoService.update(produto);
    }

    @DeleteMapping("{id}")
    List<Produto> delete(@PathVariable Long id) {
        return produtoService.delete(id);
    }
}
