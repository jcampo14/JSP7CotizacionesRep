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

public class informeDeVentasPorPais extends informeDeVentasPorPais_class3 {

	protected ParameterForm parameterForm = new ParameterForm(0,0,600,400,new Color(191,191,191),"informeDeVentasPorPais");
	protected PresentationRules presentationRules = new PresentationRules();
	protected ReportFieldPresentation fieldPresentationMainBodyAnteriores = new ReportFieldPresentation("ANTERIORES",350,12,10,90,reportRegionMainBody,8,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","ANTERIORES","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),"###,###,###,###,###,###.###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyActuales = new ReportFieldPresentation("ACTUALES",178,12,10,90,reportRegionMainBody,9,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","ACTUALES","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),"###,###,###,###,###,###.###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNom = new ReportFieldPresentation("NOM",26,12,10,93,reportRegionMainBody,11,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","NOM","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyMon = new ReportFieldPresentation("MON",119,12,10,59,reportRegionMainBody,10,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","MON","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPorc_act = new ReportFieldPresentation("PORC_ACT",268,12,10,82,reportRegionMainBody,17,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","PERIODO_ACTUAL","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),"###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPorc_ant = new ReportFieldPresentation("PORC_ANT",440,12,10,84,reportRegionMainBody,20,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","PERIODO_PASADO","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),"###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTotal_ant = new ReportFieldPresentation("TOTAL_ANT",350,22,10,90,reportRegionMainBody,13,reportFrameMainBodyFrame2,"FIXED","FIXED","SUM_PAS","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),"###,###,###,###,###,###.###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTotal_act = new ReportFieldPresentation("TOTAL_ACT",178,22,10,90,reportRegionMainBody,14,reportFrameMainBodyFrame2,"FIXED","FIXED","SUM_ACT","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),"###,###,###,###,###,###.###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTot_por_act = new ReportFieldPresentation("TOT_POR_ACT",268,22,10,82,reportRegionMainBody,18,reportFrameMainBodyFrame2,"FIXED","FIXED","TOT_POR_ACT","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),"###,###,###,###,###,###.#","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTot_por_pas = new ReportFieldPresentation("TOT_POR_PAS",440,22,10,84,reportRegionMainBody,19,reportFrameMainBodyFrame2,"FIXED","FIXED","TOT_POR_PAS","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),"###,###,###,###,###,###.#","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field0 = new ReportFieldPresentation("LAYOUT_FIELD0",522,43,10,50,reportRegionMainMargin,4,null,"FIXED","FIXED","CURRENT_DATE","java.sql.Date",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,8),"dd/MM/yyyy","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field1 = new ReportFieldPresentation("LAYOUT_FIELD1",522,54,9,16,reportRegionMainMargin,6,null,"FIXED","FIXED","PAGE_NUMBER","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field2 = new ReportFieldPresentation("LAYOUT_FIELD2",554,54,9,18,reportRegionMainMargin,8,null,"FIXED","FIXED","TOTAL_PAGES","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	
	public informeDeVentasPorPais() throws Exception {
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
			this.getJreport().setPreviewerTitle("informeDeVentasPorPais");			
			
			this.getJreport().setParameterForm(this.parameterForm);
		    this.setJspDocument("reports/com/aspsols/cotizaciones/reportes/informeDeVentasPorPaisParamForm.jsp");
			this.queryLogic.addQueries(this.queryQUERY0);
			this.queryQUERY0.setInitialGroup(this.groupGROUP_MON);
			this.queryQUERY0.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY0 = ASPString.splitExpression("XPJ.NOM,XPJ.MON,XPJ.PRESENTE,ACTUALES,XPJ.PASADAS,ANTERIORES",",");
			String[] arrayAliasqueryQUERY0 = ASPString.splitExpression("NOM,MON,PRESENTE,ACTUALES,PASADAS,ANTERIORES,",",");
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

			this.groupGROUP_MON.addChildGroup(this.groupGROUP0);
			
			this.groupGROUP0.addField(this.groupFieldGROUP0NOM);
			this.groupGROUP0.addField(this.groupFieldGROUP0PRESENTE);
			this.groupGROUP0.addField(this.groupFieldGROUP0ACTUALES);
			this.groupGROUP0.addField(this.groupFieldGROUP0PASADAS);
			this.groupGROUP0.addField(this.groupFieldGROUP0ANTERIORES);
			this.groupGROUP0.addField(this.groupFieldGROUP0Color_reg);
			this.groupFieldGROUP0Color_reg.setSource(this.groupFieldGROUP0NOM);
			this.groupGROUP0.addField(this.groupFieldGROUP0PERIODO_ACTUAL);
			this.groupGROUP0.addField(this.groupFieldGROUP0PERIODO_PASADO);
			this.groupGROUP_MON.addField(this.groupFieldGROUP_MONMON);
			this.groupGROUP_MON.addField(this.groupFieldGROUP_MONSUM_ACT);
			this.groupFieldGROUP_MONSUM_ACT.setSource(this.groupFieldGROUP0ACTUALES);
			this.groupGROUP_MON.addField(this.groupFieldGROUP_MONSUM_PAS);
			this.groupFieldGROUP_MONSUM_PAS.setSource(this.groupFieldGROUP0ANTERIORES);
			this.groupGROUP_MON.addField(this.groupFieldGROUP_MONTOT_POR_ACT);
			this.groupFieldGROUP_MONTOT_POR_ACT.setSource(this.groupFieldGROUP0PERIODO_ACTUAL);
			this.groupGROUP_MON.addField(this.groupFieldGROUP_MONTOT_POR_PAS);
			this.groupFieldGROUP_MONTOT_POR_PAS.setSource(this.groupFieldGROUP0PERIODO_PASADO);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsMES);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPERIODO_ACT);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPERIODO_PAS);
			this.presentationRules.getSections().add(this.reportSectionHeader);
			this.presentationRules.getSections().add(this.reportSectionMain);
			this.presentationRules.getSections().add(this.reportSectionTrailer);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_title);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_hint);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_periodo);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_empresa);

			this.parameterForm.addToVectorGroupField(this.parameterPeriodo);
			this.parameterForm.addToVectorGroupField(this.parameterEmpresa);
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


			this.fieldPresentationMainBodyAnteriores.setGroupFieldReference(this.groupFieldGROUP0ANTERIORES);
			this.fieldPresentationMainBodyActuales.setGroupFieldReference(this.groupFieldGROUP0ACTUALES);
			this.fieldPresentationMainBodyNom.setGroupFieldReference(this.groupFieldGROUP0NOM);
			this.fieldPresentationMainBodyMon.setGroupFieldReference(this.groupFieldGROUP_MONMON);
			this.fieldPresentationMainBodyPorc_act.setGroupFieldReference(this.groupFieldGROUP0PERIODO_ACTUAL);
			this.fieldPresentationMainBodyPorc_ant.setGroupFieldReference(this.groupFieldGROUP0PERIODO_PASADO);
			this.fieldPresentationMainBodyTotal_ant.setGroupFieldReference(this.groupFieldGROUP_MONSUM_PAS);
			this.fieldPresentationMainBodyTotal_act.setGroupFieldReference(this.groupFieldGROUP_MONSUM_ACT);
			this.fieldPresentationMainBodyTot_por_act.setGroupFieldReference(this.groupFieldGROUP_MONTOT_POR_ACT);
			this.fieldPresentationMainBodyTot_por_pas.setGroupFieldReference(this.groupFieldGROUP_MONTOT_POR_PAS);
			

			this.reportChartMainBodyLayout_chart0.setFilePath("D:/Workspace_solagro/JSP7CotizacionesRep/JSP7_Cotizaciones_Rep/src/main/java/INFOPAIS_GRAPHICS.xml");
			this.reportChartMainBodyLayout_chart0.setDateFormat("dd/MM/yyyy");
			
			PageNumbering pageNumberingfieldPresentationMainMarginLayout_field1 = new PageNumbering(true,true,true,1,1,null);
			this.fieldPresentationMainMarginLayout_field1.setPageNumbering(pageNumberingfieldPresentationMainMarginLayout_field1);

			
			PageNumbering pageNumberingfieldPresentationMainMarginLayout_field2 = new PageNumbering(true,true,true,1,1,null);
			this.fieldPresentationMainMarginLayout_field2.setPageNumbering(pageNumberingfieldPresentationMainMarginLayout_field2);

			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterperiodo);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterempresa);

			this.addLayoutTextVariables();
			this.addColumnInformation();
			this.addRecordGroupsToServer();
			this.addFormulaInFormula();
			this.addFormulaInGroup();
			this.addFormulaInLayout();
			this.setExecutedInit(true);

			this.parameterPeriodo.setQueryParameter(true);
			this.parameterEmpresa.setQueryParameter(true);
		} catch(Exception error) {
			throw new Exception(error);
		}
	}

	/*
	public static void main(String args[]) throws Exception {
		try {
			JReportClient report = new JReportClient("com.aspsols.cotizaciones.reportes.informeDeVentasPorPais");
			FocusManager foco = new FocusManagerImplementation();
			FocusManager.setCurrentManager(foco);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
	//*/

	public java.lang.String mes_method () {

	java.lang.String mes_nu=null;
	java.lang.String mes_no=null;
	Object object1=ASPString.substring(getField("periodo").getFieldValue(),5,6);
	mes_nu=convertTo(object1,mes_nu);
	if (isTrue(isTrue((isEquals(mes_nu,"01") )))){
		mes_no=convertTo("Enero",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"02") )))){
		mes_no=convertTo("Febrero",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"03") )))){
		mes_no=convertTo("Marzo",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"04") )))){
		mes_no=convertTo("Abril",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"05") )))){
		mes_no=convertTo("Mayo",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"06") )))){
		mes_no=convertTo("Junio",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"07") )))){
		mes_no=convertTo("Julio",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"08") )))){
		mes_no=convertTo("Agosto",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"09") )))){
		mes_no=convertTo("Septiembre",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"10") )))){
		mes_no=convertTo("Octubre",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"11") )))){
		mes_no=convertTo("Noviembre",mes_no);
	}else if (isTrue(isTrue((isEquals(mes_nu,"12") )))){
		mes_no=convertTo("Diciembre",mes_no);
	}
	return (java.lang.String)convertTo2(mes_no,"java.lang.String");


	}


	public java.lang.String periodo_act_method () {

	java.lang.String fec_act=null;
	Object object1=ASPString.substring(getField("presente").getFieldValue(),1,4);
	fec_act=convertTo(object1,fec_act);
	return (java.lang.String)convertTo2(fec_act,"java.lang.String");


	}


	public java.lang.String periodo_pas_method () {

	java.lang.String fec_pas=null;
	Object object1=ASPString.substring(getField("pasadas").getFieldValue(),1,4);
	fec_pas=convertTo(object1,fec_pas);
	return (java.lang.String)convertTo2(fec_pas,"java.lang.String");


	}


	public java.lang.Boolean REPEATING_FRAME0_formatEvent () {

	if (isTrue(isEquals(ASPMath.mod(getField("color_reg").getFieldValue(),2),0) )){
		setForegroundFillColor("r238g238b238");
	}else {
		setForegroundFillColor("white");
	}
	return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");


	}


	public java.lang.Double periodo_actual_method () {

	java.lang.Double porc=null;
	if (isTrue(notEquals(getField("actuales").getFieldValue(),0) && notEquals(getField("sum_act").getFieldValue(),0) )){
		Object object1=ASPMath.round(multiply ((divide (getField("actuales").getFieldValue(),getField("sum_act").getFieldValue())),100),2);
		porc=convertTo(object1,porc);
	}else {
		porc=convertTo(0,porc);
	}
	return (java.lang.Double)convertTo2(porc,"java.lang.Double");


	}


	public java.lang.Double periodo_pasado_method () {

	java.lang.Double porc=null;
	if (isTrue(notEquals(getField("anteriores").getFieldValue(),0) && notEquals(getField("sum_pas").getFieldValue(),0) )){
		Object object1=ASPMath.round(multiply ((divide (getField("anteriores").getFieldValue(),getField("sum_pas").getFieldValue())),100),2);
		porc=convertTo(object1,porc);
	}else {
		porc=convertTo(0,porc);
	}
	return (java.lang.Double)convertTo2(porc,"java.lang.Double");


	}



	private void addLayoutTextVariables() {
		LayoutTextVariables ltvreportTextMainBodyT_anteriores_0 = new LayoutTextVariables("MES", "&MES");
		this.reportTextMainBodyT_anteriores.addToVectorVariables(ltvreportTextMainBodyT_anteriores_0);
		LayoutTextVariables ltvreportTextMainBodyT_anteriores_2 = new LayoutTextVariables("PERIODO_PAS", "&PERIODO_PAS");
		this.reportTextMainBodyT_anteriores.addToVectorVariables(ltvreportTextMainBodyT_anteriores_2);
		LayoutTextVariables ltvreportTextMainBodyT_actuales_0 = new LayoutTextVariables("MES", "&MES");
		this.reportTextMainBodyT_actuales.addToVectorVariables(ltvreportTextMainBodyT_actuales_0);
		LayoutTextVariables ltvreportTextMainBodyT_actuales_2 = new LayoutTextVariables("PERIODO_ACT", "&PERIODO_ACT");
		this.reportTextMainBodyT_actuales.addToVectorVariables(ltvreportTextMainBodyT_actuales_2);
		LayoutTextVariables ltvreportTextMainBodyText_graphic7_0 = new LayoutTextVariables("mon", "&mon");
		this.reportTextMainBodyText_graphic7.addToVectorVariables(ltvreportTextMainBodyText_graphic7_0);
		LayoutTextVariables ltvreportTextMainMarginText_graphic0_0 = new LayoutTextVariables("mes", "&mes");
		this.reportTextMainMarginText_graphic0.addToVectorVariables(ltvreportTextMainMarginText_graphic0_0);
		LayoutTextVariables ltvreportTextMainMarginText_graphic0_2 = new LayoutTextVariables("periodo_act", "&periodo_act");
		this.reportTextMainMarginText_graphic0.addToVectorVariables(ltvreportTextMainMarginText_graphic0_2);
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
		this.groupFieldGROUP0PERIODO_ACTUAL.addToVectorFormulaInFormula(this.groupFieldGROUP0ACTUALES);
		this.groupFieldGROUP0PERIODO_ACTUAL.addToVectorFormulaInFormula(this.groupFieldGROUP_MONSUM_ACT);
		this.groupFieldGROUP0PERIODO_PASADO.addToVectorFormulaInFormula(this.groupFieldGROUP0ANTERIORES);
		this.groupFieldGROUP0PERIODO_PASADO.addToVectorFormulaInFormula(this.groupFieldGROUP_MONSUM_PAS);
		this.groupFieldFormula_columnsMES.addToVectorFormulaInFormula(this.parameterPeriodo);
		this.groupFieldFormula_columnsPERIODO_ACT.addToVectorFormulaInFormula(this.groupFieldGROUP0PRESENTE);
		this.groupFieldFormula_columnsPERIODO_PAS.addToVectorFormulaInFormula(this.groupFieldGROUP0PASADAS);
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
		this.repetitiveFrameMainBodyRepeating_frame0.addToVectorGetters(this.groupFieldGROUP0Color_reg);
	}
}