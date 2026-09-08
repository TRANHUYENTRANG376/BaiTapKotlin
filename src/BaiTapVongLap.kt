fun main() {
    println("Ma sinh vien: 2415053122344")
    println("Ho ten sinh vien: Tran Huyen Trang")
    println("\nBai 1: In cac so tu 1 den 10")
    for(i in 1.. 10) {
        print("$i ")
    }
    println("\nBai 2: Tinh tong 1+2+3+...+10")
    var sum=0
    for(i in 1..100) {
        sum+=i
    }
    println("Tong=$sum")
    println("Bai 3: In cac so chan tu 1 den 20")
    for(i in 1.. 20) {
        if(i%2==0) {
            print("$i ")
        }
    }
}