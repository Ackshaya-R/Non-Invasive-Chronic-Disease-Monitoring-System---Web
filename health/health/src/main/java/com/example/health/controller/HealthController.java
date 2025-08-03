package com.example.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.health.model.HealthData;
import com.example.health.repository.HealthRepository;

@Controller
public class HealthController {

    @Autowired
    private HealthRepository healthRepo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("healthData", new HealthData());
        return "index";
    }

    @PostMapping("/predict")
    public String predictHealth(@ModelAttribute HealthData healthData, Model model) {
        double sodium = healthData.getSodium();
        double potassium = healthData.getPotassium();
        double lactose = healthData.getLactose();

        // Predicted calculations
        healthData.setGlucose((sodium + potassium) / 2);
        healthData.setHemoglobin((potassium + lactose) / 2);
        healthData.setCholesterol((sodium + lactose) / 2);

        // Save to DB and show result
        healthRepo.save(healthData);
        model.addAttribute("result", healthData);

        return "result";
    }
}
