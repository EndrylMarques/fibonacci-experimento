package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            System.out.print("(" + i + "):" + fibonacci(i) + "\t");
        }
	}

	static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
