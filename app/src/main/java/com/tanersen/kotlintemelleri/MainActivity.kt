package com.tanersen.kotlintemelleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba Kotlin")

        //Değişkenler ve Sabitler

        //Int
        println("-----------Int(tamsayı)----------")

        // Değişkenler ile ilgili değer aralıkları kotlinlang.com basic types
        // Değişken belirlemede en önemli nokta hafızada kaplayacağı alana
        // göre en uygun şekilde kullanmaktır.
        var a=5
        var b=10
        println(a*b)
        // var ın üzerinin yeşil olması madem değişkeni sabit yapacaksın
        // neden val kullanmıyorsun uyarısıdır.
        val pi = 3.14
        val yariCap = 5

        //Kod yazma jargonu
        //camelCase yariCap
        //snake_case yari_cap

        val alan =pi*yariCap*yariCap

        //pi = 5 yapamazsın. pi sabit değer olarak tanımlayıp 3 yapmışsın.
        //val sabitlerde kullanılır.
        println(alan)

        //Tanımlama (Defining)

        val myInteger : Int

        //Değer Atama (Initialzing)
        myInteger = 5
        println(myInteger)
        println(myInteger/2)
        //Burada sonuç 2.5 değil 2 çıkacaktır.
        //Nedeni myInteger değerini ondalık yani double
        //olarak tanımlamadın.

        //Long
        println("-----------Long(tamsayı)----------")
        // Başta belirlediğin değişkenin ileride
        // Int kapasitesini aşma durumu varsa
        //şu şekilde Initial yaparsın
        // Int kapasitesi = - + 2milyar147milyon483bin648
        var myLong : Long = 100
        myLong = 3000000000000
        println(myLong)

        //Double & Float
        println("-----------Double & Float(ondalıklı)----------")
        //Float virgülden sonra 6-7 ondalık basamağa gider.
        //Double virgülden sonra 13-14 ondalık basamağa gider.

        val doublePi : Double = 3.14
        println(doublePi*2)

        // Float tanımlama sonuna f yazılır.

        val floatPi : Float = 3.14f
        println(floatPi*2)

        // Birşeyin sonucunu ondalıklı almak istiyorsak
        //Initilazing işlemini ondalıklı olarak yazmalısın.

        val newDouble = 5.0
        //Burada kotlin sabiti direk olarak double olarak tanımladı.
        println(newDouble/2)

        val newInt = 5
        // Burada sonuç 2 çıkar.
        println(newInt/2)

        //String (Text)
        println("-----------String(Text)----------")
        //Değişkenden sonra nokta konulduğunda o değişkenin
        //ulaşılabilen özelliklerini görürsün.
        val myString = "Benim Yeni Metnim"
        println(myString.length)

        val fName = "Taner"
        val lName = "ŞEN"
        val name  = fName + " " + lName
        println(name)
        // Nesnelerle ilgili ayrıntılı bilgi
        //developer.android.com docs bölümü

        //Boolean(True-False)
        println("-----------Boolean(True-False)----------")

        // < küçüktür
        // > büyüktür
        //<= küçük eşittir
        //>= büyük eşittir
        //== eşittir. Init işleminde tek eşit kullanıldığı için 2 eşit ile tanımlanmış.
        //!= eşit değildir
        //&& ve
        //|| veya

        println(3<5)
        //Çıktı true olur.
        println(5!=5)
        //Çıktı false olur. Çünkü 5 5' e eşittir.

        //Veri Tipi Dönüştürme
        println("-----------Dönüştürme----------")
        val myInt = 10
        val myInttoLong = myInt.toLong()
        //Burada 10 atadığımız myInt değişkeninin
        //veri türünü int den long a çevirdik.
        println(myInttoLong)

        val userEntry = "50"
        val userEntrytoInt = userEntry.toInt()
        println(userEntrytoInt/2)
        //Burada text girişini matematiksel bir işlemde kullandık.
        //Sonuç 25 olur.

        //Kolleksiyonlar
        println("-----------Kolleksiyonlar----------")
        //Array - Diziler
        // Birden fazla değişkeni yada sabiti tek bir yerde tutabilmeyi sağlar.
        //Veri çekerken kullanılacak. Örn. bir yerden 100 adet veri çekerken
        //100 ayrı değişken oluşturulmayacak. Array içine atılacak.
        val firstDay="Pazartesi"
        //Array içine değişkende atılabilir
        val myArray = arrayOf(firstDay,"Salı","Çarşamba","Perşembe","Cuma")
        //Array index mantığında çalışır. 0 rakamından başlar.
        println(myArray[0])
        //Çıktı Pazartesi olur.
        println(myArray.get(1))
        // Diğer bir şekli. Çıktı Salı olur.
        //İçindeki değerler değiştirilebilir
        myArray[2]="Cumartesi"
        //Çıktı Cumartesi olur.
        println(myArray[2])
        //İçindeki değer şu şekilde de değiştirilebilir
        myArray.set(3,"Pazar")
        //Çıktı Pazar olur.
        println(myArray[3])
        println(myArray[4])

        // Rakamlar ile de dizi yapılabilir
        val myNumberArray = doubleArrayOf(1.5,2.0,2.5,3.0,3.5,4.0)
        println(myNumberArray[3])

        //Karışık verilerden de dizi yapılabilir
        val myMixArray = arrayOf(3.14, "Pi rakamı", 24, "Oda Sıcaklığı", true)
        //Burada arrayof kullanmamız içinde farklı veri türleri olmasıdır.
        println(myMixArray.get(4))

        //ArrayList(Listeler)
        println("-----------ArrayList(Listeler)----------")
        //Array' e göre daha esnektir.
        val lessonArrayList = arrayListOf<String>("Türkçe","Matematik","Fen","Sosyal Bilgiler")
        //Listenin içindeki değerlerin tipini belirtmeyebilirsiniz
        val dayArrayList = arrayListOf("Pzt","Sl","Çrş","Prş","Cm")
        println(lessonArrayList.get(1))
        println(dayArrayList.get(4))

        //Array' e veri eklenemez iken ArrayList' e eklenir.
        lessonArrayList.add("İngilizce")
        dayArrayList.add("Cmt")
        println(lessonArrayList.get(4))
        println(dayArrayList.get(5))

        //Karışık veri türlerinden oluşan bir arraylist için
        //any değerini kullanmalıyız.

        val myMixArrayList = arrayListOf<Any>()
        myMixArrayList.add(3.14)
        myMixArrayList.add("Pi")
        myMixArrayList.add(true)
        println(myMixArrayList.get(2))

        //Set
        println("-----------Set----------")
        //Verilerin tekrarlanmış halinden kurtulmak için kullan
        //İçinde aynı veriden bir tane daha olmaz.
        //Bir metnin içinde kod çalıştıracaksanız
        //başına dolar işareti konulur.

        val sampleArray = arrayOf(1,2,2,3,4,4,4,5)
        println("sampleArray index 2:${sampleArray[2]}")
        println("sampleArray index 4:${sampleArray[4]}")

        //İçindeki eleman sayısını bulmak için
        println(sampleArray.size)
        //Şimdi set te bu sayı kaç çıkacak
        val sampleSetarray = setOf<Int>(1,2,2,3,4,4,4,5)
        println(sampleSetarray.size)
        //Dizi içindeki tüm değerleri yazdırmak için
        //For Each kullanılır
        //it:ınt süslü parantez açıldığında ot gelir.

        sampleSetarray.forEach {
            println(it)
        }

        //Diğer bir kullanımı
        val otherMySet = HashSet<String>()
        otherMySet.add("Taner")
        otherMySet.add("Taner")
        otherMySet.add("Taner")
        otherMySet.add("ŞEN")


        otherMySet.forEach {
            println(it)
        }

        //Map
        println("-----------Map----------")
        //Anahtar Kelime  - Değer Eşleşmesi
        //Key Value Pairing

        val lessonArray = arrayOf("Türkçe","Matematik","Fen")
        val pointArray = arrayOf(1.0,2.0,1.5)
        println("${lessonArray[0]}' nin puanı ${pointArray[0]}")
        //Map bu ikisini tek satırda yazmamızı sağlıyor.
        val lessonPointMap = HashMap<String, Double>()
        //Veri eklemek için map' te add yerine put kullanılır.
        lessonPointMap.put("Türkçe",1.0)
        lessonPointMap.put("Matematik",2.0)
        lessonPointMap.put("Fen",1.5)
        //Veriyi görmek için key değerini girmen gerekiyor.
        println("Fen' in  puan değeri ${lessonPointMap.get("Fen")}")
        //Fen puan değeri 1.5 çıkacak.

        //Matematiksel İşlemler
        println("-----------Matematiksel İşlemler----------")
        var nmbr=8
        nmbr=nmbr+1
        nmbr++
        //Sayı 10 olacak
        println(nmbr)
        nmbr--
        //Sayı 9 olacak
        println(nmbr)

        var othnmbr = 10

        println(othnmbr>nmbr)
        //Sonuç true olur. 10 9 dan büyük.

        // && Ve
        // || Veya

        println(othnmbr>nmbr && 4>9)
        // Sonuç false
        //Çünkü her ikisi de doğru olmak zorunda

        println(othnmbr>nmbr || 4>9)
        //Sonuç true
        //Birisinin doğru olması yeterli

        //Remainder kalanı bulmak
        // % işareti kullanılır
        //Sonuç 1
        println(10%3)

        //If Statements
        println("-----------If Statements (Eğer Kontrolleri)----------")
        // If bloğunun içindeki herşey ancak koşul sağlanırsa çalışır.

        val point  = 15
        var degree : Int = 0
        var conclusion : String =" "
        if (point<45){
            degree = 1
        }
        else if (point>=45 && point<60){
            degree = 2
        }
        else if (point>=60 && point<70){
            degree = 3
        }
        else if (point>=70 && point<85){
            degree = 4
        }
        else if (point>=85){
            degree = 5
        }
        println(degree)
        //Notu 4 çıkar.

        //When - Switch
        println("-----------When----------")
        //else if çok fazla olmaya başladığında kullanılır.

        when(degree){
            1 -> conclusion ="Başarısız"
            2 -> conclusion ="İdare eder"
            3 -> conclusion ="Orta"
            4 -> conclusion ="İyi"
            5 -> conclusion ="Pekiyi"
        }
        println("Notu : ${degree} Derecesi ${conclusion}")

        //Döngüler
        println("-----------For----------")
        //For döngüsündeki sayacı tanımlamana gerek yok
        //Herhangi bir değişken ismi ile başla
        //index' i ben tanımladım.

        val days = arrayOf("Pzt","Sl","Çrş","Prş","Cm","Cmt","Pzr")
        println("Döngü başladı")
        for (index in days){
            println(index)
        }
        println("Döngü bitti")
        //indices özelliği dizi içindeki indexleri verir
        println("Döngü başladı")
        for (index in days.indices){
            println(index)
        }
        println("Döngü bitti")
        //For döngüsü dizilerle kullanmak zorunlu gibi birşey
        //For döngüsünde range belirleme
        //araya .. konarak olur

        println("Döngü başladı")
        for(index in 0..5){
            println(index)
        }
        println("Döngü bitti")

        val mixSr = arrayListOf<Any>()
        mixSr.add("Veri türleri")
        mixSr.add(true)
        mixSr.add(3.14)
        mixSr.add(24)

        println("Döngü başladı")
        for (index in mixSr){
            println(index)
        }
        println("Döngü bitti")

        //For each de aynı işlemi yapar
        println("Döngü başladı")
        mixSr.forEach(){
            println(it)
        }
        println("Döngü bitti")

        //Döngüler
        println("-----------While----------")
        //While bu olurken manasına gelir.
        //Koşul tuttuğu sürece bunu yapmaya devam et.

        var i=-1

        while (i<days.size){
            i=i+1
            println("Haftanın ${i+1}. günü ${days[i]}")
        }


    }
}