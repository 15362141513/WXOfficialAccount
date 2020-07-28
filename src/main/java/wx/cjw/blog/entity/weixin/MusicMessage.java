package wx.cjw.blog.entity.weixin;

import lombok.Data;
import wx.cjw.blog.entity.messageType.Music;

@Data
public class MusicMessage extends BaseMessage {
    private Music music;
}
