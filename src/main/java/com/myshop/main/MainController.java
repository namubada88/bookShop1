package com.myshop.main;


import com.myshop.common.base.BaseController;
import com.myshop.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("mainController")
@EnableAspectJAutoProxy
public class MainController extends BaseController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/")
    public String main(){
        return "/main/main";
    }
}
