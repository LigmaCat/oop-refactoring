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

    public String catagory(double bmw){

          String category;
        if (bmw < 18.5) {
            return category = "Nepietiekama ķermeņa masa";
        } else if (bmw < 25) {
            return category = "Normāla ķermeņa masa";
        } else if (bmw < 30) {
            return category = "Lieka ķermeņa masa";
        } else {
            return category = "Aptaukošanās";
        }

    }

}