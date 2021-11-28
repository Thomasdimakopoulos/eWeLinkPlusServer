package org.elisa.controler.eWeLinkControlLib.live;

import com.github.realzimboguy.ewelink.api.EweLink;

public class LiveManager {

	EweLink eweLink;
	
	
	public void setEweLink(EweLink eweLink) {
		this.eweLink = eweLink;
	}
	
	public void StartLiveMonitor()
	{
		Controller pManager= new Controller();
		pManager.setEweLink(eweLink);
		pManager.Initialize();
      try {
			eweLink.getWebSocket(pManager.getRespondController());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
