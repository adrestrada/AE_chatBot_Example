package test3
import scala.io.StdIn
object ChatBoot extends App {

  // Función para procesar la entrada del usuario y generar respuestas
  def processInput(input: String): String = {
    // Lógica del chatbot (puedes personalizar esto según tus necesidades)
    input.toLowerCase match {
      case "hola" => "¡Hola! ¿En qué puedo ayudarte?"
      case "adios" => "¡Hasta luego! Si tienes más preguntas, estoy aquí."
      case _ => "Lo siento, no entendí. ¿Puedes reformular la pregunta?"
    }
  }

  // Función principal del chatbot
  def runChatBot(): Unit = {
    println("¡Bienvenido al ChatBot! (Escribe 'adios' para salir)")

    // Bucle de interacción con el usuario
    var userInput = ""
    while (userInput.toLowerCase != "adios") {
      print("Usuario: ")
      userInput = StdIn.readLine()

      // Procesar la entrada y generar la respuesta
      val response = processInput(userInput)

      // Mostrar la respuesta del chatbot
      println(s"ChatBot: $response")
    }

    println("¡Hasta luego! Gracias por usar el ChatBot.")
  }

  // Iniciar el chatbot
  runChatBot()
}
