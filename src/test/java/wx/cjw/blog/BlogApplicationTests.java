package wx.cjw.blog;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Test

    void contextLoads() {
        String str = "762\t000010\t\t\t\t\t2\t铝镁匹林片(Ⅱ)\t\t\t每片含阿司匹林81mg，重质碳酸镁22mg，甘羟铝11mg（12片/盒）\t\t山东中健康桥制药有限公司\t盒\t盒\t\t\t\t\t\t0\t0\t\t\t\t\t1\t0\t0\t\t片剂\t1\t处方药\t国药准字H20174102\t遮光、密封、干燥处保存\t国药准字H20174102\t$$$$$$$$IM$1\t\t400\t0\t\t\t\t1\t\t\t\t\t\t\t山东中健康桥制药有限公司";
        String[] split = str.split("\t");
        int i = 0;
        for (String s : split) {
            if (!s.equals("")) {
                System.out.println(s);
                i++;
            }
        }
        System.out.println(i);

    }

}
