package com.minipro2.Lulu_MS1_SportsProduct.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minipro2.Lulu_MS1_SportsProduct.entity.SportsProduct;
import com.minipro2.Lulu_MS1_SportsProduct.repository.SportsProductrepo;

@RequestMapping("/sps")
@RestController
public class SportsProductController {
	

	

	
			
			//CRUD with Customer care
			
			@Autowired
	                  SportsProductrepo SportsProductRepository;
			
			@GetMapping("/getSportsProduct")
			public List< SportsProduct> getSportsProduct() {

				return SportsProductRepository.findAll(); // select * from <TableName>;
			}
				
				@PostMapping("/addSportsProduct")
				public SportsProduct createuser(@RequestBody SportsProduct sps) {
					return SportsProductRepository.save(sps);
				}
				
			
				@DeleteMapping("/deleteSportsProduct/{id}")
				public void deleteSportsProduct(@PathVariable("id") Integer id  ) {

			 

					SportsProductRepository.deleteById(id); // select * from <TableName>;

				}
				@PutMapping("/SportsProduct/{id}")

				public ResponseEntity<Object> updateShipping(@RequestBody SportsProduct sportsproduct, @PathVariable long id) {

			 

			Optional<SportsProduct> sportsproductOptional = SportsProductRepository.findById((int) id);

			 

				if (sportsproductOptional.isEmpty())

				return ResponseEntity.notFound().build();

			 

				sportsproduct.setId(id);

				

				SportsProductRepository.save(sportsproduct);

			 

				return ResponseEntity.noContent().build();

				}
				
				
			}

		



		
		