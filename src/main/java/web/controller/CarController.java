package web.controller;

import dao.CarDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class CarController {
    private CarDAO carDAO = new CarDAO();

    @GetMapping(value="/cars")
    public String getCars(@RequestParam(value = "count", required = false) String count, Model model) {
        int num = Integer.parseInt(Optional.ofNullable(count).orElse("5"));
        if (num > 5) { num = 5; }
        model.addAttribute("cars", carDAO.getCarList().subList(0, num));
        return "cars";
    }
}