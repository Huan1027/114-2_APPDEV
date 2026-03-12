public class triangle {
    public static void main(String [] args){
        System.out.println("helloworld");
        printriangle();
    }
    private static String str="";
    private static void printriangle(){
        int i,j;
        for(i=1;i<=5;j++){
            for(j=1;j<=i;j++){
                str+="*";
                str+="\n";

            }
        }
    }
}