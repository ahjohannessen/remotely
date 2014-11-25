package remotely
package example.benchmark

trait TestData {
  val sm: Small = Small((for(i <- 1 to 10) yield i.toString -> i.toString).toMap, (for(i <- 1 to 10) yield i.toString).toList)

  val medIn: Medium = Medium(1, (0 to 200).map(_ => "a").mkstring, List.fill(10)(sm), Some(1))

  val largeIn: Large = Large(1, List("asdf", "qwer", "qwer","ldsfdfsaj","aksldjfsdfkdfjasdfpoweurpaasdflsdkfjsllslosdfiuasdpoaisudpfidsaf"), (1 to 1000) map (_ => "a").mkString, (for(i <- 1 to 20) yield i.toString -> i.toString).toMap,List.fill(10)(medIn), Vector.fill(10)(sm))

  val bigIn: Big = Big(1)

}
