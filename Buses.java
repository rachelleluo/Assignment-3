public class Buses{
    public static void main(String args[]){
        int bus_number = Integer.parseInt(args[0]);

        //if the bus_number is negative (less than 0) then display an error
        if(bus_number < 0){
            System.out.println("ERROR");
        }else{
             //set variables current and sum = 0
            int current = 0;
            int sum = 0;

            //loop for the length of the integer
            for(int i = 0; i < 4; i++){
                //set current equal to the remainder of the bus_number / 10
                current = bus_number % 10;
                //add the current to the sum
                sum += current;
                //update the bus_number
                bus_number = (bus_number - current)/10;
            }

            //check to see what the output should be
            if(sum % 2 == 0){
                System.out.println("LX");
            }else{
                System.out.println("H");
            }
        }

    }
}