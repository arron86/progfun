object exercise1 {
  def pascal(c: Int, r: Int): Int = {
    if ( c == 0 || c == r ) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  }
  pascal(1,3)
}