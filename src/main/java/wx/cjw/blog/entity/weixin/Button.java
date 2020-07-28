package wx.cjw.blog.entity.weixin;

import lombok.Data;

@Data
public class Button {
    /**
     * 菜单的响应动作类型，view表示网页类型，click表示点击类型，miniprogram表示小程序类型
     */
    private String type;

    /**
     * 菜单标题，不超过16个字节，子菜单不超过60个字节
     */
    private String name;

    /**
     * 二级菜单数组，个数应为1~5个
     */
    private Button[] sub_button;
}
