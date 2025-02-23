package n01619238.assign4_arjav.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import n01619238.assign4_arjav.Model.Customer;

public interface customerRepository extends JpaRepository<Customer, Long> {
}