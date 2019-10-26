package ali.ashique.jokesapp.controllers;

import ali.ashique.services.RandomJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomJokeController {

    private RandomJokeService randomJokeService;

    public RandomJokeController(RandomJokeService randomJokeService) {
        this.randomJokeService = randomJokeService;
    }

    @GetMapping("/jokes")
    public String randomJoke(Model model) {
        model.addAttribute("joke", randomJokeService.getRandomJoke() + "--GET");
        return "index";
    }
}
