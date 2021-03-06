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

public class informeDeVentasPorEmpresa extends informeDeVentasPorEmpresa_class3 {

	protected ParameterForm parameterForm = new ParameterForm(0,0,425,355,new Color(191,191,191),"informeDeVentasPorEmpresa");
	protected PresentationRules presentationRules = new PresentationRules();
	protected ReportFieldPresentation fieldPresentationMainBodyLayout_field1 = new ReportFieldPresentation("LAYOUT_FIELD1",23,11,12,120,reportRegionMainBody,7,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","NOM_EMP","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPorcentaje = new ReportFieldPresentation("porcentaje",413,11,12,37,reportRegionMainBody,6,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","PORCENTAJE","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",4,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyLayout_field2 = new ReportFieldPresentation("LAYOUT_FIELD2",143,11,12,39,reportRegionMainBody,9,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","MONEDA","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodySum_round_fd_can_fd_ven_2_ = new ReportFieldPresentation("SUM_ROUND_FD_CAN_FD_VEN_2_",182,11,12,54,reportRegionMainBody,8,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","ACTUAL","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###,###,###,###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyLayout_field3 = new ReportFieldPresentation("LAYOUT_FIELD3",236,11,12,58,reportRegionMainBody,15,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","VENTAS_AC","java.lang.Double",true,0,new Color(255,255,255),"Default,1,(0,0,0)",2,new Color(0,0,0),new Font("Arial",0,7),"###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyLayout_field4 = new ReportFieldPresentation("LAYOUT_FIELD4",294,11,12,59,reportRegionMainBody,16,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","PASADO","java.lang.String",true,0,new Color(255,255,255),"Default,1,(0,0,0)",2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyLayout_field5 = new ReportFieldPresentation("LAYOUT_FIELD5",353,11,12,60,reportRegionMainBody,17,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","VENTAS_PA","java.lang.Double",true,0,new Color(255,255,255),"Default,1,(0,0,0)",2,new Color(0,0,0),new Font("Arial",0,7),"###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field0 = new ReportFieldPresentation("LAYOUT_FIELD0",438,36,10,53,reportRegionMainMargin,1,null,"FIXED","FIXED","CURRENT_DATE","java.sql.Date",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),"dd/MM/yyyy","DEFAULT",false,false,false,false,null,0,false,-1);
	
	public informeDeVentasPorEmpresa() throws Exception {
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
			this.getJreport().setPreviewerTitle("informeDeVentasPorEmpresa");			
			
			this.getJreport().setParameterForm(this.parameterForm);
		    this.setJspDocument("reports/com/aspsols/cotizaciones/reportes/informeDeVentasPorEmpresaParamForm.jsp");
			this.queryLogic.addQueries(this.queryQUERY0);
			this.queryQUERY0.setInitialGroup(this.groupGROUP_MONEDA);
			this.queryQUERY0.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY0 = ASPString.splitExpression("EMPRESA,MONEDA,ACTUAL,VENTAS_AC,PASADO,VENTAS_PA",",");
			String[] arrayAliasqueryQUERY0 = ASPString.splitExpression("EMPRESA1,MONEDA,ACTUAL,VENTAS_AC,PASADO,VENTAS_PA,",",");
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

			this.groupGROUP_MONEDA.addChildGroup(this.groupGROUP0);
			this.groupGROUP_MONEDA.addField(this.groupFieldGROUP_MONEDAMONEDA);
			
			this.groupGROUP0.addField(this.groupFieldGROUP0EMPRESA1);
			this.groupGROUP0.addField(this.groupFieldGROUP0ACTUAL);
			this.groupGROUP0.addField(this.groupFieldGROUP0VENTAS_AC);
			this.groupGROUP0.addField(this.groupFieldGROUP0PASADO);
			this.groupGROUP0.addField(this.groupFieldGROUP0VENTAS_PA);
			this.groupGROUP0.addField(this.groupFieldGROUP0PORCENTAJE);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPorcentaje_total);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsNOM_EMP);
			this.presentationRules.getSections().add(this.reportSectionHeader);
			this.presentationRules.getSections().add(this.reportSectionMain);
			this.presentationRules.getSections().add(this.reportSectionTrailer);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicRECTANGLE0);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicRECTANGLE1);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_title);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_periodo);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicTEXT_GRAPHIC0);

			this.parameterForm.addToVectorGroupField(this.parameterEmpresa);
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


			this.fieldPresentationMainBodyLayout_field1.setGroupFieldReference(this.groupFieldFormula_columnsNOM_EMP);
			this.fieldPresentationMainBodyPorcentaje.setGroupFieldReference(this.groupFieldGROUP0PORCENTAJE);
			this.fieldPresentationMainBodyLayout_field2.setGroupFieldReference(this.groupFieldGROUP_MONEDAMONEDA);
			this.fieldPresentationMainBodySum_round_fd_can_fd_ven_2_.setGroupFieldReference(this.groupFieldGROUP0ACTUAL);
			this.fieldPresentationMainBodyLayout_field3.setGroupFieldReference(this.groupFieldGROUP0VENTAS_AC);
			this.fieldPresentationMainBodyLayout_field4.setGroupFieldReference(this.groupFieldGROUP0PASADO);
			this.fieldPresentationMainBodyLayout_field5.setGroupFieldReference(this.groupFieldGROUP0VENTAS_PA);
			

			this.reportChartMainBodyLayout_chart0.setFilePath("D:/Workspace_solagro/JSP7CotizacionesRep/JSP7_Cotizaciones_Rep/src/main/java/INFORMEEMPRESA_GRAPHICS.xml");
			this.reportChartMainBodyLayout_chart0.setDateFormat("dd/MM/yyyy");
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
			JReportClient report = new JReportClient("com.aspsols.cotizaciones.reportes.informeDeVentasPorEmpresa");
			FocusManager foco = new FocusManagerImplementation();
			FocusManager.setCurrentManager(foco);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
	//*/

	public void porcentaje_ganancia () {

	}


	public java.lang.Double porcentaje_total_method () {

	java.lang.Double valor_periodo1=null;
	java.lang.Double valor_periodo2=null;
	java.lang.Double valor_porcentaje=null;
	try{
		java.lang.String sqlCommand1="SELECT SUM(round(fd.can * fd.ven,2)) ";
		sqlCommand1+=" FROM fac_det fd, fac_enc fe ";
		sqlCommand1+="WHERE fe.fac=fd.fac AND fe.c_emp=fd.c_emp  AND fe.c_agr=fd.c_agr  AND fe.n_ide=fd.n_ide  AND fe.est='A'  AND substr(fe.per_ct,1,4)=#parameterPeriodo   ";
		sqlCommand1+="GROUP BY substr(fe.per_ct,1,4) ";
		//Generated vector to hold the arguments.
		Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
		SqlParameter sqlParameter1=new SqlParameter("parameterPeriodo",getField("periodo").getFieldValue());
		arguments1.add(sqlParameter1);
		Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
		setRowsAffected(resulSet1.size());
		if (resulSet1.size()==0){
			throw new NoDataFoundException("No Data found.");
		} else if (resulSet1.size()>1){
			throw new TooManyRows("Too many Rows.");
		}
		valor_periodo1=(java.lang.Double)convertTo2(((Vector)resulSet1.get(0)).get(0),"java.lang.Double");
	} catch(NoDataFoundException expt1){
		valor_periodo1=null;
	}
	try{
		java.lang.String sqlCommand2="SELECT SUM(round(fd.can * fd.ven,2)) ";
		sqlCommand2+=" FROM fac_det fd, fac_enc fe ";
		sqlCommand2+="WHERE fe.fac=fd.fac AND fe.c_emp=fd.c_emp  AND fe.c_agr=fd.c_agr  AND fe.n_ide=fd.n_ide  AND fe.est='A'  AND substr(fe.per_ct,1,4)=(substr(#parameterPeriodo ,1,4) - 1)  ";
		sqlCommand2+="GROUP BY substr(fe.per_ct,1,4) ";
		//Generated vector to hold the arguments.
		Vector<SqlParameter> arguments2=new Vector<SqlParameter>();
		SqlParameter sqlParameter2=new SqlParameter("parameterPeriodo",getField("periodo").getFieldValue());
		arguments2.add(sqlParameter2);
		Vector resulSet2=getDAOObject().getRecords(sqlCommand2,arguments2);
		setRowsAffected(resulSet2.size());
		if (resulSet2.size()==0){
			throw new NoDataFoundException("No Data found.");
		} else if (resulSet2.size()>1){
			throw new TooManyRows("Too many Rows.");
		}
		valor_periodo2=(java.lang.Double)convertTo2(((Vector)resulSet2.get(0)).get(0),"java.lang.Double");
		valor_porcentaje=convertTo(divide ((multiply (valor_periodo1,100)),valor_periodo2),valor_porcentaje);
	} catch(NoDataFoundException expt2){
		valor_periodo2=null;
		valor_porcentaje=null;
	}
	Object object1=ASPMath.round(valor_porcentaje,2);
	return (java.lang.Double)convertTo2(object1,"java.lang.Double");


	}


	public java.lang.String nom_emp_method () {

	java.lang.String varemp=null;
	java.lang.String sqlCommand1="SELECT emp  AS empresa ";
	sqlCommand1+=" FROM parametros ";
	sqlCommand1+="WHERE c_emp=#parameterEmpresa  ";
	//Generated vector to hold the arguments.
	Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
	SqlParameter sqlParameter1=new SqlParameter("parameterEmpresa",getField("empresa").getFieldValue());
	arguments1.add(sqlParameter1);
	Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
	setRowsAffected(resulSet1.size());
	if (resulSet1.size()==0){
		throw new NoDataFoundException("No Data found.");
	} else if (resulSet1.size()>1){
		throw new TooManyRows("Too many Rows.");
	}
	varemp=(java.lang.String)convertTo2(((Vector)resulSet1.get(0)).get(0),"java.lang.String");
	return (java.lang.String)convertTo2(varemp,"java.lang.String");


	}


	public java.lang.Double porcentaje_method () {

	java.lang.Double porc=null;
	if (isTrue(notEquals(getField("ventas_ac").getFieldValue(),0) && notEquals(getField("ventas_pa").getFieldValue(),0) )){
		Object object1=ASPMath.round(multiply ((divide (getField("ventas_ac").getFieldValue(),getField("ventas_pa").getFieldValue())),100),2);
		porc=convertTo(object1,porc);
	}else {
		porc=convertTo(0,porc);
	}
	return (java.lang.Double)convertTo2(porc,"java.lang.Double");


	}



	private void addLayoutTextVariables() {
		LayoutTextVariables ltvreportTextMainBodyText_graphic5_0 = new LayoutTextVariables("mon", "&mon");
		this.reportTextMainBodyText_graphic5.addToVectorVariables(ltvreportTextMainBodyText_graphic5_0);
		LayoutTextVariables ltvreportTextMainMarginText_graphic4_0 = new LayoutTextVariables("periodo", "&periodo");
		this.reportTextMainMarginText_graphic4.addToVectorVariables(ltvreportTextMainMarginText_graphic4_0);
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
		this.groupFieldGROUP0PORCENTAJE.addToVectorFormulaInFormula(this.groupFieldGROUP0VENTAS_AC);
		this.groupFieldGROUP0PORCENTAJE.addToVectorFormulaInFormula(this.groupFieldGROUP0VENTAS_PA);
		this.groupFieldFormula_columnsPorcentaje_total.addToVectorFormulaInFormula(this.parameterPeriodo);
		this.groupFieldFormula_columnsNOM_EMP.addToVectorFormulaInFormula(this.parameterEmpresa);
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