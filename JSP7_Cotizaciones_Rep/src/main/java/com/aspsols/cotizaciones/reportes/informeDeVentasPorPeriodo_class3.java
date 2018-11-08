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
	protected ReportText reportTextMainBodyCompania = new ReportText("COMPANIA",50,10,reportRegionMainBody,10,repetitiveFrameMainBodyRepeating_frame0,"Ventas facturadas por Solagro",10,129,new Color(0,0,0),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",0,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_ventas_act = new ReportText("t_VENTAS_ACT",179,0,reportRegionMainBody,4,reportFrameMainBodyFrame1,"Ventas a Mes (&MES) &PERIODO_PRE",10,100,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyC_emp = new ReportText("C_EMP",50,0,reportRegionMainBody,3,reportFrameMainBodyFrame1,"COMPA�IA",10,129,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_ventas_pas = new ReportText("t_VENTAS_PAS",279,0,reportRegionMainBody,5,reportFrameMainBodyFrame1,"Ventas a Mes (&MES) &PERIODO_PAS",10,103,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyPorcentaje = new ReportText("PORCENTAJE",382,0,reportRegionMainBody,9,reportFrameMainBodyFrame1,"%",10,121,new Color(255,255,255),new Color(255,255,255),"Default,1,(0,0,0)",new Font("Arial",0,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic3 = new ReportText("TEXT_GRAPHIC3",173,24,reportRegionMainMargin,0,null,"Informes estad�sticos para SOLAGRO S.A.S.",16,238,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic4 = new ReportText("TEXT_GRAPHIC4",468,41,reportRegionMainMargin,1,null,"Fecha:",10,32,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);

	public informeDeVentasPorPeriodo_class3() throws Exception {
		super();
	}
}