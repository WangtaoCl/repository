package com.wt.controller;

import org.apache.commons.fileupload.DefaultFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/uploadServlet")
public class UploadServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-type","text/html;charset=UTF-8");
        System.out.println("上传成功！");
        PrintWriter pw = resp.getWriter();

        DefaultFileItemFactory factory = new DefaultFileItemFactory();
        FileUpload fileUpload = new FileUpload(factory);
        // 设置允许用户上传文件大小,单位:字节，这里设为2m
        fileUpload.setSizeMax(2 * 1024 * 1024);
        // 设置最多只允许在内存中存储的数据,单位:字节
        factory.setSizeThreshold(4096);
        // 开始读取上传信息
        List fileItems = null;
        try {
            fileItems = fileUpload.parseRequest(req);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        FileItem item = (FileItem)fileItems.get(0);
        String string = item.getString();



        pw.print("上传成功！"+"<div>"+string+"</div>");

    }
}
