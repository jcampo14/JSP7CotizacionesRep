package com.aspsols.cotizaciones.reportes.data;

import com.aspsolutions.jframework.Server.ApplicationDataServer;
import com.aspsolutions.jframework.Server.DataFieldDefinition;
import com.aspsolutions.jframework.Server.JApplicationServer;
import com.aspsolutions.jframework.Server.event.listeners.When_Button_PressedListener;
import com.aspsolutions.jframework.Server.startup.IAcceptJForm;
import com.aspsols.cotizaciones.reportes.informeDeVentasPorPaisParamForm;

public class DATA_informeDeVentasPorPaisParamForm extends ApplicationDataServer implements IAcceptJForm {
	/**
	 * default serial ID. 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * This method is used to set a reference to the running jform.
	 * If you want to use jform components and methods 
	 * from events in this class, you can used the reference to myForm.
	 * 
	 */
	public void acceptJForm(JApplicationServer jForm){
		myForm=(informeDeVentasPorPaisParamForm)jForm;
	}
	
	public DATA_informeDeVentasPorPaisParamForm (){
	}
	private informeDeVentasPorPaisParamForm myForm=null;
	
	private int rowsAffected=0;
	

}