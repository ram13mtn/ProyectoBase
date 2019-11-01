package sv.mh.fe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/holamundo")
public class HolaMundoController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHolaMundo() {
		return "Hola Mundo";

	}
}
