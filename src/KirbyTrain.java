public class KirbyTrain {
    private Cabin<Object> head;

    public KirbyTrain() {
        head = null;
    }
    public void add(Object passName){
        if(head != null){
            Cabin<Object> current = head;
            while(current.getNextCabin() != null){
                current = current.getNextCabin();
            }
            Cabin<Object> nextCabin = new Cabin<>(passName);
            current.setNextCabin(nextCabin);
        }
        else{
            head = new Cabin<Object>(passName);
        }
    }

    public void printPassengers(){
        Cabin<Object> current = head;
        System.out.print("Passenger List: ");
        while(current.getNextCabin() != null){
            System.out.print(current.getCargo() + ", ");
            current = current.getNextCabin();
        }
        System.out.println(current.getCargo());
    }

    public void delete(int index){
        Cabin<Object> current = head;
        if(index < this.length()){
            if(index == 0){
                head = head.getNextCabin();
            }
            else{
                for(int i = 0; i < index - 1; i++){
                    current = current.getNextCabin();
                }
                Cabin<Object> nextCabin = current.getNextCabin();
                current.setNextCabin(nextCabin.getNextCabin());
            }
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int length(){
        Cabin<Object> current = head;
        int length = 0;
        while(current.getNextCabin() != null){
            current = current.getNextCabin();
            length++;
        }
        return length;
    }
}
