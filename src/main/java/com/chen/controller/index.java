package com.chen.controller;

import com.chen.dao.book;
import com.chen.dao.bookimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
    @Autowired
    com.chen.dao.bookimpl bookimpl;
    @RequestMapping("index")
    public book x(String name) {
        return bookimpl.getbook(name);
    }
}
