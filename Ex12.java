class Ex12 {
    public static void main(String[] args) {
        int n = 5;
        int j;
        int k;
	int i;
        if (args.length == 1)
            n = Integer.valueOf(args[0]);

	  
        for (i = 1; i <= n; i++) {
            
          
            for(j = 1;j<=n-i;j++){
             System.out.print(" ");
            }
              
              for(j = n-i+2;j<=n+i;j++){
             System.out.print("*");
            }
             

              for(k=n+i+1;k<=2*n-1;k++){
             System.out.print(" ");
           }
           System.out.println(" ");
    }
}
}
