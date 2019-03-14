package com.dkb.springsessionjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author A-pZ
 */
@RestController
public class SampleController {
    @GetMapping("/hello")
    public String start(HttpSession session) {
        session.setAttribute("sample", "sample");
        return "index";
    }
}