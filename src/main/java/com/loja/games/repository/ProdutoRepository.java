package com.loja.games.repository;

import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 9d2aaf09418fd49b863e5ce81b475488569c20a7
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.loja.games.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

<<<<<<< HEAD
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);


=======
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	
>>>>>>> 9d2aaf09418fd49b863e5ce81b475488569c20a7
}
