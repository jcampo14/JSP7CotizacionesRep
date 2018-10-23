package com.aspsols.cotizaciones.reportes;

import java.awt.Font;
import  java.util.Map;
import java.util.Vector;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Iterator;
import java.util.Hashtable;
import com.aspsolutions.jdbc.ObjectType;
import com.aspsolutions.jframework.Exceptions.RecordIdNotFoundException;
import com.aspsolutions.jframework.standar.JReportUtils;
import com.aspsolutions.jreports.server.JReport;
import com.aspsolutions.jreports.server.PresentationRules;
import com.aspsolutions.jreports.server.QueryLogic;
import com.aspsolutions.jreports.server.presentation.FormatException;
import com.aspsolutions.jreports.server.presentation.ReportEllipse;
import com.aspsolutions.jreports.server.presentation.ReportFieldPresentation;
import com.aspsolutions.jreports.server.presentation.ReportLine;
import com.aspsolutions.jreports.server.presentation.ReportMargin;
import com.aspsolutions.jreports.server.presentation.ReportRectangle;
import com.aspsolutions.jreports.server.presentation.ReportImage;
import com.aspsolutions.jreports.server.presentation.ReportRegion;
import com.aspsolutions.jreports.server.presentation.ReportRepetitiveFrame;
import com.aspsolutions.jreports.server.presentation.ReportSection;
import com.aspsolutions.jreports.server.querylogic.DataLink;
import com.aspsolutions.jreports.server.querylogic.Group;
import com.aspsolutions.jreports.server.querylogic.GroupField;
import com.aspsolutions.jreports.server.querylogic.Query;
import com.aspsolutions.jreports.server.querylogic.querycomponents.FromTables;
import com.aspsolutions.jreports.server.runtime.GroupPointer;
import com.aspsolutions.jreports.server.runtime.JReportRuntime;
import com.aspsolutions.jreports.server.runtime.QueryRecords;
import com.aspsolutions.jreports.server.runtime.ReportField;
import com.aspsolutions.jreports.server.presentation.ReportText;
import com.aspsolutions.jreports.server.presentation.ReportFrame;
import com.aspsolutions.jreports.server.presentation.ReportRoundedRectangle;
import com.aspsolutions.jframework.standar.ASPString;
import com.aspsolutions.jreports.server.querylogic.querycomponents.SelectColumns;
import com.aspsolutions.jreports.server.parameters.ParameterForm;
import com.aspsolutions.jframework.Server.DataFieldDefinition;
import com.aspsolutions.jframework.Server.GraphicsObjectServer;
import javax.swing.FocusManager;
import com.aspsolutions.jframework.standar.ASPMath;
import com.aspsolutions.jframework.Server.RecordGroupServer;
import com.aspsolutions.jframework.Server.HelpListServer;
import com.aspsolutions.jreports.server.presentation.ReportChart;
import com.aspsolutions.jframework.Server.JApplicationServer;
import com.aspsolutions.jframework.standar.ASPConverter;
import com.aspsolutions.jframework.standar.ASPSQLFunctions;
import com.aspsolutions.jframework.Utils.SqlParameter;
import com.aspsolutions.jframework.Exceptions.NoDataFoundException;
import com.aspsolutions.jframework.Exceptions.TooManyRows;
import com.aspsolutions.jframework.Exceptions.NumericOrValueException;
import com.aspsolutions.jframework.srw.SRWProgramAbort;
import com.aspsolutions.jframework.standar.ASPLogicalOperators;
import java.awt.Font;
import com.aspsolutions.jreports.server.LayoutTextVariables;
import com.aspsolutions.jframework.Server.ProcedureCallParameters;
import com.aspsolutions.jframework.standar.Utils;
import com.aspsolutions.jreports.server.presentation.PresentationFormat;
import com.aspsolutions.jreports.server.presentation.Conditions;
import com.aspsolutions.jframework.Server.ColumnSpecifications;
import com.aspsolutions.jreports.server.presentation.ReportButton;
import com.aspsolutions.jreports.server.presentation.PageNumbering;
import com.aspsolutions.jframework.Exceptions.DupValOnIndexException;
import com.aspsolutions.jreports.server.presentation.ReportAnchor;
import com.aspsolutions.jframework.standar.ASPCollection;
import com.aspsolutions.jreports.server.presentation.ChartParameter;
import com.aspsolutions.jreports.server.presentation.ChartColumn;
import static com.aspsolutions.jframework.standar.ASPConverter.*;
import static com.aspsolutions.jframework.standar.ASPLogicalOperators.*;
import static com.aspsolutions.jframework.standar.ASPMath.*;
import static com.aspsolutions.jframework.standar.ASPString.*;
import com.aspsolutions.jframework.standar.ASPAccessFile;
import com.aspsolutions.jframework.srw.SRWRunReportFailure;

