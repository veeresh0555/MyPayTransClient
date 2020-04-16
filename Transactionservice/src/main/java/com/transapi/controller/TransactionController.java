package com.transapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transapi.feigncleint.BankServiceClient;
import com.transapi.feigncleint.MyPayTransClient;
import com.transapi.model.Customerdetails;
import com.transapi.model.TransRequest;
import com.transapi.model.TransactionHistory;

@RestController
@RequestMapping("/mypay/transaction")
public class TransactionController {

	@Autowired
	Environment env;
	
	@Autowired
	BankServiceClient transclient;
	
	@Autowired
	MyPayTransClient myapptransclient;
 	
	@GetMapping
	public String info() {
		String port=env.getProperty("local.server.port");
		return "Transactional Service Running on "+port;
	}
	
	@GetMapping("/allaccounts")
	public ResponseEntity<List<Customerdetails>> getAllAccounts() {
		return transclient.getAllAccounts();
	}
	
	@GetMapping("/inf")
	public String inf() {
		return myapptransclient.info();
	}
	
	
	@PostMapping("/savetrans")//transfer amount
	public ResponseEntity<TransactionHistory> savetrans(TransRequest transreq){
		return myapptransclient.savetrans(transreq);
	}
	
	@GetMapping("/{frmmobilenumber}")
	public ResponseEntity<List<TransactionHistory>> getbalstatement(@PathVariable("frmmobilenumber") long frmmobilenumber){
		return myapptransclient.getbalstatement(frmmobilenumber);
	}
	
	
	
	
	
	
	
}
