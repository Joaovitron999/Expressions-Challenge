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

        for(BigInteger i = 1; i < 20; i++){
            System.out.println(catalan(i));
        }
    }

    private static BigInteger fatorial(BigInteger x){
        for(BigInteger i = x-1; i > 0; i--){
            x *= i;
        }
        return x;
    }


    private static BigInteger catalan(BigInteger n){

        return (fatorial(new BigInteger(""+n).add(new BigInteger("1"))).divide((fatorial(new BigInteger(""+n).add(new BigInteger("1"))).multiply( fatorial(new BigInteger(""+n))))));
    }
    
}
