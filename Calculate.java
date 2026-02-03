class Calculate{

    private int heightCm ;
    private int weightKg ;

    public Calculate(){
        heightCm = -1;
        weightKg = -1;
    }

    public double bmwCalc(int height,int weight){

        double heightM = height / 100.0;
        double bmiRaw = weight / (heightM * heightM);
        return Math.round(bmiRaw * 100.0) / 100.0;

    }

}