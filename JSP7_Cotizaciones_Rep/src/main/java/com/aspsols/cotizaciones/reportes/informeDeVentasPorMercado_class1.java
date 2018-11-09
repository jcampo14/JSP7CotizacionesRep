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

public class informeDeVentasPorMercado_class1 extends JReportRuntime {
	
	protected QueryLogic queryLogic = new QueryLogic();
	protected Group tempGroup = new Group("GrupoTemporal");
	
	protected Query queryQUERY0 = new Query("QUERY0","MASTER","WHERE SUBSTR(VXJ.MES_ACTUAL, 1 , 6 ) = #periodo",null,"ORDER BY VXJ.ZON"," SELECT  VXJ.ZON   ,VXJ.MON   ,VXJ.MES_ACTUAL   , ROUND (VXJ.VENTAS_ACTUAL, 0 )  VENTAS_ACTUAL  ,VXJ.MES_PASADO   , ROUND (VXJ.VENTAS_PASADAS)  VENTAS_PASADAS   FROM VENTAS_XMERCADO_JOIN VXJ  WHERE SUBSTR(VXJ.MES_ACTUAL, 1 , 6 ) = #periodo",null);
	protected Group groupGROUP_MON = new Group("GROUP_MON",queryQUERY0,"NONE",null,0);
	protected Group groupGROUP0 = new Group("GROUP0",queryQUERY0,"NONE",null,0);
	protected GroupField groupFieldGROUP0ZON = new GroupField("ZON",0,"java.lang.String",null,null,"ASC",null,null,"REPORT","REPORT",null,"DATABASE",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP0MES_ACTUAL = new GroupField("MES_ACTUAL",2,"java.lang.String",null,null,"ASC",null,null,"REPORT","REPORT",null,"DATABASE",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP0MES_PASADO = new GroupField("MES_PASADO",4,"java.lang.String",null,null,"ASC",null,null,"REPORT","REPORT",null,"DATABASE",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP0VENTAS_ACTUAL = new GroupField("VENTAS_ACTUAL",3,"java.lang.String","0",null,"ASC",null,null,"REPORT","REPORT",null,"DATABASE",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP0VENTAS_PASADAS = new GroupField("VENTAS_PASADAS",5,"java.lang.String","0",null,"ASC",null,null,"REPORT","REPORT",null,"DATABASE",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP0Color_reg = new GroupField("color_reg",0,"java.lang.Double","0",null,"ASC","COUNT",groupGROUP0,"REPORT","REPORT",null,"SUMMARY",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP0SUMA_PORC_ACT = new GroupField("SUMA_PORC_ACT",0,"java.lang.Double","0",null,"NONE",null,null,"REPORT","REPORT","suma_porc_act_method","FORMULA",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP0SUMA_PORC_PAS = new GroupField("SUMA_PORC_PAS",0,"java.lang.Double","0",null,"NONE",null,null,"REPORT","REPORT","suma_porc_pas_method","FORMULA",null,false,0,groupGROUP0,this);
	protected GroupField groupFieldGROUP_MONMON = new GroupField("MON",1,"java.lang.String",null,null,"ASC",null,null,"REPORT","REPORT",null,"DATABASE",null,false,0,groupGROUP_MON,this);
	protected GroupField groupFieldGROUP_MONTOT_POR_ACT = new GroupField("TOT_POR_ACT",0,"java.lang.Double",null,null,"ASC","SUM",groupGROUP0,"GROUP_MON","REPORT",null,"SUMMARY",null,false,0,groupGROUP_MON,this);
	protected GroupField groupFieldGROUP_MONTOT_POR_PAS = new GroupField("TOT_POR_PAS",0,"java.lang.Double",null,null,"ASC","SUM",groupGROUP0,"GROUP_MON","REPORT",null,"SUMMARY",null,false,0,groupGROUP_MON,this);
	protected GroupField groupFieldGROUP_MONSUMA_ACT = new GroupField("SUMA_ACT",0,"java.lang.Double",null,null,"ASC","SUM",groupGROUP0,"GROUP_MON","REPORT",null,"SUMMARY",null,false,0,groupGROUP_MON,this);
	protected GroupField groupFieldGROUP_MONSUMA_PAS = new GroupField("SUMA_PAS",0,"java.lang.Double",null,null,"ASC","SUM",groupGROUP0,"GROUP_MON","REPORT",null,"SUMMARY",null,false,0,groupGROUP_MON,this);
	protected GroupField groupFieldFormula_columnsPERIODO_PR = new GroupField("PERIODO_PR",0,"java.lang.String",null,null,"NONE",null,null,"REPORT","REPORT","periodo_pr_method","FORMULA",null,false,0,tempGroup,this);
	protected GroupField groupFieldFormula_columnsPERIODO_PA = new GroupField("PERIODO_PA",0,"java.lang.String",null,null,"NONE",null,null,"REPORT","REPORT","periodo_pa_method","FORMULA",null,false,0,tempGroup,this);
	protected GroupField groupFieldFormula_columnsMES = new GroupField("MES",0,"java.lang.String",null,null,"NONE",null,null,"REPORT","REPORT","mes_method","FORMULA",null,false,0,tempGroup,this);
	protected GroupField groupFieldFormula_columnsNOM_MERCADO = new GroupField("NOM_MERCADO",0,"java.lang.String",null,null,"NONE",null,null,"REPORT","REPORT","nom_mercado_method","FORMULA",null,false,0,tempGroup,this);
	protected GroupField groupFieldFormula_columnsVENTAS_ACT_ROUND = new GroupField("VENTAS_ACT_ROUND",0,"java.lang.Double","0",null,"NONE",null,null,"REPORT","REPORT","ventas_act_round_method","FORMULA",null,false,0,tempGroup,this);
	protected GroupField groupFieldFormula_columnsVENTAS_PAS_ROUND = new GroupField("VENTAS_PAS_ROUND",0,"java.lang.Double","0",null,"NONE",null,null,"REPORT","REPORT","ventas_pas_round_method","FORMULA",null,false,0,tempGroup,this);
	protected GraphicsObjectServer graphicServergraphicTitulo = new GraphicsObjectServer("Titulo",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,120,100,40,false,false,-1,0,null,0,0,new Font("Arial",1,14),false,"Report parameters");
	protected GraphicsObjectServer graphicServergraphicParameterperiodo = new GraphicsObjectServer("parameterperiodo",new Color(255,255,255),new Color(0,0,0),"TEXT_GRAPHIC",20,120,80,80,false,false,-1,0,null,0,0,new Font("Arial",0,10),false,"periodo");
	protected ReportRegion reportRegionHeaderBody = new ReportRegion("BODY");
	protected ReportRegion reportRegionHeaderMargin = new ReportRegion("MARGIN");
	protected ReportRegion reportRegionMainBody = new ReportRegion("BODY");
	protected ReportRegion reportRegionMainMargin = new ReportRegion("MARGIN");
	protected ReportRegion reportRegionTrailerBody = new ReportRegion("BODY");
	protected ReportRegion reportRegionTrailerMargin = new ReportRegion("MARGIN");
	protected ReportMargin reportMarginHeader = new ReportMargin(70,34,34,70);
	protected ReportSection reportSectionHeader = new ReportSection("HEADER",reportMarginHeader,792,612,reportRegionHeaderBody,reportRegionHeaderMargin,"Portrait");
	protected ReportMargin reportMarginMain = new ReportMargin(70,34,34,70);
	protected ReportSection reportSectionMain = new ReportSection("MAIN",reportMarginMain,792,612,reportRegionMainBody,reportRegionMainMargin,"Portrait");
	protected ReportMargin reportMarginTrailer = new ReportMargin(70,34,34,70);
	protected ReportSection reportSectionTrailer = new ReportSection("TRAILER",reportMarginTrailer,792,612,reportRegionTrailerBody,reportRegionTrailerMargin,"Portrait");

	public informeDeVentasPorMercado_class1() throws Exception {
		super();
	}
}