package org.elisa.controler.eWeLinkControlLib.gateway.rfswitch;

public class RFSwitch {

	public int WhoRFTriggered(String s)
	{
		if(s.contains("rfTrig0"))
        {
        	return 0;
        }
		if(s.contains("rfTrig1"))
        {
        	return 1;
        }
        if(s.contains("rfTrig2"))
        {
        	return 2;
        }
        if(s.contains("rfTrig3"))
        {
        	return 3;
        }
        if(s.contains("rfTrig4"))
        {
        	return 4;
        }
        if(s.contains("rfTrig5"))
        {
        	return 5;
        }
        if(s.contains("rfTrig6"))
        {
        	return 6;
        }
        
        if(s.contains("rfTrig7"))
        {
        	return 7;
        }
        
        if(s.contains("rfTrig8"))
        {
        	return 8;
        }
        
        if(s.contains("rfTrig9"))
        {
        	return 9;
        }

        
        
        if(s.contains("rfTrig10"))
        {
        	return 10;
        }
		if(s.contains("rfTrig11"))
        {
        	return 11;
        }
        if(s.contains("rfTrig12"))
        {
        	return 12;
        }
        if(s.contains("rfTrig13"))
        {
        	return 13;
        }
        if(s.contains("rfTrig14"))
        {
        	return 14;
        }
        if(s.contains("rfTrig15"))
        {
        	return 15;
        }
        if(s.contains("rfTrig16"))
        {
        	return 16;
        }
        return -1;
	}
}
