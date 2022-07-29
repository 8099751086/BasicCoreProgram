package com.Basic.Program;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {

		int h_cnt = 0;
		int t_cnt = 0;
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the No. of times to flip a coin: ");
		int n = Sc.nextInt();
		for (int i = 1; i < n; i++) {
			double flip = Math.floor(Math.random() * 10) % 2;
			if (flip < 0.5) {
				h_cnt++;
			} else {
				t_cnt++;
			}

		}
		double headpercentage = (h_cnt * 100) / n;
		double tailpercentage = (t_cnt * 100) / n;
		System.out.println("The Percentage of head flips: " + headpercentage);
		System.out.println("The Percentage of head flips: " + tailpercentage);

	}

}
