package application;

import entities.Soldado;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soldado s1 = new Soldado("Miguel");
        Soldado s2 = new Soldado("Pedro");
        Soldado s3 = new Soldado("Joao");
        Soldado s4 = new Soldado("Carlos");
        Soldado s5 = new Soldado("Marcos");
        Soldado s6 = new Soldado("Matheus");
        Soldado s7 = new Soldado("David");
        Soldado s8 = new Soldado("Max");
        Soldado s9 = new Soldado("Bob");
        Soldado s10 = new Soldado("Tom");
        s1.atacar();
        s2.movimentar();
    }
}
