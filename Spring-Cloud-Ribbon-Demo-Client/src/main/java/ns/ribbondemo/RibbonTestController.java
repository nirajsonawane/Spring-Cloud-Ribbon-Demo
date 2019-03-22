package ns.ribbondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ribbon-test-client/")
public class RibbonTestController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping
    public String getMessage() {
        System.out.println("Calling User Service using Feign Client!!");
        return helloClient.getMessage();
    }



}
