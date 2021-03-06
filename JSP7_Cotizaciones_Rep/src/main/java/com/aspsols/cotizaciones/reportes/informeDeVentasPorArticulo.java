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

public class informeDeVentasPorArticulo extends informeDeVentasPorArticulo_class3 {

	protected ParameterForm parameterForm = new ParameterForm(0,0,440,335,new Color(191,191,191),"informeDeVentasPorArticulo");
	protected PresentationRules presentationRules = new PresentationRules();
	protected ReportFieldPresentation fieldPresentationMainBodyCod = new ReportFieldPresentation("COD",16,25,13,54,reportRegionMainBody,4,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","COD","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNom = new ReportFieldPresentation("NOM",70,25,13,169,reportRegionMainBody,3,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","NOM","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyMon = new ReportFieldPresentation("MON",289,25,13,48,reportRegionMainBody,6,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","MON","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPer_ct = new ReportFieldPresentation("PER_CT",239,25,13,50,reportRegionMainBody,5,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","PER_CT","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyVentas = new ReportFieldPresentation("VENTAS",337,25,13,58,reportRegionMainBody,7,repetitiveFrameMainBodyRepeating_frame0,"FIXED","EXPAND","VENTAS","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,8),"###,###,###,###,###,###.###","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field0 = new ReportFieldPresentation("LAYOUT_FIELD0",524,38,10,53,reportRegionMainMargin,3,null,"FIXED","FIXED","CURRENT_DATE","java.sql.Date",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),"dd/MM/yyyy","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field1 = new ReportFieldPresentation("LAYOUT_FIELD1",524,49,10,18,reportRegionMainMargin,6,null,"FIXED","FIXED","PAGE_NUMBER","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLayout_field2 = new ReportFieldPresentation("LAYOUT_FIELD2",559,49,10,18,reportRegionMainMargin,8,null,"FIXED","FIXED","TOTAL_PAGES","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	
	public informeDeVentasPorArticulo() throws Exception {
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
			this.getJreport().setPreviewerTitle("informeDeVentasPorArticulo");			
			
			this.getJreport().setParameterForm(this.parameterForm);
		    this.setJspDocument("reports/com/aspsols/cotizaciones/reportes/informeDeVentasPorArticuloParamForm.jsp");
			this.queryLogic.addQueries(this.queryQUERY0);
			this.queryQUERY0.setInitialGroup(this.groupGROUP_MON);
			this.queryQUERY0.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY0 = ASPString.splitExpression("AR.NOM,FD.COD,FE.PER_CT,FE.MON,VENTAS",",");
			String[] arrayAliasqueryQUERY0 = ASPString.splitExpression("NOM,COD,PER_CT,MON,VENTAS,",",");
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
			this.groupGROUP0.addField(this.groupFieldGROUP0COD);
			this.groupGROUP0.addField(this.groupFieldGROUP0PER_CT);
			this.groupGROUP0.addField(this.groupFieldGROUP0VENTAS);
			this.groupGROUP0.addField(this.groupFieldGROUP0Color_reg);
			this.groupFieldGROUP0Color_reg.setSource(this.groupFieldGROUP0COD);
			this.groupGROUP_MON.addField(this.groupFieldGROUP_MONMON);
			this.presentationRules.getSections().add(this.reportSectionHeader);
			this.presentationRules.getSections().add(this.reportSectionMain);
			this.presentationRules.getSections().add(this.reportSectionTrailer);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_title);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_hint);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_periodo_fin);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_periodo_ini);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_empresa);

			this.parameterForm.addToVectorGroupField(this.parameterPeriodo_fin);
			this.parameterForm.addToVectorGroupField(this.parameterPeriodo_ini);
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


			this.fieldPresentationMainBodyCod.setGroupFieldReference(this.groupFieldGROUP0COD);
			this.fieldPresentationMainBodyNom.setGroupFieldReference(this.groupFieldGROUP0NOM);
			this.fieldPresentationMainBodyMon.setGroupFieldReference(this.groupFieldGROUP_MONMON);
			this.fieldPresentationMainBodyPer_ct.setGroupFieldReference(this.groupFieldGROUP0PER_CT);
			this.fieldPresentationMainBodyVentas.setGroupFieldReference(this.groupFieldGROUP0VENTAS);
			
			PageNumbering pageNumberingfieldPresentationMainMarginLayout_field1 = new PageNumbering(true,true,true,1,1,null);
			this.fieldPresentationMainMarginLayout_field1.setPageNumbering(pageNumberingfieldPresentationMainMarginLayout_field1);

			
			PageNumbering pageNumberingfieldPresentationMainMarginLayout_field2 = new PageNumbering(true,true,true,1,1,null);
			this.fieldPresentationMainMarginLayout_field2.setPageNumbering(pageNumberingfieldPresentationMainMarginLayout_field2);

			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterperiodo_fin);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterperiodo_ini);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterempresa);

			this.addLayoutTextVariables();
			this.addColumnInformation();
			this.addRecordGroupsToServer();
			this.addFormulaInFormula();
			this.addFormulaInGroup();
			this.addFormulaInLayout();
			this.setExecutedInit(true);

			this.parameterEmpresa.setQueryParameter(true);
			this.parameterPeriodo_ini.setQueryParameter(true);
			this.parameterPeriodo_fin.setQueryParameter(true);
		} catch(Exception error) {
			throw new Exception(error);
		}
	}

	/*
	public static void main(String args[]) throws Exception {
		try {
			JReportClient report = new JReportClient("com.aspsols.cotizaciones.reportes.informeDeVentasPorArticulo");
			FocusManager foco = new FocusManagerImplementation();
			FocusManager.setCurrentManager(foco);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
	//*/

	public java.lang.Boolean REPEATING_FRAME0_formatEvent () {

	if (isTrue(isEquals(ASPMath.mod(getField("color_reg").getFieldValue(),2),0) )){
		setForegroundFillColor("r238g238b238");
	}else {
		setForegroundFillColor("white");
	}
	return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");


	}



	private void addLayoutTextVariables() {
		LayoutTextVariables ltvreportTextMainMarginText_graphic0_0 = new LayoutTextVariables("periodo_ini", "&periodo_ini");
		this.reportTextMainMarginText_graphic0.addToVectorVariables(ltvreportTextMainMarginText_graphic0_0);
		LayoutTextVariables ltvreportTextMainMarginText_graphic0_2 = new LayoutTextVariables("periodo_fin", "&periodo_fin");
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