//homework3
​
/*ex1: 1.   A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
Type code to check: For example if he/she worked 3 years print ‘No Bonus’.*/
​
​
decimal salary= 10000;
integer serveYear=6;
​
if(serveYear>5){
    salary=salary*1.05;
    System.debug(salary);
}else{
    System.debug('No Bonus');
}
​
​
//Salih hoca
​
integer salary=50000; 
integer year=5;
​
if (year>=5){
    System.debug('5 yildan fazla calisan oldugunuz icin '+salary*0.05+'TL ikramiye ile odullendirildiniz');
}else if(year<=5 && year>=0){
    System.debug('Ikramiye alamadiniz');
}else{
    System.debug('Hatali Giris');
}
​
//halil hoca
integer salary=250000;
Decimal bonus,salaryWithBonus;  
integer year = 6;
   
if(year>5)   
{
      bonus=5;
salaryWithBonus=salary+(salary*(bonus/100));    
System.debug('Salary '+salary);
System.debug('Bonus '+bonus+ '%');
System.debug('Salary after bonus'+ ' ' + salaryWithBonus);
}
else
{
    System.debug('No Bonus');
}
//aslıhan hoca
Decimal salary=1000;
Integer yearsOfService=8;
​
​
if (yearsOfService>5){
    Decimal bonusAmount = salary * 0.05;
    System.debug('Net Bonus Amount : '+ bonusAmount );
    
}else {
   System.debug('No Bonus'); 
}
// aslıhan hoca class
public  class BonusCalculator {
    public void calculateBonus(Decimal salary, Integer yearsOfService) {
        if (yearsOfService > 5) {
            Decimal bonusAmount = salary * 0.05;
            System.debug('Net Bonus Amount: ' + bonusAmount);
        } else {
            System.debug('No Bonus');
        }
    }
}
​
Bonuscalculator bonus = new BonusCalculator();
bonus.calculateBonus(1000,7);
​
​
//ex2 = 2.  Take values of length and breadth of a shape and check if it is square or not
​
double lengthOfShape=3.1;
double breadthOfShape=3.1;
​
if(lengthOfShape==breadthOfShape){
    System.debug('this shape is square');
}else{
    System.debug('this is not square dude. sorry..');
}
​
//salih hoca
integer length=0;
integer breadth=20;
if (length <= 0 || breadth <= 0 ){
    System.debug('Hatali Giris');   
}else if(length!=breadth){
    System.debug('Bu sekil kare degil');
}else if(length==breadth){
    System.debug('Bu sekil bir kare');
}
// halil hocam
integer a =20;    // value of length
integer b =35;   //value of breadth
if( a==b){
    System.debug('it is square');
   }else{
    System.debug('it is not square');
}
​
//ex2. aslıhan hocam class
public class Square {
    public void  isSquare (Decimal length, Decimal breadth  ){
      if ( length == breadth ){
          System.debug('The shape is square!');
}else{
    System.debug('The shape is not square!');
}   
}   
}
​
Square sekil= new Square();
sekil.isSquare(14,15);
​
​
​
//ex3.  Take two int values and print greatest among them.
​
integer limon= 35;
integer kahve=36;
system.debug(math.max(limon,kahve));
​
//salih hoca
//Iki degerden buyuk olani bulan kod
Integer firstInt = 40;
Integer secondInt = 60;
if(firstInt > secondInt){
    System.debug(firstInt+', '+ secondInt+' \'den buyuktur');   
}else if(firstInt < secondInt){
    System.debug(secondInt+', '+ firstInt+' \'den buyuktur');   
}else if(firstInt == secondInt){
    System.debug('Iki sayi esit');
}else{
    System.debug('Hatali giris');
}
​
//ex4. Take input of age of 3 people by user and determine oldest and youngest among them.
​
​
list<integer> guys= new list<integer>{18, 25, 9};
guys.sort();
System.debug('youngest: '+guys[0]+ ' oldest: '+guys[guys.size()-1]);
​
//halil hoca
 integer age1 = 30;
             integer age2 = 45;
             integer age3 = 65;
             Integer youngest, oldest;
        if (age1 < age2 && age1 < age3) {
            
           System.debug( 'youngest' + ' ' + age1); 
            
        } else if (age2 < age1 && age2 < age3) {
            System.debug('youngest' + ' ' + age2);
        } else {
            System.debug('youngest' + ' ' + age3);
        }
        
        if (age1 > age2 && age1 > age3) {
            System.debug('oldest' + ' ' + age1);
        } else if (age2 > age1 && age2 > age3) {
            System.debug('oldest' + ' ' +age2);
        } else {
            System.debug('oldest' + ' ' + age3);
        }
