
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

/* Simulem el comportament d'una calculadora. El programa llegeix dos enters i un caràcter. Si el caràcter és un + s’imprimeix la suma, si és un – la resta, si és un * el producte, si és un / la divisió entera i si és un %, el mòdul. Per a poder llegir un caràcter cal fer: sc.next().charAt(0).

Input Format

Introduïm dos enters i un caràcter.

Constraints

El caràcter ha d'estar en el rang (-, +, *, /, %)

Output Format

S'ha d'imprimir el resultat de l'operació demanada.

Sample Input 0

10
5
+
Sample Output 0

15
Sample Input 1

10
5
-
Sample Output 1

5
Sample Input 2

10
5
*
Sample Output 2

50
Sample Input 3

10
5
/
Sample Output 3

2
Sample Input 4

10
5
=
Sample Output 4

L'operacio no es valida
Sample Input 5

15
6
%
Sample Output 5

3

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char oper = sc.next().charAt(0);

        if (oper == '+'){System.out.print(num1 + num2);}
        else if (oper == '-'){System.out.print(num1 - num2);}
        else if (oper == '*'){System.out.print(num1 * num2);}
        else if (oper == '/'){System.out.print(num1 / num2);}
        else if (oper == '%'){System.out.print(num1 % num2);}

        else{
            if (oper!='+'|| oper!='-' || oper!='*' || oper!='/' || oper!='%'){System.out.print("L'operacio no es valida");}

        }
    }
}
