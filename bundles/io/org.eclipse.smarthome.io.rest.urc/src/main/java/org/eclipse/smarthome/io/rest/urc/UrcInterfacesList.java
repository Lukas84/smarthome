package org.eclipse.smarthome.urc;

import java.util.LinkedList;
import java.util.List;

import com.sun.jersey.spi.container.ResourceFilters;
import com.sun.xml.txw2.annotation.XmlElement;


public class UrcInterfacesList {
int	 i = 0;
	private String title = "Available Interfaces";
	private List<InterfaceInformation> interfaceInformation = new LinkedList<InterfaceInformation>();
	
	@XmlElement("name=h1")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<InterfaceInformation> getInterfaceInformation() {
		return interfaceInformation;
	}
	public void setInterfaceInformation(List<InterfaceInformation> interfaceInformation) {
		this.interfaceInformation = interfaceInformation;
	}
	public void addUrcInterface(InterfaceInformation info) {
		info.setLink(link);
		
	}
	
}
