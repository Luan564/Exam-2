import java.util.Timer;
import java.util.TimerTask;

public class Bank {
    public static void main (String args[]){

        TimerTask timerTask = new TimerTask()
        {
            public void run() 
            {
                //Se me acabo el tiempoooo ;((
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 3000);


        
        Date today = new Date(22, 12);
        Date cum2 = new Date(01, 01);
        int yearUser1 = 02;
        int monthUser1 = 11;
        //int nipUser = 1234;
        User user1 = new User("Luis", new Date(02, 11));
        User user2 = new User("Angel", new Date(01, 01));

        CreditCard Bancomer = new CreditCard(user1,123456789, new Date (23,11),
         123, 1234, false, 5000);
        DebitCard Santander = new DebitCard(user1, 987654321, new Date (23,12), 
        123, 1234, false, 0);

        CreditCard BBVA = new CreditCard(user2,12345, new Date (23,11),
         123, 0000, false, 2000);


        //activar ambas tarjetas por separado
        Bancomer.activate(new Date(yearUser1, monthUser1));
        Santander.activate(new Date(yearUser1, monthUser1));

        //Realiza compra credito - rechaza
        Bancomer.collect(123456789, 1234, 10000);

        //Deposito debito
        Santander.pay(987654321, 500);

        //Compra debito
        Santander.collect(987654321, 1234, 200);

        //intento de uso sin activar 
        BBVA.pay(12345, 500);

        //Activar tarjeta
        BBVA.activate(cum2);

        //compra normal
        BBVA.collect(12345, 0000, 200);


        
        
        


        
        
        
    }
    
}
