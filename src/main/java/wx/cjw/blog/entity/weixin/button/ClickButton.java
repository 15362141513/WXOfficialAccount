package wx.cjw.blog.entity.weixin.button;

import lombok.Data;
import wx.cjw.blog.entity.weixin.button.Button;

@Data
public class ClickButton extends Button {
    private String key;
}
