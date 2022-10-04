//Kotlin infix function notation
/*Trong Kotlin, một hàm được đánh dấu bằng
từ khóa infix cũng có thể được gọi bằng cách sử dụng ký hiệu infix
 có nghĩa là gọi mà không sử dụng (dấu ngoặc và dấu chấm.)
Có hai loại ký hiệu hàm infix trong Kotlin*/
// infix notation function do người dùng xác định chỉ hợp lệ khi:
// là một function thành viên(ví dụ như là 1 method of class)
// phải chấp nhận 1 tham số duy nhất
// Tham số không được chấp nhận số lượng đối số thay đổi và không được có giá trị mặc định
// Nó phải được đánh dấu bằng từ khóa infix
class Test{
    infix fun Hello(Name : String) : Unit{
        println("Hello ${Name}");
    }
}
//Kotlin Higher-Order Functions: các function bậc cao
/*Các hàm Kotlin có thể được lưu trữ trong các biến và cấu trúc dữ liệu, được truyền dưới dạng đối số đến và trả về từ các hàm bậc cao khác. */
// chỉ có thể lưu trữ các hàm ẩn danh và lambda expression vào biến , không thể lưu trữ các hàm có tên vào biến
//Trong Kotlin, một hàm có thể chấp nhận một hàm làm tham số hoặc
// có thể trả về một hàm được gọi là Higher-Order function(hàm Thứ tự cao hơn)
//Truyền biểu thức lambda làm tham số cho Hàm bậc cao hơn
var lambda1 = { println("return Unit Type"); }
var lambda2:(String,Int) -> String = {Name,Age -> Name + Age}
inline fun higherFun(lambda: () -> Unit) : Unit {// day la 1 higher-order Function voi tham so la 1 lambda function Unit return
    lambda();
}
inline fun higherFunc2(lambda: (String,Int) -> String,Name: String,Age :Int) : Unit {
    println(lambda(Name, Age));// day la 1 higher-order Function voi tham so la 1 lambda function String return
}
//inline fun higherFun3(lambda: () -> Unit) :
//Truyền hàm dưới dạng tham số cho hàm Thứ tự cao hơn -
inline fun Display(Name : String) : Unit{
    println("Name: $Name");
}
inline fun Display2(Name : String, Age : Int) : String{
    return Name + " " + Age;
}
inline fun higherFunpara(Display:(String) -> Unit, Name : String) : Unit {
    Display(Name);
}
//Trả về một hàm từ hàm Thứ tự cao hơn
inline fun returDisplay() : (String) -> Unit {
    return ::Display;
}
fun main(args: Array<String>) {
// mot so vi du ve su dung infix function sytem
//    println((5 < 6) and (7 > 8));//call using infix notation
    var result = 0 shr 1;// shr is o infix notation(ký hiệu infix giống kiểu gọi method không cần () và dot(.))
    // tương tự thế , toán tử ++ và -- cũng là infix notation
//    val obj : Test = Test();
//    obj Hello "Thien";// giong nhu nap chong toan tu trong C++ vay
    //Các lệnh gọi hàm infix có mức độ ưu tiên thấp hơn các toán tử số học, kiểu đúc và toán tử rangeTo.
//    higherFun(lambda1);
//    higherFunc2(lambda2, "Thien",20);// lambda von di la 1 thuoc tinh da chua tham chieu roi
//    higherFunpara(::Display,"Tran Dinh Thien");// truyen tham chieu cua ham Display
//    val temp = returDisplay();
//    temp("Tran Dinh Thien");
    // Vậy các hàm bậc cao là các hàm nhận tham số là 1 function , return 1 function
    // hay sử dụng toán tử :: để tạo 1 tham chiếu của 1 class or 1 tham chiếu của đối tượng cụ thế
}