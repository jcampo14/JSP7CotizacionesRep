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

public class informeDeVentasPorPais_class3 extends informeDeVentasPorPais_class2 {
	protected ReportText reportTextMainBodyT_nom = new ReportText("t_NOM",26,2,reportRegionMainBody,5,reportFrameMainBodyFrame1,"Paises",10,93,new Color(255,255,255),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_anteriores = new ReportText("t_ANTERIORES",350,2,reportRegionMainBody,4,reportFrameMainBodyFrame1,"A &MES de &PERIODO_PAS",10,91,new Color(255,255,255),new Color(226,107,10),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_mon = new ReportText("t_MON",119,2,reportRegionMainBody,7,reportFrameMainBodyFrame1,"Moneda",10,59,new Color(255,255,255),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_actuales = new ReportText("t_ACTUALES",178,2,reportRegionMainBody,6,reportFrameMainBodyFrame1,"A &MES de &PERIODO_ACT",10,90,new Color(255,255,255),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic6 = new ReportText("TEXT_GRAPHIC6",440,2,reportRegionMainBody,16,reportFrameMainBodyFrame1,"%",10,81,new Color(255,255,255),new Color(226,107,10),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic5 = new ReportText("TEXT_GRAPHIC5",268,2,reportRegionMainBody,21,reportFrameMainBodyFrame1,"%",10,82,new Color(255,255,255),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic4 = new ReportText("TEXT_GRAPHIC4",26,22,reportRegionMainBody,15,reportFrameMainBodyFrame2,"Total",10,127,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginTitle = new ReportText("TITLE",190,10,reportRegionMainMargin,0,null,"SOLAGRO SOLUCIONES AGROINDRUSTRIALES S.A.S.",14,382,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,11),"DEFAULT",false,false,false,false,4,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic0 = new ReportText("TEXT_GRAPHIC0",223,22,reportRegionMainMargin,2,null,"Informe de ventas por pais del mes &mes del a�o &periodo_act con respecto al a�o anterior",21,349,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,9),"DEFAULT",false,false,false,false,4,"EXPAND","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic1 = new ReportText("TEXT_GRAPHIC1",490,43,reportRegionMainMargin,3,null,"Fecha:",10,32,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,4,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic2 = new ReportText("TEXT_GRAPHIC2",481,54,reportRegionMainMargin,5,null,"P�gina",9,41,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,4,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic3 = new ReportText("TEXT_GRAPHIC3",543,54,reportRegionMainMargin,7,null,"de",9,10,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportImage reportRectangleMainMarginImage0 = new ReportImage("IMAGE0",34,7,reportRegionMainMargin,1,null,1,new Color(0,0,0),new Color(135,155,211),55,152,"Normal","logo.png","DEFAULT",false,false,false,null,0);  
	protected ReportLine reportLineMainMarginLine0 = new ReportLine("LINE0",33,64,reportRegionMainMargin,9,null,577,65,new Color(0,0,0),null,1,"DEFAULT",false,false,false,null);

	public informeDeVentasPorPais_class3() throws Exception {
		super();
	}
}