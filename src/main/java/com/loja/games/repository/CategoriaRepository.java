package com.loja.games.repository;

import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 9d2aaf09418fd49b863e5ce81b475488569c20a7
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.loja.games.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

<<<<<<< HEAD
    public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

=======
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	
>>>>>>> 9d2aaf09418fd49b863e5ce81b475488569c20a7
}
