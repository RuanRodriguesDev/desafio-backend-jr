package br.com.autoscore.desafiobackendjr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.autoscore.desafiobackendjr.entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo ,Long> {
}
