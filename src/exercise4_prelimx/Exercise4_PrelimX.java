// Author : John Henly A. Montera
// Date: November 28, 2019
// Exercise4_PrelimX


package exercise4_prelimx;

import javax.swing.*;

public class Exercise4_PrelimX {

    public static void main(String[] args) {       
        Choice();      
    }   
     private static void Choice() {   
         
        String b;       
        
        b = JOptionPane.showInputDialog(null, "Enter Your Ticket!"+"\n"
                +"[A]: First Class Seats"+"\n"
                +"[B]: Bussiness Class Seats"+"\n"
                +"[C]: Economy Class Seats");
        
        switch (b) {
            case "A":
                JOptionPane.showMessageDialog(null, "Welcome to First Class Accomodations!");
                Firstclass();
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Welcome to Bussiness Class Accomodations!");
                Bussinessclass();
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Welcome to Economy Class Accomodations!");
                Economyclass();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Choose Among the three only!");
                Choice();
                break;
        } 
    }
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////   FIRSTCLASS
    private static void Firstclass() {
        
        String waw [][];int awa[][];
        boolean exit = true;
        int attempts = 0;
        awa = new int [16][9];
        waw = new String [16][9];
        int row = 1;
        String p = "",o,b;
        int seatrow = 0, seatcol = 0;
                 
while (attempts == 0) {  
    attempts++;   
        for (int i = 1; i < 16; i++) {  
           for (int j = 1;j< 9;j++){               
               if (i < 3){
               waw[i][j]= "  =   ";}
               else if (i >= 1){
               waw[i][j]= "X     ";}
               
                if(j==1){

                        if(row <= 9)
                        p+="Row:"+row+"      ";

                        else
                        p+="Row:"+row+"    ";                                   
                    }         
                 p+=waw[i][j];  
           }      
           p+="\n";          
           row++;         
     }   
        
}
 while (exit = true) {
     
     JOptionPane.showMessageDialog(null, "           Welcome to First Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p);
         
     String l = "";

        o = JOptionPane.showInputDialog(null, "           Welcome to First Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p+
                "  Enter Your Seat Row! Choose Among the (=) only! "+"\n");
        
        seatrow = Integer.parseInt(o);
        
        b = JOptionPane.showInputDialog(null, "           Welcome to First Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p+
                "  Enter Your Seat Column! Choose Among the (=) only! "+"\n");
        
        seatcol = Integer.parseInt(b);
        
         if (seatrow > 2 || seatcol > 8) {
            JOptionPane.showMessageDialog(null, "You input is Invalid!");
            exit = true;   
            }
         
     int row1 = 1;
     
        for (int i = 1; i < 16; i++) {
            
           for (int j = 1;j< 9;j++){
               
               if ( j == seatcol && i == seatrow){
                        if (awa[i][j] >= 1){
                            JOptionPane.showMessageDialog(null, "The Seat is already occupied! Choose Another!");
                            exit = true;
                        }
                        else {   
                              awa[i][j]++;
                              waw[i][j]= " X    ";                                   
                             }
               }
               if (awa[i][j] >= 1){
               waw[i][j]= " X    ";
               } 
               else if (i < 3){
               waw[i][j]= "  =   ";}
               else if (i >= 1){
               waw[i][j]= "X     ";}  
                       
                if(j==1){
                        if(row1 <= 9)
                        l+="Row:"+row1+"      ";

                        else
                        l+="Row:"+row1+"    ";                                            
                    }
                 l+=waw[i][j]; 
           }  
           l+="\n";          
           row1++;         
        }    
        JOptionPane.showMessageDialog(null, "           Welcome to First Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+l);   
        String choice;   
           choice = JOptionPane.showInputDialog("Do you want to Continue? [Y] Yes/ [S] Terminate");
           if (choice.equals("Y")){
               p=l;
               exit = true;
           }
           else if (choice.equals("S")){
               System.exit(0); 
           }
       }
    }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////// BUSSINESS CLASS       
    private static void Bussinessclass() { 
        
        String waw [][];int awa[][];
        boolean exit = true;
        int attempts = 0;
        awa = new int [16][9];
        waw = new String [16][9];
        int row = 1;
        String p = "",o,b, a="";
        int seatrow = 0, seatcol = 0;
        
while (attempts == 0) {  
    attempts++;   
        for (int i = 1; i < 16; i++) {  
           for (int j = 1;j< 9;j++){               
               if (i >= 3 && i <= 4){
               waw[i][j]= "  =   ";}
               else if (i < 3 || i > 4 ){
               waw[i][j]= "X     ";}
               
                if(j==1){

                        if(row <= 9)
                        p+="Row:"+row+"      ";

                        else
                        p+="Row:"+row+"    ";                                   
                    }         
                 p+=waw[i][j];  
           }      
           p+="\n";          
           row++;         
     }   
        
}

 while (exit = true) {
         
     String l = "";
     
     JOptionPane.showMessageDialog(null, "           Welcome to Bussiness Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p);
     
        o = JOptionPane.showInputDialog(null, "           Welcome to Bussiness Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p+
                "  Enter Your Seat Row! Choose Among the (=) only! "+"\n");
        
        seatrow = Integer.parseInt(o);
        
        b = JOptionPane.showInputDialog(null, "           Welcome to Bussiness Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p+
                "  Enter Your Seat Column! Choose Among the (=) only! "+"\n");
        
        seatcol = Integer.parseInt(b);
        
         if (seatrow < 3 || seatrow > 4 || seatcol > 8) {
            JOptionPane.showMessageDialog(null, "You input is Invalid!");
            exit = true;   
            } 
        
     int row1 = 1;
     
        for (int i = 1; i < 16; i++) {
            
           for (int j = 1;j< 9;j++){
               
               if ( j == seatcol && i == seatrow){
                        if (awa[i][j] >= 1){
                            JOptionPane.showMessageDialog(null, "The Seat is already occupied! Choose Another!");
                            exit = true;
                        }
                        else {   
                              awa[i][j]++;
                              waw[i][j]= " X    ";                                   
                             }
               }
               if (awa[i][j] >= 1){
               waw[i][j]= " X    ";
               } 
               else if (i >= 3 && i <= 4){
               waw[i][j]= "  =   ";}
               else if (i < 3 || i > 4 ){
               waw[i][j]= "X     ";}  
                       
                if(j==1){
                        if(row1 <= 9)
                        l+="Row:"+row1+"      ";

                        else
                        l+="Row:"+row1+"    ";                                            
                    }
                 l+=waw[i][j]; 
           }  
           l+="\n";          
           row1++;         
        }    
        JOptionPane.showMessageDialog(null, "           Welcome to Bussiness Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+l);   
        String choice;   
           choice = JOptionPane.showInputDialog("Do you want to Continue? [Y] Yes/ [S] Terminate");
           if (choice.equals("Y")){
               p=l;
               exit = true;
           }
           else if (choice.equals("S")){
               System.exit(0); 
           }
       }
    }
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////  ECONOMY CLASS
    private static void Economyclass() {
        
       String waw [][];int awa[][];
        boolean exit = true;
        int attempts = 0;
        awa = new int [16][9];
        waw = new String [16][9];
        int row = 1;
        String p = "",o,b, a="";
        int seatrow = 0, seatcol = 0;
                 
while (attempts == 0) {  
    attempts++;   
        for (int i = 1; i < 16; i++) {  
           for (int j = 1;j< 9;j++){               
               if (i > 4){
               waw[i][j]= "  =   ";}
               else if (i < 5 ){
               waw[i][j]= "X     ";}
               
                if(j==1){

                        if(row <= 9)
                        p+="Row:"+row+"      ";

                        else
                        p+="Row:"+row+"    ";                                   
                    }         
                 p+=waw[i][j];  
           }      
           p+="\n";          
           row++;         
     }   
        
}

 while (exit = true) {
         
     String l = "";
     
        JOptionPane.showMessageDialog(null, "           Welcome to Economy Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p);
     
        o = JOptionPane.showInputDialog(null, "           Welcome to Economy Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p+
                "  Enter Your Seat Row! Choose Among the (=) only! "+"\n");
        
        seatrow = Integer.parseInt(o);
        
        b = JOptionPane.showInputDialog(null, "           Welcome to Economy Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+p+
                "  Enter Your Seat Column! Choose Among the (=) only! "+"\n");
        
        seatcol = Integer.parseInt(b);
        
         if (seatrow < 5 || seatrow > 15 || seatcol > 8) {
            JOptionPane.showMessageDialog(null, "You input is Invalid!");
            exit = true;   
            } 
        
     int row1 = 1;
     
        for (int i = 1; i < 16; i++) {
            
           for (int j = 1;j< 9;j++){
               
               if ( j == seatcol && i == seatrow){
                        if (awa[i][j] >= 1){
                            JOptionPane.showMessageDialog(null, "The Seat is already occupied! Choose Another!");
                            exit = true;
                        }
                        else {   
                              awa[i][j]++;
                              waw[i][j]= " X    ";                                   
                             }
               }
               if (awa[i][j] >= 1){
               waw[i][j]= " X    ";
               } 
               else if (i > 4){
               waw[i][j]= "  =   ";}
               else if (i < 5 ){
               waw[i][j]= "X     ";}  
                       
                if(j==1){
                        if(row1 <= 9)
                        l+="Row:"+row1+"      ";

                        else
                        l+="Row:"+row1+"    ";                                            
                    }
                 l+=waw[i][j]; 
           }  
           l+="\n";          
           row1++;         
        }    
        JOptionPane.showMessageDialog(null, "           Welcome to Economy Class "+"\n"+
                "                 |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |"+"\n"+l);   
        String choice;   
           choice = JOptionPane.showInputDialog("Do you want to Continue? [Y] Yes/ [S] Terminate");
           if (choice.equals("Y")){
               p=l;
               exit = true;
           }
           else if (choice.equals("S")){
               System.exit(0); 
           }
       }
    }    
}
