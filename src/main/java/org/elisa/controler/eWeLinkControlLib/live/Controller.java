package org.elisa.controler.eWeLinkControlLib.live;

import org.elisa.controler.eWeLinkControlLib.Lamp.LampConrtol;
import org.elisa.controler.eWeLinkControlLib.gateway.rfswitch.RFSwitch;

import com.github.realzimboguy.ewelink.api.EweLink;
import com.github.realzimboguy.ewelink.api.wss.WssResponse;
import com.github.realzimboguy.ewelink.api.wss.wssrsp.WssRspMsg;

public class Controller {

	WssResponse respondController;

EweLink eweLink;
	
	
	public void setEweLink(EweLink eweLink) {
		this.eweLink = eweLink;
	}
	
	public WssResponse getRespondController() {
		return respondController;
	}



	public void Initialize() {
		respondController = new WssResponse() {

			@Override
			public void onMessage(String s) {
				// if you want the raw json data
				// System.out.println("on message in test raw:" + s);
				RFSwitch prf=new RFSwitch();
				LampConrtol pLamp=new LampConrtol();
				
				pLamp.setEweLink(eweLink);
				if(prf.WhoRFTriggered(s)==0)
				{
					if(pLamp.IsLampOn("10010abafb"))
						pLamp.SwitchLampOff("10010abafb");
					else
						pLamp.SwitchLampOn("10010abafb");
				}
				
				if(prf.WhoRFTriggered(s)==2)
				{
					if(pLamp.IsLampOn("10010acccc"))
						pLamp.SwitchLampOff("10010acccc");
					else
						pLamp.SwitchLampOn("10010acccc");
				}
				
				if(prf.WhoRFTriggered(s)==1)
				{
					if(pLamp.IsLampOn("1001084115"))
						pLamp.SwitchLampOff("1001084115");
					else
						pLamp.SwitchLampOn("1001084115");
				}
				
				if(prf.WhoRFTriggered(s)==3)
				{
					if(pLamp.IsLampOn("10010aa0b4"))
						pLamp.SwitchLampOff("10010aa0b4");
					else
						pLamp.SwitchLampOn("10010aa0b4");
				}
				//1 bathroom 1001084115
				//3 kitchen 10010aa0b4
				
			}

			@Override
			public void onError(String error) {
				System.out.println("onError in test, this should never be called");
				System.out.println(error);

			}

			@Override
			public void onMessageParsed(WssRspMsg rsp) {
				// TODO Auto-generated method stub
				if (rsp.getError() == null) {

					// normal scenario
					StringBuilder sb = new StringBuilder();
					sb.append("Device:").append(rsp.getDeviceid()).append(" - ");
					if (rsp.getDeviceid().equalsIgnoreCase("1001108712"))
						System.out.println("**** Trigger *****");
					if (rsp.getParams() != null) {
						sb.append("Switch:").append(rsp.getParams().getSwitch()).append(" - ");
//	                        sb.append("Voltage:").append(rsp.getParams().getVoltage()).append(" - ");
//	                        sb.append("Power:").append(rsp.getParams().getPower()).append(" - ");
//	                        sb.append("Current:").append(rsp.getParams().getCurrent()).append(" - ");
						// rsp.getParams().get
					}

					System.out.println(sb.toString());

				} else if (rsp.getError() == 0) {
					// this is from a login response
					System.out.println("login success");
				} else if (rsp.getError() > 0) {
					System.out.println("login error:" + rsp.toString());
				}

			}
		};

	}
}
