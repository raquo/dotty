import scala.deriving.Mirror

@main def Test =
  val mirrorTop = summon[Mirror.SumOf[lib.Top]]
  assert(mirrorTop eq lib.Top) // cached in companion - previous run, tasty dependency
  assert(mirrorTop.ordinal(lib.Middle()) == 0)
