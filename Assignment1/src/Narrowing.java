/*
WIDEING
byte to short, int, long, float, or double

short to int, long, float, or double

char to int, long, float, or double

int to long, float, or double

long to float or double

float to double
*/

/*
NARROWING
short to byte or char

char to byte or short

int to byte, short, or char

long to byte, short, char, or int

float to byte, short, char, int, or long

double to byte, short, char, int, long, or float
*/


class Narraowing{
    public static void main(String[] args) {
        int intNum=255;
        float floatNum=255.000901f;
        double doubleNum=256.09007978901d;
        long longNum=2147483648l;
        byte byteNum=1;
        short shortNum=100;
        char character='a';
        int a=floatNum;
        System.out.println((float)intNum); //Wideing float,double
        System.out.println((byte)intNum); //Narrowing
        System.out.println((char)intNum); //Narrowing
        System.out.println((byte)floatNum); //Narrowing
        System.out.println((float)doubleNum); //Narrowing getting percise
        System.out.println((int)floatNum); //Narrowing
        System.out.println((long)doubleNum); //Narrowing
        System.out.println((byte)character); //Narrowing
        System.out.println((float)byteNum); //Wideing
        System.out.println((int)'அ'); //Wideing
        System.out.println((int)longNum); //Narrowing
        System.out.println((double)shortNum);
        System.out.println((float)longNum);
    }
}