class Calculator{
public static void main(String[]args){
int num1 =1;
int num2 =2;
float sign = '-';

if (sign=='+'){
System.out.println(num1+num2);
}
else if(sign=='-'){
System.out.println(num1-num2); 
}
else if(sign=='*'){
System.out.println(num1*num2); 
}
else if(sign=='/'){
System.out.println(num1/num2); 
}
else if(sign=='%'){
System.out.println(num1%num2); 
}

else 
System.out.println("invalid"); 
}
}