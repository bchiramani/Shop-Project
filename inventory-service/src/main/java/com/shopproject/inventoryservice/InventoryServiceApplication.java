package com.shopproject.inventoryservice;

import com.shopproject.inventoryservice.model.Inventory;
import com.shopproject.inventoryservice.repository.InventoryRepository;
import com.shopproject.inventoryservice.service.InventoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args ->{
			Inventory inventory = new Inventory();
			inventory.setSkuCode(("iphone_white"));
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode(("iphone_black"));
			inventory.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}
