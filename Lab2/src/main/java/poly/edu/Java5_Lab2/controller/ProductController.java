package poly.edu.Java5_Lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import poly.edu.Java5_Lab2.model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private List<Product> productList = new ArrayList<>();
    private Product product1;

    public ProductController() {
        product1 = new Product("iPhone 30", 5000.0);
        productList.add(new Product("A", 1.0));
        productList.add(new Product("B", 12.0));
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("product1", product1);
        return "productForm";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Product product, Model model) {
        productList.add(product);
        model.addAttribute("product2", product);
        model.addAttribute("product1", product1);
        return "productForm";
    }

    @ModelAttribute("products")
    public List<Product> getProducts() {
        return productList;
    }

}
