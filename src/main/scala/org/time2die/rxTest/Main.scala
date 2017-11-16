package org.time2die.rxTest


object ObservablesItems extends App {
  import rx.lang.scala._

  val o = Observable.from(List("Pascal", "Java", "Scala"))
  o.subscribe( i=>{ println(i) })
  o.subscribe( i=>{ println(s"$i another") })
//  o.subscribe(name => log(s"forgot the $name language"))

}


class Main extends {

}
