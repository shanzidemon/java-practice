public class Start{
    public static void main(String[]args){
        Account a1=new Account("Shanzid Helal Emon","A34920394",500);
    a1.deposit(500);
    a1.deposit(350);
        System.out.println(a1.getBalance());
    }
}