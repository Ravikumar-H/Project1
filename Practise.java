
class Bank_R{                    // parent class
    int getInterestRate(){
    return 0;}}
class Canara extends Bank_R{
    int getInterestRate(){
        return 5;}}
class SBI extends Bank_R{        // child class
    int getInterestRate(){      // method overriding
        return 6;}}
class SCDCC extends Bank_R{
    int getInterestRate(){
        return 8;}}
public class Practise{
    public static void main(String[] args){
        Canara bank1=new Canara();    //object created
        SBI bank2 = new SBI();
        SCDCC bank3 = new SCDCC();
        System.out.println("Bank1: " + bank1.getInterestRate() + " %");
        System.out.println("Bank2: " + bank2.getInterestRate() + " %");
        System.out.println("Bank3: " + bank3.getInterestRate() + " %");}}
        