​
//aslıhan hoca
Integer num1= 298;
Integer num2= 399;
Integer num3= 587;
​
if ((num1 > num2) && (num1>num3)) {
      System.debug('Greater number is: ' + num1);
    }  else if  ((num2 > num1)&& (num2>num3)) {
      System.debug('Greater number is: ' + num2);
    } else if  ((num3 > num1)&& (num3>num2)) {
      System.debug('Greater number is: ' + num3);
    }else {
        System.debug('Some numbers are equal !');
    }
​
/*ex5. Type code to print
a) "Weekdays" for Monday, Tuesday, Wednesday, Thursday, Friday
b) "Weekend" for Saturday, Sunday, 
e) "Invalid Day name" for all the others */
​
string day ='saturday';
day=day.trim().capitalize();
if(day=='Saturday'){
    System.debug('Weekend');
}
    else if(day == 'Sunday'){
    System.debug('Weekend');
}
    else if(day == 'Monday'){
    System.debug('Weekdays');
}   else if(day == 'Tuesday'){
    System.debug('Weekdays');
}    else if(day == 'Wednesday'){
    System.debug('Weekdays');
}    else if(day == 'Thursday'){
    System.debug('Weekdays');
}   else if(day =='Friday'){
    System.debug('Weekdays');
} else{
    System.debug('Invalid Day Name');
}
​
//halil hocam
​
 String day = 'saturday';
if(day.equals('sunday')){
    System.debug('Weekend');
}else if(day.equals('monday')){
    System.debug('Weekdays');
}else if(day.equals('tuesday')){
    System.debug('Weekdays');
}else if(day.equals('wednesday')){
    System.debug('Weekdays');
}else if(day.equals('thursday')){
    System.debug('Weekdays');
}else if(day.equals('friday')){
    System.debug('Weekdays');
}else if(day.equals('saturday')){
    System.debug('Weekend');
}else{
    System.debug('Invalid Day name');
} 
​
//aslıhan hocam BP:)
String day = 'SATURDAY';
switch on day.toLowerCase(){
when 'sunday', 'saturday'{
System.debug('Weekend day');
}
when 'monday', 'tuesday', 'wednesday', 'thursday', 'friday' {
System.debug('Weekday');
}
when else{
System.debug('Invalid day name');
}
} 
//salih hocam
//1
String day = 'SATURDAY';
if(day.equalsIgnoreCase('sunday')){
    System.debug('Weekend');
}else if(day.equalsIgnoreCase('monday')){
    System.debug('Week day');
}else if(day.equalsIgnoreCase('tuesday')){
    System.debug('Week day');
}else if(day.equalsIgnoreCase('wednesday')){
    System.debug('Week day');
}else if(day.equalsIgnoreCase('thursday')){
    System.debug('Week day');
}else if(day.equalsIgnoreCase('friday')){
    System.debug('Week day');
}else if(day.equalsIgnoreCase('saturday')){
    System.debug('Weekend');   
}else{
    System.debug('Invalid Day Name');
}
​
//2
String day = 'Wednesday';
if(day.equalsIgnoreCase('sunday') || day.equalsIgnoreCase('saturday')){
    System.debug('Weekend');
}else if(day.equalsIgnoreCase('monday') || day.equalsIgnoreCase('tuesday') || day.equalsIgnoreCase('Wednesday') ||day.equalsIgnoreCase('Thursday') || day.equalsIgnoreCase('friday')){
    System.debug('Week day');
}else{
    System.debug('Invalid Day Name');
}
//3
String[] weekDays = new String []{'monday', 'tuesday', 'wednesday', 'thursday', 'friday'};
String[] weekendDays = new String []{'saturday', 'sunday'};
String gun = 'wednesday';
if(weekDays.contains(gun)){
    System.debug('Weekdays');
}else if(weekendDays.contains(gun)){
    System.debug('Weekdays');
}else{
   System.debug('Invalid Day Name'); 
}
​
/*ex6.  Type code to print
a) "Valid Password" if the password has at least 8 characters and at least one symbol differ than letters and numbers.
b) "No space character allowed in password" if the password has any space character in
any position
c) "Invalid Password please create new password" if a and b conditions are not satisfied*/
​
string password='adboga41131*';
boolean specialChar = password.replaceAll('[A-Za-z0-9 ]','')!='';
boolean legthOfPswrd = password.length()>=8;
boolean charOfPswrd = password.containsAny(' ');
if(specialChar&&legthOfPswrd&&!charOfPswrd){
    System.debug('password is valid');
}else{
    System.debug('Invalid Password please create new password');
}
​
/*ex7.  Type code to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied*/
​
integer x=9, y =8, z=10;
​
if(x==y && x==z){
     System.debug('Equilateral Triangle');
    }else if(x==y && x!=z){
      System.debug('Isosceles Triangle');
    }else if(y==z && y!=x){
       System.debug('Isosceles Triangle');
    }else if(x==z && x!=y){
       System.debug('Isosceles Triangle');
    }else{
       System.debug('Neither isosceles, nor equilateral');
    }
