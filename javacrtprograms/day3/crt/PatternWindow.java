package day3.crt;

 class PatternWindow {
    public static void main(String[] args) {
        for(int i=0;i<=12;i++){
            for(int j=0;j<=12;j++){
                if(i==0||i==6||i==12||j==0||j==6||j==12){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }   
}