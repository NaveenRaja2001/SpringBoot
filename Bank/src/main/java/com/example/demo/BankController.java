package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.exception.InsufficientBalanceException;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	@Autowired
	BankService bank;
	
	@RequestMapping(value="menu",method=RequestMethod.GET)
	public ModelAndView menu(ModelAndView mandv) {
		mandv.setViewName("menu");
		
		return mandv;
	}
	
	@RequestMapping(value="createAccount",method=RequestMethod.GET)
	public ModelAndView create(ModelAndView mandv) {
		BankDTO bank=new BankDTO();
		mandv.addObject("bank",bank);
		mandv.setViewName("createAccount");
		return mandv;
		
	}
	@RequestMapping(value="createAccount",method=RequestMethod.POST)
	public ModelAndView addAccount(BankDTO bankDTO,ModelAndView mandv) {
		bank.createUser(bankDTO);
		mandv.setViewName("User");
		return mandv;
		
	}
	
	@RequestMapping(value="checkBalance",method=RequestMethod.GET)
	public ModelAndView checkBalance(ModelAndView mandv) {
		BankDTO bank=new BankDTO();
		mandv.addObject("bank",bank);
		mandv.setViewName("checkBalance");
		return mandv;
		
	}
	
	@RequestMapping(value="checkBalance",method=RequestMethod.POST)
	public ModelAndView find(BankDTO banks ,ModelAndView mandv) {
		int a=banks.getUid();
	
		BankDTO banlance=bank.checkBalance(a);
		mandv.addObject("Balance",banlance);
		mandv.setViewName("Balance");
		return mandv;
}
	
	@RequestMapping(value="transfer",method=RequestMethod.GET)
	public ModelAndView transaction(ModelAndView mandv) {
		Transaction trans=new Transaction();
		mandv.addObject("trans",trans);
		
		mandv.setViewName("transfer");
		return mandv;
		
	}
	
	@RequestMapping(value="transfer",method=RequestMethod.POST)
	public ModelAndView transactionsuccess(ModelAndView mandv,Transaction trans) {
		try {
		bank.transfer(trans);
		}
		catch(Exception e) {
			mandv.addObject("error",e);
		    mandv.setViewName("InsufficientBalance");
		    return mandv;
		}
		mandv.setViewName("transferSus");
		return mandv;
		
	}
	

}