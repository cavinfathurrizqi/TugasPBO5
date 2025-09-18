/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author LENOVO
 */
class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String saldo) {
        super(saldo);
    }
}

public class Bank {
     int saldo = 500;
    
    public void tarikUang(int jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            throw new SaldoTidakCukupException("Saldo anda hanya 500 ");
        }
       
        System.out.println(" Saldo mencukupi : " + saldo);
    }
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        try {
            bank.tarikUang(500);
        } catch (SaldoTidakCukupException e) {
            System.out.println("Gagal : " + e.getMessage());
        }
    }
}