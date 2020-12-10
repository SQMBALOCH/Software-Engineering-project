package software.engineering.project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SoftwareEngineeringProject {
public static void main(String[] args) throws IOException {
    
DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
 
         
    try{
         
      
              String fileName= "Result1.doc";
              PrintWriter write1= new PrintWriter(fileName);
              write1.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            

            @Override
            public void run() {
                 LocalDateTime getsystime = LocalDateTime.now();  
                 String datetime=dtformat.format(getsystime); 
                try {
                    Random random_number=new Random();
                    
                    for(int loopcount=0;loopcount<=5;loopcount++){
                        int find=random_number.nextInt(5);
                        if( find>=0 && find<2){
                            System.out.println("Patient need some sugar and eat some gluco");
                         
                        
                            write1.println("Patient need some sugar and eat some gluco Your Suger Level is:: "+find);
                            write1.println(datetime);
                            write1.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                            
                           
                          write1.flush();
                            break;
                            
                        }
                        else if( find>=3 &&  find<=5){
                            System.out.println("Patient sugar level is high inject insuline");
                         
                        
                            write1.println("Your Suger Level is High Your Suger Level is::" + find);
                             write1.println(datetime);
                            write1.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                           
                                write1.flush();
                                break;

                     }
                        else if( find==2){
                            System.out.println("Sugar Level is normal");
                         
                        
                            write1.println("Your Suger Level is normal:: "+ find);
                             write1.println(datetime);
                            write1.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                            
                             write1.flush();

                                break;

                            
                        }
                    }  
                    System.out.println("one time completed");
                } catch (Exception ex) {
                    Logger.getLogger(SoftwareEngineeringProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
       },
     new Date(),
        3500
        );  
    }  
       catch(Exception e){System.out.println(e);
           
           }  
}
}
