package ma.enset.security.customerservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.net.ProtocolFamily;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
