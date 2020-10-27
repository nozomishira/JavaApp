class Ex11 {
    public static void main(String[] args) {
        double height = 170.0; 
        double weight = 60.0; 
        if (args.length == 2) {
            height = Double.valueOf(args[0]);
            weight = Double.valueOf(args[1]);
        }
        System.out.println("身長 (cm): " + height);
        System.out.println("体重 (kg): " + weight);

       
      
        double bmi = weight/(height*height);
		bmi=bmi*10000;
        System.out.println("BMI: " + bmi);
    }
}
