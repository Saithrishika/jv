import java.util.Random;
import java.util.Scanner;
public class Rks{
public static void main(String[] args){
String[] rps={"rock","paper","scissor"};
String cmpmove=rps[new Random().nextInt(rps.length)];
Scanner scanner=new Scanner(System.in);
String playerMove;
while(true){
System.out.println("Please Enter your move(r,p,s)");
playerMove=scanner.nextLine();
if(playerMove.equals("rock")||playerMove.equals("paper")||playerMove.equals("scissor")){
break;}
System.out.println(playerMove+" is not valid move");
}
System.out.println("Computer move:"+cmpmove);
if(playerMove.equals(cmpmove)){
System.out.println("The game was tie");
}
else if(playerMove.equals("rock")){
if(cmpmove.equals("paper")){
System.out.println("your lose!");
}
else if(playerMove.equals("scissor")){
System.out.println("you win");
}
}
else if(playerMove.equals("paper")){
if(cmpmove.equals("rock")){
System.out.println("your win!");
}
else if(playerMove.equals("scissor")){
System.out.println("you win");
}
}
else if(playerMove.equals("scissor")){
if(cmpmove.equals("rock")){
System.out.println("your win!");
}
else if(playerMove.equals("paper")){
System.out.println("you lose!!");
}
}
System.out.println("play again?(yes/no)");
String playAgain=scanner.nextLine();
if(!playAgain.equals("y")){
break;
}
else{
System.out.println("Okay!! we wil play some other time...");
}
}
}
}