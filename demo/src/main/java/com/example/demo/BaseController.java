package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletSecurityElement;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class BaseController {
    int i = 1;
    boolean pass = false;
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
                String name = c.getName();
                String value = c.getValue();
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
            Cookie setCookie = new javax.servlet.http.Cookie("notfirst", i+"");
            setCookie.setMaxAge(60);
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


    @RequestMapping(value = "/single_upload", method = RequestMethod.POST)
    public String postTest(Model m,  @RequestParam(value  = "file") MultipartFile p){
        m.addAttribute("message","Image/wallpaper-master/"+i+".png");
        File f = new File("F://Limage/as"+(i++)+".png");
        try {
            p.transferTo(f);
            System.out.println("");
            System.out.println("");
            System.out.println("GOOD");
            System.out.println("");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("");
            System.out.println("");
            System.out.println("FAIL");
            System.out.println("");
            System.out.println("");
            e.printStackTrace();
        }
        return "redirect:LAS";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/single_upload_")
    public String fileUpload(@RequestParam("name") String name,
                             @RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes) {


        if (!file.isEmpty()) {
            try {
                i+=1;
                File f = new File("F:\\"+(i)+".png");
                file.transferTo(f);
                System.out.println("");
                System.out.println("");
                System.out.println("GOOD");
                System.out.println("");
                System.out.println("");
            }
            catch (Exception e) {
                System.out.println("");
                System.out.println("");
                System.out.println("FAIL");
                System.out.println("");
                System.out.println("");
            }
        }
        else {
            System.out.println("");
            System.out.println("");
            System.out.println("FAIL");
            System.out.println("");
            System.out.println("");
        }
        return "redirect:LAS";
    }

    @RequestMapping(value = "/game")
    public String tetris(){
        return "single_upload_form";
    }

    @RequestMapping(value="/single_upload_form", method = RequestMethod.GET)
    public String singleUploadForm() {
        return "single_upload_form";
    }

    @RequestMapping(value = "/HAKO", method = RequestMethod.POST)
    public @ResponseBody String HAKO(@RequestParam("Source") String Source, @RequestParam("Input") String input, @RequestParam("Result") String result){
        String sd = null;
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("F:/out.py"));
            if(result.equals("go"))
            {out = new BufferedWriter(new FileWriter("out.go"));}
            String s = Source;

            out.write(s); out.newLine();
            out.close();
            System.out.println(0);
            Process p = new ProcessBuilder("python", "F:/out.py").start();
            if(result.equals("go"))
            {
                p = new ProcessBuilder("go  run"," out.go").start();
            }
            System.out.println(1);
            System.out.println(2);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            System.out.println(input);
            bw.write(input);
            bw.flush();
            sd = new BufferedReader( new InputStreamReader (p.getInputStream ()) ).readLine();
            System.out.println(pass=result.equals(sd));
            p.destroy();
        } catch (IOException e) {}
        catch (Exception e){}
        System.out.println(sd);
        return sd;
    }

    @RequestMapping(value = "/HAKO")
    public @ResponseBody String HAKO_(){
        return "0";
    }
}
