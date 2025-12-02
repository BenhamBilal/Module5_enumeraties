public enum Planet {
    MERCURIUS(5.23),MARS(6.32),VENUS(3.43),AARDE(1);

    private double gravity ;

//    Bij enum de constructor mag nooit plubliek zijn
    private Planet(double gravity){
        this.gravity = gravity;
    }

    public double getGravity(){
        return this.gravity;
    }
}
