package com.company.aprilchallenge.week1;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) throws Exception {
        System.out.println(isHappy(18));
    }

    public static boolean isHappy(int n) {

            HashSet<Integer> hs = new HashSet();

            while (!hs.contains(n)) {
                hs.add(n);

                n = getSum(n);

                if (n == 1)
                    return true;
            }

            return false;
        }

        public static int getSum ( int n){
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem * rem;
                n = n / 10;
            }
            return sum;
        }
    }



