package br.com.renbstux.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renbstux.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);


}
