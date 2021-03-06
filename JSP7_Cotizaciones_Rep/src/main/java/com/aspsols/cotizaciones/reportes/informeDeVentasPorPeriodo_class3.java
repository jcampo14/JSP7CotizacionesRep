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

public class informeDeVentasPorPeriodo_class3 extends informeDeVentasPorPeriodo_class2 {
	protected ReportText reportTextMainBodyCompania = new ReportText("COMPANIA",22,18,reportRegionMainBody,4,repetitiveFrameMainBodyRepeating_frame0,"Ventas facturadas por Solagro",10,105,new Color(0,0,0),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_ventas_pas = new ReportText("t_VENTAS_PAS",302,8,reportRegionMainBody,9,reportFrameMainBodyFrame1,"Ventas a Mes (&MES) &PERIODO_PAS",10,117,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyC_emp = new ReportText("C_EMP",22,8,reportRegionMainBody,10,reportFrameMainBodyFrame1,"COMPA�IA",10,105,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_ventas_act = new ReportText("t_VENTAS_ACT",185,8,reportRegionMainBody,11,reportFrameMainBodyFrame1,"Ventas a Mes (&MES) &PERIODO_PRE",10,117,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_moneda = new ReportText("t_MONEDA",127,8,reportRegionMainBody,12,reportFrameMainBodyFrame1,"Moneda",10,58,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyPorcentaje = new ReportText("PORCENTAJE",419,8,reportRegionMainBody,8,reportFrameMainBodyFrame1,"%",10,89,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic3 = new ReportText("TEXT_GRAPHIC3",191,6,reportRegionMainMargin,0,null,"SOLAGRO SOLUCIONES AGROINDRUSTRIALES S.A.S.",16,382,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,11),"DEFAULT",false,false,false,false,4,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic4 = new ReportText("TEXT_GRAPHIC4",494,43,reportRegionMainMargin,1,null,"Fecha:",10,32,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,4,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic0 = new ReportText("TEXT_GRAPHIC0",238,22,reportRegionMainMargin,3,null,"Informe de ventas por periodo del mes &mes del a�o &periodo_pre con respecto al a�o anterior",20,335,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,9),"DEFAULT",false,false,false,false,4,"EXPAND","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic1 = new ReportText("TEXT_GRAPHIC1",496,54,reportRegionMainMargin,6,null,"P�gina ",9,38,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,4,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic2 = new ReportText("TEXT_GRAPHIC2",548,54,reportRegionMainMargin,7,null,"de",9,10,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportImage reportRectangleMainMarginImage0 = new ReportImage("IMAGE0",30,4,reportRegionMainMargin,9,null,1,new Color(0,0,0),new Color(135,155,211),55,152,"Normal","logo.png","DEFAULT",false,false,false,null,0);  
	protected ReportLine reportLineMainMarginLine0 = new ReportLine("LINE0",30,63,reportRegionMainMargin,8,null,573,64,new Color(0,0,0),null,1,"DEFAULT",false,false,false,null);

	public informeDeVentasPorPeriodo_class3() throws Exception {
		super();
	}
}