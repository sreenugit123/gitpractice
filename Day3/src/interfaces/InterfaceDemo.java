package interfaces;

interface Bank{
	int bankid=9001;
	void deposit();
	void withdraw();
}
interface Insurance
{
	void insureDeposit();
}

class HDFC implements Bank,Insurance

{
    @Override
    public void deposit() 
    {
        //bankid=100;
    }
    @Override
    public void withdraw() {
    }
    @Override
    public void insureDeposit() {

    }   
}
public class InterfaceDemo
{
        public static void main(String[] args) {

            Bank obj = new HDFC();
        }
}
