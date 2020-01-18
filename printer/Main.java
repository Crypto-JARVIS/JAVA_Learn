package printer;

public class Main 
{
    public static void main(String[] args)
    {
        Printer printer = new Printer(50,true);
        System.out.println("Initial page count : "+printer.getPagesPrinted());
        int pagesprinted = printer.printpages(4);
        System.out.println("Pages printed was : "+pagesprinted+" New total page count for printer : "+printer.getPagesPrinted());
        pagesprinted = printer.printpages(5);
        System.out.println("Pages printed was : "+pagesprinted+" New total page count for printer : "+printer.getPagesPrinted());
    }
}