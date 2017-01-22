class Jump() {
  def calculate (x:Int, y:Int, d:Int):Double = {
    val diff = y - x
    if (diff % d == 0) diff / d
    else diff / d + 1
  }
}
