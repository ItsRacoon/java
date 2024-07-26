abstract class Vehicle 
{ 
public abstract void wheels(); 
public abstract void seating(); 
public abstract void brakes();
 } 
class Car extends Vehicle
 { 
public void wheels() 
{
 System.out.println("\nCar Has Four Wheels");
 }
 public void seating()
 {
 System.out.println("Car Has Four Seating Capacity"); 
} 
public void brakes() 
{ 
System.out.println("Car Has Power Brakes\n");
 } } 
class Bike extends Vehicle 
{
 public void wheels() 
{ 
System.out.println("Bike Has Two Wheels");
 } 
public void seating()
 { 
System.out.println("Bike Has Two Seating Capacity"); 
} 
public void brakes() 
{
 System.out.println("Bike Has Disk Brakes");
 } } 
class VehicleDemo 
{ 
public static void main(String args[]) 
{ 
Vehicle v=new Car();
Vehicle v1=new Bike(); 
v.wheels(); 
v.seating(); 
v.brakes();
 v1.wheels(); 
v1.seating(); 
v1.brakes();
 } }
