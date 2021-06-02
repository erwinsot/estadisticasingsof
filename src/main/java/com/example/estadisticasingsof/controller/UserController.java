package com.example.estadisticasingsof.controller;


import com.example.estadisticasingsof.model.User;
import com.example.estadisticasingsof.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

@Controller
@RequestMapping("/Home")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/barChart")
    public  String barChart(Model model,@RequestParam(value = "id",defaultValue = "7") Long id ){
        Optional<User> oPersona=userService.findById(id);
        Map<String,Integer> data=new LinkedHashMap<String,Integer>();
        data.put("sss",30);
        data.put("sdsd",300);
        data.put("sdsgdfss",50);
        data.put("ssfafss",350);
        data.put("fsfassss",59);
        data.put("ssdasfs",64);
        data.put("sfasgass",411);
        model.addAttribute("keySet",oPersona.get().getMateria().keySet());
        model.addAttribute("values",oPersona.get().getMateria().values());
        return "barChart";
    }
    @GetMapping("/pieChart")
    public String pieChart(Model model) {
        model.addAttribute("pass", 90);
        model.addAttribute("fail", 10);
        return "pieChart";

    }


    @GetMapping("/hi")
    public String hola(Model model){
        model.addAttribute("mensaje","probando thymeylief");
        return "hola";
    }

    @PostMapping
    public ResponseEntity<?> crete(@RequestBody User persona){
        User obj=userService.save(persona);
        return  new ResponseEntity<User>(obj, HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<?>read(@PathVariable Long id){
        Optional<User> oPersona=userService.findById(id);

        if(!oPersona.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(oPersona.get().getMateria());
    }
}
