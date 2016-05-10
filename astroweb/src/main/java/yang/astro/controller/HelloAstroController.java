package yang.astro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by yang on 2016-05-11.
 */

@Controller
public class HelloAstroController
{
    @RequestMapping("/hello")
    public ModelAndView hello(Map<String, String> param)
    {
        System.out.println("Hello");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }
}
