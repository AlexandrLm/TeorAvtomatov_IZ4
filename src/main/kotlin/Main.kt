import kotlin.io.*

fun main() {
    val grades = mutableListOf<Int>()
    while (true) {
        print("Введите оценку сына (2 или 5), для выхода введите '0': ")
        val grade = readln().toInt()
        if (grade == 0) break
        val prevGrade = if (grades.size != 0) grades[grades.lastIndex] else 0

        if(prevGrade != 0 && prevGrade != grade)
            grades.clear()

        grades.add(grade)
        when (grade) {
            2 -> when (grades.size) {
                1 -> println("Отец успокаивает сына.(1)")
                2 -> println("Отец ругает сына.(2)")
                else -> println("Отец наказывает сына.(3)")
            }
            5 -> when (grades.size) {
                1 -> println("Отец надеется на лучшее.(1)")
                2 -> println("Отец радуется.(2)")
                else -> println("Отец гордится сыном.(3)")
            }
            else -> println("Некорректная оценка. Пожалуйста, введите 2 или 5.")
        }
    }
}