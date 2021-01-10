package energy.uniper.vegas.dockerexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerexampleApplication

fun main(args: Array<String>) {
	runApplication<DockerexampleApplication>(*args)
}
