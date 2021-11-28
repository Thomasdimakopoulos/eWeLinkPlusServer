package org.elisa.controler.eWeLinkControlLib.Logic;

public class LogicModel {

	String TriggerID;
	String ControlID;
	String ControlDeviceType; //LAMP/Siren
	String Action;//On/OFF/ChangeStatus
	
	public String getTriggerID() {
		return TriggerID;
	}
	public void setTriggerID(String triggerID) {
		TriggerID = triggerID;
	}
	public String getControlID() {
		return ControlID;
	}
	public void setControlID(String controlID) {
		ControlID = controlID;
	}
	public String getControlDeviceType() {
		return ControlDeviceType;
	}
	public void setControlDeviceType(String controlDeviceType) {
		ControlDeviceType = controlDeviceType;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	
	
}
