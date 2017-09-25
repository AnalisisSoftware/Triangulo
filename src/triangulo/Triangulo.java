package triangulo;

import java.util.Scanner;

public class Triangulo {
	private int ladoUno;
	private int ladoDos;
	private int ladoTres;

	public Triangulo() {
	}

	public Triangulo(int a, int b, int c) {
		this.ladoUno = a;
		this.ladoDos = b;
		this.ladoTres = c;
	}

	public void validarTipo() {
		if (this.ladoUno != 0 && this.ladoDos != 0 && this.ladoTres != 0 && this.ladoUno + this.ladoDos > this.ladoTres
				&& this.ladoUno + this.ladoTres > this.ladoDos && this.ladoDos + this.ladoTres > this.ladoUno) {
			if (this.ladoUno != this.ladoDos && this.ladoDos != this.ladoTres && this.ladoUno != this.ladoTres) {
				System.out.println("Es Escaleno: " + this.ladoUno + " " + this.ladoDos + " " + this.ladoTres);
			} else if (this.ladoUno == this.ladoDos && this.ladoDos == this.ladoTres && this.ladoUno == this.ladoTres) {
				System.out.println("Es Equilatero: " + this.ladoUno + " " + this.ladoDos + " " + this.ladoTres);
			} else {
				System.out.println("Es Isosceles: " + this.ladoUno + " " + this.ladoDos + " " + this.ladoTres);
			}
		} else {
			System.out.println("No forma triangulo");
		}

	}

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		System.out.println("Ingrese el lado 1: ");
		Scanner scan = new Scanner(System.in);
		t1.ladoUno = scan.nextInt();
		System.out.println("Ingrese el lado 2: ");
		t1.ladoDos = scan.nextInt();
		System.out.println("Ingrese el lado 3: ");
		t1.ladoTres = scan.nextInt();
		t1.validarTipo();
		scan.close();
	}
}