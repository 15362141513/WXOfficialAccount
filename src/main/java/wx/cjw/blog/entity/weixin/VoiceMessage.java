package wx.cjw.blog.entity.weixin;

import lombok.Data;
import wx.cjw.blog.entity.messageType.Voice;

@Data
public class VoiceMessage extends BaseMessage {
    private Voice voice;
}
