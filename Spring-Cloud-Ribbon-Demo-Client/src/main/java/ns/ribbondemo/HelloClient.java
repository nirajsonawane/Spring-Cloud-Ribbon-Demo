package ns.ribbondemo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "hello",configuration= HelloClientConfig.class)
@RibbonClient(name = "hello")
public interface
HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
    String getMessage();


}

