package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
@ComponentScan("web")
//@RequestMapping(value = "/cars")

public class CarsController {
    private CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

//    @GetMapping("/cars")
//    public String allCars(Model model) {
//        model.addAttribute("cars", carDAO.allCars());
//        return "cars/allCars";
//    }

    @GetMapping("/cars")
    public String getCars(@RequestParam (value = "count", required = false, defaultValue = "5") Integer count, Model model){
        model.addAttribute("cars", carDAO.getCars(count));

        return "cars/getCars";
    }
}
