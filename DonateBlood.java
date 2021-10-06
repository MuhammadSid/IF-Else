/*The nested if statement represents the if block within another if block. Here, the inner 
if block condition executes only when outer if block condition is true.*/


class DonateBlood{
public static void main (String[]args){

int age=12;
int Hb=13;

if (age>=18){
if (Hb>12){
System.out.println("you are eligible to donate blood");
}

else{
System.out.println("For blood donate age must be 18 and Hb must be 13%");
}

}else {
System.out.println("your age is less than 18");

}
}
}