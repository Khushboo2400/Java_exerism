import java.util.*;
import java.lang.Math ;
class Queen{
    int row =0;
    int column=0;
    public Queen(int row,int col){
        this.row =row;
        this.column =col;    
    }
    public int getRow(){
        return this.row;
    }
     public int getColumn(){
        return this.column;
    }
}
public class QueenAttackCalculator{
    Queen white =new Queen();
    Queen black = new Queen();
    public QueenAttackCalculator(Queen w, Queen b){
        this.white =w;
        this.black =b;
    }
    public Queen getWhite() {
        return this.white;
    }
    public Queen getBlack() {
        return this.black;
    }
public boolean canQueensAttackOneAnother(){
    boolean canAttack =false;
    int rW = (this.getWhite()).getRow();
    int cW =(this.getWhite()).getColumn();
    int rB =(this.getBlack()).getRow();
    int cB = (this.getBlack()).getColumn();
 if (rW == rB || cW ==cB || (Math.abs(rB -rW)==Math.abs(cB-cW))){
     canAttack =true;
 }
    return canAttack;
}
public static void main(String Args[]){
   }
    
}
