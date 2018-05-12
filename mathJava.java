/*
Ethan Pulido
CS/IS 130 
Lab 1
Math Program
2/22/18

double pi, radius, height, circle, cylinder, sphere;

pi = 3.14;
radius = 5.6;
height = 2.7;

circle = pi * (radius)^2;
cylinder = pi * (radius)^2 * height;
sphere = (4/3) * pi * radius^3

output "The area of a circle, formula p * r^2 is " circle;
output "The volume if a cylinder, formula p * r^2 * h is" cylinder;
output "The voulme of a sphere, formula 4/3 * p * r^3 is " sphere;



*/

public class mathJava
{
public static void main(String[] args){

double pi, radius, height, circle, cylinder, sphere, cubed;

pi = 3.14;
radius = 5.6;
height = 2.7;
cubed = radius*radius*radius;

circle = pi * (radius*radius);
cylinder = pi * (radius*radius) * height;
sphere = (4/3) * (pi * cubed);

System.out.println("The vloume of a circle, formula p*r^2 is " + circle);
System.out.println("The volume if a cylinder, formula p * r^2 * h is " + cylinder);
System.out.println("The voulme of a sphere, formula 4/3 * p * r^3 is " + sphere);

}

}