package hu.petrik;

import java.util.Random;

public class Tesla implements Auto{

    private  double sebesseg;

    private static final Random r = new Random();

    public Tesla(){
        this.sebesseg = r.nextInt(60);
    }
    @Override
    public void gyorsul() {
        this.sebesseg = getSebesseg() + r.nextInt(15-5)+5;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
