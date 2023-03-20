//                      TYPE VARIABLES     
// Every variable has a type, which defines the type of the value it holds.
//A variable can hold a text value, a number, a decimal, etc.

/*
String
//declaration of String and assign
String name = "Hello";
*/

//For example
class Demo {
    public static void main(String[] args) {
        String name = "James";
        name = "David";

        System.out.println(name);
    }
}

//observation: The variable can change if you asign multiples lines each variable. 
//In this case name = "James" but before name = "David", in the console will show David.

//                           MORE TYPE VARIABLES
/*
int number = 23;
----------------------------
double height = 223.34;
float weight = 223.435f; // you need to use f after the value
                         double vs float
 As a general rule: use float instead of double when memory usage is critical. 
If you need more precise computations, for example, when dealing with currency, use double.
----------------------------
char letter = 'b'; //The char type is used to hold a single character. Always with simple quotes.
----------------------------
boolean isOpen = false; // Another important type is boolean.
It can hold only the values true or false.
This is handy when we work with states or conditions.
----------
*/
