public class DogWalker{
    public static void main(String args[]){
        //take in the number of steps entered by the user
        int steps = Integer.parseInt(args[0]);

        //print out the first starting coordinate (0,0)
        System.out.println("(0,0)");
        //set the x and y to 0
        int x = 0;
        int y = 0;

        for(int i = 0; i < steps; i++){
            //use math.random to generate a random number between 0.0 and 1.0
            double rand = Math.random() * 1.0;

            //if rand is between 0.0 and 0.25 then the person will move north
            if(rand <= 0.25){
                y += 1;
            //if rand is between 0.26 and 0.50 then the person will move south
            }else if (rand > 0.25 && rand <= 0.50){
                y -= 1;
            //if rand is between 0.51 and 0.75 then the person will move east
            }else if (rand > 0.50 && rand <= 0.75){
                x += 1;
            //if rand is between 0.76 and 1.0 then the person will move west
            }else if (rand > 0.75 && rand <= 1.0){
                x -= 1;
            }
            //print out the new coordinate
            System.out.println("(" + x + "," + y + ")");
        }

        //calculate the final squared distance
        double dist = ((x*x) + (y*y));
        System.out.println("Squared distance = " + dist);
    }
}