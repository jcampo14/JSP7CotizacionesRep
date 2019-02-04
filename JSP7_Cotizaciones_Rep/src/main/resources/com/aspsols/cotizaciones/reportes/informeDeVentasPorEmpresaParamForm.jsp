<?xml version="1.0" encoding="ISO-8859-1"?>
<jsp:root version="2.0" xmlns:f="http://java.sun.com/jsf/core"
         xmlns:jsp="http://java.sun.com/JSP/Page"
         xmlns:jforms="http://www.aspsols.com">
 <jsp:directive.page contentType="text/html" session="false" />
<html>
<head>

<meta http-equiv="X-UA-Compatible" content="chrome=1"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="formName" content="com.aspsols.cotizaciones.reportes.informeDeVentasPorEmpresaParamForm"/>

<jsp:include page="../../../../../resources/stylesReports.html"></jsp:include>

<title>informeDeVentasPorEmpresaParamForm</title>

</head>
<body>
<f:view>
<jforms:gwtscript route="../../../../../gwt24/gwt24.nocache.js" />
	<jforms:desktop width="425" height="355">
		<jforms:desktopContainer height="355">
			<jforms:frame bindsTo="frame" width="425" height="355" left="0" cssStyle="frame" backgroundColor="bfbfbf" heightUnit="px" widthUnit="px">
				<jforms:toolbarPanel bindsTo="toolbar" backgroundColor="bfbfbf" toolbarPosition="Horizontal" width="425" height="60" cssStyle="toolbar-panel">
											                <jforms:button bindsTo="TOOLBAR.run" height="33" width="35" top="5" left="6" cssStyle="toolbar-button toolbar-run" tooltip="run" horizontalAlignment="Alg_Left" nOfRecDisplayed="1" recordDistance="0" keyboardNavigable="true" mouseNavigable="false" visible="true" enabled="true" htmlTooltip="null">
					</jforms:button>
	                <jforms:button bindsTo="TOOLBAR.exit" height="33" width="35" top="5" left="42" cssStyle="toolbar-button toolbar-exit" tooltip="exit" horizontalAlignment="Alg_Left" nOfRecDisplayed="1" recordDistance="0" keyboardNavigable="true" mouseNavigable="false" visible="true" enabled="true" htmlTooltip="null">
					</jforms:button>
	                <jforms:button bindsTo="TOOLBAR.help" height="33" width="35" top="5" left="78" cssStyle="toolbar-button toolbar-help" tooltip="help" horizontalAlignment="Alg_Left" nOfRecDisplayed="1" recordDistance="0" keyboardNavigable="true" mouseNavigable="false" visible="true" enabled="true" htmlTooltip="null">
					</jforms:button>
					<jforms:comboBox bindsTo="DATA.DESFORMAT" height="33" width="80" top="17" left="145" cssStyle="" nOfRecDisplayed="1" tooltip="null" prompt="null" caseRestriction="Normal" horizontalAlignment="Alg_Center" comboStyle="null" visible="true" editable="true" enabled="true" htmlTooltip="null">
						<jforms:font family="Arial" style="0" size="12"/>
						<jforms:promptFont family="Arial" style="0" size="12"/>
						<jforms:comboBoxValues>
							<jforms:comboBoxValue label="PDF" value="PDF" />
							<jforms:comboBoxValue label="HTML" value="HTML" />
							<jforms:comboBoxValue label="XLS" value="XLS" />
							<jforms:comboBoxValue label="TXT" value="TXT" />
							<jforms:comboBoxValue label="CSV" value="CSV" />
						</jforms:comboBoxValues>
					</jforms:comboBox>
				</jforms:toolbarPanel>
				<jforms:mainPanel bindsTo="panel0" width="425" height="355"  cssStyle="main-panel" backgroundColor="bfbfbf" overflow="Hidden">
					<jforms:scrollbar bindsTo="DATA0" height="100" width="20" left="0" top="0" scrollbarOrientation="Vertical" nOfRecDisplayed="1" scrollbarActive="false" currentRecordAttribute="null" visualAttribute="null" currentFieldAttribute="null" recordDistance="0"/>
				</jforms:mainPanel>
				<jforms:stackedPanel bindsTo="panel1" width="425" height="365" left="0" top="0" cssStyle="main-panel" backgroundColor="bfbfbf" viewPortWidth="425" viewPortHeight="355" showScrollbar="false" overflow="Hidden" visible="true" positionType="absolute">
						                <jforms:textGraphic bindsTo="panel1.G_title" height="20" width="164" left="100" cssStyle="" top="50" fill="false" fillColor="ffffff" font="Courier New,1,14" fontColor="000000" text="Parámetros del reporte"/>
	                <jforms:textGraphic bindsTo="panel1.G_periodo" height="14" width="49" left="115" cssStyle="" top="115" fill="false" fillColor="ffffff" font="Courier New,0,12" fontColor="000000" text="Periodo"/>
	                <jforms:textGraphic bindsTo="panel1.TEXT_GRAPHIC0" height="14" width="49" left="115" cssStyle="" top="145" fill="false" fillColor="ffffff" font="Courier New,0,12" fontColor="000000" text="Empresa"/>
						                <jforms:textField bindsTo="DATA.PF_periodo" height="20" width="120" top="110" left="172" backgroundColor="ffffff" foregroundColor="000000" maxSize="20" placeHolder="null" echoChar="null" helpList="" tooltip="null" prompt="null" promptDistance="2,4" promptPosition="left" promptDisplayStyle="AllRecords" promptBackground="000000" promptForeground="000000" promptOpaque="false" nOfRecDisplayed="1" recordDistance="0" formatMask="null" promptCssStyle="null" caseRestriction="Normal" horizontalAlignment="Alg_Left" keyboardNavigable="true" mouseNavigable="true" cssStyle="" cursorStyle="Normal" visible="true" editable="true" enabled="true" validateFromList="false" htmlTooltip="null">
						<jforms:font family="Arial" style="0" size="12"/>
						<jforms:promptFont family="Arial" style="0" size="12"/>
					</jforms:textField>
	                <jforms:textField bindsTo="DATA.PARAMETER_FIELD0" height="20" width="121" top="141" left="172" backgroundColor="ffffff" foregroundColor="000000" maxSize="20" placeHolder="null" echoChar="null" helpList="" tooltip="null" prompt="null" promptDistance="2,4" promptPosition="left" promptDisplayStyle="AllRecords" promptBackground="000000" promptForeground="000000" promptOpaque="false" nOfRecDisplayed="1" recordDistance="0" formatMask="null" promptCssStyle="null" caseRestriction="Normal" horizontalAlignment="Alg_Left" keyboardNavigable="true" mouseNavigable="true" cssStyle="" cursorStyle="Normal" visible="true" editable="true" enabled="true" validateFromList="false" htmlTooltip="null">
						<jforms:font family="Arial" style="0" size="12"/>
						<jforms:promptFont family="Arial" style="0" size="12"/>
					</jforms:textField>
				</jforms:stackedPanel>
            </jforms:frame>
        </jforms:desktopContainer>
    </jforms:desktop>
<jforms:statusBar top="335" width="425" showStatusBar="true"/>
</f:view>
</body>
</html>
</jsp:root>