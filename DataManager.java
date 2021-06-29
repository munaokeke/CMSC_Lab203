

/**
 * The DataManager class should never depend on the GUI, but rather the reverse. 
 * So the DataManager methods should not use the GUI directly.  If you want data
 * to get from the user to the manager, have the GUI get the data, and call the manager 
 * with the data that the GUI got from a text field or other data structure.
 * @author ralexander
 *
 * Lab 2 summer 2021 Montgomery College 
 * @author Daniel Muna Okeke
 * Professor Ahmed Tarek
 * CMSC 203 CRN: 46519
* Due Date 29 June 2021
 *
 */
public class DataManager {
    
	DataManager() {	}

	/** 
	 * This method illustrates how the GUI can interact with the manager
	 */
	public String getHello() {
		return "Hello World";
	}

	public String getHowdy() {
		return "Howdy y'all";
	}

	public String getChinese() {
		return "Ni hau";
	}
	
	public String getIgbo() {
		return "Kedu.";
	}


}