public class informeDeVentasPorPeriodo extends informeDeVentasPorPeriodo_class3 {

	protected ParameterForm parameterForm = new ParameterForm(0,0,359,188,new Color(191,191,191),"informeDeVentasPorPeriodo");
	protected PresentationRules presentationRules = new PresentationRules();
	protected ReportFieldPresentation fieldPresentationMainBodyVentas_pr = new ReportFieldPresentation("VENTAS_PR",179,10,10,100,reportRegionMainBody,7,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","VENTAS_PRESENTE","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",0,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###,###,###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPorcent = new ReportFieldPresentation("PORCENT",382,10,10,121,reportRegionMainBody,6,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","PORCENTAJE","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",0,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyVentas_pa = new ReportFieldPresentation("VENTAS_PA",279,10,10,103,reportRegionMainBody,8,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","VENTAS_PASADA","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",0,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###,###,###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field0 = new ReportFieldPresentation("LAYOUT_FIELD0",502,41,10,70,reportRegionMainMargin,2,null,"FIXED","FIXED","CURRENT_DATE","java.util.Date",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),"dd/MM/yyyy","DEFAULT",false,false,false,false,null,0,false,-1);
	
	public informeDeVentasPorPeriodo() throws Exception {
		super();
		try {
			jbInit();
		}catch(Exception ex){
			throw new Exception(ex);
		}
	}
	
	private void jbInit() throws Exception {
		try {
			this.setJreport(new JReport());
			this.getJreport().setQueryLogic(this.queryLogic);
			this.getJreport().setPresentationRules(this.presentationRules);
			this.getJreport().setPreviewerTitle("informeDeVentasPorPeriodo");			
			
			this.getJreport().setParameterForm(this.parameterForm);
		    this.setJspDocument("reports/com/aspsols/cotizaciones/reportes/informeDeVentasPorPeriodoParamForm.jsp");
			this.queryLogic.addQueries(this.queryQUERY0);
			this.queryQUERY0.setInitialGroup(this.groupGROUP0);
			this.queryQUERY0.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY0 = ASPString.splitExpression("VENTAS_PRESENTE,VENTAS_PASADA",",");
			String[] arrayAliasqueryQUERY0 = ASPString.splitExpression("VENTAS_PRESENTE,VENTAS_PASADA,",",");
			for(int k=0;k<arrayColumnsqueryQUERY0.length;k++){
				boolean insertqueryQUERY0 = true;
				SelectColumns queryQUERY0SelectColumns = new SelectColumns();
				if(!arrayColumnsqueryQUERY0[k].equals("null")){
					queryQUERY0SelectColumns.setColumnName(arrayColumnsqueryQUERY0[k]);
				}
				if(!arrayAliasqueryQUERY0[k].equals("null")){
					queryQUERY0SelectColumns.setColumnAlias(arrayAliasqueryQUERY0[k]);
					insertqueryQUERY0 = false;
					this.queryQUERY0.getColumnsName().add(arrayAliasqueryQUERY0[k]);
				}else{
					queryQUERY0SelectColumns.setColumnAlias(arrayColumnsqueryQUERY0[k]);
				}
				if(insertqueryQUERY0){
					this.queryQUERY0.getColumnsName().add(arrayColumnsqueryQUERY0[k]);
				}
				this.queryQUERY0.getColumns().add(queryQUERY0SelectColumns);
			}

			
			this.groupGROUP0.addField(this.groupFieldGROUP0VENTAS_PASADA);
			this.groupGROUP0.addField(this.groupFieldGROUP0VENTAS_PRESENTE);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPERIODO_PAS);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPERIODO_PRE);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsMES);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPORCENTAJE);
			this.presentationRules.getSections().add(this.reportSectionHeader);
			this.presentationRules.getSections().add(this.reportSectionMain);
			this.presentationRules.getSections().add(this.reportSectionTrailer);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicRECTANGLE0);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicTEXT_GRAPHIC0);

			this.parameterForm.addToVectorGroupField(this.parameterPeriodo);
			this.getJreport().addToVectorGroupField(this.parameterBACKGROUND);
			this.getJreport().addToVectorGroupField(this.parameterCOPIES);
			this.getJreport().addToVectorGroupField(this.parameterCURRENCY);
			this.getJreport().addToVectorGroupField(this.parameterDECIMAL);
			this.getJreport().addToVectorGroupField(this.parameterDESFORMAT);
			this.getJreport().addToVectorGroupField(this.parameterDESNAME);
			this.getJreport().addToVectorGroupField(this.parameterDESTYPE);
			this.getJreport().addToVectorGroupField(this.parameterMODE);
			this.getJreport().addToVectorGroupField(this.parameterORIENTATION);
			this.getJreport().addToVectorGroupField(this.parameterPRINTJOB);
			this.getJreport().addToVectorGroupField(this.parameterTHOUSANDS);
			this.getJreport().addToVectorGroupField(this.parameterMAXRECORDS);


			this.fieldPresentationMainBodyVentas_pr.setGroupFieldReference(this.groupFieldGROUP0VENTAS_PRESENTE);
			this.fieldPresentationMainBodyPorcent.setGroupFieldReference(this.groupFieldFormula_columnsPORCENTAJE);
			this.fieldPresentationMainBodyVentas_pa.setGroupFieldReference(this.groupFieldGROUP0VENTAS_PASADA);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterperiodo);

			this.addLayoutTextVariables();
			this.addColumnInformation();
			this.addRecordGroupsToServer();
			this.addFormulaInFormula();
			this.addFormulaInGroup();
			this.addFormulaInLayout();
			this.setExecutedInit(true);

			this.parameterPeriodo.setQueryParameter(true);
		} catch(Exception error) {
			throw new Exception(error);
		}
	}

	/*
	public static void main(String args[]) throws Exception {
		try {
			JReportClient report = new JReportClient("com.aspsols.cotizaciones.reportes.informeDeVentasPorPeriodo");
			FocusManager foco = new FocusManagerImplementation();
			FocusManager.setCurrentManager(foco);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
	//*/

	public java.lang.String periodo_pas_method () {

	java.lang.String periodo_pa=null;
	Object object1=ASPString.substring(getField("periodo").getFieldValue(),1,4);
	periodo_pa=convertTo(substract (object1,1),periodo_pa);
	return (java.lang.String)convertTo2(periodo_pa,"java.lang.String");


	}


	public java.lang.String mes_method () {

	java.lang.String mes_normal=null;
	Object object1=ASPString.substring(getField("periodo").getFieldValue(),5,6);
	mes_normal=convertTo(object1,mes_normal);
	return (java.lang.String)convertTo2(mes_normal,"java.lang.String");


	}


	public java.lang.String periodo_pre_method () {

	java.lang.String periodo_pr=null;
	Object object1=ASPString.substring(getField("periodo").getFieldValue(),1,4);
	periodo_pr=convertTo(object1,periodo_pr);
	return (java.lang.String)convertTo2(periodo_pr,"java.lang.String");


	}


	public java.lang.String porcentaje_method () {

	java.lang.String porc=null;
	if (isTrue(isTrue((notEquals(getField("ventas_presente").getFieldValue(),"0")  || isNotTrue(Utils.isNull(getField("ventas_presente").getFieldValue()))))&& isTrue((notEquals(getField("ventas_pasada").getFieldValue(),"0")  || isNotTrue(Utils.isNull(getField("ventas_pasada").getFieldValue())))))){
		Object object1=ASPMath.round(multiply (divide (getField("ventas_presente").getFieldValue(),getField("ventas_pasada").getFieldValue()),100),2);
		porc=convertTo(concat (object1," %"),porc);
	}else {
		porc=convertTo("XX %",porc);
	}
	return (java.lang.String)convertTo2(porc,"java.lang.String");


	}



	private void addLayoutTextVariables() {
		LayoutTextVariables ltvreportTextMainBodyT_ventas_act_0 = new LayoutTextVariables("MES", "&MES");
		this.reportTextMainBodyT_ventas_act.addToVectorVariables(ltvreportTextMainBodyT_ventas_act_0);
		LayoutTextVariables ltvreportTextMainBodyT_ventas_act_2 = new LayoutTextVariables("PERIODO_PRE", "&PERIODO_PRE");
		this.reportTextMainBodyT_ventas_act.addToVectorVariables(ltvreportTextMainBodyT_ventas_act_2);
		LayoutTextVariables ltvreportTextMainBodyT_ventas_pas_0 = new LayoutTextVariables("MES", "&MES");
		this.reportTextMainBodyT_ventas_pas.addToVectorVariables(ltvreportTextMainBodyT_ventas_pas_0);
		LayoutTextVariables ltvreportTextMainBodyT_ventas_pas_2 = new LayoutTextVariables("PERIODO_PAS", "&PERIODO_PAS");
		this.reportTextMainBodyT_ventas_pas.addToVectorVariables(ltvreportTextMainBodyT_ventas_pas_2);
	}
			
	/**
	 * Metodo generado automaticamente para agregar los valores
	 * de las columnas a los sqlstatements estaticos.
	 */
	private final void addColumnInformation() {
	}
			
	/**
	 * Metodo generado automaticamente para agregar los valores
	 * de las columnas a los sqlstatements y agregarlos al vector de recordgroups.
	 */
	private void addRecordGroupsToServer() {
	}

	/**
	 * Metodo generado automaticamente para agregar las formulas
	 * que se encuentran en los eventos de las formulas.
	 */
	private void addFormulaInFormula() {
		this.groupFieldFormula_columnsPERIODO_PAS.addToVectorFormulaInFormula(this.parameterPeriodo);
		this.groupFieldFormula_columnsPERIODO_PRE.addToVectorFormulaInFormula(this.parameterPeriodo);
		this.groupFieldFormula_columnsMES.addToVectorFormulaInFormula(this.parameterPeriodo);
		this.groupFieldFormula_columnsPORCENTAJE.addToVectorFormulaInFormula(this.groupFieldGROUP0VENTAS_PASADA);
		this.groupFieldFormula_columnsPORCENTAJE.addToVectorFormulaInFormula(this.groupFieldGROUP0VENTAS_PRESENTE);
	}
		
	/**
	 * Metodo generado automaticamente para agregar las formulas
	 * que se encuentran en los eventos de los grupos.
	 */
	private void addFormulaInGroup() {
	}
		
	/**
	 * Metodo generado automaticamente para agregar las formulas
	 * que se encuentran en los elementos de el layout.
	 */
	private void addFormulaInLayout() {
	}
}