import java.util.Scanner;

public class MyText {
    public  String string;
    public String outText="";
    Scanner scanner=new Scanner(System.in);
    public  void scanText(){
        System.out.print("Input text:");
        string=scanner.nextLine();
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='0' || string.charAt(i)== '1' || string.charAt(i)=='2' || string.charAt(i)=='3'|| string.charAt(i)=='4' || string.charAt(i)=='5'||string.charAt(i)=='6'|string.charAt(i)=='7'|string.charAt(i)=='8'|string.charAt(i)=='9') {
                            continue;
            }
            else {
                outText = outText + string.charAt(i);
            }
        }
        System.out.print("Output text:"+outText);
    }

public  static void main(String args[]){
       MyText myText1 =new MyText();
       myText1.scanText();
      }
}
