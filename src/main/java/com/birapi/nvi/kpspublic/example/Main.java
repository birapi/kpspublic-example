package com.birapi.nvi.kpspublic.example;

import com.birapi.nvi.kpspublic.client.KPSPublic;
import com.birapi.nvi.kpspublic.client.KPSPublicSoap;

public class Main {
	public static void main(String[] args) {
		KPSPublicSoap client = new KPSPublic().getKPSPublicSoap();

		Long tckn = 12436019938l;
		String firstName = "mehmet";
		String lastName = "gürevin";
		int birthYear = 1987;

		if (client.tcKimlikNoDogrula(tckn, firstName, lastName, birthYear)) {
			System.out.printf("%d(%s %s, %d) identity verified.\n", tckn, firstName, lastName, birthYear);
		} else {
			System.out.printf("%d(%s %s, %d) identity can not verified.\n", tckn, firstName, lastName, birthYear);
		}
	}
}
