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

public class informeDeVentasPorTipoFacturacion_class2 extends informeDeVentasPorTipoFacturacion_class1 {
	protected ReportFrame reportFrameMainBodyFrame0 = new ReportFrame("FRAME0",15,3,47,523,reportRegionMainBody,0,null,"FIXED","VARIABLE",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyRepeating_frame1 = new ReportRepetitiveFrame("REPEATING_FRAME1",18,13,31,512,reportRegionMainBody,1,reportFrameMainBodyFrame0,"EXPAND","EXPAND","GROUP_MON","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyRepeating_frame0 = new ReportRepetitiveFrame("REPEATING_FRAME0",83,23,11,388,reportRegionMainBody,2,repetitiveFrameMainBodyRepeating_frame1,"EXPAND","EXPAND","GROUP0","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodyFrame1 = new ReportFrame("FRAME1",83,13,10,388,reportRegionMainBody,5,repetitiveFrameMainBodyRepeating_frame1,"FIXED","FIXED",new Color(0,51,153),"Default,1,(0,0,0)","ALLPAGES",false,false,false,null,0,-1,false);
	protected DataFieldDefinition dataFieldDefinitionParameterperiodo = new DataFieldDefinition("PF_periodo",175,144,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,null,false,true,null,null,false,null,"",null,2,true,20,null,null,false,"periodo");
	protected DataFieldDefinition dataFieldDefinitionParameterempresa = new DataFieldDefinition("PARAMETER_FIELD0",174,110,120,20,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,null,false,true,null,null,false,null,"",null,2,true,20,null,null,false,"empresa");
	protected GraphicsObjectServer graphicServergraphicRECTANGLE0 = new GraphicsObjectServer("RECTANGLE0",new Color(135,155,211),new Color(0,0,0),"RECTANGLE",55,270,67,40,false,false,1,0,"Normal",0,0,null,false,null);
	protected GraphicsObjectServer graphicServergraphicRECTANGLE1 = new GraphicsObjectServer("RECTANGLE1",new Color(135,155,211),new Color(0,0,0),"RECTANGLE",84,270,67,97,false,false,1,0,"Normal",0,0,null,false,null);
	protected GraphicsObjectServer graphicServergraphicG_title = new GraphicsObjectServer("G_title",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,164,100,50,false,false,-1,0,null,0,0,new Font("Courier New",1,14),false,"Parámetros del reporte");
	protected GraphicsObjectServer graphicServergraphicG_periodo = new GraphicsObjectServer("G_periodo",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",14,49,101,148,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"Periodo");
	protected GraphicsObjectServer graphicServergraphicTEXT_GRAPHIC0 = new GraphicsObjectServer("TEXT_GRAPHIC0",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",14,49,96,115,false,false,-1,0,null,0,0,new Font("Courier New",0,12),false,"Empresa");

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

	// User parameters
	protected GroupField parameterEmpresa = new GroupField("empresa","java.lang.String",null,"",this.tempGroup,this);
	protected GroupField parameterPeriodo = new GroupField("periodo","java.lang.String",null,"",this.tempGroup,this);

			
	public informeDeVentasPorTipoFacturacion_class2() throws Exception {
		super();
	}
}