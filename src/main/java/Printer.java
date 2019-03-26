public class Printer {

    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int getPaper() {
        return this.paper;
    }

    public int print(int pages,int copies){
        return pages * copies;
    }

    public boolean hasEnoughPaper(int pages, int copies){
        return (this.print(pages,copies)<this.paper);

    }
}
