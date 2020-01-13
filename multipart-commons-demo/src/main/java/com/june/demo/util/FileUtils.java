package com.june.demo.util;

/**
 * @author junelee
 * @date 2020/1/12 18:12
 */
public class FileUtils {
    public static String getFileSuffix(String originalFilename) {
        // 获取文件的后缀   xx.png
        int index = originalFilename.lastIndexOf(".");
        return originalFilename.substring(index + 1);
    }
}
