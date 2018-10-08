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

public class Cotizaciones_Print extends Cotizaciones_Print_class3 {

	protected ParameterForm parameterForm = new ParameterForm(0,0,600,400,new Color(191,191,191),"Cotizaciones_Print");
	protected PresentationRules presentationRules = new PresentationRules();
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_cliente = new ReportFieldPresentation("NOMBRE_CLIENTE",0,12,10,175,reportRegionMainBody,3,reportFrameMainBodyDatos_cliente,"FIXED","EXPAND","NOMBRE_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDir_cliente = new ReportFieldPresentation("DIR_CLIENTE",0,22,10,175,reportRegionMainBody,5,reportFrameMainBodyDatos_cliente,"FIXED","FIXED","DIR_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTel_cliente = new ReportFieldPresentation("TEL_CLIENTE",0,32,10,175,reportRegionMainBody,6,reportFrameMainBodyDatos_cliente,"FIXED","FIXED","TEL_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyEmail_cliente = new ReportFieldPresentation("EMAIL_CLIENTE",0,42,10,175,reportRegionMainBody,7,reportFrameMainBodyDatos_cliente,"FIXED","FIXED","EMAIL_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyUbicacion_cliente = new ReportFieldPresentation("UBICACION_CLIENTE",0,52,10,175,reportRegionMainBody,8,reportFrameMainBodyDatos_cliente,"FIXED","EXPAND","UBICACION_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyEmi = new ReportFieldPresentation("EMI",51,96,10,144,reportRegionMainBody,13,reportFrameMainBodyEncabezado_cot,"FIXED","EXPAND","EMI","java.sql.Date",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),"dd-MMM-yy","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyOrigen = new ReportFieldPresentation("ORIGEN",58,126,10,137,reportRegionMainBody,14,reportFrameMainBodyEncabezado_cot,"FIXED","EXPAND","ORIGEN","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDias_validez = new ReportFieldPresentation("DIAS_VALIDEZ",128,106,10,67,reportRegionMainBody,22,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","DIAS_VALIDEZ","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyEmbalaje = new ReportFieldPresentation("EMBALAJE",75,116,10,120,reportRegionMainBody,23,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","NOMBRE_EMBALAJE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyMoneda = new ReportFieldPresentation("MONEDA",397,96,10,145,reportRegionMainBody,27,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","MONEDA_TEXTO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDestino = new ReportFieldPresentation("DESTINO",421,106,10,121,reportRegionMainBody,31,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","DESTINO_NOMBRE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDespacho = new ReportFieldPresentation("DESPACHO",79,136,10,116,reportRegionMainBody,85,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","DESPACHO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTermino_pago = new ReportFieldPresentation("TERMINO_PAGO",133,146,10,409,reportRegionMainBody,88,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","TERMINO_PAGO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_seccion = new ReportFieldPresentation("NOMBRE_SECCION",0,72,13,80,reportRegionMainBody,34,repetitiveFrameMainBodySecciones_pre,"EXPAND","FIXED","NOMBRE_SECCION","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDescripcion_seccion = new ReportFieldPresentation("DESCRIPCION_SECCION",80,72,13,462,reportRegionMainBody,35,repetitiveFrameMainBodySecciones_pre,"FIXED","EXPAND","DESCRIPCION","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodySubtotal = new ReportFieldPresentation("SUBTOTAL",444,253,9,98,reportRegionMainBody,52,repetitiveFrameMainBodyDetalle,"FIXED","FIXED","Subtotal","java.lang.Double",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_articulo = new ReportFieldPresentation("NOMBRE_ARTICULO",63,253,9,128,reportRegionMainBody,53,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","NOMBRE_ARTICULO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCod = new ReportFieldPresentation("COD",0,253,9,63,reportRegionMainBody,54,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","COD","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyUnidad = new ReportFieldPresentation("UNIDAD",191,253,9,47,reportRegionMainBody,55,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","UNIDAD","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCan = new ReportFieldPresentation("CAN",238,253,9,60,reportRegionMainBody,56,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","CAN","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyVen1 = new ReportFieldPresentation("VEN1",298,253,9,78,reportRegionMainBody,57,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","VEN1","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyIva1 = new ReportFieldPresentation("IVA1",376,253,9,68,reportRegionMainBody,58,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","IVA1","java.lang.Double",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyBru = new ReportFieldPresentation("BRU",436,266,9,106,reportRegionMainBody,67,reportFrameMainBodyTotales,"FIXED","EXPAND","BRU","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDes = new ReportFieldPresentation("DES",436,275,9,106,reportRegionMainBody,68,reportFrameMainBodyTotales,"FIXED","EXPAND","DES","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyMer = new ReportFieldPresentation("MER",436,284,9,106,reportRegionMainBody,69,reportFrameMainBodyTotales,"FIXED","EXPAND","MER","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyIva = new ReportFieldPresentation("IVA",436,293,9,106,reportRegionMainBody,70,reportFrameMainBodyTotales,"FIXED","EXPAND","IVA","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTot = new ReportFieldPresentation("TOT",436,302,9,106,reportRegionMainBody,71,reportFrameMainBodyTotales,"FIXED","EXPAND","TOT","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCostos_adic = new ReportFieldPresentation("COSTOS_ADIC",436,311,9,106,reportRegionMainBody,72,reportFrameMainBodyTotales,"FIXED","EXPAND","COSTOS_ADIC","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTotd = new ReportFieldPresentation("TOTD",436,320,9,106,reportRegionMainBody,73,reportFrameMainBodyTotales,"FIXED","EXPAND","TOTD","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_sec_enc = new ReportFieldPresentation("NOMBRE_SEC_ENC",86,199,13,359,reportRegionMainBody,77,repetitiveFrameMainBodySecciones_enc,"FIXED","FIXED","NOMBRE_SECCION1","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDesc_sec_enc = new ReportFieldPresentation("DESC_SEC_ENC",86,215,13,359,reportRegionMainBody,78,repetitiveFrameMainBodySecciones_enc,"FIXED","EXPAND","DESCRIPCION1","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_sec_pie = new ReportFieldPresentation("NOMBRE_SEC_PIE",86,334,13,359,reportRegionMainBody,81,repetitiveFrameMainBodySecciones_pie,"FIXED","FIXED","NOMBRE_SECCION2","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDesc_sec_pie = new ReportFieldPresentation("DESC_SEC_PIE",86,350,13,359,reportRegionMainBody,82,repetitiveFrameMainBodySecciones_pie,"FIXED","FIXED","DESCRIPCION2","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNom_articulo = new ReportFieldPresentation("NOM_ARTICULO",86,164,13,359,reportRegionMainBody,91,repetitiveFrameMainBodyDesc_det,"FIXED","FIXED","NOM_ARTICULO","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDesc_comercial = new ReportFieldPresentation("DESC_COMERCIAL",86,180,13,359,reportRegionMainBody,92,repetitiveFrameMainBodyDesc_det,"FIXED","EXPAND","INF7","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLogo_emp = new ReportFieldPresentation("LOGO_EMP",34,7,55,152,reportRegionMainMargin,0,null,"FIXED","FIXED","LOGO_EMP","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	
	public Cotizaciones_Print() throws Exception {
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
			this.getJreport().setPreviewerTitle("Cotizaciones_Print");			
			
			this.getJreport().setParameterForm(this.parameterForm);
		    this.setJspDocument("reports/com/aspsols/cotizaciones/reportes/Cotizaciones_PrintParamForm.jsp");
			this.queryLogic.addQueries(this.queryQUERY0);
			this.queryQUERY0.setInitialGroup(this.groupGROUP_ENCABEZADO);
			this.queryQUERY0.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY0 = ASPString.splitExpression("E.C_EMP,E.PER,E.C_AGR,E.COT,E.REV,E.N_IDE,E.COD_SUC,E.EMI,E.VEN,E.BRU,E.DES,E.MER,E.IVA,E.TOT,E.COSTOS_ADIC,E.TOTD,E.MON,E.TASA,E.C_VEN,E.COD_INCOTERM,E.IDIOMA,E.ORIGEN,DESTINO,E.COD_EMB,E.ZONA,D.COD,D.UNIDAD,D.CAN,D.VEN,D.IVA,E.DESPACHO,E.TERMINO_PAGO",",");
			String[] arrayAliasqueryQUERY0 = ASPString.splitExpression("C_EMP1,PER1,C_AGR1,COT1,REV1,N_IDE,COD_SUC,EMI,VEN,BRU,DES,MER,IVA,TOT,COSTOS_ADIC,TOTD,MON,TASA,C_VEN,COD_INCOTERM,IDIOMA,ORIGEN,DESTINO,COD_EMB,ZONA,COD,UNIDAD,CAN,VEN1,IVA1,DESPACHO,TERMINO_PAGO,",",");
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

			this.queryLogic.addQueries(this.queryQUERY1);
			this.queryQUERY1.setInitialGroup(this.groupSECCIONES_PRE);
			this.queryQUERY1.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY1 = ASPString.splitExpression("S.C_EMP,S.PER,S.C_AGR,S.COT,S.REV,S.COD_SECCION,S.DESCRIPCION,NOMBRE_SECCION",",");
			String[] arrayAliasqueryQUERY1 = ASPString.splitExpression("C_EMP2,PER2,C_AGR2,COT2,REV2,COD_SECCION,DESCRIPCION,NOMBRE_SECCION,",",");
			for(int k=0;k<arrayColumnsqueryQUERY1.length;k++){
				boolean insertqueryQUERY1 = true;
				SelectColumns queryQUERY1SelectColumns = new SelectColumns();
				if(!arrayColumnsqueryQUERY1[k].equals("null")){
					queryQUERY1SelectColumns.setColumnName(arrayColumnsqueryQUERY1[k]);
				}
				if(!arrayAliasqueryQUERY1[k].equals("null")){
					queryQUERY1SelectColumns.setColumnAlias(arrayAliasqueryQUERY1[k]);
					insertqueryQUERY1 = false;
					this.queryQUERY1.getColumnsName().add(arrayAliasqueryQUERY1[k]);
				}else{
					queryQUERY1SelectColumns.setColumnAlias(arrayColumnsqueryQUERY1[k]);
				}
				if(insertqueryQUERY1){
					this.queryQUERY1.getColumnsName().add(arrayColumnsqueryQUERY1[k]);
				}
				this.queryQUERY1.getColumns().add(queryQUERY1SelectColumns);
			}

			this.queryLogic.addQueries(this.queryQUERY2);
			this.queryQUERY2.setInitialGroup(this.groupSECCIONES_ENC);
			this.queryQUERY2.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY2 = ASPString.splitExpression("S.C_EMP,S.PER,S.C_AGR,S.COT,S.REV,S.COD_SECCION,S.DESCRIPCION,NOMBRE_SECCION",",");
			String[] arrayAliasqueryQUERY2 = ASPString.splitExpression("C_EMP3,PER3,C_AGR3,COT3,REV3,COD_SECCION1,DESCRIPCION1,NOMBRE_SECCION1,",",");
			for(int k=0;k<arrayColumnsqueryQUERY2.length;k++){
				boolean insertqueryQUERY2 = true;
				SelectColumns queryQUERY2SelectColumns = new SelectColumns();
				if(!arrayColumnsqueryQUERY2[k].equals("null")){
					queryQUERY2SelectColumns.setColumnName(arrayColumnsqueryQUERY2[k]);
				}
				if(!arrayAliasqueryQUERY2[k].equals("null")){
					queryQUERY2SelectColumns.setColumnAlias(arrayAliasqueryQUERY2[k]);
					insertqueryQUERY2 = false;
					this.queryQUERY2.getColumnsName().add(arrayAliasqueryQUERY2[k]);
				}else{
					queryQUERY2SelectColumns.setColumnAlias(arrayColumnsqueryQUERY2[k]);
				}
				if(insertqueryQUERY2){
					this.queryQUERY2.getColumnsName().add(arrayColumnsqueryQUERY2[k]);
				}
				this.queryQUERY2.getColumns().add(queryQUERY2SelectColumns);
			}

			this.queryLogic.addQueries(this.queryQUERY3);
			this.queryQUERY3.setInitialGroup(this.groupSECCIONES_PIE);
			this.queryQUERY3.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY3 = ASPString.splitExpression("S.C_EMP,S.PER,S.C_AGR,S.COT,S.REV,S.COD_SECCION,S.DESCRIPCION,NOMBRE_SECCION",",");
			String[] arrayAliasqueryQUERY3 = ASPString.splitExpression("C_EMP4,PER4,C_AGR4,COT4,REV4,COD_SECCION2,DESCRIPCION2,NOMBRE_SECCION2,",",");
			for(int k=0;k<arrayColumnsqueryQUERY3.length;k++){
				boolean insertqueryQUERY3 = true;
				SelectColumns queryQUERY3SelectColumns = new SelectColumns();
				if(!arrayColumnsqueryQUERY3[k].equals("null")){
					queryQUERY3SelectColumns.setColumnName(arrayColumnsqueryQUERY3[k]);
				}
				if(!arrayAliasqueryQUERY3[k].equals("null")){
					queryQUERY3SelectColumns.setColumnAlias(arrayAliasqueryQUERY3[k]);
					insertqueryQUERY3 = false;
					this.queryQUERY3.getColumnsName().add(arrayAliasqueryQUERY3[k]);
				}else{
					queryQUERY3SelectColumns.setColumnAlias(arrayColumnsqueryQUERY3[k]);
				}
				if(insertqueryQUERY3){
					this.queryQUERY3.getColumnsName().add(arrayColumnsqueryQUERY3[k]);
				}
				this.queryQUERY3.getColumns().add(queryQUERY3SelectColumns);
			}

			this.queryLogic.addQueries(this.queryQUERY4);
			this.queryQUERY4.setInitialGroup(this.groupDESCRIPCIONES_DETALLE);
			this.queryQUERY4.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY4 = ASPString.splitExpression("C.C_EMP,C.COT,C.REV,C.C_AGR,C.PER,C.COD,C.INF7,NOM_ARTICULO",",");
			String[] arrayAliasqueryQUERY4 = ASPString.splitExpression("C_EMP5,COT5,REV5,C_AGR5,PER5,COD1,INF7,NOM_ARTICULO,",",");
			for(int k=0;k<arrayColumnsqueryQUERY4.length;k++){
				boolean insertqueryQUERY4 = true;
				SelectColumns queryQUERY4SelectColumns = new SelectColumns();
				if(!arrayColumnsqueryQUERY4[k].equals("null")){
					queryQUERY4SelectColumns.setColumnName(arrayColumnsqueryQUERY4[k]);
				}
				if(!arrayAliasqueryQUERY4[k].equals("null")){
					queryQUERY4SelectColumns.setColumnAlias(arrayAliasqueryQUERY4[k]);
					insertqueryQUERY4 = false;
					this.queryQUERY4.getColumnsName().add(arrayAliasqueryQUERY4[k]);
				}else{
					queryQUERY4SelectColumns.setColumnAlias(arrayColumnsqueryQUERY4[k]);
				}
				if(insertqueryQUERY4){
					this.queryQUERY4.getColumnsName().add(arrayColumnsqueryQUERY4[k]);
				}
				this.queryQUERY4.getColumns().add(queryQUERY4SelectColumns);
			}

			this.groupGROUP_ENCABEZADO.addChildGroup(this.groupGROUP_DETALLE);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupDESCRIPCIONES_DETALLE);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupSECCIONES_PIE);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupSECCIONES_ENC);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupSECCIONES_PRE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOC_EMP1);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPER1);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOC_AGR1);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOCOT1);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOREV1);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADON_IDE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOCOD_SUC);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOEMI);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOVEN);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOBRU);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADODES);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOMER);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOIVA);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOTOT);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOCOSTOS_ADIC);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOTOTD);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOMON);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOTASA);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOC_VEN);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOCOD_INCOTERM);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOORIGEN);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADODESTINO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOCOD_EMB);
			
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLECOD);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEUNIDAD);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLECAN);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEVEN1);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEIVA1);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLESubtotal);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEColor_reg);
			this.groupFieldGROUP_DETALLEColor_reg.setSource(this.groupFieldGROUP_DETALLECOD);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLENOMBRE_ARTICULO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOZONA);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADONOMBRE_CLIENTE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADODIR_CLIENTE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOTEL_CLIENTE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOUBICACION_CLIENTE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOEMAIL_CLIENTE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADODIAS_VALIDEZ);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOMONEDA_TEXTO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE);
			
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEC_EMP5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLECOT5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEREV5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEC_AGR5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEPER5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLECOD1);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEINF7);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLENOM_ARTICULO);
			
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIEC_EMP4);
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIEPER4);
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIEC_AGR4);
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIECOT4);
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIEREV4);
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIECOD_SECCION2);
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIEDESCRIPCION2);
			this.groupSECCIONES_PIE.addField(this.groupFieldSECCIONES_PIENOMBRE_SECCION2);
			
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCC_EMP3);
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCPER3);
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCC_AGR3);
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCCOT3);
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCREV3);
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCCOD_SECCION1);
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCDESCRIPCION1);
			this.groupSECCIONES_ENC.addField(this.groupFieldSECCIONES_ENCNOMBRE_SECCION1);
			
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PREC_EMP2);
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PREPER2);
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PREC_AGR2);
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PRECOT2);
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PREREV2);
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PRECOD_SECCION);
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PREDESCRIPCION);
			this.groupSECCIONES_PRE.addField(this.groupFieldSECCIONES_PRENOMBRE_SECCION);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOIDIOMA);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADODESPACHO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOTERMINO_PAGO);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPARAMETROS);
			this.queryLogic.addToFields(this.groupFieldPlaceholder_columnsLOGO_EMP);
			this.queryLogic.addDataLink(this.dataLinkLINK0);
			this.queryLogic.addDataLink(this.dataLinkLINK1);
			this.queryLogic.addDataLink(this.dataLinkLINK2);
			this.queryLogic.addDataLink(this.dataLinkLINK3);
			this.queryLogic.addDataLink(this.dataLinkLINK4);
			this.queryLogic.addDataLink(this.dataLinkLINK5);
			this.queryLogic.addDataLink(this.dataLinkLINK6);
			this.queryLogic.addDataLink(this.dataLinkLINK7);
			this.queryLogic.addDataLink(this.dataLinkLINK8);
			this.queryLogic.addDataLink(this.dataLinkLINK9);
			this.queryLogic.addDataLink(this.dataLinkLINK10);
			this.queryLogic.addDataLink(this.dataLinkLINK11);
			this.queryLogic.addDataLink(this.dataLinkLINK12);
			this.queryLogic.addDataLink(this.dataLinkLINK13);
			this.queryLogic.addDataLink(this.dataLinkLINK14);
			this.queryLogic.addDataLink(this.dataLinkLINK15);
			this.queryLogic.addDataLink(this.dataLinkLINK16);
			this.queryLogic.addDataLink(this.dataLinkLINK17);
			this.queryLogic.addDataLink(this.dataLinkLINK18);
			this.presentationRules.getSections().add(this.reportSectionHeader);
			this.presentationRules.getSections().add(this.reportSectionMain);
			this.presentationRules.getSections().add(this.reportSectionTrailer);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_title);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_hint);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_cot);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_rev);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_c_agr);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_per);
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicG_c_emp);

			this.parameterForm.addToVectorGroupField(this.parameterCot);
			this.parameterForm.addToVectorGroupField(this.parameterC_agr);
			this.parameterForm.addToVectorGroupField(this.parameterC_emp);
			this.parameterForm.addToVectorGroupField(this.parameterPer);
			this.parameterForm.addToVectorGroupField(this.parameterRev);
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


			this.fieldPresentationMainBodyNombre_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADONOMBRE_CLIENTE);
			this.fieldPresentationMainBodyDir_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODIR_CLIENTE);
			this.fieldPresentationMainBodyTel_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTEL_CLIENTE);
			this.fieldPresentationMainBodyEmail_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOEMAIL_CLIENTE);
			this.fieldPresentationMainBodyUbicacion_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOUBICACION_CLIENTE);
			this.fieldPresentationMainBodyEmi.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOEMI);
			this.fieldPresentationMainBodyOrigen.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOORIGEN);
			this.fieldPresentationMainBodyDias_validez.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODIAS_VALIDEZ);
			this.fieldPresentationMainBodyEmbalaje.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE);
			this.fieldPresentationMainBodyMoneda.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOMONEDA_TEXTO);
			this.fieldPresentationMainBodyDestino.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE);
			this.fieldPresentationMainBodyDespacho.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODESPACHO);
			this.fieldPresentationMainBodyTermino_pago.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTERMINO_PAGO);
			this.fieldPresentationMainBodyNombre_seccion.setGroupFieldReference(this.groupFieldSECCIONES_PRENOMBRE_SECCION);
			this.fieldPresentationMainBodyDescripcion_seccion.setGroupFieldReference(this.groupFieldSECCIONES_PREDESCRIPCION);
			this.fieldPresentationMainBodySubtotal.setGroupFieldReference(this.groupFieldGROUP_DETALLESubtotal);
			this.fieldPresentationMainBodyNombre_articulo.setGroupFieldReference(this.groupFieldGROUP_DETALLENOMBRE_ARTICULO);
			this.fieldPresentationMainBodyCod.setGroupFieldReference(this.groupFieldGROUP_DETALLECOD);
			this.fieldPresentationMainBodyUnidad.setGroupFieldReference(this.groupFieldGROUP_DETALLEUNIDAD);
			this.fieldPresentationMainBodyCan.setGroupFieldReference(this.groupFieldGROUP_DETALLECAN);
			this.fieldPresentationMainBodyVen1.setGroupFieldReference(this.groupFieldGROUP_DETALLEVEN1);
			this.fieldPresentationMainBodyIva1.setGroupFieldReference(this.groupFieldGROUP_DETALLEIVA1);
			this.fieldPresentationMainBodyBru.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOBRU);
			this.fieldPresentationMainBodyDes.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODES);
			this.fieldPresentationMainBodyMer.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOMER);
			this.fieldPresentationMainBodyIva.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOIVA);
			this.fieldPresentationMainBodyTot.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTOT);
			this.fieldPresentationMainBodyCostos_adic.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOCOSTOS_ADIC);
			this.fieldPresentationMainBodyTotd.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTOTD);
			this.fieldPresentationMainBodyNombre_sec_enc.setGroupFieldReference(this.groupFieldSECCIONES_ENCNOMBRE_SECCION1);
			this.fieldPresentationMainBodyDesc_sec_enc.setGroupFieldReference(this.groupFieldSECCIONES_ENCDESCRIPCION1);
			this.fieldPresentationMainBodyNombre_sec_pie.setGroupFieldReference(this.groupFieldSECCIONES_PIENOMBRE_SECCION2);
			this.fieldPresentationMainBodyDesc_sec_pie.setGroupFieldReference(this.groupFieldSECCIONES_PIEDESCRIPCION2);
			this.fieldPresentationMainBodyNom_articulo.setGroupFieldReference(this.groupFieldDESCRIPCIONES_DETALLENOM_ARTICULO);
			this.fieldPresentationMainBodyDesc_comercial.setGroupFieldReference(this.groupFieldDESCRIPCIONES_DETALLEINF7);
			this.fieldPresentationMainMarginLogo_emp.setGroupFieldReference(this.groupFieldPlaceholder_columnsLOGO_EMP);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParametercot);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterrev);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterc_agr);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterper);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterc_emp);

			this.addLayoutTextVariables();
			this.addColumnInformation();
			this.addRecordGroupsToServer();
			this.addFormulaInFormula();
			this.addFormulaInGroup();
			this.addFormulaInLayout();
			this.setExecutedInit(true);

			this.queryQUERY1.addToVectorGroupField(this.groupFieldGROUP_ENCABEZADOIDIOMA, true);
			this.queryQUERY2.addToVectorGroupField(this.groupFieldGROUP_ENCABEZADOIDIOMA, true);
			this.queryQUERY3.addToVectorGroupField(this.groupFieldGROUP_ENCABEZADOIDIOMA, true);
			this.parameterCot.setQueryParameter(true);
			this.parameterRev.setQueryParameter(true);
			this.parameterC_agr.setQueryParameter(true);
			this.parameterPer.setQueryParameter(true);
			this.parameterC_emp.setQueryParameter(true);
		} catch(Exception error) {
			throw new Exception(error);
		}
	}

	/*
	public static void main(String args[]) throws Exception {
		try {
			JReportClient report = new JReportClient("com.aspsols.cotizaciones.reportes.Cotizaciones_Print");
			FocusManager foco = new FocusManagerImplementation();
			FocusManager.setCurrentManager(foco);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
	//*/

	public java.lang.Double subtotal_method () {

	return (java.lang.Double)convertTo2(add ((multiply (getField("can").getFieldValue(),getField("ven1").getFieldValue())),(getField("iva1").getFieldValue())),"java.lang.Double");


	}


	public java.lang.String datos_cliente_method () {

	try{
		java.lang.String sqlCommand1="SELECT N.nom,N.dir,'Tel./Phone ' || N.tel,M.nombre || ', ' || P.nom,N.dir_elect ";
		sqlCommand1+=" FROM nits n JOIN  pais p  ON P.c_pai=N.c_pai AND P.c_emp=N.c_emp  JOIN  departamento d  ON D.c_dpto=N.dep AND D.c_pai=N.c_pai  AND D.c_emp=N.c_emp  JOIN  municipio m  ON M.c_mnpo=N.ciu AND M.c_dpto=N.dep  AND M.c_pai=N.c_pai  AND M.c_emp=N.c_emp  ";
		sqlCommand1+="WHERE N.n_ide=#groupFieldGROUP_ENCABEZADON_IDE  AND N.c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
		//Generated vector to hold the arguments.
		Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
		SqlParameter sqlParameter1=new SqlParameter("groupFieldGROUP_ENCABEZADON_IDE",getField("n_ide").getFieldValue());
		arguments1.add(sqlParameter1);
		SqlParameter sqlParameter2=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
		arguments1.add(sqlParameter2);
		Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
		setRowsAffected(resulSet1.size());
		if (resulSet1.size()==0){
			throw new NoDataFoundException("No Data found.");
		} else if (resulSet1.size()>1){
			throw new TooManyRows("Too many Rows.");
		}
Object object1=convertTo2(((Vector)resulSet1.get(0)).get(0),getField("nombre_cliente").getDataType());
		getField("nombre_cliente").setFieldValue(object1);
Object object2=convertTo2(((Vector)resulSet1.get(0)).get(1),getField("dir_cliente").getDataType());
		getField("dir_cliente").setFieldValue(object2);
Object object3=convertTo2(((Vector)resulSet1.get(0)).get(2),getField("tel_cliente").getDataType());
		getField("tel_cliente").setFieldValue(object3);
Object object4=convertTo2(((Vector)resulSet1.get(0)).get(3),getField("ubicacion_cliente").getDataType());
		getField("ubicacion_cliente").setFieldValue(object4);
Object object5=convertTo2(((Vector)resulSet1.get(0)).get(4),getField("email_cliente").getDataType());
		getField("email_cliente").setFieldValue(object5);
	} catch(NoDataFoundException expt1){
		Object object6="";
		getField("nombre_cliente").setFieldValue(object6);
		Object object7="";
		getField("dir_cliente").setFieldValue(object7);
		Object object8="";
		getField("tel_cliente").setFieldValue(object8);
	}
	return (java.lang.String)convertTo2(null,"java.lang.String");


	}


	public java.lang.Boolean DETALLE_formatEvent () {

	if (isTrue(isEquals(ASPMath.mod(getField("color_reg").getFieldValue(),2),0) )){
		setForegroundFillColor("r238g238b238");
	}else {
		setForegroundFillColor("white");
	}
	return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");


	}


	public java.lang.String dias_validez_method () {

	java.lang.String dias=null;
	dias=convertTo(concat ((substract (getField("ven").getFieldValue(),getField("emi").getFieldValue()))," Días/Days"),dias);
	return (java.lang.String)convertTo2(dias,"java.lang.String");


	}


	public java.lang.String parametros_method () {

	java.lang.String sqlCommand1="SELECT logo ";
	sqlCommand1+=" FROM parametros ";
	sqlCommand1+="WHERE c_emp=#parameterC_emp  ";
	//Generated vector to hold the arguments.
	Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
	SqlParameter sqlParameter1=new SqlParameter("parameterC_emp",getField("c_emp").getFieldValue());
	arguments1.add(sqlParameter1);
	Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
	setRowsAffected(resulSet1.size());
	if (resulSet1.size()==0){
		throw new NoDataFoundException("No Data found.");
	} else if (resulSet1.size()>1){
		throw new TooManyRows("Too many Rows.");
	}
Object object1=convertTo2(((Vector)resulSet1.get(0)).get(0),getField("logo_emp").getDataType());
	getField("logo_emp").setFieldValue(object1);
	return (java.lang.String)convertTo2(null,"java.lang.String");


	}


	public java.lang.String nombre_embalaje_method () {

	java.lang.String vnom=null;
	try{
		java.lang.String sqlCommand1="SELECT nombre ";
		sqlCommand1+=" FROM embalaje ";
		sqlCommand1+="WHERE cod_emb=#groupFieldGROUP_ENCABEZADOCOD_EMB  AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
		//Generated vector to hold the arguments.
		Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
		SqlParameter sqlParameter1=new SqlParameter("groupFieldGROUP_ENCABEZADOCOD_EMB",getField("cod_emb").getFieldValue());
		arguments1.add(sqlParameter1);
		SqlParameter sqlParameter2=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
		arguments1.add(sqlParameter2);
		Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
		setRowsAffected(resulSet1.size());
		if (resulSet1.size()==0){
			throw new NoDataFoundException("No Data found.");
		} else if (resulSet1.size()>1){
			throw new TooManyRows("Too many Rows.");
		}
		vnom=(java.lang.String)convertTo2(((Vector)resulSet1.get(0)).get(0),"java.lang.String");
	} catch(NoDataFoundException expt1){
		vnom=convertTo("",vnom);
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String moneda_texto_method () {

	java.lang.String vmon=null;
	java.lang.String sqlCommand1="SELECT simbolo ";
	sqlCommand1+=" FROM moneda ";
	sqlCommand1+="WHERE mon=#groupFieldGROUP_ENCABEZADOMON  AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
	//Generated vector to hold the arguments.
	Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
	SqlParameter sqlParameter1=new SqlParameter("groupFieldGROUP_ENCABEZADOMON",getField("mon").getFieldValue());
	arguments1.add(sqlParameter1);
	SqlParameter sqlParameter2=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
	arguments1.add(sqlParameter2);
	Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
	setRowsAffected(resulSet1.size());
	if (resulSet1.size()==0){
		throw new NoDataFoundException("No Data found.");
	} else if (resulSet1.size()>1){
		throw new TooManyRows("Too many Rows.");
	}
	vmon=(java.lang.String)convertTo2(((Vector)resulSet1.get(0)).get(0),"java.lang.String");
	return (java.lang.String)convertTo2(vmon,"java.lang.String");


	}


	public java.lang.String nombre_articulo_method () {

	java.lang.String vnom=null;
	try{
		java.lang.String sqlCommand1="SELECT nvl(nom_largo,nom) ";
		sqlCommand1+=" FROM articulo ";
		sqlCommand1+="WHERE cod=#groupFieldGROUP_DETALLECOD  AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
		//Generated vector to hold the arguments.
		Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
		SqlParameter sqlParameter1=new SqlParameter("groupFieldGROUP_DETALLECOD",getField("cod").getFieldValue());
		arguments1.add(sqlParameter1);
		SqlParameter sqlParameter2=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
		arguments1.add(sqlParameter2);
		Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
		setRowsAffected(resulSet1.size());
		if (resulSet1.size()==0){
			throw new NoDataFoundException("No Data found.");
		} else if (resulSet1.size()>1){
			throw new TooManyRows("Too many Rows.");
		}
		vnom=(java.lang.String)convertTo2(((Vector)resulSet1.get(0)).get(0),"java.lang.String");
	} catch(NoDataFoundException expt1){
		vnom=convertTo("",vnom);
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String destino_nombre_method () {

	java.lang.String vnom=null;
	try{
		java.lang.String sqlCommand1="SELECT nom ";
		sqlCommand1+=" FROM pais ";
		sqlCommand1+="WHERE c_pai=#groupFieldGROUP_ENCABEZADODESTINO  AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
		//Generated vector to hold the arguments.
		Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
		SqlParameter sqlParameter1=new SqlParameter("groupFieldGROUP_ENCABEZADODESTINO",getField("destino").getFieldValue());
		arguments1.add(sqlParameter1);
		SqlParameter sqlParameter2=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
		arguments1.add(sqlParameter2);
		Vector resulSet1=getDAOObject().getRecords(sqlCommand1,arguments1);
		setRowsAffected(resulSet1.size());
		if (resulSet1.size()==0){
			throw new NoDataFoundException("No Data found.");
		} else if (resulSet1.size()>1){
			throw new TooManyRows("Too many Rows.");
		}
		vnom=(java.lang.String)convertTo2(((Vector)resulSet1.get(0)).get(0),"java.lang.String");
	} catch(NoDataFoundException expt1){
		vnom=convertTo("",vnom);
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}



	private void addLayoutTextVariables() {
		LayoutTextVariables ltvreportTextMainBodyText_graphic4_0 = new LayoutTextVariables("Cot", "&Cot");
		this.reportTextMainBodyText_graphic4.addToVectorVariables(ltvreportTextMainBodyText_graphic4_0);
		LayoutTextVariables ltvreportTextMainBodyText_graphic4_2 = new LayoutTextVariables("Rev", "&Rev");
		this.reportTextMainBodyText_graphic4.addToVectorVariables(ltvreportTextMainBodyText_graphic4_2);
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
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADONOMBRE_CLIENTE);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADODIR_CLIENTE);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADOTEL_CLIENTE);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADOUBICACION_CLIENTE);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADOEMAIL_CLIENTE);
		this.groupFieldFormula_columnsPARAMETROS.addToVectorFormulaSetters(this.groupFieldPlaceholder_columnsLOGO_EMP);
		this.groupFieldGROUP_DETALLESubtotal.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLECAN);
		this.groupFieldGROUP_DETALLESubtotal.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLEVEN1);
		this.groupFieldGROUP_DETALLESubtotal.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLEIVA1);
		this.groupFieldGROUP_DETALLENOMBRE_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_DETALLENOMBRE_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLECOD);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADON_IDE);
		this.groupFieldGROUP_ENCABEZADODIAS_VALIDEZ.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOEMI);
		this.groupFieldGROUP_ENCABEZADODIAS_VALIDEZ.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOVEN);
		this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOCOD_EMB);
		this.groupFieldGROUP_ENCABEZADOMONEDA_TEXTO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADOMONEDA_TEXTO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOMON);
		this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADODESTINO);
		this.groupFieldFormula_columnsPARAMETROS.addToVectorFormulaInFormula(this.parameterC_emp);
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
		this.repetitiveFrameMainBodyDetalle.addToVectorGetters(this.groupFieldGROUP_DETALLEColor_reg);
	}
}