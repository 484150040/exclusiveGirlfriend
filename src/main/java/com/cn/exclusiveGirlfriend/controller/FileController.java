package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.utiles.FileUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.UUID;

@RestController
@RequestMapping("/file/")
@Api(value = "上传",tags = "上传数据接口API")
/**
　　* @description: TODO
　　* @Param 上传
　　* @return 
　　* @throws
　　* @author YangFangHong
　　* @date 2020/11/5 13:41
　　*/
public class FileController {
    @RequestMapping("upload")
    public String upload (@RequestParam("file") MultipartFile file,HttpServletRequest request) {
        // 获取原始名字
        String fileName = file.getOriginalFilename();
        // 获取后缀名
//         String suffixName = fileName.substring(fileName.lastIndexOf("."));
        String suffixName= FileUtil.getExtention(fileName);
        //获取绝对路径
        String projectUrl = request.getServletContext().getRealPath("/");

        //获取请求接口
//        String projectUrl = request.getRequestURI();
        //获取相对路径
//        String filePath= FileUtil.getRelativePath(fileName);
        // 文件保存路径
        String filePath = "D://upfile/";
        // 文件重命名，防止重复
        fileName = filePath + UUID.randomUUID().toString().replace("-","") + suffixName;
        // 文件对象
        File dest = new File(fileName);
        // 判断路径是否存在，如果不存在则创建
        if(!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            // 保存到服务器中
            file.transferTo(dest);
            return "上传成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    /**
    　　* @description: TODO
    　　* @Param  下载
    　　* @return
    　　* @throws
    　　* @author YangFangHong
    　　* @date 2020/11/5 13:33
    　　*/
    @RequestMapping("download")
    public void download(HttpServletResponse response,@RequestParam("img") String img) throws Exception {
        // 获取原始名字
        String suffixName= FileUtil.getExtention(img);
        // 文件地址，真实环境是存放在数据库中的
        File file = new File(img);
        // 穿件输入对象
        FileInputStream fis = new FileInputStream(file);
        // 设置相关格式
        response.setContentType("application/force-download");
        // 设置下载后的文件名以及header
        response.addHeader("Content-disposition", "attachment;fileName=" + suffixName);
        // 创建输出对象
        OutputStream os = response.getOutputStream();
        // 常规操作
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            os.write(buf, 0, len);
        }
        fis.close();
    }
}