package br.com.latanks.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificadores:
 * private
 * public
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

    /*
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros 0.0000
     * float numeros 0.000F
     * char ('a', 'b') um caracter
     * boolean (Boleana) true e false
     * Date (data) 17/02/1955
     * void
     */

    /*
     * Inside of body
     */

    @PostMapping("/")
    public void create(@RequestBody UserModel obj) {
        System.out.println(obj.toString());
    }
}
