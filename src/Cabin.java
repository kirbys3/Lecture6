public class Cabin<T> {

    private T cargo;
    private Cabin<T> nextCabin;

    public Cabin(T inputCargo) {
        this.cargo = inputCargo;
        nextCabin = null;
    }

    public T getCargo() {
        return cargo;
    }
    public void setCargo(T inputCargo) {
        this.cargo = inputCargo;
    }
    public Cabin<T> getNextCabin() {
        return nextCabin;
    }
    public void setNextCabin(Cabin<T> inputCabin) {
        this.nextCabin = inputCabin;
    }
}
