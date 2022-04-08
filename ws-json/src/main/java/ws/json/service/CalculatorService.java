package ws.json.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ws.json.model.Result;
import ws.json.model.Values;

@RestController
@RequestMapping(path = "/ws")
public class CalculatorService {

	private static final Logger log = LoggerFactory.getLogger(CalculatorService.class);

	/*
	 * @Path("/home")
	 * 
	 * @Produces("application/json") //@Consumes("application/json")
	 * 
	 * @RequestMapping(method = RequestMethod.GET, headers =
	 * "Accept=application/json") public @ResponseBody Result home() {
	 * 
	 * log.info("Method home"); return new Result(Integer.valueOf(10)); }
	 */

	@RequestMapping(path = "/sum", method = RequestMethod.GET, consumes = "application/json", produces = "application/json", headers = "Accept=application/json")
	public @ResponseBody Result sum(@RequestBody Values values) {

		log.info("Method sum. Values {}", values);

		try {
			log.info("Method sum. values.getValue1() {}. Class: {}", values.getValue1(), values.getValue1().getClass());
			log.info("");
			int val1 = Integer.valueOf((String) values.getValue1());
			log.info("Method sum. values.getValue2() {}", values.getValue2());
			int val2 = Integer.valueOf((String) values.getValue2());
			// int result = Integer.sum((Integer)values.getValue1(), (Integer)
			// values.getValue2());
			int result = val1 + val2;

			log.info("Method sum. Result {}", result);

			return new Result(result);

		} catch (Exception e) {
			log.error("Method sum. Excepotion {}", e.getMessage());
			return new Result(Integer.valueOf("450"));
		}
	}

	@RequestMapping(path = "/subtraction", method = RequestMethod.GET, consumes = "application/json", produces = "application/json", headers = "Accept=application/json")
	public Result subtraction(@RequestBody Values values) {
		log.info("Method subtraction. Values {}", values);

		return new Result(Integer.valueOf(300));
	}

	@RequestMapping(path = "/multiplication", method = RequestMethod.GET, consumes = "application/json", produces = "application/json", headers = "Accept=application/json")
	public Result multiplication(@RequestBody Values values) {
		return null;
	}

	@RequestMapping(path = "/division", method = RequestMethod.GET, consumes = "application/json", produces = "application/json", headers = "Accept=application/json")
	public Result division(@RequestBody Values values) {
		return null;
	}

}
