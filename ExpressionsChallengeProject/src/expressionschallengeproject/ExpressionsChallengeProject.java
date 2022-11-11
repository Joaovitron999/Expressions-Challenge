/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionschallengeproject;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author 2020.1.08.003
 */
public class ExpressionsChallengeProject {


    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        BigInteger n, d;
        //n = input.nextBigInteger();
        //d = input.nextBigInteger();

        for(BigInteger i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(100)) <= 0; i = i.add(BigInteger.valueOf(1))){
            System.out.println(catalan(i));
        }
    }

    private static BigInteger fatorial(BigInteger x){
        for(BigInteger i = x.subtract(new BigInteger("1")); i.compareTo(new BigInteger("0")) == -1; i = i.subtract(new BigInteger("1"))){
            
            x = x.multiply(i);
        }
        return x;
    }


    private static BigInteger catalan(BigInteger n){

        return (fatorial(new BigInteger(""+n).add(new BigInteger("1"))).divide((fatorial(new BigInteger(""+n).add(new BigInteger("1"))).multiply( fatorial(new BigInteger(""+n))))));
    }
    
}
