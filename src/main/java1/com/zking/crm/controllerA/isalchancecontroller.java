package com.zking.crm.controllerA;
import com.zking.crm.bizA.isalchance;
import com.zking.crm.model.salchance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/salchance")
public class isalchancecontroller {

    @Autowired
   private  isalchance isalchance;


    @RequestMapping("/sele")
    @ResponseBody
    public String sele(salchance salchance){
        System.out.println("AAAAA");
        List<salchance> ss= isalchance.list(salchance);
        System.out.println(ss+"SSS");
        Map<String,Object> map=new HashMap<>();
        map.put("rows",ss);
        System.out.println("ooooopppp");
        return "ss";

    }
}
