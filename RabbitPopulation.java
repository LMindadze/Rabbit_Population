package fop.w2rabbits;

public class RabbitPopulation extends MiniJava {

    public static void main(String[] args){
        int month = readInt("Please insert a number:");
        int gen[] = {1,0,0};
        int n = 1;
        while(n < month){
            int sum = gen[0] + gen[1] + gen[2];
            gen[2] = gen[1];
            gen[1] = gen[0];
            gen[0] = sum;
            n++;
        }
        write((gen[0]+gen[1]+gen[2]));
    }
}
