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

	protected ParameterForm parameterForm = new ParameterForm(0,0,292,250,new Color(191,191,191),"informeDeVentasPorEmpresa");
	protected PresentationRules presentationRules = new PresentationRules();
	protected ReportFieldPresentation fieldPresentationMainBodyTotales = new ReportFieldPresentation("totales",202,46,10,62,reportRegionMainBody,4,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","SUM_SUMA_","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###,###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPeriodo = new ReportFieldPresentation("periodo",202,36,10,62,reportRegionMainBody,5,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","PERIODO1","java.lang.String",true,0,new Color(0,51,153),"Default,1,(0,0,0)",0,new Color(255,255,255),new Font("Arial",1,8),null,"DEFAULT",false,false,true,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyMoneda = new ReportFieldPresentation("moneda",153,46,10,49,reportRegionMainBody,6,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","MON","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPorcentaje = new ReportFieldPresentation("porcentaje",264,46,10,43,reportRegionMainBody,7,repetitiveFrameMainBodyRepeating_frame0,"FIXED","FIXED","porcentaje_total","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field0 = new ReportFieldPresentation("LAYOUT_FIELD0",525,33,10,51,reportRegionMainMargin,1,null,"FIXED","FIXED","CURRENT_DATE","java.util.Date",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,8),"dd/MM/YYYY","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field1 = new ReportFieldPresentation("LAYOUT_FIELD1",522,45,10,20,reportRegionMainMargin,7,null,"FIXED","FIXED","PAGE_NUMBER","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field2 = new ReportFieldPresentation("LAYOUT_FIELD2",557,45,10,20,reportRegionMainMargin,8,null,"FIXED","FIXED","TOTAL_PAGES","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	
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
			this.queryQUERY0.setInitialGroup(this.groupGROUP_MON);
			this.queryQUERY0.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY0 = ASPString.splitExpression("PERIODO,SUM(SUMA),MON",",");
			String[] arrayAliasqueryQUERY0 = ASPString.splitExpression("PERIODO1,SUM_SUMA_,MON,",",");
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
			this.groupGROUP_MON.addField(this.groupFieldGROUP_MONMON);
			
			this.groupGROUP0.addField(this.groupFieldGROUP0PERIODO1);
			this.groupGROUP0.addField(this.groupFieldGROUP0SUM_SUMA_);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPorcentaje_total);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPeriodofin);
			this.presentationRules.getSections().add(this.reportSectionHeader);
			this.presentationRules.getSections().add(this.reportSectionMain);
			this.presentationRules.getSections().add(this.reportSectionTrailer);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicRECTANGLE0);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicRECTANGLE1);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicROUNDED_RECTANGLE0);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicTEXT_GRAPHIC0);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicTEXT_GRAPHIC1);

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


			this.fieldPresentationMainBodyTotales.setGroupFieldReference(this.groupFieldGROUP0SUM_SUMA_);
			this.fieldPresentationMainBodyPeriodo.setGroupFieldReference(this.groupFieldGROUP0PERIODO1);
			this.fieldPresentationMainBodyMoneda.setGroupFieldReference(this.groupFieldGROUP_MONMON);
			this.fieldPresentationMainBodyPorcentaje.setGroupFieldReference(this.groupFieldFormula_columnsPorcentaje_total);
			
			PageNumbering pageNumberingfieldPresentationMainMarginLayout_field1 = new PageNumbering(true,true,true,1,1,null);
			this.fieldPresentationMainMarginLayout_field1.setPageNumbering(pageNumberingfieldPresentationMainMarginLayout_field1);

			
			PageNumbering pageNumberingfieldPresentationMainMarginLayout_field2 = new PageNumbering(true,true,true,1,1,null);
			this.fieldPresentationMainMarginLayout_field2.setPageNumbering(pageNumberingfieldPresentationMainMarginLayout_field2);

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


	public java.lang.String periodofin_method () {

	java.lang.String periodo_fin=null;
	periodo_fin=convertTo(substract (getField("periodo").getFieldValue(),1),periodo_fin);
	return (java.lang.String)convertTo2(periodo_fin,"java.lang.String");


	}



	private void addLayoutTextVariables() {
		LayoutTextVariables ltvreportTextMainMarginTitle_0 = new LayoutTextVariables("periodo", "&periodo");
		this.reportTextMainMarginTitle.addToVectorVariables(ltvreportTextMainMarginTitle_0);
		LayoutTextVariables ltvreportTextMainMarginTitle_2 = new LayoutTextVariables("periodofin", "&periodofin");
		this.reportTextMainMarginTitle.addToVectorVariables(ltvreportTextMainMarginTitle_2);
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
		this.groupFieldFormula_columnsPorcentaje_total.addToVectorFormulaInFormula(this.parameterPeriodo);
		this.groupFieldFormula_columnsPeriodofin.addToVectorFormulaInFormula(this.parameterPeriodo);
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