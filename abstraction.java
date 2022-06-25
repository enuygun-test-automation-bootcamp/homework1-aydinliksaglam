//Abstraction ile bir işin ne yaptığını biliriz ancak nasıl yapıldığı ile ilgilenmeyiz, yani işimize yarayacak kadar bilgi sahibi oluruz ve problemlerimizi çözer geçeriz. Bu işlemler için ise Interface ve Abstract Class gibi yapılardan yararlanılır
//  Örnek olarak uçak bileti almak için yolcuların bilgilerinin olduğu veri tabanına ihtiyacımız olmaması gibi veya araba sürmeyi bilip motoru ya da nasıl çalıştığıyla ilgilenmememiz gibi.


//abstract class
// Bu örnekte Car sınıfı ve accelerate abstract metodu oluşturuldu.
abstract class Car{
    abstract void accelerate();
}
//concrete class
//Bu class'a accelerate abstract metodu uygulandı.
class Toyota extends Car{
    void accelerate(){
        System.out.println("Toyota::accelerate");

    }
}
class Main{
    public static void main(String args[]){
        Car obj = new Toyota();    //Car object =>contents of Suzuki
        obj.accelerate();          //metot çağrıldı.
    }

// abstract bir sınıfın tanımlandı, inheritance edildi ve sonra programda kullanıldı.
}