package wx.cjw.blog.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wx.cjw.blog.util.WXSignUtil;
import wx.cjw.blog.util.XMLUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

//import wx.cjw.blog.util.XMLUtil;

@RestController
@RequestMapping("/token")
@Log4j2
public class tokenController {
    @Autowired
    WXSignUtil wxSignUtil;

    @GetMapping("/")
    public String demo(String signature, String timestamp
            , String nonce, String echostr) {
        log.info("signature: " + signature);
        log.info(timestamp);
        log.info(nonce);
        log.info(echostr);
        if (wxSignUtil.checkSignature(signature, timestamp, nonce)) {
            log.info("验证成功！");
            return echostr;

        } else {
            log.info("验证失败");
            return "";

        }
    }

    @PostMapping("/")
    public void demo2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.info("into post /token/");
        Map<String, String> map = XMLUtil.parseXmlFromRequest(request);
        log.info(map);
        Map<String, String> reqXmlData;
        try {
//            reqXmlData = XMLUtil.parseXmlFromRequest(request);
//            weiXinService.doRequestXmlData(request.getQueryString(), reqXmlData,response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
