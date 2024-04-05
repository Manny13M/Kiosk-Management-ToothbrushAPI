package ca.sheridancollege.martmanu.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.martmanu.beans.Toothbrush;
import ca.sheridancollege.martmanu.services.ToothbrushService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/toothbrushes")
public class ToothbrushRestController {

	private ToothbrushService toothbrushService;
	
	@GetMapping(value = "/findAll")
	public List<Toothbrush> getAllToothbrushes() {
		return toothbrushService.findAll();
	}
	
	@GetMapping(value = "/findById/{id}")
	public Toothbrush getToothbrushById(@PathVariable Long id) {
		return toothbrushService.findById(id);
	}
	
	@PostMapping(value = "/save", headers = {"Content-type=application/json"})
	public List<Toothbrush> saveToothbrush(@RequestBody Toothbrush toothbrush) {
		toothbrushService.save(toothbrush);
		return toothbrushService.findAll();
	}
	
	@DeleteMapping(value = {"/delete/{id}"})
	public List<Toothbrush> deleteToothbrush(@PathVariable Long id){
		return toothbrushService.delete(id);
	}
}
