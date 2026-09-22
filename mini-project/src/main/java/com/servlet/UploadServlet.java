package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

@MultipartConfig(
        maxFileSize = 5L * 1024 * 1024,
        maxRequestSize = 10L * 1024 * 1024
)
public class UploadServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp
    ) throws ServletException, IOException {

        Part file = req.getPart("file");

        String fileName = Paths
                .get(file.getSubmittedFileName())
                .getFileName()
                .toString();

        fileName = UUID.randomUUID() + "_" + fileName;

        file.write(
                "E:\\JAVA\\mini-project\\src\\main\\uploads\\" + fileName
        );

        resp.getWriter().println("File uploaded successfully!");
    }
}

enum ValidType {
    PDF,
    JPEG,
    PNG
}