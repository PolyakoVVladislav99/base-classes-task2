import kotlin.math.sqrt
import kotlin.math.pow

data class Point(val x: Double, val y: Double) {

    fun distanceTo(other: Point): Double {
        return sqrt((other.x - x).pow(2) + (other.y - y).pow(2))
    }
}

fun main() {
    try {
        println("Введите координаты первой точки (x y):")
        val (x1, y1) = readLine()!!.split(" ").map { it.toDoubleOrNull() ?: throw IllegalArgumentException("Некорректный ввод координат") }
        val point1 = Point(x1, y1)

        println("Введите координаты второй точки (x y):")
        val (x2, y2) = readLine()!!.split(" ").map { it.toDoubleOrNull() ?: throw IllegalArgumentException("Некорректный ввод координат") }
        val point2 = Point(x2, y2)

        val distance = point1.distanceTo(point2)

        println("Расстояние между точками (${point1.x}, ${point1.y}) и (${point2.x}, ${point2.y}) равно: $distance")
    } catch (e: Exception) {
        println("Ошибка: ${e.message}. Убедитесь, что вводите координаты числом через пробел.")
    }
}
