package com.spring.day01.controller;

import com.spring.day01.bean.StudentInfo;
import com.spring.day01.vo.StudentVo;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Controller
@ResponseBody
@RequestMapping("/helloSpring")
public class SpringTest {

//    @Autowired
    Logger logger = LoggerFactory.getLogger(SpringTest.class);

    @Autowired
    PropertiesFactoryBean propertiesFactoryBean;

    @RequestMapping(value = "/day01",method = RequestMethod.POST)
    public StudentInfo getStudentInfo(@RequestBody StudentVo param){
        logger.info("请求参数：{}",param.toString());
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setAge(param.getAge());
        studentInfo.setName(param.getName());
        studentInfo.setSex(param.getSex());
        logger.info("返回参数：{}",studentInfo.toString());
        try {
            InputStream in = SpringTest.class.getClassLoader().getResourceAsStream("config_dev.properties");
            Properties properties = new Properties();
            properties.load(in);
            String p = properties.getProperty("log.dir");
            String property = propertiesFactoryBean.getObject().getProperty("log.dir");
            System.out.println(p);
            System.out.println(property);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentInfo;
    }
}
