package com.aspsols.cotizaciones.reportes.data;

import com.aspsolutions.jframework.Server.ApplicationDataServer;
import com.aspsolutions.jframework.Server.DataFieldDefinition;
import com.aspsolutions.jframework.Server.JApplicationServer;
import com.aspsolutions.jframework.Server.event.listeners.When_Button_PressedListener;
import com.aspsolutions.jframework.Server.startup.IAcceptJForm;
import com.aspsols.cotizaciones.reportes.Cotizaciones_PrintParamForm;

public class TOOLBAR_Cotizaciones_PrintParamForm extends ApplicationDataServer implements IAcceptJForm {
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
		myForm=(Cotizaciones_PrintParamForm)jForm;
	}
	
	public TOOLBAR_Cotizaciones_PrintParamForm (){
	}
	private Cotizaciones_PrintParamForm myForm=null;
	
	private int rowsAffected=0;
	
	public class Run extends DataFieldDefinition implements IAcceptJForm {
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
		}

		public Run (){
			this.addWhen_Button_PressedListener (new When_Button_PressedListener(){
				public void when_Button_Pressed(){
					myForm.runReport();
				}
			});
		}
	}
	
	public class Exit extends DataFieldDefinition implements IAcceptJForm {
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
		}

		public Exit (){
			this.addWhen_Button_PressedListener (new When_Button_PressedListener(){
				public void when_Button_Pressed(){
					myForm.exitForm();
				}
			});
		}
	}

}