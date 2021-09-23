package com.rest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PaintingsDAO;
import com.dao.ShopsDAO;
import com.models.Painting;
import com.models.Shop;

@RestController
@RequestMapping("/shops")
public class ControllerRest {
	
	//injection of the dependencies
	@Autowired
	private ShopsDAO shopsDAO;
	@Autowired
	private PaintingsDAO paintingsDAO;
	
	//insert a new shop
	@PostMapping
	public ResponseEntity<Shop> createShop(@RequestBody Shop shop) {
		Shop newShop = shopsDAO.save(shop);
		return ResponseEntity.ok(newShop);
	}
	
	//get all the shops
	@GetMapping
	public ResponseEntity<List<Shop>> getShops() {
		List<Shop> shops = shopsDAO.findAll();
		return ResponseEntity.ok(shops);
	}
	
	//add a new painting
	@PostMapping
	@RequestMapping(value="{shopID}/paintings")
	public ResponseEntity<Painting> createPainting(@PathVariable("shopID") Long shopID, @RequestBody Painting painting) {
		Optional<Shop> optionalShop = shopsDAO.findById(shopID);
		if (optionalShop.isPresent()) {
			painting.setShop_id(shopID);
			Painting newPainting = paintingsDAO.save(painting);
			return ResponseEntity.ok(newPainting);
		}
		else {
			return ResponseEntity.noContent().build();
		}
	}
	
	//get all the paintings from a shop
	@GetMapping("{shopID}/paintings")
	public ResponseEntity<List<Painting>> getPaintings(@PathVariable("shopID") Long shopID) {
		Optional<Shop> optionalShop = shopsDAO.findById(shopID);
		if (optionalShop.isPresent()) {
			List<Painting> paintings = paintingsDAO.findAll().stream()  //stores in a list all the paintings from a shop
					.filter(painting -> painting.getShop_id() == shopID)
					.collect(Collectors.toList());
			return ResponseEntity.ok(paintings);
		}
		else {
			return ResponseEntity.noContent().build();
		}
	}
	
	//Incendiar quadres: per si ve la policia, es poden eliminar tots els quadres de la botiga sense deixar 
	//rastre (DELETE /shops/{ID}/pictures). 
	
	
}







