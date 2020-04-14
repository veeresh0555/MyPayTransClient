package com.transapi.feigncleint;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.transapi.model.TransRequest;
import com.transapi.model.TransactionHistory;

@FeignClient(name="http://mypaytransaction/mypaytrans")
public interface MyPayTransClient {
	
	@PostMapping("/savetrans")
	public ResponseEntity<TransactionHistory> savetrans(TransRequest transreq);
	
	@GetMapping("/{frmmobilenumber}")
	public ResponseEntity<List<TransactionHistory>> getbalstatement(@PathVariable("frmmobilenumber") long frmmobilenumber);
	
}
