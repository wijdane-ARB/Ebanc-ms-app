package ma.enset.security.ebankservice.services;


import ma.enset.security.ebankservice.entities.BankAccount;
import ma.enset.security.ebankservice.repositories.BankAccRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class EbankService {
    private BankAccRepo bankAccRepo;
    public EbankService(BankAccRepo bankAccRepo) {
        this.bankAccRepo = bankAccRepo;
    }

    public List<BankAccount> getAllBankAccounts() {
       return bankAccRepo.findAll();
    }
    public BankAccount getBankAccountByCustomerId(String id) {
        return bankAccRepo.findById(id)
                        .orElseThrow(() -> new RuntimeException("Bank account not found for customer id: " + id));

    }
    public BankAccount save(BankAccount bankAccount) {
        bankAccount.setId(UUID.randomUUID().toString());
        bankAccount.setCreatedAt(new Date());
        return bankAccRepo.save(bankAccount);
    }

}
