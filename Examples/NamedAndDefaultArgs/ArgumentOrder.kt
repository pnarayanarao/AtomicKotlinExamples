// NamedAndDefaultArgs/ArgumentOrder.kt
package namedanddefaultargs1
import atomictest.eq

fun main(args: Array<String>) {
  colorRGB(blue = 0, red = 99, green = 52) eq
    "(99, 52, 0)"
  // Can't put regular arguments after named:
  // colorRGB(red = 255, 255, 0)
}
