package com.invillia.acme.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.invillia.acme.dto.LojaDTO;
import com.invillia.acme.model.Loja;
import com.invillia.acme.repository.LojaRepository;
import com.invillia.acme.services.exceptions.DataIntegrityException;
import com.invillia.acme.services.exceptions.ObjectNotFoundException;

@Service
public class LojaService {
	
	@Autowired
	private LojaRepository repo;
	
	public Loja find(Integer id) {
		Loja obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Loja.class.getName());
		}
		return obj;
	}
	
	public Loja insert(Loja obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Loja update(Loja obj) {
		Loja newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma Loja que possui produtos");
		}
	}
	
	public List<Loja> findAll() {
		return repo.findAll();
	}
	
	public Loja fromDTO(LojaDTO objDto) {
		return new Loja(objDto.getId(), objDto.getNome(), objDto.getEndereco());
	}

	private void updateData(Loja newObj, Loja obj) {
		newObj.setNome(obj.getNome());
	}
}
