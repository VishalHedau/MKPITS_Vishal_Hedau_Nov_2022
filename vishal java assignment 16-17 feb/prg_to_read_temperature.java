/*Write a java program to read temperature in centigrade and display a suitable message according to temperature state below :
Temp < 0 then Freezing weather

Temp 0-10 then Very Cold weather

Temp 10-20 then Cold weather

Temp 20-30 then Normal in Temp

Temp 30-40 then Its Hot

Temp >=40 then Its Very HoT  */

import java.util.*;

class prg_to_read_temperature
{
public static void main(String[]args)
{
   int temp;
   Scanner val =new Scanner(System.in);
   System.out.println("Enter the temprature to know about weather");
   temp=val.nextInt();
   if(temp<0)
   {
      System.out.println("Freezing Weather");
   }
       else if(temp>0 && temp<10)
	       {
	           System.out.println("Very Cold Weather");
               }
                  else if(temp>=10 && temp<=20)
		       {
		           System.out.println("Cold Weather");
                       }
                           else if(temp>20 && temp<30)
			      {
			           System.out.println("Normal in temp");
                              }
                                    else if(temp>30 && temp<40)
				         {
				   		 System.out.println("Hot Weather");
                                          }
                                                else if(temp>=40)
					               {
					       			 System.out.println("Very Hot Weather");
                                                        }
        }
   }
