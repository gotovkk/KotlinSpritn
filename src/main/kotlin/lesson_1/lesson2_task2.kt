package lesson_1

fun main() {
    val numOfEmployee: Int = 50
    val employeeSalary: Int = 30000
    val numOfInterns: Int = 30
    val internSalary: Int = 20000
    val employeeCosts: Int = numOfEmployee * employeeSalary
    val staffCost: Int = (numOfInterns * internSalary) + (employeeCosts)
    val averageSalary: Int = staffCost / (numOfEmployee + numOfInterns)
    println("Расходы на постоянных сотрудников: $employeeCosts")
    println("Общие расходы на всех сотрудников: $staffCost")
    println("Средняя ЗП на сотрудника: $averageSalary")
}