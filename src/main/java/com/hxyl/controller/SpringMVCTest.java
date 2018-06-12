package com.hxyl.controller;

import com.hxyl.pojo.Model;
import com.hxyl.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

//SessionAttributes将值放到Session域中
//@SessionAttributes(value = {"user"},types = {String.class})
@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {
    private static final String SUCCESS = "success";

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(Model model){
        System.out.println("update : " + model);
        return SUCCESS;
    }

    /**
     * @ModelAttribute标记的方法：会在每个目标方法执行之前被SpringMVC调用
     * @param id
     * @param map
     */
    @ModelAttribute
    private void getUser(@RequestParam(value = "id",required = false) Integer id,Map<String,Object> map){
        System.out.println("ModelAttribute Method");
        if (id != null){
            Model model = new Model(1,"Tom","123456","Tom@123.com",12);
            System.out.println("从数据库中获得一个对象：" + model);
            map.put("model",model);
        }
    }

    /**
     * 可以添加Map类型(Model,ModelMap)到Request域中
     * @param map
     * @return
     */
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("names",Arrays.asList("Tom","Jerry","Mike"));
        return SUCCESS;
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String,Object> map){
        User user = new User("Tom","123456", 25,"tom@126.com");
        map.put("user",user);
        return SUCCESS;
    }

    /**
     * SpringMVC会把ModelAndView的model中数据放入到request域对象中
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }

    /**
     * 可以使用Servlet原生的API
     * HttpServletRequest
     * HttpServletResponse
     * HttpSession
     * java.security.Principal
     * Locale InputStream
     * OutputStream
     * Reader
     * Writer
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/testServletAPI")
    public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out) throws IOException {
        System.out.println("testServletAPI : " + request + " , " + response);
        out.write("hello springmvc");
//        return SUCCESS;
    }
    @RequestMapping("/testPojo")
    public String testPojo(User user){
        System.out.println("testPojo : " + user);
        return SUCCESS;
    }

    /**
     *
     * @param cv : 映射Cookie值
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID")String cv){
        System.out.println("CookieValue : " + cv);
        return SUCCESS;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language")String al){
        System.out.println("testRequestHeader : " + al);
        return SUCCESS;
    }

    /**
     *
     * @param username 请求参数：如果与请求参数名字相同，可以直接写"username"，否则必须写value="username"
     * @param age 请求参数：required 参数是否必须
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("username") String username,
                                   @RequestParam (value = "age",required = false) int age){
        System.out.println("testRequestParam : " + username + "age : " + age);
        return SUCCESS;
    }

    @ResponseBody
    @RequestMapping(value = "/testRestDelete/{id}",method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id){
        System.out.println("testRestDelete : " + id);
        return SUCCESS;
    }
    @ResponseBody
    @RequestMapping(value = "/testRestPut/{id}",method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id){
        System.out.println("testRestPut : " + id);
        return SUCCESS;
    }
    @ResponseBody
    @RequestMapping(value = "/testRestPost",method = RequestMethod.POST)
    public String testRestPost(){
        System.out.println("testRestPost");
        return SUCCESS;
    }
    @ResponseBody
    @RequestMapping(value = "/testRestGet/{id}",method = RequestMethod.GET)
    public String testRestGet(@PathVariable Integer id){
        System.out.println("testRestGet : " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testAntPath/**/")
    public String testAntPath(){
        System.out.println("testAntPath");
        return SUCCESS;
    }

    @RequestMapping(value = "/testParamsAndHeaders",params = {"username","age!=10"})
    public String testParamsAndHeaders(){
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.GET)
    public String testMethod(){
        System.out.println("testMethod");
        return SUCCESS;
    }

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return SUCCESS;
    }
}
