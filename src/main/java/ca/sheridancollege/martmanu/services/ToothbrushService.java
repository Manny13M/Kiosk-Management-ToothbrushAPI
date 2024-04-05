package ca.sheridancollege.martmanu.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.martmanu.beans.Toothbrush;

@Service
public interface ToothbrushService {

	public List<Toothbrush> findAll();
	public Toothbrush findById(Long id);
	public Toothbrush save(Toothbrush toothbrush);
	public List<Toothbrush> delete(Long id);
}