​
//halil hoca   
          integer side1 =20; 
          integer side2 =20;
          integer side3 =20; 
    
        if (side1 == side2 && side2 == side3) {
            
            System.debug('Equilateral Triangle');
            
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            
            System.debug('Isosceles Triangle');
            
        } else {
            
            System.debug('Neither isosceles, nor equilateral');
        }
//aslıhan hoca
Integer num1= 5;
Integer num2=6;
Integer num3 =4;
​
if((num1==num2)&& (num1==num3)){
    system.debug('This is a Equilateral Triangle');
}else if ((num1==num2)  || (num1==num3) || (num2==num3)){
    system.debug('This is a Isosceles Triangle ');
}else {
    system.debug('Neither isosceles, nor equilateral');
}
​
// salih hoca
Integer num1= 5;
Integer num2= 5;
Integer num3 =0;
​
if((num1<=0) || (num2<=0) || (num3<=0)){
    system.debug('This is not a triangle');
}else if ((num1==num2)&& (num1==num3)){
    system.debug('This is a Equilateral Triangle');
}else if ((num1==num2)  || (num1==num3) || (num2==num3)){
    system.debug('This is a Isosceles Triangle ');
}else {
    system.debug('Neither isosceles, nor equilateral');
}
    
/*ex8.  Type code to check the grammatical rules for full name
a) Your code should print "Error in initials" for "noah Ozay", 
b) Your code should print "First name or last name missed" for single words like
"Noah" or "Ozay
c) Your code should print "Format error" for all the format like "SHOUYI WANG"
e) Your code should print "Invalid Name" if the name has any character different from
letters and space.*/
//aslıhan hoca1  incelenecek**
String name = 'Noah Ozay';
if (!name.equals(name.tolowercase().capitalize())){
    System.debug('Error in initials!');
}
​
String[] names = name.split(' ');
String firstName = names[0];
String lastName = names[names.size() - 1];
​
if (firstName.equals('') || lastName.equals('')) {
    System.debug('First name or last name missed!');
}
if (!name.equals(name.toUpperCase())){
    System.debug('Format error!');
}
​
if (name.containsany('^[a-zA-Z\\s]*$')) {
    System.debug('Format error!');
}
​
​
​
​
​
/*ex.9  Type code to create a simple calculator which does addition,
subtraction, multiplication,
and division with any 2 number
For example:  When user entered 100 and 20 and / sign your code should print 
"The result is 5" on the console*/
​
double x=100, y=50;
string operator ='/';
​
if(operator =='+'){
    system.debug('the sum of nums: '+(x+y));
}else if(operator=='-'){
    system.debug('the remain of nums: '+ (x-y));
}else if(operator == '*'){
    system.debug('the multipicilation of the nums: '+ (x*y));   
}else if(operator=='/' && x!=0 && y!=0){
    system.debug('the division of the nums: '+(x/y));
}else{
    system.debug('please insert a valid number or operator');
}
    
    //halil hoca
Double sayi1 = 100;
Double sayi2 = 20;
String islem = '/';
if (islem == '+') {
    Double toplam = sayi1 + sayi2;
    System.debug('Toplam: ' + toplam);
} else if (islem == '-') {
    Double cikarma = sayi1 - sayi2;
    System.debug('Çıkarma: ' + cikarma);
} else if (islem == '*') {
    Double carpma = sayi1 * sayi2;
    System.debug('Çarpma: ' + carpma);
} else if (islem == '/') {
    if (sayi2 == 0) {
        System.debug('Bir sayı sıfıra bölünemez.');
    } else {
        Double bolum = sayi1 / sayi2;
        System.debug('Bölme: ' + bolum);
    }
}
else {
    System.debug('Geçersiz işlem.');
}
​
​
/*10.   Type code to print the messages about the Body Mass Index(BMI) for the given BMI
values
Invalid BMI value < 0
Underweight = <20
Normal weight = 20–26.9
Overweight = 26.9–31
Obesity = BMI of 31 or greater*/
​
double BMI=26.9;
​
if(BMI<0){
    system.debug('Invalid BMI value');
}else if(BMI<=20){
    system.debug('Underweight');
}else if(BMI<=26.9){
    system.debug('Normal weight');
}else if(BMI<31){
    system.debug('Overweight');
}else{
    system.debug('Obesity');
}
​
//halil hoca
    Double bmiValue = 35;
    if (bmiValue < 0) {
        System.debug('Invalid BMI value');
    } else if (bmiValue < 20) {
        System.debug('Underweight');
    } else if (bmiValue < 26.9) {
        System.debug('Normal weight');
    } else if (bmiValue < 31) {
        System.debug('Overweight');
    } else {
        System.debug('Obesity');
    }