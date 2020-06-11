package com.victorambiel.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorambiel.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
