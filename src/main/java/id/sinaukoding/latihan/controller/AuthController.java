package id.sinaukoding.latihan.controller;

import id.sinaukoding.latihan.common.RestResult;
import id.sinaukoding.latihan.model.dto.LoginDTO;
import id.sinaukoding.latihan.model.dto.ResponseAuthDTO;
import id.sinaukoding.latihan.model.dto.UserDTO;
import id.sinaukoding.latihan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/do-login")
    public RestResult doLogin(@RequestBody LoginDTO param){
        ResponseAuthDTO res = service.doLogin(param);

        return new RestResult(res, res != null ? "Login Sukses" : "Login Gagal", HttpStatus.OK);
    }

    @PostMapping("/do-register")
    public RestResult doRegister(@RequestBody UserDTO param){
        UserDTO res = service.doRegister(param);

        return new RestResult(res, res != null ? "Registrasi Sukses" : "Registrasi Gagal", HttpStatus.OK);
    }
}