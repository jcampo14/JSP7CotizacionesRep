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

public class informeDeVentasPorEmpresa_class2 extends informeDeVentasPorEmpresa_class1 {
	protected ReportFrame reportFrameMainBodyFrame0 = new ReportFrame("FRAME0",87,15,132,309,reportRegionMainBody,1,null,"VARIABLE","VARIABLE",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyRepeating_frame1 = new ReportRepetitiveFrame("REPEATING_FRAME1",153,36,20,160,reportRegionMainBody,2,reportFrameMainBodyFrame0,"VARIABLE","EXPAND","GROUP_MON","Down",new Color(255,255,255),null,0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportRepetitiveFrame repetitiveFrameMainBodyRepeating_frame0 = new ReportRepetitiveFrame("REPEATING_FRAME0",153,36,20,158,reportRegionMainBody,3,repetitiveFrameMainBodyRepeating_frame1,"VARIABLE","EXPAND","GROUP0","Across",new Color(255,255,255),"Default,1,(0,0,0)",0,"DEFAULT",false,false,false,null,0,0,0,-1,false);
	protected ReportFrame reportFrameMainBodyFrame1 = new ReportFrame("FRAME1",89,27,54,231,reportRegionMainBody,0,null,"FIXED","FIXED",new Color(255,255,255),null,"DEFAULT",false,false,false,null,0,-1,false);
	protected DataFieldDefinition dataFieldDefinitionParameterperiodo = new DataFieldDefinition("PARAMETER_FIELD0",129,99,84,19,new Color(255,255,255),new Color(0,0,0),null,null,"TF","java.lang.String",true,new Font("Arial",0,10),null,null,"año del cual se requiere informe de venta total",false,true,null,null,false,null,"",null,2,true,20,null,null,false,"periodo");
	protected GraphicsObjectServer graphicServergraphicRECTANGLE0 = new GraphicsObjectServer("RECTANGLE0",new Color(135,155,211),new Color(0,0,0),"RECTANGLE",27,89,100,41,false,false,1,0,"Normal",0,0,null,false,null);
	protected GraphicsObjectServer graphicServergraphicRECTANGLE1 = new GraphicsObjectServer("RECTANGLE1",new Color(135,155,211),new Color(0,0,0),"RECTANGLE",38,162,62,89,false,false,1,0,"Normal",0,0,null,false,null);
	protected GraphicsObjectServer graphicServergraphicROUNDED_RECTANGLE0 = new GraphicsObjectServer("ROUNDED_RECTANGLE0",new Color(135,155,211),new Color(0,0,0),"ROUNDED_RECTANGLE",142,210,39,28,false,false,1,0,null,10,10,null,false,null);
	protected GraphicsObjectServer graphicServergraphicTEXT_GRAPHIC0 = new GraphicsObjectServer("TEXT_GRAPHIC0",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",19,79,107,45,false,false,-1,0,null,0,0,new Font("Arial",1,16),false,"Parámetro");
	protected GraphicsObjectServer graphicServergraphicTEXT_GRAPHIC1 = new GraphicsObjectServer("TEXT_GRAPHIC1",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",15,49,72,100,false,false,-1,0,null,0,0,new Font("Arial",0,12),false,"Periodo :");

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
	protected GroupField parameterPeriodo = new GroupField("periodo","java.lang.String",null,"",this.tempGroup,this);

			
	public informeDeVentasPorEmpresa_class2() throws Exception {
		super();
	}
}