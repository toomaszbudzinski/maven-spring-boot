package pl.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    //use localhost:8080/hello
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    //use localhost:8080/helloName?name=Tom
    @GetMapping("/helloName")
    @ResponseBody
    public String helloName(@RequestParam(name = "name", required = false) String name){
        return "hello " + name;
    }

    //often use
    //use localhost:8080/helloSurname/Budz
    @GetMapping("/helloSurname/{name}")
    @ResponseBody
    public String helloSurname(@PathVariable("name") String name){
        return "Hello " + name;
    }
}