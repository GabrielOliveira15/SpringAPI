package com.sistema.SistemaCRUD.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.SistemaCRUD.models.model.Peca;
import com.sistema.SistemaCRUD.models.repository.PecaRepository;
import com.sistema.SistemaCRUD.models.service.PecaService;

@Service
public class PecaServiceImpl implements PecaService {
	
	@Autowired
	public PecaRepository pecaRepository;
	
	@Override
	public List<Peca> lista() {
		return pecaRepository.findAll();
	}

	@Override
	public Peca incluir(Peca peca) {
		return pecaRepository.save(peca);
	}

	@Override
	public Peca alterar(Long id, Peca peca) {
		
		Peca pecaCadastrada = pecaRepository.findById(id).get();
		
		pecaCadastrada.setCodigo_peca(peca.getCodigo_peca());
		pecaCadastrada.setDescricao_peca(peca.getDescricao_peca());
		pecaCadastrada.setPreco_peca(peca.getPreco_peca());
		
		return pecaRepository.save(pecaCadastrada);
	}

	@Override
	public void excluir(Long id) {
		pecaRepository.deleteById(id);
	}

}
