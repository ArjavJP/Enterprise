package n01619238.assign4_arjav.Service;


import n01619238.assign4_arjav.Model.Customer;
import n01619238.assign4_arjav.Repository.customerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class customerService {

    private final customerRepository custrepo;

    public void savecustomer(Customer customer) {
        custrepo.save(customer);
    }
}
