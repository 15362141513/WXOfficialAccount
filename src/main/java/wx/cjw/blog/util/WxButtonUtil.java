package wx.cjw.blog.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import wx.cjw.blog.entity.weixin.button.ClickButton;

import java.net.MalformedURLException;

@Component
@Log4j2
public class WxButtonUtil {

    /**
     * 组装菜单
     *
     * @return
     */
//    public static Menu initMenu(){
//        Menu menu = new Menu();
//        ViewButton button11 = new ViewButton();
//        //注意按钮名字不要太长，不然会报40018错误
//        button11.setName("搜索");
//        button11.setType("view");
//        button11.setUrl("https://www.baidu.com");
//        //注意链接不要少了https://  否则会报错40055
//
////        SendPicButton button21 = new SendPicButton();
////        button21.setName("发图");
////        button21.setType("pic_photo_or_album");
////        button21.setKey("pic");
//
//        SendLocalButton button32 = new SendLocalButton();
//        button32.setName("发位置");
//        button32.setType("location_select");
//        button32.setKey("local");
//
//        ClickButton button31 = new ClickButton();
//        button31.setName("点赞");
//        button31.setType("click");
//        button31.setKey("strtest");//事件key
//
//        Button button = new Button();
//        button.setName("click2");
//        button.setSub_button(new Button[]{button31,button32});
//
//        menu.setButton(new Button[]{button11,button});
//        return menu;
//    }
    public void init() throws MalformedURLException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
        ClickButton button = new ClickButton();
        button.setName("测试");
        button.setType("click");
        button.setKey("V1001_TODAY_MUSIC");
        ResponseEntity<String> result = restTemplate.postForEntity(url, button, String.class);
        JSONObject body = JSON.parseObject(result.getBody());
        log.info(body);
    }
}
