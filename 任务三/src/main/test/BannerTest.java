import com.pojo.Banner;
import com.pojo.Message;
import com.service.BannerService;
import com.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
    public class BannerTest {
    @Autowired
    BannerService bannerService;
    @Autowired
    MessageService messageService;
    @Test
    public void selectBanner() {
        //List<Banner>banners=bannerService.selectBanner();
        //System.out.println(banners);
    }
    @Test
    public void selectmessage(){
       // List<Message>message1=messageService.selectmessage(1,1);
         //   System.out.println(message1);
        }
    }

