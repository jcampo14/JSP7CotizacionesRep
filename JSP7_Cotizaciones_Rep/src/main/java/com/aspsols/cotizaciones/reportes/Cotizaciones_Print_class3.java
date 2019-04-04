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
	protected ReportText reportTextMainBodyText_graphic5 = new ReportText("TEXT_GRAPHIC5",20,171,reportRegionMainBody,3,reportFrameMainBodyEncabezado_cot,"Fecha /",12,38,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic6 = new ReportText("TEXT_GRAPHIC6",58,171,reportRegionMainBody,4,reportFrameMainBodyEncabezado_cot,"Date:",12,29,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic7 = new ReportText("TEXT_GRAPHIC7",20,207,reportRegionMainBody,7,reportFrameMainBodyEncabezado_cot,"Origen /",12,41,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic8 = new ReportText("TEXT_GRAPHIC8",61,207,reportRegionMainBody,8,reportFrameMainBodyEncabezado_cot,"Origin: ",12,34,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic10 = new ReportText("TEXT_GRAPHIC10",118,183,reportRegionMainBody,10,reportFrameMainBodyEncabezado_cot,"Offer validity:",12,64,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic9 = new ReportText("TEXT_GRAPHIC9",20,183,reportRegionMainBody,9,reportFrameMainBodyEncabezado_cot,"Validez de la oferta /",12,98,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic11 = new ReportText("TEXT_GRAPHIC11",20,195,reportRegionMainBody,13,reportFrameMainBodyEncabezado_cot,"Embalaje /",12,51,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic12 = new ReportText("TEXT_GRAPHIC12",71,195,reportRegionMainBody,14,reportFrameMainBodyEncabezado_cot,"Packing:",12,43,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic14 = new ReportText("TEXT_GRAPHIC14",342,171,reportRegionMainBody,15,reportFrameMainBodyEncabezado_cot,"Currency:",12,46,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic13 = new ReportText("TEXT_GRAPHIC13",295,171,reportRegionMainBody,17,reportFrameMainBodyEncabezado_cot,"Moneda /",12,47,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic16 = new ReportText("TEXT_GRAPHIC16",295,183,reportRegionMainBody,18,reportFrameMainBodyEncabezado_cot,"Destino /",12,45,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic17 = new ReportText("TEXT_GRAPHIC17",340,183,reportRegionMainBody,21,reportFrameMainBodyEncabezado_cot,"Final destination:",12,79,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic25 = new ReportText("TEXT_GRAPHIC25",20,219,reportRegionMainBody,57,reportFrameMainBodyEncabezado_cot,"Despacho /",12,55,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic26 = new ReportText("TEXT_GRAPHIC26",75,219,reportRegionMainBody,58,reportFrameMainBodyEncabezado_cot,"Delivery:",12,43,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic30 = new ReportText("TEXT_GRAPHIC30",295,195,reportRegionMainBody,75,reportFrameMainBodyEncabezado_cot,"Tiempo de entrega /",12,96,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic31 = new ReportText("TEXT_GRAPHIC31",391,195,reportRegionMainBody,76,reportFrameMainBodyEncabezado_cot,"Delivery Time:",12,67,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic36 = new ReportText("TEXT_GRAPHIC36",337,207,reportRegionMainBody,80,reportFrameMainBodyEncabezado_cot,"Include:",12,38,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED","TEXT_GRAPHIC36_formatEvent",0,-1);
	protected ReportText reportTextMainBodyText_graphic32 = new ReportText("TEXT_GRAPHIC32",295,207,reportRegionMainBody,81,reportFrameMainBodyEncabezado_cot,"Incluye /",12,42,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED","TEXT_GRAPHIC32_formatEvent",0,-1);
	protected ReportText reportTextMainBodyText_graphic28 = new ReportText("TEXT_GRAPHIC28",115,231,reportRegionMainBody,128,reportFrameMainBodyTermino_pago_frame,"Payment terms:",11,76,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic27 = new ReportText("TEXT_GRAPHIC27",20,231,reportRegionMainBody,129,reportFrameMainBodyTermino_pago_frame,"T�rminos de pago /",11,95,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic24 = new ReportText("TEXT_GRAPHIC24",437,391,reportRegionMainBody,26,reportFrameMainBodyDetalle_frame,"Total Price",9,98,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic22 = new ReportText("TEXT_GRAPHIC22",368,391,reportRegionMainBody,27,reportFrameMainBodyDetalle_frame,"Unit. Price",9,69,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic21 = new ReportText("TEXT_GRAPHIC21",318,391,reportRegionMainBody,28,reportFrameMainBodyDetalle_frame,"Quantity",9,50,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic20 = new ReportText("TEXT_GRAPHIC20",268,391,reportRegionMainBody,29,reportFrameMainBodyDetalle_frame,"Unit",9,50,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic19 = new ReportText("TEXT_GRAPHIC19",83,391,reportRegionMainBody,30,reportFrameMainBodyDetalle_frame,"Item Name",9,185,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic18 = new ReportText("TEXT_GRAPHIC18",20,391,reportRegionMainBody,31,reportFrameMainBodyDetalle_frame,"Code",9,63,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic15 = new ReportText("TEXT_GRAPHIC15",83,382,reportRegionMainBody,32,reportFrameMainBodyDetalle_frame,"Nombre Art�culo",9,185,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTsubtotal = new ReportText("tSubtotal",437,382,reportRegionMainBody,33,reportFrameMainBodyDetalle_frame,"Subtotal",9,98,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTcod = new ReportText("tCod",20,382,reportRegionMainBody,34,reportFrameMainBodyDetalle_frame,"C�digo",9,63,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTcantidad = new ReportText("tCantidad",318,382,reportRegionMainBody,35,reportFrameMainBodyDetalle_frame,"Cantidad",9,50,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyTunidad = new ReportText("tUnidad",268,382,reportRegionMainBody,36,reportFrameMainBodyDetalle_frame,"Unidad",9,50,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyT_ven1 = new ReportText("t_VEN1",368,382,reportRegionMainBody,37,reportFrameMainBodyDetalle_frame,"Precio Venta",9,69,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic45 = new ReportText("TEXT_GRAPHIC45",148,295,reportRegionMainBody,115,reportFrameMainBodyDesc_det_frame,"Nombre Articulo",11,387,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic44 = new ReportText("TEXT_GRAPHIC44",50,295,reportRegionMainBody,114,reportFrameMainBodyDesc_det_frame,"Unidad",11,44,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic48 = new ReportText("TEXT_GRAPHIC48",148,306,reportRegionMainBody,116,reportFrameMainBodyDesc_det_frame,"Item Name",11,387,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic43 = new ReportText("TEXT_GRAPHIC43",94,295,reportRegionMainBody,113,reportFrameMainBodyDesc_det_frame,"Cantidad",11,54,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic46 = new ReportText("TEXT_GRAPHIC46",94,306,reportRegionMainBody,117,reportFrameMainBodyDesc_det_frame,"Quantity",11,54,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic47 = new ReportText("TEXT_GRAPHIC47",50,306,reportRegionMainBody,118,reportFrameMainBodyDesc_det_frame,"Unit",11,44,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic49 = new ReportText("TEXT_GRAPHIC49",20,295,reportRegionMainBody,119,reportFrameMainBodyDesc_det_frame,"Item",11,30,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic50 = new ReportText("TEXT_GRAPHIC50",20,306,reportRegionMainBody,120,reportFrameMainBodyDesc_det_frame,"Item",11,30,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,10),"DEFAULT",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic29 = new ReportText("TEXT_GRAPHIC29",22,643,reportRegionMainBody,74,reportFrameMainBodyFirma,"Comercial Manager",10,255,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic37 = new ReportText("TEXT_GRAPHIC37",20,413,reportRegionMainBody,83,reportFrameMainBodyFrame_detalle_sin_tot,"C�digo",9,63,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic38 = new ReportText("TEXT_GRAPHIC38",83,413,reportRegionMainBody,84,reportFrameMainBodyFrame_detalle_sin_tot,"Nombre Art�culo",9,350,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic39 = new ReportText("TEXT_GRAPHIC39",433,413,reportRegionMainBody,85,reportFrameMainBodyFrame_detalle_sin_tot,"Unidad",9,50,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic40 = new ReportText("TEXT_GRAPHIC40",483,413,reportRegionMainBody,86,reportFrameMainBodyFrame_detalle_sin_tot,"Cantidad",9,52,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",1,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic23 = new ReportText("TEXT_GRAPHIC23",20,422,reportRegionMainBody,122,reportFrameMainBodyFrame_detalle_sin_tot,"Code",9,63,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic51 = new ReportText("TEXT_GRAPHIC51",83,422,reportRegionMainBody,123,reportFrameMainBodyFrame_detalle_sin_tot,"Item Name",9,350,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic52 = new ReportText("TEXT_GRAPHIC52",433,422,reportRegionMainBody,124,reportFrameMainBodyFrame_detalle_sin_tot,"Unit",9,50,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic53 = new ReportText("TEXT_GRAPHIC53",483,422,reportRegionMainBody,125,reportFrameMainBodyFrame_detalle_sin_tot,"Quantity",9,52,new Color(0,0,0),new Color(204,204,204),null,new Font("Arial",2,8),"ALLPAGES",false,false,true,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic3 = new ReportText("TEXT_GRAPHIC3",439,36,reportRegionMainBody,95,reportFrameMainBodyPresentacion,"Quote",14,39,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic2 = new ReportText("TEXT_GRAPHIC2",380,36,reportRegionMainBody,96,reportFrameMainBodyPresentacion,"Cotizaci�n /",14,59,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic4 = new ReportText("TEXT_GRAPHIC4",340,50,reportRegionMainBody,97,reportFrameMainBodyPresentacion,"No. &Cot Rev. &Rev",14,174,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic0 = new ReportText("TEXT_GRAPHIC0",20,36,reportRegionMainBody,100,reportFrameMainBodyDatos_cliente,"Se�or(es) /",12,55,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic1 = new ReportText("TEXT_GRAPHIC1",75,36,reportRegionMainBody,105,reportFrameMainBodyDatos_cliente,"Mr(s)",12,40,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic41 = new ReportText("TEXT_GRAPHIC41",222,366,reportRegionMainBody,111,reportFrameMainBodyPresupuesto_frame,"Presupuesto /",11,69,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainBodyText_graphic42 = new ReportText("TEXT_GRAPHIC42",290,366,reportRegionMainBody,112,reportFrameMainBodyPresupuesto_frame,"Budget",11,40,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",2,10),"DEFAULT",false,false,false,false,2,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic33 = new ReportText("TEXT_GRAPHIC33",420,59,reportRegionMainMargin,1,null,"P�gina &<PageNumber> de &<TotalPages>",10,158,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,4,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic34 = new ReportText("TEXT_GRAPHIC34",34,765,reportRegionMainMargin,3,reportFrameMainMarginReserva_derechos,"Solagro S.A.S., se reserva el derecho de corregir esta oferta por errores u omisiones",10,544,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",1,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportText reportTextMainMarginText_graphic35 = new ReportText("TEXT_GRAPHIC35",34,774,reportRegionMainMargin,4,reportFrameMainMarginReserva_derechos,"Solagro S.A.S., reserves the right to amend this offer to correct errors and omissions",10,544,new Color(0,0,0),new Color(255,255,255),null,new Font("Arial",0,8),"DEFAULT",false,false,false,false,0,"FIXED","FIXED",null,0,-1);
	protected ReportLine reportLineMainBodyLine1 = new ReportLine("LINE1",20,284,reportRegionMainBody,93,repetitiveFrameMainBodySecciones_enc,535,286,new Color(0,0,0),null,1,"DEFAULT",false,false,false,null);
	protected ReportLine reportLineMainBodyLine0 = new ReportLine("LINE0",20,351,reportRegionMainBody,92,repetitiveFrameMainBodyDesc_det,535,353,new Color(0,0,0),null,1,"DEFAULT",false,false,false,null);

	public Cotizaciones_Print_class3() throws Exception {
		super();
	}
}