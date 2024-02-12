package edu.trinity.videoquizreact

import shared.SharedMessages
import org.scalajs.dom

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._

object ScalaJSExample {

  def main(args: Array[String]): Unit = {
    // This line demonstrates using Scala.js to modify the DOM.
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks

    // What is below is using Scala.js with Slinky to use React.
    println("Call the react stuff.")
    ReactDOM.render(
      div(
        h1("Hello, world!"),
        p("This is a component added with Slinky, a Scala.js React binding.")
      ),
      dom.document.getElementById("root")
    )
  }
}
