package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BaseController {
    int i = 1;
    @RequestMapping(value = "/w")
    public @ResponseBody String view(){
        return "test";
    }

    @RequestMapping(value = "/LAS")
    public String view(Model m,HttpServletRequest request,HttpServletResponse response){
        int page_tema = i;
        Cookie[] getCookie = request.getCookies();
        boolean is_first = true;
        if(getCookie != null){
            for(int i=0; i<getCookie.length; i++) {
                Cookie c = getCookie[i];
                String name = c.getName(); // 쿠키 이름 가져오기
                String value = c.getValue(); // 쿠키 값 가져오기
                if (name.equals("notfirst")) {
                    is_first = false;
                    try{
                    page_tema =  Integer.parseInt(value);
                    }catch (Exception r){}
                }
            }
        }

        String go_path = "test";
        if(is_first) {
            Cookie setCookie = new javax.servlet.http.Cookie("notfirst", i+""); // 쿠키 생성
            setCookie.setMaxAge(60*60*24); // 기간을 하루로 지정
            response.addCookie(setCookie);

            m.addAttribute("message","Image/wallpaper-master/back"+((i++)%3+1)+".png");
        }
        else{
            m.addAttribute("message","Image/wallpaper-master/back"+((page_tema)%3+1)+".png");
            go_path = "info";
        }
        return go_path;
    }
    @RequestMapping(value = "/info")
    public String view1(Model m){
        m.addAttribute("message","Image/wallpaper-master/back"+((i++)%3+1)+".png");
        return "info";
    }


}
