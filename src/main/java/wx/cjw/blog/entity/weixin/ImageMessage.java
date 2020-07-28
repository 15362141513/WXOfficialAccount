package wx.cjw.blog.entity.weixin;

import lombok.Data;
import wx.cjw.blog.entity.messageType.Image;

@Data
public class ImageMessage extends BaseMessage {
    private Image image;
}
