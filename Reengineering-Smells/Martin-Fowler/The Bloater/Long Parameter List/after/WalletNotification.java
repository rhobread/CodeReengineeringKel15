

class WalletNotification {
	public void balanceNotif(Information info) {
		String body = "";
		if(info.amount == 0) {
			body = String.format(
					"Halo %s, Saldo mu sekarang ada %2d ", info.name, info.current);
		}
		
		else if (info.amount > 0) { 
			body = String.format(
				"Halo %s, ada %2d masuk ke akunmu nih. " + 
				"Sekarang balance-mu menjadi %2d", info.name, info.amount, info.current);
		} 
		
		else{
			body = String.format(
					"Halo %s, ada %2d keluar dari akunmu nih. " + 
					"Sekarang balance-mu menjadi %2d", info.name, info.amount, info.current);
		}
		
		System.out.printf("Email terkirim ke %s\n", info.email);
		System.out.println("Isi email: ");
		System.out.println(body);
		
	}
}