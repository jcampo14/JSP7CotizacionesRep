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

public class Cotizaciones_Print_class3 extends Cotizaciones_Print_class2 {
	protected ReportText reportTextMainBodyText_graphic0 = new ReportText("TEXT_GRAPHIC0",0,2,reportRegionMainBody,4,reportFrameMainBodyDatos_cliente,"Se�or(es) /",10,43,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic1 = new ReportText("TEXT_GRAPHIC1",43,2,reportRegionMainBody,9,reportFrameMainBodyDatos_cliente,"Mr(s)",10,40,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic3 = new ReportText("TEXT_GRAPHIC3",398,1,reportRegionMainBody,17,repetitiveFrameMainBodyEncabezado,"Proforma Invoice",14,81,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic2 = new ReportText("TEXT_GRAPHIC2",305,1,reportRegionMainBody,16,repetitiveFrameMainBodyEncabezado,"Factura Proforma /",14,93,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic5 = new ReportText("TEXT_GRAPHIC5",0,96,reportRegionMainBody,11,reportFrameMainBodyEncabezado_cot,"Fecha /",10,29,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic6 = new ReportText("TEXT_GRAPHIC6",29,96,reportRegionMainBody,12,reportFrameMainBodyEncabezado_cot,"Date:",10,22,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic7 = new ReportText("TEXT_GRAPHIC7",0,126,reportRegionMainBody,18,reportFrameMainBodyEncabezado_cot,"Origen /",10,32,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic8 = new ReportText("TEXT_GRAPHIC8",32,126,reportRegionMainBody,19,reportFrameMainBodyEncabezado_cot,"Origin: ",10,26,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic10 = new ReportText("TEXT_GRAPHIC10",79,106,reportRegionMainBody,21,reportFrameMainBodyEncabezado_cot,"Offer validity:",10,49,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic9 = new ReportText("TEXT_GRAPHIC9",0,106,reportRegionMainBody,20,reportFrameMainBodyEncabezado_cot,"Validez de la oferta /",10,79,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic11 = new ReportText("TEXT_GRAPHIC11",0,116,reportRegionMainBody,24,reportFrameMainBodyEncabezado_cot,"Embalaje /",10,42,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic12 = new ReportText("TEXT_GRAPHIC12",42,116,reportRegionMainBody,25,reportFrameMainBodyEncabezado_cot,"Packing:",10,33,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic14 = new ReportText("TEXT_GRAPHIC14",360,96,reportRegionMainBody,26,reportFrameMainBodyEncabezado_cot,"Currency:",10,37,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic13 = new ReportText("TEXT_GRAPHIC13",323,96,reportRegionMainBody,28,reportFrameMainBodyEncabezado_cot,"Moneda /",10,37,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic16 = new ReportText("TEXT_GRAPHIC16",322,106,reportRegionMainBody,30,reportFrameMainBodyEncabezado_cot,"Destino /",10,36,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic17 = new ReportText("TEXT_GRAPHIC17",358,106,reportRegionMainBody,33,reportFrameMainBodyEncabezado_cot,"Final destination:",10,63,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic25 = new ReportText("TEXT_GRAPHIC25",0,136,reportRegionMainBody,83,reportFrameMainBodyEncabezado_cot,"Despacho /",10,45,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic26 = new ReportText("TEXT_GRAPHIC26",45,136,reportRegionMainBody,84,reportFrameMainBodyEncabezado_cot,"Delivery:",10,34,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic27 = new ReportText("TEXT_GRAPHIC27",0,146,reportRegionMainBody,86,reportFrameMainBodyEncabezado_cot,"T�rminos de pago /",10,75,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic28 = new ReportText("TEXT_GRAPHIC28",75,146,reportRegionMainBody,87,reportFrameMainBodyEncabezado_cot,"Payment terms:",10,58,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic4 = new ReportText("TEXT_GRAPHIC4",305,15,reportRegionMainBody,15,repetitiveFrameMainBodyEncabezado,"No. &Cot Rev. &Rev",14,174,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic24 = new ReportText("TEXT_GRAPHIC24",444,242,reportRegionMainBody,38,reportFrameMainBodyDetalle_frame,"Total Price",9,98,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic22 = new ReportText("TEXT_GRAPHIC22",298,242,reportRegionMainBody,39,reportFrameMainBodyDetalle_frame,"Unit. Price",9,78,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic21 = new ReportText("TEXT_GRAPHIC21",238,242,reportRegionMainBody,40,reportFrameMainBodyDetalle_frame,"Cantidad",9,60,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic20 = new ReportText("TEXT_GRAPHIC20",191,242,reportRegionMainBody,41,reportFrameMainBodyDetalle_frame,"Unidad",9,47,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic23 = new ReportText("TEXT_GRAPHIC23",376,242,reportRegionMainBody,42,reportFrameMainBodyDetalle_frame,"IVA",9,68,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic19 = new ReportText("TEXT_GRAPHIC19",63,242,reportRegionMainBody,43,reportFrameMainBodyDetalle_frame,"Item Name",9,128,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic18 = new ReportText("TEXT_GRAPHIC18",0,242,reportRegionMainBody,44,reportFrameMainBodyDetalle_frame,"Item Code",9,63,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic15 = new ReportText("TEXT_GRAPHIC15",63,233,reportRegionMainBody,45,reportFrameMainBodyDetalle_frame,"Nombre Art�culo",9,128,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTsubtotal = new ReportText("tSubtotal",444,233,reportRegionMainBody,46,reportFrameMainBodyDetalle_frame,"Subtotal",9,98,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTcod = new ReportText("tCod",0,233,reportRegionMainBody,47,reportFrameMainBodyDetalle_frame,"C�digo Art�culo",9,63,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTcantidad = new ReportText("tCantidad",238,233,reportRegionMainBody,48,reportFrameMainBodyDetalle_frame,"Cantidad",9,60,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTunidad = new ReportText("tUnidad",191,233,reportRegionMainBody,49,reportFrameMainBodyDetalle_frame,"Unidad",9,47,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_ven1 = new ReportText("t_VEN1",298,233,reportRegionMainBody,50,reportFrameMainBodyDetalle_frame,"Precio Venta",9,78,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_iva1 = new ReportText("t_IVA1",376,233,reportRegionMainBody,51,reportFrameMainBodyDetalle_frame,"IVA",9,68,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_bru = new ReportText("t_BRU",362,266,reportRegionMainBody,60,reportFrameMainBodyTotales,"Total Bruto",9,74,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_des = new ReportText("t_DES",362,275,reportRegionMainBody,61,reportFrameMainBodyTotales,"Valor Descuento",9,74,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_mer = new ReportText("t_MER",362,284,reportRegionMainBody,62,reportFrameMainBodyTotales,"Valor Descontado",9,74,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_iva = new ReportText("t_IVA",362,293,reportRegionMainBody,63,reportFrameMainBodyTotales,"IVA",9,74,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_tot = new ReportText("t_TOT",362,302,reportRegionMainBody,64,reportFrameMainBodyTotales,"Total Parcial",9,74,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_costos_adic = new ReportText("t_COSTOS_ADIC",362,311,reportRegionMainBody,65,reportFrameMainBodyTotales,"Total Cargos/Costos",9,74,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_totd = new ReportText("t_TOTD",362,320,reportRegionMainBody,66,reportFrameMainBodyTotales,"Total Neto",9,74,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,7),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportLine reportLineMainBodyLine0 = new ReportLine("LINE0",0,93,reportRegionMainBody,29,repetitiveFrameMainBodyEncabezado,542,95,new Color(0,0,0),null,1,"DEFAULT",false,false,false,null);
	protected ReportLine reportLineMainBodyLine1 = new ReportLine("LINE1",0,160,reportRegionMainBody,74,repetitiveFrameMainBodyEncabezado,542,162,new Color(0,0,0),null,1,"DEFAULT",false,false,false,null);

	public Cotizaciones_Print_class3() throws Exception {
		super();
	}
}