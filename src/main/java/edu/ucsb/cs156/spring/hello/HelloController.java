package edu.ucsb.cs156.spring.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        String html = "<h1>Hello World!</h1>\n" +
    "<p>This web app is powered by \n" +
    "<a href='https://github.com/jiaweiyu2009/jpa02_cs156.git'>this github repo</a></p>\n";
return html;
    }
    
}
