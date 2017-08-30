package cc.felix.practise.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1241641063694494270L;

	private long id;
	private String name;
	private long price;
}
