package poly.edu.Java5_Lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rectangle")
public class RectangleController {
    @GetMapping("/form")
    public String form() {
        return "rectangle";
    }

    @PostMapping("/calc")
    public String calc(@RequestParam double width,
                       @RequestParam double height,
                       Model model) {
        double area = width * height;
        double perimeter = 2 * (width + height);
        model.addAttribute("width", width);
        model.addAttribute("height", height);
        model.addAttribute("area", area);
        model.addAttribute("perimeter", perimeter);
        return "rectangle";
    }
}
