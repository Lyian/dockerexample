package energy.uniper.vegas.dockerexample.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class GreetingController {
	
	@Value("\${app.userName}")
	lateinit var name: String
	
	@Value("\${app.greetingMessage}")
	lateinit var msg: String
	
	@GetMapping("/")
	fun greeting(model: Model): String {
		model.addAttribute("name", name)
		model.addAttribute("msg", msg)
		return "welcome"
	}
}