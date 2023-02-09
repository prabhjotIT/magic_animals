package com.spring_boot_application.magic_animals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MagicController{
    Game g=new Game();
    @GetMapping("/" )
    String home(Model model){
        g.setupGame();
        return "home";
    }
    @GetMapping("/setupgame")
    String setupGame(Model model){
        model.addAttribute("game", new Game());

        //Player p= Player.getInstance("God",0);
       // model.addAttribute("game", g);
        
        model.addAttribute("c1attack", g.getC1().getAttack());
        model.addAttribute("c2attack", g.getC2().getAttack());
        model.addAttribute("c3attack", g.getC3().getAttack());
        model.addAttribute("c1animalphoto", g.c1animalpic);
        model.addAttribute("c2animalphoto", g.c2animalpic);
        model.addAttribute("c3animalphoto", g.c3animalpic);
        
        model.addAttribute("comment", g.comment);
        model.addAttribute("c1health", g.getC1().health);
        
        //g.startGame();
        return "home1";
    }
    @GetMapping("/startgame")
    String startgame(Model model){
        
        return "home1";
    }
    @PostMapping("/attack")
    String attack(@ModelAttribute Game game){
        g.playerAnimal=game.getPlayerAnimal();
        g.playertype=game.getPlayertype();
        game.comment=g.comment;
        game.getC1().setHealth(g.getC1().getHealth());
        game.getC2().setHealth(g.getC2().getHealth());
        game.getC3().setHealth(g.getC3().getHealth());
        game.getP().setHealth(g.getP().getHealth());
        
        String winner=g.startGame();

        if(winner.equals("")){ 
            
            return "redirect:/setupgame";
        }
        else{
            System.out.println("someone won");//have to change this to winning screen
            return "winner";
        }
    }

}