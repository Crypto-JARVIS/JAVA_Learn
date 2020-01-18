package printer;

public class Printer
{
    private int tonerlevel;
    private int pagesprinted;
    private boolean duplex;

    public Printer(int tonerlevel,boolean duplex)
    {
        if(tonerlevel > -1 && tonerlevel <=100)
        {
            this.tonerlevel = tonerlevel;
        }
        else
        {
            this.tonerlevel = -1;
        }
        this.pagesprinted = 0;
        this.duplex = duplex;
    }

    public int addtoner(int toneramount)
    {
        if(toneramount > 0 && toneramount <= 100)
        {
            if(this.tonerlevel + toneramount > 100)
            {
                return -1;
            }
            this.tonerlevel += toneramount;
            return this.tonerlevel;
        }
        else
        {
            return -1;
        }
    }

    public int printpages(int pages)
    {
        int pagestoprint = pages;
        if(this.duplex)
        {
            pagestoprint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesprinted += pagestoprint;
        return pagestoprint;
    }

    public int getPagesPrinted()
    {
        return pagesprinted;
    }
}