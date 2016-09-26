package org.eclipse.smarthome.urc;

import com.sun.xml.txw2.annotation.XmlElement;

public class InterfaceInformation {
private String titel;  
private Link link;
	private String target;
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
@XmlElement("name=a")	
	public Link getLink() {
		return link;
	}
	public void setLink(Link link) {
		this.link = link;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
}
