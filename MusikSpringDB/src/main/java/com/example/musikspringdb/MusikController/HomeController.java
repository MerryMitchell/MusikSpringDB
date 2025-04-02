package com.example.musikspringdb.MusikController;

import com.example.musikspringdb.Model.Artist;
import com.example.musikspringdb.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ArtistService artistService;

    @GetMapping("/")
    public String index(Model model){
        List<Artist> personList = artistService.fetchAll();
        model.addAttribute("personliste", personList);
        return "home/index";
    }

    @GetMapping("/create")
    public String create(){
        return "home/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Artist artist){
        artistService.addArtist(artist);
        return "redirect:/";
    }
    @GetMapping("/viewOne/{id}")
    public String viewOne(@PathVariable("id") int id, Model model){
        model.addAttribute("artist", artistService.findArtistById(id));
        return "home/viewOne";
    }
    @GetMapping("/deleteOne/{id}")
    public String deleteOne(@PathVariable("id") int id){
        boolean deleted = artistService.deleteArtist(id);
        if (deleted){
            return "redirect:/";
        } else {
            return "redirect:/";
        }
    }
    @GetMapping("/updateOne/{id}")
    public String updateOne(@PathVariable("id") int id, Model model){
        model.addAttribute("artist", artistService.findArtistById(id));
        return "home/updateOne";
    }
    @PostMapping("/updateOne")
    public String updateOne(@ModelAttribute Artist artist){
        artistService.updateArtist(artist);
        return "redirect:/";
    }

}