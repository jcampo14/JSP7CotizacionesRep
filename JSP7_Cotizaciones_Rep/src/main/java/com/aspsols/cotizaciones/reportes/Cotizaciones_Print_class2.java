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

public class Cotizaciones_Print_class2 extends Cotizaciones_Print_class1 {
	protected ReportFrame reportFrameMainBodyFrame0 = new ReportFrame("FRAME0",0,0,649,548,reportRegionMainBody,0,null,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyEncabezado = new ReportRepetitiveFrame("ENCABEZADO",0,0,646,548,reportRegionMainBody,1,reportFrameMainBodyFrame0,"FIXED","EXPAND","GROUP_ENCABEZADO","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodyEncabezado_cot = new ReportFrame("ENCABEZADO_COT",0,163,90,548,reportRegionMainBody,2,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyNombres_cargos = new ReportRepetitiveFrame("NOMBRES_CARGOS",375,207,12,173,reportRegionMainBody,76,reportFrameMainBodyEncabezado_cot,"FIXED","VARIABLE","COSTOS_ADIC","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodyTermino_pago_frame = new ReportFrame("TERMINO_PAGO_FRAME",0,231,13,548,reportRegionMainBody,120,reportFrameMainBodyEncabezado_cot,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodySecciones_pre = new ReportRepetitiveFrame("SECCIONES_PRE",0,145,15,548,reportRegionMainBody,20,repetitiveFrameMainBodyEncabezado,"FIXED","VARIABLE","SECCIONES_PRE","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodyDetalle_frame = new ReportFrame("DETALLE_FRAME",0,396,31,548,reportRegionMainBody,24,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,"DETALLE_FRAME_formatEvent",0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyDetalle = new ReportRepetitiveFrame("DETALLE",20,416,11,515,reportRegionMainBody,25,reportFrameMainBodyDetalle_frame,"FIXED","EXPAND","GROUP_DETALLE","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,"DETALLE_formatEvent",0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodyTotales = new ReportFrame("TOTALES",0,463,65,548,reportRegionMainBody,44,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyCostos_adicionales = new ReportRepetitiveFrame("COSTOS_ADICIONALES",254,500,9,281,reportRegionMainBody,67,reportFrameMainBodyTotales,"FIXED","VARIABLE","COSTOS_ADIC","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodySecciones_enc_frame = new ReportFrame("SECCIONES_ENC_FRAME",0,262,29,548,reportRegionMainBody,49,repetitiveFrameMainBodyEncabezado,"FIXED","VARIABLE",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodySecciones_enc = new ReportRepetitiveFrame("SECCIONES_ENC",20,262,29,515,reportRegionMainBody,50,reportFrameMainBodySecciones_enc_frame,"FIXED","VARIABLE","SECCIONES_ENC","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,5,0,-1,false);
	protected ReportFrame reportFrameMainBodySecciones_pie_frame = new ReportFrame("SECCIONES_PIE_FRAME",0,534,29,548,reportRegionMainBody,53,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodySecciones_pie = new ReportRepetitiveFrame("SECCIONES_PIE",20,534,29,515,reportRegionMainBody,54,reportFrameMainBodySecciones_pie_frame,"FIXED","VARIABLE","SECCIONES_PIE","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,5,0,-1,false);
	protected ReportFrame reportFrameMainBodyDesc_det_frame = new ReportFrame("DESC_DET_FRAME",0,302,70,548,reportRegionMainBody,59,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyDesc_det = new ReportRepetitiveFrame("DESC_DET",20,338,34,515,reportRegionMainBody,60,reportFrameMainBodyDesc_det_frame,"FIXED","VARIABLE","DESCRIPCIONES_DETALLE","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,5,0,-1,false);
	protected ReportFrame reportFrameMainBodyFirma = new ReportFrame("FIRMA",0,614,30,548,reportRegionMainBody,70,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportFrame reportFrameMainBodyFrame_detalle_sin_tot = new ReportFrame("FRAME_DETALLE_SIN_TOT",0,427,31,548,reportRegionMainBody,80,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,"FRAME_DETALLE_SIN_TOT_formatEvent",0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodySt_detalle = new ReportRepetitiveFrame("ST_DETALLE",20,445,11,515,reportRegionMainBody,85,reportFrameMainBodyFrame_detalle_sin_tot,"FIXED","EXPAND","GROUP_DETALLE","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,"ST_DETALLE_formatEvent",0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodyPresentacion = new ReportFrame("PRESENTACION",0,4,136,548,reportRegionMainBody,91,repetitiveFrameMainBodyEncabezado,"FIXED","EXPAND",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportFrame reportFrameMainBodyDatos_cliente = new ReportFrame("DATOS_CLIENTE",20,36,100,237,reportRegionMainBody,95,reportFrameMainBodyPresentacion,"FIXED","VARIABLE",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportFrame reportFrameMainBodyFrame_cont_presp = new ReportFrame("FRAME_CONT_PRESP",0,372,20,548,reportRegionMainBody,125,repetitiveFrameMainBodyEncabezado,"FIXED","FIXED",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportFrame reportFrameMainBodyPresupuesto_frame = new ReportFrame("PRESUPUESTO_FRAME",0,381,11,548,reportRegionMainBody,126,reportFrameMainBodyFrame_cont_presp,"FIXED","FIXED",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportFrame reportFrameMainMarginReserva_derechos = new ReportFrame("RESERVA_DERECHOS",34,771,20,544,reportRegionMainMargin,2,null,"FIXED","FIXED",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected DataFieldDefinition dataFieldDefinitionParametercot = new DataFieldDefinition("PF_cot",160,110,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,null,false,true,null,null,false,null,"",null,2,true,0,null,null,false,"cot");
	protected DataFieldDefinition dataFieldDefinitionParameterrev = new DataFieldDefinition("PF_rev",160,140,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,null,false,true,null,null,false,null,"",null,2,true,0,null,null,false,"rev");
	protected DataFieldDefinition dataFieldDefinitionParameterc_agr = new DataFieldDefinition("PF_c_agr",160,170,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,null,false,true,null,null,false,null,"",null,2,true,0,null,null,false,"c_agr");
	protected DataFieldDefinition dataFieldDefinitionParameterper = new DataFieldDefinition("PF_per",160,200,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,null,false,true,null,null,false,null,"",null,2,true,0,null,null,false,"per");
	protected DataFieldDefinition dataFieldDefinitionParameterc_emp = new DataFieldDefinition("PF_c_emp",160,230,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,null,false,true,null,null,false,null,"",null,2,true,0,null,null,false,"c_emp");
	protected DataFieldDefinition dataFieldDefinitionParameterver_totales = new DataFieldDefinition("PARAMETER_FIELD0",196,264,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"CH","java.lang.String",true,new Font("Arial",0,10),null,"S",null,false,true,"S","N",false,null,"",null,2,false,0,null,null,false,"ver_totales");
	protected GraphicsObjectServer graphicServergraphicG_title = new GraphicsObjectServer("G_title",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,164,100,50,false,false,-1,0,null,0,0,new Font("Courier New",1,14),false,"Parámetros del reporte");
	protected GraphicsObjectServer graphicServergraphicG_hint = new GraphicsObjectServer("G_hint",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,276,100,80,false,false,-1,0,null,0,0,new Font("Courier New",1,14),false,"Escriba los valores para el parámetro.");
	protected GraphicsObjectServer graphicServergraphicG_cot = new GraphicsObjectServer("G_cot",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,31,100,110,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"cot");
	protected GraphicsObjectServer graphicServergraphicG_rev = new GraphicsObjectServer("G_rev",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,31,100,140,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"rev");
	protected GraphicsObjectServer graphicServergraphicG_c_agr = new GraphicsObjectServer("G_c_agr",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,45,100,170,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"c_agr");
	protected GraphicsObjectServer graphicServergraphicG_per = new GraphicsObjectServer("G_per",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,31,100,200,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"per");
	protected GraphicsObjectServer graphicServergraphicG_c_emp = new GraphicsObjectServer("G_c_emp",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,45,100,230,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"c_emp");
	protected GraphicsObjectServer graphicServergraphicTEXT_GRAPHIC0 = new GraphicsObjectServer("TEXT_GRAPHIC0",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",14,27,79,264,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"Ocultar totales");

	// System parameters
	protected GroupField parameterBACKGROUND = new GroupField("BACKGROUND","java.lang.String","false",true,this.tempGroup,this);
	protected GroupField parameterCOPIES = new GroupField("COPIES","java.lang.Double","1",true,this.tempGroup,this);
	protected GroupField parameterCURRENCY = new GroupField("CURRENCY","java.lang.String",null,true,this.tempGroup,this);
	protected GroupField parameterDECIMAL = new GroupField("DECIMAL","java.lang.String","0",true,this.tempGroup,this);
	protected GroupField parameterDESFORMAT = new GroupField("DESFORMAT","java.lang.String","dec",true,this.tempGroup,this);
	protected GroupField parameterDESNAME = new GroupField("DESNAME","java.lang.String",null,true,this.tempGroup,this);
	protected GroupField parameterDESTYPE = new GroupField("DESTYPE","java.lang.String","Preview",true,this.tempGroup,this);
	protected GroupField parameterMODE = new GroupField("MODE","java.lang.String","Default",true,this.tempGroup,this);
	protected GroupField parameterORIENTATION = new GroupField("ORIENTATION","java.lang.String","Default",true,this.tempGroup,this);
	protected GroupField parameterPRINTJOB = new GroupField("PRINTJOB","java.lang.String","false",true,this.tempGroup,this);
	protected GroupField parameterTHOUSANDS = new GroupField("THOUSANDS","java.lang.String","0",true,this.tempGroup,this);
	protected GroupField parameterMAXRECORDS = new GroupField("MAXRECORDS","java.lang.Integer","0",true,this.tempGroup,this);
	protected GroupField parameterENCRYPTION = new GroupField("ENCRYPTION","java.lang.String",null,true,this.tempGroup,this);

	// User parameters
	protected GroupField parameterCot = new GroupField("cot","java.lang.String",null,"",this.tempGroup,this);
	protected GroupField parameterC_agr = new GroupField("c_agr","java.lang.String",null,"",this.tempGroup,this);
	protected GroupField parameterC_emp = new GroupField("c_emp","java.lang.String",null,"",this.tempGroup,this);
	protected GroupField parameterPer = new GroupField("per","java.lang.String",null,"",this.tempGroup,this);
	protected GroupField parameterRev = new GroupField("rev","java.lang.String",null,"",this.tempGroup,this);
	protected GroupField parameterVer_totales = new GroupField("ver_totales","java.lang.String","S","",this.tempGroup,this);

			
	public Cotizaciones_Print_class2() throws Exception {
		super();
	}
}