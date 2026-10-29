package ma.enset.security.ebankservice.controllers;


import ma.enset.security.ebankservice.entities.BankAccount;
import ma.enset.security.ebankservice.services.EbankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EbankController {
    private EbankService ebankService;
    public EbankController(EbankService ebankService) {
        this.ebankService = ebankService;
    }

    @GetMapping("/accounts")
    public List<BankAccount> getAllBankAccounts() {
        return ebankService.getAllBankAccounts();
    }
    @GetMapping("/accounts/customer/{id}")
    public BankAccount getBankAccountByCustomerId(@PathVariable String id) {
        return ebankService.getBankAccountByCustomerId(id);
    }
    @PostMapping("/accounts")
    public BankAccount save(@RequestBody BankAccount bankAccount) {
        return ebankService.save(bankAccount);
    }

}
