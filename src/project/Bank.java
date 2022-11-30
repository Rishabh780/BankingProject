package project;
import java.util.Scanner;
 class BankDeatils {
	 private String accno;  
	    private String name;  
	    private String acc_type;  
	    private long balance;  
	    
	    Scanner sc = new Scanner(System.in);
	    public void openAcc() {
	    	System.out.println("Enetr the Account Number");
	    	 accno=sc.nextLine();
	    		System.out.println("Enter the name");
	    		name=sc.nextLine();
	    		System.out.println("Enter the Account");
	    		acc_type=sc.nextLine();
	    		System.out.println("Enter the balance");
	    		balance=sc.nextLong();
	    }
	    public void showAccount() {
	    	System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no: " + accno);  
	        System.out.println("Account : " + acc_type);  
	        System.out.println("Balance: " + balance);  
	    	
	    }
	    public void deposit() {  
	        long amount;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amount = sc.nextLong();  
	        balance = balance + amount; 
	    
}
	    public void withdrawal() {  
	        long amount;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amount = sc.nextLong();  
	        if (balance >= amount) {  
	            balance = balance - amount;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
	        }  

	    }
	    public boolean search(String ac_no) {  
	        if (accno.equals(ac_no)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	    }  
}

public class Bank {
	  
	    public static void main(String arg[]) {  
	        Scanner sc = new Scanner(System.in);  
	         
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        BankDeatils C[] = new BankDeatils[n];  
	        for (int i = 0; i < C.length; i++) {  
	            C[i] = new BankDeatils();  
	            C[i].openAcc();  
	        }  
	        
	        int ch;  
	        do {  
	            System.out.println("\n ***Banking Project***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                        for (int i = 0; i < C.length; i++) {  
	                            C[i].showAccount();  
	                        }  
	                        break;  
	                    case 2:  
	                        System.out.print("Enter account no. you want to search: ");  
	                        String ac_no = sc.next();  
	                        boolean found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 3:  
	                        System.out.print("Enter Account no. : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].deposit();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 4:  
	                        System.out.print("Enter Account No : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].withdrawal();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 5:  
	                        System.out.println("See you soon...");  
	                        break;  
	                }  
	            }  
	            while (ch != 5);  
	        }  
	    }  



