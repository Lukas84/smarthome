package org.eclipse.smarthome.urc;

import com.sun.xml.txw2.annotation.XmlAttribute;
import com.sun.xml.txw2.annotation.XmlValue;

public class Link {
	private String text;
	
	private String href;

	public Link(String text, String href) {
		// TODO Auto-generated constructor stub
	this.text = text;
	this.href = href;
	}
	
	@XmlValue
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	@XmlAttribute
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}
