package com.controller;
import com.pojo.Banner;
import com.pojo.Message;
import com.pojo.Production;
import com.pojo.Work;
import com.service.BannerService;
import com.service.MessageService;
import com.service.ProductionService;
import com.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/F" )
public class FrontController {
    @Autowired
    WorkService workService;
    @Autowired
    BannerService bannerService;
    @Autowired
    ProductionService productionService;
    @Autowired
    MessageService messageService;

Logger logger=Logger.getLogger(FrontController.class);
    //查询所有标题栏一二级标题（作品和工作室）
    @RequestMapping(value = "/All", method = RequestMethod.GET)
    @ResponseBody
    public Map selectAll() {
        //logger.info();
        Map<String, Object> map = new HashMap<String, Object>();
        List<Production> productions = productionService.selectAll();
        List<Work> works = workService.selectAll();
        map.put("code", 1);
        map.put("message", "成功");
        map.put("all", productions);
        map.put("all", works);
        return map;
    }

    //查询所有为上架状态的banner图片
    @RequestMapping(value = "/banner0", method = RequestMethod.GET)
    @ResponseBody
    public Map selectBanner() throws IOException {
        //logger.info();
        Map<String, Object> map = new HashMap<String, Object>();
        List<Banner> banners = bannerService.selectAll();
        map.put("code", 1);
        map.put("message", "成功");
        map.put("all", banners);
        return map;
    }

    //点击一级标题出现所有相关三级（作品）
    @RequestMapping(value = "/title/{id}", method = RequestMethod.GET)
    @ResponseBody

    public Map selectThree(Integer id) {
        logger.info(id);
        Map<String, Object> map = new HashMap<String, Object>();
        List<Production> productions = productionService.selectThree(id);
        map.put("code", 1);
        map.put("message", "成功");
        map.put("Three", productions);
        return map;
    }

    //通过二级查询三级（作品）
    @RequestMapping(value = "/title1{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map selectProTwo(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Production> productions = productionService.selectTwo(id);
        map.put("code", 1);
        map.put("message", "成功");
        map.put("Three", productions);
        return map;
    }

    //通过二级查询三级（工作室）
    @RequestMapping(value = "/title2{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map selectWorkTwo(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Work> works = workService.selectTwo(id);
        map.put("code", 1);
        map.put("message", "成功");
        map.put("Two", works);
        return map;
    }

    //通过作品id查询留言的接口
    @RequestMapping(value = "/message{workId}", method = RequestMethod.GET)
    @ResponseBody
    public Map selectMessage(Integer workId) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<Message> list = messageService.selectMessage(workId);
            map.put("code", 1);
            map.put("message", "成功");
            map.put("list", list);
            return map;
        } catch (Exception E) {
            map.put("code", -1);
            map.put("message", "失败");
            return map;
        }

    }

    //插入留言
    @RequestMapping(value = "/inserect/{Workid}", method = RequestMethod.POST)
    @ResponseBody
    public Map insertSelective(@PathVariable ("Workid")Integer Workid,Message record) {

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            record.setWorkid(Workid);
            record.setState(1);
            map.put("code", 1);
            map.put("message", "成功");
            messageService.insertSelective(record);
            return map;
        } catch (Exception e) {
            map.put("code", -1);
            map.put("message", "失败");
            return map;
        }
    }

//    @RequestMapping(value = "/banner/in", method = RequestMethod.POST)
//    @ResponseBody
//    public Map insertbanner(MultipartFile file) throws IOException {
//        String filename = file.getOriginalFilename();
//        file.transferTo(new File("E:/project/" + filename));
//        return ("ok");
//    }

    @RequestMapping(value = "/banner1", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView selectBanner( MultipartFile file) {
        ModelAndView mv = new ModelAndView();
        File uploadDir = new File("E:/project");
        String fileName = file.getOriginalFilename();
        //构建一个完整的文件上传对象
        File uploadFile = new File(uploadDir.getAbsolutePath() + "/" + fileName);
        //判断文件是否存在
        List banner9=bannerService.selectAll();
        if (!uploadFile.exists()) {
            try {
                //通过transferTo方法进行上传
                file.transferTo(uploadFile);
                mv.addObject("code",0);
                //把文件名放入响应视图
                mv.addObject(fileName);
                mv.addObject("message",banner9);
            } catch (IOException e) {
                e.printStackTrace();
                mv.addObject(500);
                throw new RuntimeException(e.getMessage());
            }
        } else {
            mv.addObject(400);
        }
        return mv;
//@RequestMapping(value = "/worke/",method = RequestMethod.GET)
//        {
//
//        }      public List select()
    }
    @RequestMapping(value = "/1banner", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView setBanner(MultipartFile file) throws IOException {
//        Map<String, Object> map = new HashMap<String, Object>();
        String filename=file.getOriginalFilename();
        file.transferTo(new File("E/project/"+filename));
        ModelAndView map =new ModelAndView();
        List<Banner> cs = bannerService.selectAll();
        map.addObject("code", 1);
        //map.addObject("message", "成功");
        map.addObject("cs",cs);
        map.setViewName("result");
        return map;
    }
}