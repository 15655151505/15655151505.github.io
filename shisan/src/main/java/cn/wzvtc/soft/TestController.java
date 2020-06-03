package cn.wzvtc.soft;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController("/" )
public class TestController {


    @RequestMapping(value="/data.json",method={RequestMethod.GET})
    public List bookById(){

        List resultList= new ArrayList();

        Map resultMap=new HashMap<>();
        resultMap.put("name","计算机安装与维护");
        resultMap.put("credit",1);
        resultList.add(resultMap);

        resultMap=new HashMap<>();
        resultMap.put("name","计算机安装与维护1");
        resultMap.put("credit",2);
        resultList.add(resultMap);

        resultMap=new HashMap<>();
        resultMap.put("name","计算机安装与维护2");
        resultMap.put("credit",3);
        resultList.add(resultMap);

        resultMap=new HashMap<>();
        resultMap.put("name","计算机安装与维护3");
        resultMap.put("credit",4);
        resultList.add(resultMap);

        return resultList;


    }
    @RequestMapping(value = "/creditByName")
    public int getCrditByName(String name) {
        if("计算机编程基础".equals(name)){
            return 4;
        }else {
            return 2;
        }
    }
}