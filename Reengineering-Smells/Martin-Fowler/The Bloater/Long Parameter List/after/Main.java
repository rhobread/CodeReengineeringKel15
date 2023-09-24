

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	WalletNotification walletNotif = new WalletNotification();
	User user;
	String nama="", email="";

	public void mainMenu() {
		System.out.println("IH-WALLET");
		System.out.println("=========");
		System.out.println("1. Cek Saldo ");
		System.out.println("2. Tambah Saldo");
		System.out.println("3. Tarik Saldo");
		System.out.println("4. Keluar");
		System.out.print(">> ");

		int choice = 0;
		do {
			choice = scan.nextInt();
			scan.nextLine();
		}while(choice<1 || choice>4);

		switch(choice) {
		case 1:
			cekSaldo();
			break;
		case 2:
			tambahSaldo();
			break;
		case 3:
			tarikSaldo();
			break;
		case 4:
			System.exit(0);
			break;
		}
	}

	public void menuUserProfiles() {
		System.out.println("Welcome to IH-WALLET");
		do {
			System.out.print("Masukkan nama (harus lebih dari 5 karakter): ");
			nama = scan.nextLine(); 
		}while(nama.length()<5);
		do {
			System.out.print("Masukkan email (format dalam gmail): ");
			email = scan.nextLine();
		}while(!(email.endsWith("@gmail.com")));

		user = new User(nama, email);
		System.out.println();
		mainMenu();
	}

	public void pressEnterToContinue() {
		System.out.println("Tekan enter untuk kembali ke menu..");
		scan.nextLine();
		mainMenu();
	}


	public void cekSaldo() { 
		Information info = new Information(user.getName(), user.getEmail(), 0, user.getWallet().getBalance());
		walletNotif.balanceNotif(info);
		pressEnterToContinue();
	}

	public void tambahSaldo() {
		int saldoTambahan = 0;
		do {
			System.out.print("Masukkan nominal yang ingin ditambahkan (min. 1000): ");
			saldoTambahan = scan.nextInt(); scan.nextLine();
		}while(saldoTambahan<1000);

		user.getWallet().add(saldoTambahan);

		Information info = new Information(user.getName(), user.getEmail(), 0, user.getWallet().getBalance());
		walletNotif.balanceNotif(info);
		pressEnterToContinue();
	}

	public void tarikSaldo() {
		int penguranganSaldo = 0;
		do {
			System.out.print("Masukkan nominal yang ingin ditarik (min. 1000): ");
			penguranganSaldo = scan.nextInt(); scan.nextLine();
		}while(penguranganSaldo < 1000);

		user.getWallet().reduce(penguranganSaldo);
		
		Information info = new Information(user.getName(), user.getEmail(), penguranganSaldo, user.getWallet().getBalance());
		walletNotif.balanceNotif(info);
		pressEnterToContinue();
	}

	public Main() {
		menuUserProfiles();
	}

	public static void main(String[] args) {
		new Main();
	}

}
