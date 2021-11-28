package org.elisa.controler.eWeLinkControlLib;

import org.elisa.controler.eWeLinkControlLib.Authorization.LogineWeLink;
import org.elisa.controler.eWeLinkControlLib.live.LiveManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LogineWeLink pLogin=new LogineWeLink();
    	pLogin.Login("eu","dr.thomas.dimakopoulos@gmail.com","cb1312ef");
    	LiveManager pLive=new LiveManager();
    	pLive.setEweLink(pLogin.getEweLink());
    	pLive.StartLiveMonitor();
    }
}
