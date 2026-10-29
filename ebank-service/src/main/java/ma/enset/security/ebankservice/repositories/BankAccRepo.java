package ma.enset.security.ebankservice.repositories;

import ma.enset.security.ebankservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccRepo extends JpaRepository<BankAccount, String> {
    List<BankAccount> findByCustomerId(Long id);
}
