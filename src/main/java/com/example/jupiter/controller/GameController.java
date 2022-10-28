package com.example.jupiter.controller;

import com.example.jupiter.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class GameController {
    @Autowired
    private GameService gameService;

//    private final GameService gameService;
//    @Autowired
//    public GameController(GameService gameService) {
//        this.gameService = gameService;
//    }

    // /game?game_name=whatever
    // /game
    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public void getGame(@RequestParam(value = "game_name", required = false) String
                        gameName, HttpServletResponse response) throws IOException {
        String fakeName = gameService.fakeGame();
        response.getWriter().write(fakeName);
    }

//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    @ResponseBody
//    public String search(@RequestParam(value = "lon", required = false) Double lon, @RequestParam(value = "lat", required = false) Double lat, HttpServletResponse response) throws IOException {
//        System.out.println(lon);
//        return "hello search lat: " + lat + ", lon: " + lon;
//    }
//
//    @RequestMapping(value = "/restaurant/{id}/menu", method = RequestMethod.GET)
//    public void searchMenu(@PathVariable("id") int id) {
//
//    }

}
