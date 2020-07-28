package wx.cjw.blog.entity.weixin;

import lombok.Data;
import wx.cjw.blog.entity.messageType.Video;

@Data
public class VideoMessage extends BaseMessage {
    private Video video;
}
