package pl.daro.psy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.daro.psy.DogDAO;
import pl.daro.psy.domain.Dog;
import pl.daro.psy.forms.DogDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;

@Controller
//@RequestMapping("/psy-webapp")
public class PiesController {
    @Autowired
    DogDAO dao;

    private DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);


    @RequestMapping("/lista")
    public String dogsList(Model model) {
        model.addAttribute("dogs", dao.getDogs());
        return "lista";
    }

    @RequestMapping("/dodaj")
    public String addDog(HttpServletRequest request, @ModelAttribute("dogDto") @Valid DogDTO dogDto, BindingResult result) {
        if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
//            try {
////                request.setCharacterEncoding("UTF-8");
////                response.setCharacterEncoding("UTF-8");
//
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
            Dog dog = new Dog();
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dog.setName(dogDto.getName());
            dog.setKeeperName(dogDto.getKeeperName());
            try {
                dog.setBirthDay(sdf.parse(dogDto.getBirthDay()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dog.setWeight(dogDto.getWeight());
            dao.addDog(dog);
            return "redirect:/lista";
        }
        return "dodaj";
    }

    @RequestMapping("/")
    public String start() {
        return "main";
    }
//@RequestMapping("/twoDogs")
//     public void test(){
//        dao.makeDogs();
////        return "dodaj";
//    }

    @RequestMapping("/psy-webapp")
    public String start2() {
        return "main";
    }

    @RequestMapping("/dog-{id}")
    public String showDog2(HttpServletRequest request ,Model model, @PathVariable("id") int dogID) {
        Dog dog = dao.getDogByID(dogID);

        model.addAttribute("id", dogID);
        model.addAttribute("name", dog.getName());
        model.addAttribute("birthDay", df.format(dog.getBirthDay()));
        model.addAttribute("weight", dog.getWeight());
        model.addAttribute("keeper", dog.getKeeperName());
        if (request.getMethod().equalsIgnoreCase("post")){
            dao.deleteDog(dog);
            return "redirect:/lista";
        }
        return "details";
    }


}
