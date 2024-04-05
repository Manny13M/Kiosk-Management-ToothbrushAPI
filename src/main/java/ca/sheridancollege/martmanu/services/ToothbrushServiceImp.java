package ca.sheridancollege.martmanu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ca.sheridancollege.martmanu.beans.Toothbrush;
import ca.sheridancollege.martmanu.repositories.ToothbrushRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ToothbrushServiceImp implements ToothbrushService {

	private ToothbrushRepository toothbrushRepo;
	
	@Override
	public List<Toothbrush> findAll() {

		return toothbrushRepo.findAll();
	}

	@Override
	public Toothbrush findById(Long id) {
		
		Optional<Toothbrush> toothbrush = toothbrushRepo.findById(id);
		
		if(toothbrush.isPresent()) {
			return toothbrush.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Toothbrush save(Toothbrush toothbrush) {

		return toothbrushRepo.save(toothbrush);
	}

	@Override
	public List<Toothbrush> delete(Long id) {
		
		Optional<Toothbrush> toothbrush = toothbrushRepo.findById(id);
		
		if(toothbrush.isPresent()) {
			
			toothbrushRepo.deleteById(toothbrush.get().getId());
		}
		
		return toothbrushRepo.findAll();
		
	}

}
