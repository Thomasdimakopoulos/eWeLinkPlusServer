package org.elisa.controler.eWeLinkControlLib.Lamp;

import com.github.realzimboguy.ewelink.api.EweLink;
import com.github.realzimboguy.ewelink.api.model.Status;

public class LampConrtol {

	
	EweLink eweLink;
	
	
	public void setEweLink(EweLink eweLink) {
		this.eweLink = eweLink;
	}


	public boolean IsLampOn(String IDLamp)
	{
		try {
			Status lampStatus=eweLink.getDeviceStatus(IDLamp);
			if(lampStatus.getParams().getSwitchValue().equalsIgnoreCase("on"))
				return true;
			if(lampStatus.getParams().getSwitchValue().equalsIgnoreCase("off"))
				return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
		
	}
	
	public boolean SwitchLampOn(String IDLamp)
	{
		try {
			eweLink.setDeviceStatus(IDLamp,"ON");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}		
	}
	
	public boolean SwitchLampOff(String IDLamp)
	{
		try {
			eweLink.setDeviceStatus(IDLamp,"OFF");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}		
	}
}
