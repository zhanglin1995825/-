//package com.controller;
//import com.pojo.Banner;
//import com.pojo.Production;
//import com.service.BannerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.multipart.MultipartFile;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//import java.util.UUID;
//
//
//@Controller
//@RequestMapping("/a")
//
//public class BannerController {
//    private int code;
//    @Autowired
//    private BannerService bannerService;
//    @RequestMapping(value = "/banneralls", method = RequestMethod.GET)
//    public String selectBanner(HttpServletRequest request, Banner banner, MultipartFile imgFile, ModelMap modelMap) throws IOException {
//        List<Banner> banners = bannerService.selectAll();
//        String originalFilename=imgFile.getOriginalFilename();
//            if (imgFile!=null&&originalFilename!=null&&originalFilename.length()>0){
//                String pic_path="E:/img/";
//                String newFilename= UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
//                File newFile=new File(pic_path+newFilename);
//                imgFile.transferTo(newFile);
//                HttpSession session=request.getSession();
//                session.setAttribute("img",newFilename);
//                code = banners.size() > 0?0 : -101;
//                modelMap.addAttribute("banners", banners);
//                modelMap.addAttribute("code", code);
//            }
//            return "banner";
//    }
//    @RequestMapping(value="/comment/{works_id}",method = RequestMethod.POST)
//    public String writeComment(@PathVariable("works_id")int works_id, @RequestBody Production comment, HttpServletRequest request, ModelMap modelMap){
//        String vis_ip=request.getRemoteAddr();
//        comment.setId(vis_ip);
//        comment.setState(works_id);
//        comment.(1);
//        comment.setUpdate_at(System.currentTimeMillis());
//        code=commentService.doCreate(comment)?0:-300;
//        modelMap.addAttribute("code",code);
//        return "result";
//    }
//}