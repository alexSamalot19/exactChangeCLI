package exact.Change;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class exactChange {
    public static void main(String[] args){
//        System.out.println("Hello World");

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i< args.length; i++)
        {
            numbers.add(Integer.parseInt(args[i]));

        }
        //System.out.println("ArgDollar" +args[0]);

        for(int p=0; p< numbers.size(); p++) {
            //System.out.println("change"+ numbers.get(p));
        }

        int b;
        b=Integer.parseInt(args[0]);
        makeChange2(b,numbers);


    }


    public static void makeChange2(int b, ArrayList<Integer> numbers) {
        int moneyForCh= b;
        //System.out.println("InLoopDol"+ moneyForCh );
        int remMoney=0;
        int numCoins;
        int lessMoney=0;
        ArrayList<Integer> countOut = new ArrayList<>();

        Collections.sort(numbers);
        Collections.reverse(numbers);

        for(int x=0; x<numbers.size(); x++) {
//            System.out.println("InLoopNum"+ numbers.get(x));

            if(x==0)
            {
                remMoney=moneyForCh;
            }else {
                remMoney=lessMoney;
            }

            numCoins=(int)Math.floor(remMoney/numbers.get(x));
            lessMoney=remMoney-(numCoins*numbers.get(x));

//            System.out.println("InLnumCoins"+ numCoins);
//            System.out.println("InLlessMoney"+ lessMoney);
            for(int z=0; z<numCoins; z++) {
                countOut.add(numbers.get(x));
            }



        }

        //System.out.println("remMoney"+ remMoney);
        if( lessMoney>0)
        {
//            System.out.println("0");
        }else {
//            System.out.print("\n");
            for(int n=0;n<countOut.size(); n++) {
                System.out.print(countOut.get(n) + " ");


            }
            System.out.print("\n");
        }
    }
}