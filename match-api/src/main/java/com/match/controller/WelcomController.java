package com.match.controller;

import com.google.common.collect.Maps;
import com.match.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * 首页
 * 
 * @author GaoXiang Date: 2015-4-7
 */
@RequestMapping("/")
@Controller
public class WelcomController extends BaseController{
    
    /**
     * test
     *
     * @return
     */
    @RequestMapping("index")
    public ModelAndView index() {
        Map map = Maps.newHashMap();
        map.put("key","key1");
        map.put("data","data1");
        return toVM("index",map);
    }
    

}
