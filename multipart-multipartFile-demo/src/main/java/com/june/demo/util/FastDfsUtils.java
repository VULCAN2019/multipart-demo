package com.june.demo.util;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import java.io.IOException;

/**
 * @author junelee
 * @date 2020/1/12 18:01
 */
public class FastDfsUtils {

    private static TrackerClient trackerClient;
    private static TrackerServer trackerServer;
    private static StorageClient1 storageClient1;

    static {
        try {
            // 初始化资源文件
            ClientGlobal.initByProperties("fastdfs-client.properties");
            trackerClient = new TrackerClient();
            trackerServer = trackerClient.getTrackerServer();
            storageClient1 = new StorageClient1(trackerServer, null);
        } catch (IOException | MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件上传
     *
     * @param fileBytes 文件的字节数组
     * @param suffix    文件的后缀
     * @return
     */
    public static String upload(byte[] fileBytes, String suffix) {
        try {
            return storageClient1.upload_file1(fileBytes, suffix, null);
        } catch (IOException | MyException e) {
            e.printStackTrace();
        }
        return null;
    }
}
