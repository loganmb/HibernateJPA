package br.com.fiap.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.fiap.entity.Produto;

public interface IProdutoRepository extends CrudRepository<Produto, Long> {}
