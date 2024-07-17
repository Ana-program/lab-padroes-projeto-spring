package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import one.digitalinnovation.gof.model.Produto;
import one.digitalinnovation.gof.model.ProdutoRepository;
import one.digitalinnovation.gof.model.Setor;
import one.digitalinnovation.gof.model.SetorRepository;
import one.digitalinnovation.gof.service.ProdutoService;
import one.digitalinnovation.gof.service.ViaNomeSetorService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private SetorRepository setorRepository;

    @Autowired
    private ViaNomeSetorService viaNomeSetorService;

    @Override
    public void atualizar(Long id, Produto produto) {
         if (produto == null) {
        throw new IllegalArgumentException("Produto não pode ser nulo");
    }

    Optional<Produto> produtoExistente = produtoRepository.findById(id);
    if (produtoExistente.isPresent()) {
        Produto produtoAtualizado = produtoExistente.get();
        produtoAtualizado.setNomeProduto(produto.getNomeProduto());
        produtoAtualizado.setDescricaoProduto(produto.getDescricaoProduto());
        produtoAtualizado.setValor(produto.getValor());
        produtoAtualizado.setSetor(produto.getSetor());
        produtoRepository.save(produtoAtualizado);
    } else {
        throw new EntityNotFoundException("Produto com id " + id + " não encontrado");
    }
        
    }

    @Override
    public Produto buscarPorId(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.get();
    }

    @Override
    public Iterable<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        produtoRepository.deleteById(id);

    }

    @Override
    public void inserir(Produto produto) {
        if (produto == null || produto.getSetor() == null) {
            throw new IllegalArgumentException("Produto ou setor não podem ser nulos");
        }
        String nomeSetor = produto.getSetor().getNomeSetor();
        Setor setor = setorRepository.findById(nomeSetor).orElse(null);
    
}
}
