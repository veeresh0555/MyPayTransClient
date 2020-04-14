package com.transapi.feigncleint;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.transapi.model.BankAccounts;
import com.transapi.model.Customerdetails;

@FeignClient(name="http://bankservice/customerbank")
public interface BankServiceClient {

	@GetMapping("/info")
	public String info();
	
	@GetMapping("/listofac")
	public ResponseEntity<List<BankAccounts>> getAllBankDetails();
	
	@GetMapping("/listofcustomers")
	public ResponseEntity<List<Customerdetails>> getAllAccounts();
	
	
}
