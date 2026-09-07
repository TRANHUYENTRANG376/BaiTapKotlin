//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nhap ma sinh vien: ")
    val maSV=readln()
    print("Nhap ho ten sinh vien: ")
    val hoTen=readln()
    print("Nhap diem Math: ")
    val math=readln().toDouble()
    print("Nhap diem Programming: ")
    val programming=readln().toDouble()
    print("Nhap diem Database: ")
    val database=readln().toDouble()
    val tongDiem=math+programming+database
    val diemTB=tongDiem/3
    val diemCaoNhat=maxOf(math, programming, database)
    val datGPA=diemTB>=5.0
    println()
    println("Ma sinh vien: $maSV")
    println("Ho ten sinh vien: $hoTen")
    println("Diem Math: $math")
    println("Diem Programming: $programming")
    println("Diem Database: $database")
    println("Tong diem: $tongDiem")
    println("Diem trung binh: $diemTB")
    println("Diem cao nhat: $diemCaoNhat")
    if(datGPA) {
        println("Sinh vien dat GPA tren 5.0")
    }
    else {
        println("Sinh vien khong dat GPA tren 5.0")
    }
}