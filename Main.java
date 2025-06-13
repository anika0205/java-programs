/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		System.out.println("enter your key");
		int key=sc.nextlnt();
		boolean found=false;
		for (int i=0;i<a.length();i++)
		{
		    if(a[i]==key){
		        System.out.println("the key is found");
		        found=true;
		        break;
		    }
		}
		if(!found){
		    System.out.println("element not found");
		}
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[]={10,20,30,40,50,60};
	    System.out.println("enter your key");
	    int key=sc.nextlnt();
	    int left=0;
	    int right=a.length-1;
	    boolean found=false;
	    while (left<=right){
	        int mid=left+(right-left)/2;
	        if(a[mid]==key){
	            System.out.println("found at index:"+mid);
	            found=true;
	            break;
	        
	        }
	        else if(a[mid]<key){
	            left=mid+1;
	        }
	        else{
	            right=mid-1;
	            
	        }
	    }
	    if(!found){
	        System.out.println("element not found");
	        
	    }
	}
}
	   
	   
///////////////////////////////////////////////////next program/////////////////////////////////

// step 02 

abstract class BankAccount{
    private   String AccountHolderName;
    private double Balance; 
     
     // step 03 - creating a constructor 
     
     public BankAccount(String AccountHolderName, double Balance){
         this.AccountHolderName=AccountHolderName;
         this.Balance=Balance;
     }
     
     
     public abstract void displayDetails();
     
     // step 04 - encapsulation 
     
     public String getAccountHolderName(){
         return AccountHolderName;
     }
     
     public void setAccountHolderName(String AccountHolderName){
         this.AccountHolderName=AccountHolderName;
     }
     
     
     public double getBalance(){
         return Balance;
     }
     
     public void setBalance(double Balance){
         this.Balance = Balance;
     }
     
     // polymorphism 
     
     public void deposit(double amount){
         if(amount>0){
             Balance += amount;
             System.out.println("Deposited amount:" + amount);
         }
         else{
             System.out.println("Deposit properly");
         }
     }
     
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance -=amount;
            System.out.println("Withdraw amount:" + amount);
        }
        else {
            System.out.println("Invalid Amount");
        }
    } 
}

class savingsAccount extends BankAccount{
    public savingsAccount(String AccountHolderName, double Balance){
        super(AccountHolderName, Balance);
    }
    @Override
    public void displayDetails(){
        System.out.println("Account Holder Name :" + getAccountHolderName());
        System.out.println("Account Balance:" + getBalance());
    }
    
}

// step 01 
public class Main{
    public static void main(String[] args){
     BankAccount savings = new savingsAccount("Bharanidharanm", 1000.00);
     
     savings.displayDetails();
     
     savings.deposit(2000.00);
     savings.withdraw(500.00);
     
     savings.displayDetails();
     
        
    }
}