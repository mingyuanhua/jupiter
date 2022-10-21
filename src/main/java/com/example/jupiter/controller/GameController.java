package com.example.jupiter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class GameController {
    // /game?game_name=whatever
    // /game
    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public void getGame(@RequestParam(value = "game_name", required = false) String
                        gameName, HttpServletResponse response) throws IOException {
        System.out.println(gameName);
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public void search(@RequestParam("lon") double lon, @RequestParam("lat") double lat, HttpServletResponse response) throws IOException {
        System.out.println(lon);
    }

    @RequestMapping(value = "/restaurant/{id}/menu", method = RequestMethod.GET)
    public void searchMenu(@PathVariable("id") int id) {

    }

}
