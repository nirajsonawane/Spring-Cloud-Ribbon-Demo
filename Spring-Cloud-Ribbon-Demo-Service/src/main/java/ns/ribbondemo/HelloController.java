package ns.ribbondemo;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/helloworld")
public class HelloController {

	@Autowired
	private Environment environment;
	@GetMapping
	public String getMessage()
	{
		String port = environment.getProperty("local.server.port");

		return "Hello Message From Server " +port;
	}

}
