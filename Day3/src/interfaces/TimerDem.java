package interfaces;

public class TimerDem implements Runnable
{
 
    @Override
    public void run() {

        for(int x=1;x<=5;x++)
        {
            System.out.println(x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
public static void main(String[] args) {
        TimerDem t=new TimerDem();
        t.run();
}
}