package com.panxoloto.sharepoint.rest;

import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Test {

//    https://dkshanghai.sharepoint.cn/sites/Alcon_COA/Documents/coa测试.pdf

    public static void main(String argv[]){
        String user = "WMS_COA01@htdkgroup.com";
        String passwd = "Welcome123";
        String domain = "dkshanghai.sharepoint.cn";
        String spSiteUrl = "/sites/Alcon_COA";



        PLGSharepointClient wrapper = new PLGSharepointClientOnline(user, passwd, domain, spSiteUrl);
        try {
              wrapper.downloadFile("/sites/Alcon_COA/Documents/coa测试.pdf","D:/sc.pdf");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
