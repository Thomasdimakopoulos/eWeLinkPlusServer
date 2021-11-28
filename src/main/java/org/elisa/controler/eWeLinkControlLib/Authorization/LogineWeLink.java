package org.elisa.controler.eWeLinkControlLib.Authorization;

import com.github.realzimboguy.ewelink.api.EweLink;

public class LogineWeLink {

	EweLink eweLink;
	
	public boolean Login(String region,String email,String password) {

		eweLink = new EweLink(region, email, password, 60);

		try {
			eweLink.login();
			return true;
		} catch (Exception e) {
			
			return false;
		}

	}

	public EweLink getEweLink() {
		return eweLink;
	}
	
	
}
