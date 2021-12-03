public class GenericPrinter<T extends Matrial> {
    private T matrial;

    public void setMetrial(T matrial){
        this.matrial = matrial;
    }

    public T getMatrial(){
        return matrial;
    }

    public String toString(){
        return matrial.toString();
    }

    public void printing(){
        matrial.doPrinting();
    }
}
