package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/hello")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

//    /** @noinspection SpringMVCViewInspection*/
//    @GetMapping()
//    public String getUsers(Model model) {
//        model.addAttribute("users", userService.getUsers());
//        return "users/users";
//    }

//    /** @noinspection SpringMVCViewInspection*/
//    @GetMapping("/{id}")
//    public String showUserById(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("user", userService.showUserById(id));
//        return "users/show";
//    }

//    @GetMapping("/id")
//    public String showUserById(@RequestParam("id") long id, Model model) {
//        model.addAttribute("user", userService.showUserById(id));
//        return "users/show";
//    }



//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user) {
//        return "/new";
//    }
//
//    @PostMapping
//    public String saveUser(@ModelAttribute("user") User user) {
//        userService.saveUser(user);
//        return "redirect:/";
//    }
//
//    @PutMapping ("/update")
//    public User updateUser(@RequestBody User user) {
//        user.setId(user.getId());
//        user.setName(user.getName());
//        user.setLastName(user.getLastName());
//        user.setEmailAddress(user.getEmailAddress());
//        return userService.updateUserById(user.getId(), user);
//    }
//
//    @DeleteMapping ("/{id}")
//    public String deleteUser(@RequestParam("id") Long id) {
//        userService.deleteUserById(id);
//        return "redirect/:";
//    }

}


