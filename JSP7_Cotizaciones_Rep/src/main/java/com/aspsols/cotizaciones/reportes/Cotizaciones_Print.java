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
	protected ReportFieldPresentation fieldPresentationMainBodyEmi = new ReportFieldPresentation("EMI",87,171,12,173,reportRegionMainBody,5,reportFrameMainBodyEncabezado_cot,"FIXED","EXPAND","EMI","java.sql.Date",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),"dd-MMM-yyyy","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyOrigen = new ReportFieldPresentation("ORIGEN",95,207,12,165,reportRegionMainBody,6,reportFrameMainBodyEncabezado_cot,"FIXED","EXPAND","ORIGEN","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDias_validez = new ReportFieldPresentation("DIAS_VALIDEZ",182,183,12,78,reportRegionMainBody,11,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","DIAS_VALIDEZ","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyEmbalaje = new ReportFieldPresentation("EMBALAJE",114,195,12,146,reportRegionMainBody,12,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","NOMBRE_EMBALAJE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyMoneda = new ReportFieldPresentation("MONEDA",388,171,12,160,reportRegionMainBody,16,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","MONEDA_TEXTO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDestino = new ReportFieldPresentation("DESTINO",419,183,12,129,reportRegionMainBody,19,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","DESTINO_NOMBRE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDespacho = new ReportFieldPresentation("DESPACHO",118,219,12,142,reportRegionMainBody,58,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","DESPACHO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTiempo_entrega = new ReportFieldPresentation("TIEMPO_ENTREGA",458,195,12,90,reportRegionMainBody,75,reportFrameMainBodyEncabezado_cot,"FIXED","FIXED","TIEMPO_ENTREGA","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNom_cargo = new ReportFieldPresentation("NOM_CARGO",375,207,12,173,reportRegionMainBody,77,repetitiveFrameMainBodyNombres_cargos,"FIXED","FIXED","NOMBRE_CARGO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTermino_pago = new ReportFieldPresentation("TERMINO_PAGO",191,231,11,357,reportRegionMainBody,121,reportFrameMainBodyTermino_pago_frame,"FIXED","VARIABLE","TERMINO_PAGO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_seccion = new ReportFieldPresentation("NOMBRE_SECCION",20,145,13,55,reportRegionMainBody,22,repetitiveFrameMainBodySecciones_pre,"EXPAND","FIXED","NOMBRE_SECCION","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDescripcion_seccion = new ReportFieldPresentation("DESCRIPCION_SECCION",74,145,13,472,reportRegionMainBody,23,repetitiveFrameMainBodySecciones_pre,"FIXED","EXPAND","DESCRIPCION","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodySubtotal = new ReportFieldPresentation("SUBTOTAL",437,416,9,98,reportRegionMainBody,38,repetitiveFrameMainBodyDetalle,"FIXED","FIXED","Subtotal","java.lang.Double",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_articulo = new ReportFieldPresentation("NOMBRE_ARTICULO",83,416,9,185,reportRegionMainBody,39,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","NOMBRE_ARTICULO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCod = new ReportFieldPresentation("COD",20,416,9,63,reportRegionMainBody,40,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","COD","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyUnidad = new ReportFieldPresentation("UNIDAD",268,416,9,50,reportRegionMainBody,41,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","UNIDAD","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCan = new ReportFieldPresentation("CAN",318,416,9,50,reportRegionMainBody,42,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","CAN","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyVen1 = new ReportFieldPresentation("VEN1",368,416,9,69,reportRegionMainBody,43,repetitiveFrameMainBodyDetalle,"FIXED","EXPAND","VEN1","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyBru = new ReportFieldPresentation("BRU",429,473,9,106,reportRegionMainBody,45,reportFrameMainBodyTotales,"FIXED","EXPAND","BRU","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDes = new ReportFieldPresentation("DES",429,482,9,106,reportRegionMainBody,46,reportFrameMainBodyTotales,"FIXED","EXPAND","DES","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,"DES_formatEvent",0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyIva = new ReportFieldPresentation("IVA",429,491,9,106,reportRegionMainBody,47,reportFrameMainBodyTotales,"FIXED","EXPAND","IVA","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTotd = new ReportFieldPresentation("TOTD",429,509,9,106,reportRegionMainBody,48,reportFrameMainBodyTotales,"FIXED","EXPAND","TOTD","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPrompt_tot_bruto = new ReportFieldPresentation("PROMPT_TOT_BRUTO",282,473,9,147,reportRegionMainBody,63,reportFrameMainBodyTotales,"FIXED","FIXED","PROMPT_TOTAL_BRUTO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPrompt_tot_descuento = new ReportFieldPresentation("PROMPT_TOT_DESCUENTO",282,482,9,147,reportRegionMainBody,64,reportFrameMainBodyTotales,"FIXED","FIXED","PROMPT_TOTAL_DESCUENTO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,7),null,"DEFAULT",false,false,false,false,"PROMPT_TOT_DESCUENTO_formatEvent",0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPrompt_tot_iva = new ReportFieldPresentation("PROMPT_TOT_IVA",282,491,9,147,reportRegionMainBody,65,reportFrameMainBodyTotales,"FIXED","FIXED","PROMPT_TOTAL_IVA","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPrompt_tot_neto = new ReportFieldPresentation("PROMPT_TOT_NETO",282,509,9,147,reportRegionMainBody,66,reportFrameMainBodyTotales,"FIXED","EXPAND","PROMPT_TOTAL_NETO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyValor_cargo = new ReportFieldPresentation("VALOR_CARGO",429,500,9,106,reportRegionMainBody,69,repetitiveFrameMainBodyCostos_adicionales,"FIXED","FIXED","VALOR","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",1,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_cargo = new ReportFieldPresentation("NOMBRE_CARGO",282,500,9,147,reportRegionMainBody,68,repetitiveFrameMainBodyCostos_adicionales,"FIXED","EXPAND","NOMBRE_CARGO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_sec_enc = new ReportFieldPresentation("NOMBRE_SEC_ENC",20,262,13,515,reportRegionMainBody,51,repetitiveFrameMainBodySecciones_enc,"FIXED","EXPAND","NOMBRE_SECCION1","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDesc_sec_enc = new ReportFieldPresentation("DESC_SEC_ENC",20,278,13,515,reportRegionMainBody,52,repetitiveFrameMainBodySecciones_enc,"FIXED","EXPAND","DESCRIPCION1","java.lang.String",true,0,new Color(255,255,255),null,6,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_sec_pie = new ReportFieldPresentation("NOMBRE_SEC_PIE",20,534,13,515,reportRegionMainBody,55,repetitiveFrameMainBodySecciones_pie,"FIXED","FIXED","NOMBRE_SECCION2","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDesc_sec_pie = new ReportFieldPresentation("DESC_SEC_PIE",20,550,13,515,reportRegionMainBody,129,repetitiveFrameMainBodySecciones_pie,"FIXED","EXPAND","DESCRIPCION2","java.lang.String",true,0,new Color(255,255,255),null,6,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNom_articulo = new ReportFieldPresentation("NOM_ARTICULO",168,338,13,367,reportRegionMainBody,61,repetitiveFrameMainBodyDesc_det,"FIXED","EXPAND","DESCRIP_ARTICULO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDesc_comercial = new ReportFieldPresentation("DESC_COMERCIAL",168,356,13,367,reportRegionMainBody,62,repetitiveFrameMainBodyDesc_det,"FIXED","EXPAND","INF7","java.lang.String",true,0,new Color(255,255,255),null,6,new Color(0,0,0),new Font("Arial",0,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCan_descrip = new ReportFieldPresentation("CAN_DESCRIP",94,338,13,54,reportRegionMainBody,105,repetitiveFrameMainBodyDesc_det,"FIXED","FIXED","CAN1","java.lang.Double",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyUnd_descrip = new ReportFieldPresentation("UND_DESCRIP",50,338,13,44,reportRegionMainBody,106,repetitiveFrameMainBodyDesc_det,"FIXED","FIXED","UNIDAD1","java.lang.String",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCount_det = new ReportFieldPresentation("COUNT_DET",20,338,13,30,reportRegionMainBody,115,repetitiveFrameMainBodyDesc_det,"FIXED","FIXED","ORDEN1","java.math.BigInteger",true,0,new Color(255,255,255),null,0,new Color(0,0,0),new Font("Arial",1,9),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_vendedor = new ReportFieldPresentation("NOMBRE_VENDEDOR",22,614,10,255,reportRegionMainBody,71,reportFrameMainBodyFirma,"FIXED","FIXED","NOMBRE_VENDEDOR","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyEmail_vendedor = new ReportFieldPresentation("EMAIL_VENDEDOR",22,634,10,255,reportRegionMainBody,72,reportFrameMainBodyFirma,"FIXED","FIXED","EMAIL_VENDEDOR","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCargo_vend = new ReportFieldPresentation("CARGO_VEND",22,624,10,255,reportRegionMainBody,124,reportFrameMainBodyFirma,"FIXED","FIXED","CARGO_VEND","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,8),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodySt_cantidad = new ReportFieldPresentation("ST_CANTIDAD",483,445,9,52,reportRegionMainBody,86,repetitiveFrameMainBodySt_detalle,"FIXED","FIXED","CAN","java.math.BigDecimal",true,0,new Color(255,255,255),null,4,new Color(0,0,0),new Font("Arial",0,7),"###,###,###,###.##","DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodySt_unidad = new ReportFieldPresentation("ST_UNIDAD",433,445,9,50,reportRegionMainBody,87,repetitiveFrameMainBodySt_detalle,"FIXED","FIXED","UNIDAD","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodySt_nombre_articulo = new ReportFieldPresentation("ST_NOMBRE_ARTICULO",83,445,9,350,reportRegionMainBody,88,repetitiveFrameMainBodySt_detalle,"FIXED","EXPAND","NOMBRE_ARTICULO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodySt_cod = new ReportFieldPresentation("ST_COD",20,445,9,63,reportRegionMainBody,89,repetitiveFrameMainBodySt_detalle,"FIXED","EXPAND","COD","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,7),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyNombre_cliente = new ReportFieldPresentation("NOMBRE_CLIENTE",20,48,12,237,reportRegionMainBody,96,reportFrameMainBodyDatos_cliente,"FIXED","EXPAND","NOMBRE_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyDir_cliente = new ReportFieldPresentation("DIR_CLIENTE",20,84,12,237,reportRegionMainBody,98,reportFrameMainBodyDatos_cliente,"FIXED","VARIABLE","DIR_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,"DIR_CLIENTE_formatEvent",0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyTel_cliente = new ReportFieldPresentation("TEL_CLIENTE",20,96,12,237,reportRegionMainBody,99,reportFrameMainBodyDatos_cliente,"FIXED","VARIABLE","TEL_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,"TEL_CLIENTE_formatEvent",0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyEmail_cliente = new ReportFieldPresentation("EMAIL_CLIENTE",20,108,12,237,reportRegionMainBody,100,reportFrameMainBodyDatos_cliente,"FIXED","VARIABLE","EMAIL_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,"EMAIL_CLIENTE_formatEvent",0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyUbicacion_cliente = new ReportFieldPresentation("UBICACION_CLIENTE",20,120,12,237,reportRegionMainBody,101,reportFrameMainBodyDatos_cliente,"FIXED","VARIABLE","UBICACION_CLIENTE","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyPersona_cargo = new ReportFieldPresentation("PERSONA_CARGO",20,60,12,237,reportRegionMainBody,103,reportFrameMainBodyDatos_cliente,"FIXED","VARIABLE","PER_CARGO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,10),null,"DEFAULT",false,false,false,false,"PERSONA_CARGO_formatEvent",0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainBodyCargo = new ReportFieldPresentation("CARGO",20,72,12,237,reportRegionMainBody,104,reportFrameMainBodyDatos_cliente,"FIXED","VARIABLE","CARGO","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",1,10),null,"DEFAULT",false,false,false,false,"CARGO_formatEvent",0,false,-1);
	protected ReportFieldPresentation fieldPresentationMainMarginLogo_emp = new ReportFieldPresentation("LOGO_EMP",56,13,55,140,reportRegionMainMargin,0,null,"FIXED","FIXED","LOGO_EMP","java.lang.String",true,0,new Color(255,255,255),null,2,new Color(0,0,0),new Font("Arial",0,10),null,"DEFAULT",false,false,false,false,null,0,false,-1);
	
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
			String[] arrayColumnsqueryQUERY0 = ASPString.splitExpression("E.C_EMP,E.PER,E.C_AGR,E.COT,E.REV,E.N_IDE,E.COD_SUC,E.EMI,E.VEN,E.BRU,E.DES,E.MER,E.IVA,E.TOT,E.COSTOS_ADIC,E.TOTD,E.MON,E.TASA,E.C_VEN,E.COD_INCOTERM,IDIOMA,E.ORIGEN,DESTINO,E.COD_EMB,E.ZONA,D.COD,D.UNIDAD,D.CAN,D.VEN,D.IVA,E.DESPACHO,E.TERMINO_PAGO,E.TIEMPO_ENTREGA,E.LUGAR_DESTINO,C.PER_CARGO,C.CARGO,D.NOM,D.ORDEN",",");
			String[] arrayAliasqueryQUERY0 = ASPString.splitExpression("C_EMP1,PER1,C_AGR1,COT1,REV1,N_IDE,COD_SUC,EMI,VEN,BRU,DES,MER,IVA,TOT,COSTOS_ADIC,TOTD,MON,TASA,C_VEN,COD_INCOTERM,IDIOMA,ORIGEN,DESTINO,COD_EMB,ZONA,COD,UNIDAD,CAN,VEN1,IVA1,DESPACHO,TERMINO_PAGO,TIEMPO_ENTREGA,LUGAR_DESTINO,PER_CARGO,CARGO,NOM,ORDEN,",",");
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
			String[] arrayColumnsqueryQUERY4 = ASPString.splitExpression("C.C_EMP,C.COT,C.REV,C.C_AGR,C.CAN,C.UNIDAD,C.PER,C.COD,C.INF7,NOM_ARTICULO,C.NOM,C.ORDEN",",");
			String[] arrayAliasqueryQUERY4 = ASPString.splitExpression("C_EMP5,COT5,REV5,C_AGR5,CAN1,UNIDAD1,PER5,COD1,INF7,NOM_ARTICULO,NOM1,ORDEN1,",",");
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

			this.queryLogic.addQueries(this.queryQUERY5);
			this.queryQUERY5.setInitialGroup(this.groupCOSTOS_ADIC);
			this.queryQUERY5.setMaximunRowsToFech(0);
			String[] arrayColumnsqueryQUERY5 = ASPString.splitExpression("C.C_EMP,COT,C.REV,C.C_AGR,C.PER,C.COD_COSTO,C.VALOR,NOMBRE_CARGO",",");
			String[] arrayAliasqueryQUERY5 = ASPString.splitExpression("C_EMP6,COT6,REV6,C_AGR6,PER6,COD_COSTO,VALOR,NOMBRE_CARGO,",",");
			for(int k=0;k<arrayColumnsqueryQUERY5.length;k++){
				boolean insertqueryQUERY5 = true;
				SelectColumns queryQUERY5SelectColumns = new SelectColumns();
				if(!arrayColumnsqueryQUERY5[k].equals("null")){
					queryQUERY5SelectColumns.setColumnName(arrayColumnsqueryQUERY5[k]);
				}
				if(!arrayAliasqueryQUERY5[k].equals("null")){
					queryQUERY5SelectColumns.setColumnAlias(arrayAliasqueryQUERY5[k]);
					insertqueryQUERY5 = false;
					this.queryQUERY5.getColumnsName().add(arrayAliasqueryQUERY5[k]);
				}else{
					queryQUERY5SelectColumns.setColumnAlias(arrayColumnsqueryQUERY5[k]);
				}
				if(insertqueryQUERY5){
					this.queryQUERY5.getColumnsName().add(arrayColumnsqueryQUERY5[k]);
				}
				this.queryQUERY5.getColumns().add(queryQUERY5SelectColumns);
			}

			this.groupGROUP_ENCABEZADO.addChildGroup(this.groupGROUP_DETALLE);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupCOSTOS_ADIC);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupDESCRIPCIONES_DETALLE);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupSECCIONES_PIE);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupSECCIONES_ENC);this.groupGROUP_ENCABEZADO.addChildGroup(this.groupSECCIONES_PRE);
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
			
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEORDEN);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLECOD);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEUNIDAD);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLECAN);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEVEN1);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEIVA1);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLESubtotal);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLEColor_reg);
			this.groupFieldGROUP_DETALLEColor_reg.setSource(this.groupFieldGROUP_DETALLECOD);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLENOMBRE_ARTICULO);
			this.groupGROUP_DETALLE.addField(this.groupFieldGROUP_DETALLENOM);
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
			
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICC_EMP6);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICCOT6);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICREV6);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICC_AGR6);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICPER6);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICCOD_COSTO);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICVALOR);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICNOMBRE_CARGO);
			this.groupCOSTOS_ADIC.addField(this.groupFieldCOSTOS_ADICCOUNT_COSTOS);
			this.groupFieldCOSTOS_ADICCOUNT_COSTOS.setSource(this.groupFieldCOSTOS_ADICCOD_COSTO);
			
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEORDEN1);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLECOD1);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEC_EMP5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLECOT5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEREV5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEC_AGR5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEPER5);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEINF7);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLENOM_ARTICULO);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEDESCRIP_ARTICULO);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLECAN1);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLEUNIDAD1);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLECOUNT_DET);
			this.groupFieldDESCRIPCIONES_DETALLECOUNT_DET.setSource(this.groupFieldDESCRIPCIONES_DETALLECOD1);
			this.groupDESCRIPCIONES_DETALLE.addField(this.groupFieldDESCRIPCIONES_DETALLENOM1);
			
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
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_BRUTO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_DESCUENTO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_BASE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_IVA);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_PARCIAL);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_NETO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOTIEMPO_ENTREGA);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOLUGAR_DESTINO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPROMPT_DESTINO_NOMBRE);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOPER_CARGO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOCARGO);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOFIRMA_VENDEDOR);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADONOMBRE_VENDEDOR);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOEMAIL_VENDEDOR);
			this.groupGROUP_ENCABEZADO.addField(this.groupFieldGROUP_ENCABEZADOCARGO_VEND);
			this.queryLogic.addToFields(this.groupFieldFormula_columnsPARAMETROS);
			this.queryLogic.addToFields(this.groupFieldPlaceholder_columnsLOGO_EMP);
			this.queryLogic.addToFields(this.groupFieldPlaceholder_columnsIMG_PIE_COT);
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
			this.queryLogic.addDataLink(this.dataLinkLINK19);
			this.queryLogic.addDataLink(this.dataLinkLINK20);
			this.queryLogic.addDataLink(this.dataLinkLINK21);
			this.queryLogic.addDataLink(this.dataLinkLINK22);
			this.queryLogic.addDataLink(this.dataLinkLINK23);
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
			this.parameterForm.addToVectorGraphics(this.graphicServergraphicTEXT_GRAPHIC0);

			this.parameterForm.addToVectorGroupField(this.parameterCot);
			this.parameterForm.addToVectorGroupField(this.parameterC_agr);
			this.parameterForm.addToVectorGroupField(this.parameterC_emp);
			this.parameterForm.addToVectorGroupField(this.parameterPer);
			this.parameterForm.addToVectorGroupField(this.parameterRev);
			this.parameterForm.addToVectorGroupField(this.parameterVer_totales);
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


			this.fieldPresentationMainBodyEmi.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOEMI);
			this.fieldPresentationMainBodyOrigen.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOORIGEN);
			this.fieldPresentationMainBodyDias_validez.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODIAS_VALIDEZ);
			this.fieldPresentationMainBodyEmbalaje.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE);
			this.fieldPresentationMainBodyMoneda.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOMONEDA_TEXTO);
			this.fieldPresentationMainBodyDestino.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE);
			this.fieldPresentationMainBodyDespacho.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODESPACHO);
			this.fieldPresentationMainBodyTiempo_entrega.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTIEMPO_ENTREGA);
			this.fieldPresentationMainBodyNom_cargo.setGroupFieldReference(this.groupFieldCOSTOS_ADICNOMBRE_CARGO);
			this.fieldPresentationMainBodyTermino_pago.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTERMINO_PAGO);
			this.fieldPresentationMainBodyNombre_seccion.setGroupFieldReference(this.groupFieldSECCIONES_PRENOMBRE_SECCION);
			this.fieldPresentationMainBodyDescripcion_seccion.setGroupFieldReference(this.groupFieldSECCIONES_PREDESCRIPCION);
			this.fieldPresentationMainBodySubtotal.setGroupFieldReference(this.groupFieldGROUP_DETALLESubtotal);
			this.fieldPresentationMainBodyNombre_articulo.setGroupFieldReference(this.groupFieldGROUP_DETALLENOMBRE_ARTICULO);
			this.fieldPresentationMainBodyCod.setGroupFieldReference(this.groupFieldGROUP_DETALLECOD);
			this.fieldPresentationMainBodyUnidad.setGroupFieldReference(this.groupFieldGROUP_DETALLEUNIDAD);
			this.fieldPresentationMainBodyCan.setGroupFieldReference(this.groupFieldGROUP_DETALLECAN);
			this.fieldPresentationMainBodyVen1.setGroupFieldReference(this.groupFieldGROUP_DETALLEVEN1);
			this.fieldPresentationMainBodyBru.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOBRU);
			this.fieldPresentationMainBodyDes.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODES);
			this.fieldPresentationMainBodyIva.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOIVA);
			this.fieldPresentationMainBodyTotd.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTOTD);
			this.fieldPresentationMainBodyPrompt_tot_bruto.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_BRUTO);
			this.fieldPresentationMainBodyPrompt_tot_descuento.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_DESCUENTO);
			this.fieldPresentationMainBodyPrompt_tot_iva.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_IVA);
			this.fieldPresentationMainBodyPrompt_tot_neto.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_NETO);
			this.fieldPresentationMainBodyValor_cargo.setGroupFieldReference(this.groupFieldCOSTOS_ADICVALOR);
			this.fieldPresentationMainBodyNombre_cargo.setGroupFieldReference(this.groupFieldCOSTOS_ADICNOMBRE_CARGO);
			this.fieldPresentationMainBodyNombre_sec_enc.setGroupFieldReference(this.groupFieldSECCIONES_ENCNOMBRE_SECCION1);
			this.fieldPresentationMainBodyDesc_sec_enc.setGroupFieldReference(this.groupFieldSECCIONES_ENCDESCRIPCION1);
			this.fieldPresentationMainBodyNombre_sec_pie.setGroupFieldReference(this.groupFieldSECCIONES_PIENOMBRE_SECCION2);
			this.fieldPresentationMainBodyDesc_sec_pie.setGroupFieldReference(this.groupFieldSECCIONES_PIEDESCRIPCION2);
			this.fieldPresentationMainBodyNom_articulo.setGroupFieldReference(this.groupFieldDESCRIPCIONES_DETALLEDESCRIP_ARTICULO);
			this.fieldPresentationMainBodyDesc_comercial.setGroupFieldReference(this.groupFieldDESCRIPCIONES_DETALLEINF7);
			this.fieldPresentationMainBodyCan_descrip.setGroupFieldReference(this.groupFieldDESCRIPCIONES_DETALLECAN1);
			this.fieldPresentationMainBodyUnd_descrip.setGroupFieldReference(this.groupFieldDESCRIPCIONES_DETALLEUNIDAD1);
			this.fieldPresentationMainBodyCount_det.setGroupFieldReference(this.groupFieldDESCRIPCIONES_DETALLEORDEN1);
			this.fieldPresentationMainBodyNombre_vendedor.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADONOMBRE_VENDEDOR);
			this.fieldPresentationMainBodyEmail_vendedor.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOEMAIL_VENDEDOR);
			this.fieldPresentationMainBodyCargo_vend.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOCARGO_VEND);
			this.fieldPresentationMainBodySt_cantidad.setGroupFieldReference(this.groupFieldGROUP_DETALLECAN);
			this.fieldPresentationMainBodySt_unidad.setGroupFieldReference(this.groupFieldGROUP_DETALLEUNIDAD);
			this.fieldPresentationMainBodySt_nombre_articulo.setGroupFieldReference(this.groupFieldGROUP_DETALLENOMBRE_ARTICULO);
			this.fieldPresentationMainBodySt_cod.setGroupFieldReference(this.groupFieldGROUP_DETALLECOD);
			this.fieldPresentationMainBodyNombre_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADONOMBRE_CLIENTE);
			this.fieldPresentationMainBodyDir_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADODIR_CLIENTE);
			this.fieldPresentationMainBodyTel_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOTEL_CLIENTE);
			this.fieldPresentationMainBodyEmail_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOEMAIL_CLIENTE);
			this.fieldPresentationMainBodyUbicacion_cliente.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOUBICACION_CLIENTE);
			this.fieldPresentationMainBodyPersona_cargo.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOPER_CARGO);
			this.fieldPresentationMainBodyCargo.setGroupFieldReference(this.groupFieldGROUP_ENCABEZADOCARGO);
			this.fieldPresentationMainMarginLogo_emp.setGroupFieldReference(this.groupFieldPlaceholder_columnsLOGO_EMP);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParametercot);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterrev);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterc_agr);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterper);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterc_emp);
			this.parameterForm.addToVectorDataFieldDefinition(this.dataFieldDefinitionParameterver_totales);

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
			this.queryQUERY5.addToVectorGroupField(this.groupFieldGROUP_ENCABEZADOIDIOMA, true);
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

	return (java.lang.Double)convertTo2((multiply (getField("can").getFieldValue(),getField("ven1").getFieldValue())),"java.lang.Double");


	}


	public java.lang.String datos_cliente_method () {

	try{
		java.lang.String sqlCommand1="SELECT DECODE(n.ide,'CC',n.nom1 || DECODE(n.nom2,null,'',' ' || n.nom2) || ' ' || n.ape1 || DECODE(n.ape2,null,'',' ' || n.ape2),n.nom),N.dir,'Tel./Phone ' || N.tel,M.nombre || ', ' || P.nom,N.dir_elect ";
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
		try{
			java.lang.String sqlCommand2="SELECT nombre ";
			sqlCommand2+=" FROM prosp_cl ";
			sqlCommand2+="WHERE n_ide=#groupFieldGROUP_ENCABEZADON_IDE  AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
			//Generated vector to hold the arguments.
			Vector<SqlParameter> arguments2=new Vector<SqlParameter>();
			SqlParameter sqlParameter3=new SqlParameter("groupFieldGROUP_ENCABEZADON_IDE",getField("n_ide").getFieldValue());
			arguments2.add(sqlParameter3);
			SqlParameter sqlParameter4=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
			arguments2.add(sqlParameter4);
			Vector resulSet2=getDAOObject().getRecords(sqlCommand2,arguments2);
			setRowsAffected(resulSet2.size());
			if (resulSet2.size()==0){
				throw new NoDataFoundException("No Data found.");
			} else if (resulSet2.size()>1){
				throw new TooManyRows("Too many Rows.");
			}
Object object6=convertTo2(((Vector)resulSet2.get(0)).get(0),getField("nombre_cliente").getDataType());
			getField("nombre_cliente").setFieldValue(object6);
		} catch(NoDataFoundException expt2){
			Object object7=null;
			getField("nombre_cliente").setFieldValue(object7);
			Object object8=null;
			getField("dir_cliente").setFieldValue(object8);
			Object object9=null;
			getField("tel_cliente").setFieldValue(object9);
		}
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
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
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
	}else if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
		try{
			java.lang.String sqlCommand2="SELECT descripcion ";
			sqlCommand2+=" FROM embalaje_sinonimo ";
			sqlCommand2+="WHERE cod_emb=#groupFieldGROUP_ENCABEZADOCOD_EMB  AND idioma='INGLES'  AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
			//Generated vector to hold the arguments.
			Vector<SqlParameter> arguments2=new Vector<SqlParameter>();
			SqlParameter sqlParameter3=new SqlParameter("groupFieldGROUP_ENCABEZADOCOD_EMB",getField("cod_emb").getFieldValue());
			arguments2.add(sqlParameter3);
			SqlParameter sqlParameter4=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
			arguments2.add(sqlParameter4);
			Vector resulSet2=getDAOObject().getRecords(sqlCommand2,arguments2);
			setRowsAffected(resulSet2.size());
			if (resulSet2.size()==0){
				throw new NoDataFoundException("No Data found.");
			} else if (resulSet2.size()>1){
				throw new TooManyRows("Too many Rows.");
			}
			vnom=(java.lang.String)convertTo2(((Vector)resulSet2.get(0)).get(0),"java.lang.String");
		} catch(NoDataFoundException expt2){
			vnom=convertTo("",vnom);
		}
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
	Object object1=ASPSQLFunctions.sqlNvl(getField("lugar_destino").getFieldValue(),"");
	Object object2=concat (concat (object1," - "),vnom);
	getField("prompt_destino_nombre").setFieldValue(object2);
	return (java.lang.String)convertTo2(getField("prompt_destino_nombre").getFieldValue(),"java.lang.String");


	}


	public java.lang.String prompt_total_bruto_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
		vnom=convertTo("SUBTOTAL PRECIO EN FABRICA",vnom);
	}else {
		if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
			vnom=convertTo("SUB-TOTAL EXWORK PRICE",vnom);
		}
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String prompt_total_descuento_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
		vnom=convertTo("TOTAL DESCUENTO",vnom);
	}else {
		if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
			vnom=convertTo("TOTAL DISCOUNT",vnom);
		}
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String prompt_total_base_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
		vnom=convertTo("TOTAL BASE",vnom);
	}else {
		if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
			vnom=convertTo("TOTAL BASE",vnom);
		}
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String prompt_total_iva_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
		vnom=convertTo("TOTAL IVA",vnom);
	}else {
		if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
			vnom=convertTo("TOTAL TAX",vnom);
		}
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String prompt_total_parcial_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
		vnom=convertTo("TOTAL PARCIAL",vnom);
	}else {
		if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
			vnom=convertTo("SUB-TOTAL",vnom);
		}
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String prompt_total_neto_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
		vnom=convertTo(concat (concat (concat ("TOTAL ",getField("cod_incoterm").getFieldValue())," "),getField("prompt_destino_nombre").getFieldValue()),vnom);
	}else {
		if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
			vnom=convertTo(concat (concat (concat ("GRAND ",getField("cod_incoterm").getFieldValue())," "),getField("prompt_destino_nombre").getFieldValue()),vnom);
		}
	}
	return (java.lang.String)convertTo2(vnom,"java.lang.String");


	}


	public java.lang.String firma_vendedor_method () {

	try{
		java.lang.String sqlCommand1="SELECT DECODE(n.ide,'CC',n.nom1 || DECODE(n.nom2,null,'',' ' || n.nom2) || ' ' || n.ape1 || DECODE(n.ape2,null,'',' ' || n.ape2),n.nom)  AS nombre,N.dir_elect ";
		sqlCommand1+=" FROM vendedor v JOIN  nits n  ON V.n_ide=N.n_ide AND V.c_emp=N.c_emp  ";
		sqlCommand1+="WHERE V.n_ide=#groupFieldGROUP_ENCABEZADOC_VEN  AND V.c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
		//Generated vector to hold the arguments.
		Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
		SqlParameter sqlParameter1=new SqlParameter("groupFieldGROUP_ENCABEZADOC_VEN",getField("c_ven").getFieldValue());
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
Object object1=convertTo2(((Vector)resulSet1.get(0)).get(0),getField("nombre_vendedor").getDataType());
		getField("nombre_vendedor").setFieldValue(object1);
Object object2=convertTo2(((Vector)resulSet1.get(0)).get(1),getField("email_vendedor").getDataType());
		getField("email_vendedor").setFieldValue(object2);
	} catch(NoDataFoundException expt1){
		Object object3="";
		getField("nombre_vendedor").setFieldValue(object3);
		Object object4="";
		getField("email_vendedor").setFieldValue(object4);
	}
	return (java.lang.String)convertTo2(null,"java.lang.String");


	}


	public java.lang.Boolean PROMPT_TOT_DESCUENTO_formatEvent () {

	if (isTrue(greaterThan(getField("des").getFieldValue(),0) )){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean DES_formatEvent () {

	if (isTrue(greaterThan(getField("des").getFieldValue(),0) )){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.String nombre_articulo_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
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
	}else {
		try{
			java.lang.String sqlCommand2="SELECT descrip ";
			sqlCommand2+=" FROM sinonimo ";
			sqlCommand2+="WHERE cod=#groupFieldGROUP_DETALLECOD  AND idioma=#groupFieldGROUP_ENCABEZADOIDIOMA   AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
			//Generated vector to hold the arguments.
			Vector<SqlParameter> arguments2=new Vector<SqlParameter>();
			SqlParameter sqlParameter3=new SqlParameter("groupFieldGROUP_DETALLECOD",getField("cod").getFieldValue());
			arguments2.add(sqlParameter3);
			SqlParameter sqlParameter4=new SqlParameter("groupFieldGROUP_ENCABEZADOIDIOMA",getField("idioma").getFieldValue());
			arguments2.add(sqlParameter4);
			SqlParameter sqlParameter5=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
			arguments2.add(sqlParameter5);
			Vector resulSet2=getDAOObject().getRecords(sqlCommand2,arguments2);
			setRowsAffected(resulSet2.size());
			if (resulSet2.size()==0){
				throw new NoDataFoundException("No Data found.");
			} else if (resulSet2.size()>1){
				throw new TooManyRows("Too many Rows.");
			}
			vnom=(java.lang.String)convertTo2(((Vector)resulSet2.get(0)).get(0),"java.lang.String");
		} catch(NoDataFoundException expt2){
			vnom=convertTo("",vnom);
		}
	}
	if (isTrue(Utils.isNull(getField("nom").getFieldValue()))){
		return (java.lang.String)convertTo2(vnom,"java.lang.String");
	}else {
		return (java.lang.String)convertTo2(getField("nom").getFieldValue(),"java.lang.String");
	}


	}


	public java.lang.String descrip_articulo_method () {

	java.lang.String vnom=null;
	if (isTrue(isEquals(getField("idioma").getFieldValue(),"ESPAÑOL") )){
		try{
			java.lang.String sqlCommand1="SELECT nvl(nom_largo,nom) ";
			sqlCommand1+=" FROM articulo ";
			sqlCommand1+="WHERE cod=#groupFieldDESCRIPCIONES_DETALLECOD1  AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
			//Generated vector to hold the arguments.
			Vector<SqlParameter> arguments1=new Vector<SqlParameter>();
			SqlParameter sqlParameter1=new SqlParameter("groupFieldDESCRIPCIONES_DETALLECOD1",getField("cod1").getFieldValue());
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
	}else {
		try{
			java.lang.String sqlCommand2="SELECT descrip ";
			sqlCommand2+=" FROM sinonimo ";
			sqlCommand2+="WHERE cod=#groupFieldDESCRIPCIONES_DETALLECOD1  AND idioma=#groupFieldGROUP_ENCABEZADOIDIOMA   AND c_emp=#groupFieldGROUP_ENCABEZADOC_EMP1   ";
			//Generated vector to hold the arguments.
			Vector<SqlParameter> arguments2=new Vector<SqlParameter>();
			SqlParameter sqlParameter3=new SqlParameter("groupFieldDESCRIPCIONES_DETALLECOD1",getField("cod1").getFieldValue());
			arguments2.add(sqlParameter3);
			SqlParameter sqlParameter4=new SqlParameter("groupFieldGROUP_ENCABEZADOIDIOMA",getField("idioma").getFieldValue());
			arguments2.add(sqlParameter4);
			SqlParameter sqlParameter5=new SqlParameter("groupFieldGROUP_ENCABEZADOC_EMP1",getField("c_emp1").getFieldValue());
			arguments2.add(sqlParameter5);
			Vector resulSet2=getDAOObject().getRecords(sqlCommand2,arguments2);
			setRowsAffected(resulSet2.size());
			if (resulSet2.size()==0){
				throw new NoDataFoundException("No Data found.");
			} else if (resulSet2.size()>1){
				throw new TooManyRows("Too many Rows.");
			}
			vnom=(java.lang.String)convertTo2(((Vector)resulSet2.get(0)).get(0),"java.lang.String");
		} catch(NoDataFoundException expt2){
			vnom=convertTo("",vnom);
		}
	}
	if (isTrue(Utils.isNull(getField("nom1").getFieldValue()))){
		return (java.lang.String)convertTo2(vnom,"java.lang.String");
	}else {
		return (java.lang.String)convertTo2(getField("nom1").getFieldValue(),"java.lang.String");
	}


	}


	public java.lang.Boolean PERSONA_CARGO_formatEvent () {

	if (isTrue(isNotTrue(Utils.isNull(getField("per_cargo").getFieldValue())))){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean CARGO_formatEvent () {

	if (isTrue(isNotTrue(Utils.isNull(getField("cargo").getFieldValue())))){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean DETALLE_FRAME_formatEvent () {

	if (isTrue(isEquals(getField("ver_totales").getFieldValue(),"N") )){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean FRAME_DETALLE_SIN_TOT_formatEvent () {

	if (isTrue(isEquals(getField("ver_totales").getFieldValue(),"N") )){
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean TEXT_GRAPHIC36_formatEvent () {

	if (isTrue(greaterThan(getField("count_costos").getFieldValue(),0) )){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean TEXT_GRAPHIC32_formatEvent () {

	if (isTrue(greaterThan(getField("count_costos").getFieldValue(),0) )){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean DIR_CLIENTE_formatEvent () {

	if (isTrue(isNotTrue(Utils.isNull(getField("dir_cliente").getFieldValue())))){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean TEL_CLIENTE_formatEvent () {

	if (isTrue(isNotTrue(Utils.isNull(getField("tel_cliente").getFieldValue())))){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean EMAIL_CLIENTE_formatEvent () {

	if (isTrue(isNotTrue(Utils.isNull(getField("email_cliente").getFieldValue())))){
		return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");
	}else {
		return (java.lang.Boolean)convertTo2(false,"java.lang.Boolean");
	}


	}


	public java.lang.Boolean ST_DETALLE_formatEvent () {

	if (isTrue(isEquals(ASPMath.mod(getField("color_reg").getFieldValue(),2),0) )){
		setForegroundFillColor("r238g238b238");
	}else {
		setForegroundFillColor("white");
	}
	return (java.lang.Boolean)convertTo2(true,"java.lang.Boolean");


	}


	public java.lang.String img_pie_cot_method () {

	return (java.lang.String)convertTo2("logo-cotizacion.png","java.lang.String");


	}


	public java.lang.String cargo_vend_method () {

	if (isTrue(isEquals(getField("idioma").getFieldValue(),"INGLES") )){
		return (java.lang.String)convertTo2("Comercial Manager","java.lang.String");
	}else {
		return (java.lang.String)convertTo2("Director Comercial","java.lang.String");
	}


	}



	private void addLayoutTextVariables() {
		LayoutTextVariables ltvreportTextMainBodyText_graphic4_0 = new LayoutTextVariables("Cot", "&Cot");
		this.reportTextMainBodyText_graphic4.addToVectorVariables(ltvreportTextMainBodyText_graphic4_0);
		LayoutTextVariables ltvreportTextMainBodyText_graphic4_2 = new LayoutTextVariables("Rev", "&Rev");
		this.reportTextMainBodyText_graphic4.addToVectorVariables(ltvreportTextMainBodyText_graphic4_2);
		LayoutTextVariables ltvreportTextMainMarginText_graphic33_0 = new LayoutTextVariables("PageNumber", "&<PageNumber>");
		this.reportTextMainMarginText_graphic33.addToVectorVariables(ltvreportTextMainMarginText_graphic33_0);
		LayoutTextVariables ltvreportTextMainMarginText_graphic33_2 = new LayoutTextVariables("TotalPages", "&<TotalPages>");
		this.reportTextMainMarginText_graphic33.addToVectorVariables(ltvreportTextMainMarginText_graphic33_2);
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
		this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADOPROMPT_DESTINO_NOMBRE);
		this.groupFieldGROUP_ENCABEZADOFIRMA_VENDEDOR.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADONOMBRE_VENDEDOR);
		this.groupFieldGROUP_ENCABEZADOFIRMA_VENDEDOR.addToVectorFormulaSetters(this.groupFieldGROUP_ENCABEZADOEMAIL_VENDEDOR);
		this.groupFieldFormula_columnsPARAMETROS.addToVectorFormulaSetters(this.groupFieldPlaceholder_columnsLOGO_EMP);
		this.groupFieldGROUP_DETALLESubtotal.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLECAN);
		this.groupFieldGROUP_DETALLESubtotal.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLEVEN1);
		this.groupFieldGROUP_DETALLENOMBRE_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_DETALLENOMBRE_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLECOD);
		this.groupFieldGROUP_DETALLENOMBRE_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_DETALLENOM);
		this.groupFieldGROUP_DETALLENOMBRE_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADODATOS_CLIENTE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADON_IDE);
		this.groupFieldGROUP_ENCABEZADODIAS_VALIDEZ.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOEMI);
		this.groupFieldGROUP_ENCABEZADODIAS_VALIDEZ.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOVEN);
		this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOCOD_EMB);
		this.groupFieldGROUP_ENCABEZADONOMBRE_EMBALAJE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOMONEDA_TEXTO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADOMONEDA_TEXTO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOMON);
		this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADODESTINO);
		this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOLUGAR_DESTINO);
		this.groupFieldGROUP_ENCABEZADODESTINO_NOMBRE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOPROMPT_DESTINO_NOMBRE);
		this.groupFieldDESCRIPCIONES_DETALLEDESCRIP_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldDESCRIPCIONES_DETALLEDESCRIP_ARTICULO.addToVectorFormulaInFormula(this.groupFieldDESCRIPCIONES_DETALLECOD1);
		this.groupFieldDESCRIPCIONES_DETALLEDESCRIP_ARTICULO.addToVectorFormulaInFormula(this.groupFieldDESCRIPCIONES_DETALLENOM1);
		this.groupFieldDESCRIPCIONES_DETALLEDESCRIP_ARTICULO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_BRUTO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_DESCUENTO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_BASE.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_IVA.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_PARCIAL.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_NETO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOCOD_INCOTERM);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_NETO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
		this.groupFieldGROUP_ENCABEZADOPROMPT_TOTAL_NETO.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOPROMPT_DESTINO_NOMBRE);
		this.groupFieldGROUP_ENCABEZADOFIRMA_VENDEDOR.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_EMP1);
		this.groupFieldGROUP_ENCABEZADOFIRMA_VENDEDOR.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOC_VEN);
		this.groupFieldGROUP_ENCABEZADOCARGO_VEND.addToVectorFormulaInFormula(this.groupFieldGROUP_ENCABEZADOIDIOMA);
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
		this.fieldPresentationMainBodyPrompt_tot_descuento.addToVectorGetters(this.groupFieldGROUP_ENCABEZADODES);
		this.fieldPresentationMainBodyDes.addToVectorGetters(this.groupFieldGROUP_ENCABEZADODES);
		this.fieldPresentationMainBodyPersona_cargo.addToVectorGetters(this.groupFieldGROUP_ENCABEZADOPER_CARGO);
		this.fieldPresentationMainBodyCargo.addToVectorGetters(this.groupFieldGROUP_ENCABEZADOCARGO);
		this.reportFrameMainBodyDetalle_frame.addToVectorGetters(this.parameterVer_totales);
		this.reportFrameMainBodyFrame_detalle_sin_tot.addToVectorGetters(this.parameterVer_totales);
		this.reportTextMainBodyText_graphic36.addToVectorGetters(this.groupFieldCOSTOS_ADICCOUNT_COSTOS);
		this.reportTextMainBodyText_graphic32.addToVectorGetters(this.groupFieldCOSTOS_ADICCOUNT_COSTOS);
		this.fieldPresentationMainBodyDir_cliente.addToVectorGetters(this.groupFieldGROUP_ENCABEZADODIR_CLIENTE);
		this.fieldPresentationMainBodyTel_cliente.addToVectorGetters(this.groupFieldGROUP_ENCABEZADOTEL_CLIENTE);
		this.fieldPresentationMainBodyEmail_cliente.addToVectorGetters(this.groupFieldGROUP_ENCABEZADOEMAIL_CLIENTE);
		this.repetitiveFrameMainBodySt_detalle.addToVectorGetters(this.groupFieldGROUP_DETALLEColor_reg);
	}
}