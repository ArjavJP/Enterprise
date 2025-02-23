package n01619238.assign4_arjav.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import n01619238.assign4_arjav.Model.Customer;
import n01619238.assign4_arjav.Service.customerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final customerService custService;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "index";
    }

    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "index";
        }

        // Save customer to the database
        custService.savecustomer(customer);

        // Add success message
        model.addAttribute("message", "Registration successful!");

        // Reset the form by adding a new empty customer object
        model.addAttribute("customer", new Customer());

        return "index";
    }
}
