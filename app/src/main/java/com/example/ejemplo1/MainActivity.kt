package com.example.ejemplo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Ciclo de Vida", "Ingresa a onCreate()")

//        Aqui llamo a las funciones
//        variables()
//        constantes()
//        typesDates()
//        fichaCliente()
//        sentencias()
//        sentenciasDos()
//        sentenciaWhen()
//        arrays()
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo de Vida", "Ingresa a onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de Vida", "Ingresa a onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de Vida", "Ingresa a onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo de Vida", "Ingresa a onStart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo de Vida", "Ingresa a onStart")
    }

    //   Aqui va el desarrolo de l app
//   Esto es una funcion
    private fun variables() {
        /*comentario de varias lines
        hola esta es una prueba
         */
        var myFirstVar = "Hello World!"
        var mySecondVar = "Hello Country"
        var myFirstNumber = 5
        var myFavoriteVar = "welcome to Kotlin"

        println(myFirstVar)
        println(myFirstNumber)
        println(mySecondVar)
        println(myFavoriteVar)
    }

    private fun constantes() {
//      Definicion de constantes no se pueden cambiar durante la ejecucion del codigo
        val myFirstConstant = "This is my first constant"
        println(myFirstConstant)
    }

    private fun typesDates() {
//        Types of Date
//        String
        var myFirstString = "This is a String"
        var mySecondString = "This is my second String"
        var mythreeString = myFirstString + mySecondString
//        Int,Byte,Short,Long
//        INT

        var firstInteger = 1
        var secondInteger = 2
        var sum = firstInteger + secondInteger
        var res = firstInteger - secondInteger
        var mult = firstInteger * secondInteger
        var div = firstInteger / secondInteger
        var firstLong = 5L         //L representa long

//        Float
        val firstDouble = 1.4
        val firstFloat = 1.5f   // representa float
        val sumaFloat = firstDouble + firstDouble
//       Boolean

        val firstBool = true
        val secondBool = false
        val response = firstBool == secondBool


//Imprimiendo variables
        println(myFirstString)
        println(mySecondString)
        println(mythreeString)
        println("La suma es" + " " + sum)
        println("La resta es" + " " + res)
        println("La multiplicacion  es" + " " + mult)
        println("La division es" + " " + div)
        println("La suma de float es" + " " + sumaFloat)
        println(response)
        println(firstBool && secondBool)
        println(firstBool != secondBool)
    }

    /*Crear una ficha de un cliente
    Nombre
    Apellido
    Ciudad de Nacimiento
    Ciudad de Recidencia
    Estado Civil
    Imprimir en Consola
    */
    private fun fichaCliente() {

        var Name = "Daniel"
        var Apellido = "Cordova"
        var CiudadNacimiento = "Loja"
        var CiudadRecidencia = "Loja"
        var EstadoCivil = "Single"

        println(Name)
        println(Apellido)
        println(CiudadNacimiento)
        println(CiudadRecidencia)
        println(EstadoCivil)

    }

    private fun sentencias() {
//        conditionals  symbols(<  >, ==, >= , <=, !=)
        val oneConst = 102
        if (oneConst <= 5) {
            println("$oneConst Es menor a 5")
        } else {
            println("$oneConst Es mayor a 5")
        }

    }

    private fun sentenciasDos() {
//        Logic Operators("y"--> &&, "o" -->||,"not"--> !)
        val secondConst = 2
        /*
        if(secondConst <= 2 || secondConst <=3){
            println("$secondConst es menor/igual a 2 y es menor igual a 3")
        }else{
            println("$secondConst es mayor que 3")
        }
         */
//        if(secondConst<=10 && secondConst<=15){
//            println("$secondConst es menor/igual 10 y es menor/igual  a 15")
//        }else{
//            println("$secondConst es mayor a 15")
//        }
        if (!(secondConst > 0)) {
            println("$secondConst es diferente de cero")
        } else {
            println("$secondConst es igual a cero")
        }

    }

    private fun sentenciaWhen() {
//        Se vuelve mas facil de utilizar que un if-else
        val ciudad = "Zamora"

        when (ciudad) {
            "Quito" -> {
                println("La ciudad es Quito")
            }
            "Guyaquil" -> {
                println("La ciudad es Guayaquil")
            }
            "zamora" -> {
                println("La ciudad es Zamora")
            }
            else -> {
                println("No es ninguna Ciudad")
            }
        }
        val peso = 100
        when (peso) {
            30 -> {
                println("Deberia subir de peso ")
            }
            150 -> {
                println("deberia bajar de peso")
            }
            100 -> {
                println("Su peso es ideal")
            }
            else -> {
                println("NO coicide nigun peso en la DB")
            }
        }

    }

    private fun arrays() {
        // En esta seccion vamos a crear arrays
        val firstName = "Daniel"
        val lastName = "Cordova"
        val countryOfBirthday = "Ecuador"
        val residence = "Loja"
        val universityWhereGraduate = "UIDE"
        val age = "27"
//        Crear un array
        val myFirstArray = arrayListOf<String>()

        myFirstArray.add(firstName)
        myFirstArray.add(lastName)
        myFirstArray.add(countryOfBirthday)
        myFirstArray.add(residence)
        myFirstArray.add(universityWhereGraduate)
        myFirstArray.add(age)

        println(myFirstArray)

//        Agregando todos los datos
        myFirstArray.addAll(listOf("Hello", "World"))
        println(myFirstArray)

//        Acceder los Datos del array
        val myLastName = myFirstArray[1]
        println(myLastName)

//        Remover datos del array
        myFirstArray.removeAt(4)
        println(myFirstArray)

//        Otros Tipos d eoperciones
//        Contamos la longitud del array
        println(myFirstArray.count())
//        myFirstArray.clear()
        println(myFirstArray)
//        myFirstArray.first()
//        myFirstArray.last()
//        myFirstArray.sort()
    }
}