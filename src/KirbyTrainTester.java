
public class KirbyTrainTester {
    public static void main(String[] args) {

        KirbyTrain kirbs = new KirbyTrain();
        for(int x = 0; x < 8; x++){
            if(x%2==0){
                String passenger = "Pass" + x;
                kirbs.add(passenger);
            }
            else{
                kirbs.add(x);
            }


        }

        kirbs.printPassengers();
        kirbs.delete(3);
        kirbs.printPassengers();

    }
}