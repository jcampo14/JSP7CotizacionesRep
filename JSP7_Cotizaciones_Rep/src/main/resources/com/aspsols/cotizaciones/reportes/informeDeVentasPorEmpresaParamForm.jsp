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

<jsp:include page="../../../../../resources/styles.html"></jsp:include>

<title>frame</title>

</head>
<body>
<f:view>
<jforms:gwtscript route="../../../../../gwt24/gwt24.nocache.js" />
	<jforms:desktop width="292" height="250">
		<jforms:desktopContainer height="250">
			<jforms:frame bindsTo="frame" width="292" height="250" left="0" cssStyle="null" backgroundColor="bfbfbf" heightUnit="px" widthUnit="px">
				<jforms:toolbarPanel bindsTo="toolbar" backgroundColor="bfbfbf" toolbarPosition="Horizontal" width="292" height="43" cssStyle="null">
											                <jforms:button bindsTo="TOOLBAR.run" height="33" width="35" top="5" left="6" cssStyle="" text="null" backgroundColor="ffffff" foregroundColor="000000" backgroundImage="../../../../../resources/image/Run.png" tooltip="run" prompt="null" promptPosition="Left" promptDisplayStyle="AllRecords" promptDistance="2,4" promptForeground="000000" promptBackground="ffffff" promptOpaque="false" horizontalAlignment="Alg_Left" nOfRecDisplayed="1" recordDistance="0" keyboardNavigable="true" mouseNavigable="false" visible="true" enabled="true" htmlTooltip="null">
						<jforms:font family="Arial" style="0" size="12"/>
						<jforms:promptFont family="Arial" style="0" size="12"/>
					</jforms:button>
	                <jforms:button bindsTo="TOOLBAR.exit" height="33" width="35" top="5" left="42" cssStyle="" text="null" backgroundColor="ffffff" foregroundColor="000000" backgroundImage="../../../../../resources/image/exit.png" tooltip="exit" prompt="null" promptPosition="Left" promptDisplayStyle="AllRecords" promptDistance="2,4" promptForeground="000000" promptBackground="ffffff" promptOpaque="false" horizontalAlignment="Alg_Left" nOfRecDisplayed="1" recordDistance="0" keyboardNavigable="true" mouseNavigable="false" visible="true" enabled="true" htmlTooltip="null">
						<jforms:font family="Arial" style="0" size="12"/>
						<jforms:promptFont family="Arial" style="0" size="12"/>
					</jforms:button>
	                <jforms:button bindsTo="TOOLBAR.help" height="33" width="35" top="5" left="78" cssStyle="" text="null" backgroundColor="ffffff" foregroundColor="000000" backgroundImage="../../../../../resources/image/Help.png" tooltip="help" prompt="null" promptPosition="Left" promptDisplayStyle="AllRecords" promptDistance="2,4" promptForeground="000000" promptBackground="ffffff" promptOpaque="false" horizontalAlignment="Alg_Left" nOfRecDisplayed="1" recordDistance="0" keyboardNavigable="true" mouseNavigable="false" visible="true" enabled="true" htmlTooltip="null">
						<jforms:font family="Arial" style="0" size="12"/>
						<jforms:promptFont family="Arial" style="0" size="12"/>
					</jforms:button>
					<jforms:comboBox bindsTo="DATA.DESFORMAT" height="33" width="80" top="5" left="115" cssStyle="" nOfRecDisplayed="1" tooltip="null" prompt="null" promptDistance="2,4" promptPosition="left" promptDisplayStyle="AllRecords" promptBackground="000000" promptForeground="000000" promptOpaque="false" recordDistance="0" promptCssStyle="null" caseRestriction="Normal" horizontalAlignment="Alg_Center" comboStyle="null" visible="true" editable="true" enabled="true" htmlTooltip="null">
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
				<jforms:mainPanel bindsTo="panel0" width="292" height="250"  cssStyle="null" backgroundColor="bfbfbf" overflow="Hidden">
					<jforms:scrollbar bindsTo="DATA0" height="100" width="20" left="0" top="0" scrollbarOrientation="Vertical" nOfRecDisplayed="1" scrollbarActive="false" currentRecordAttribute="null" visualAttribute="null" currentFieldAttribute="null" recordDistance="0"/>
				</jforms:mainPanel>
				<jforms:stackedPanel bindsTo="panel1" width="292" height="260" left="0" top="0" cssStyle="null" backgroundColor="bfbfbf" viewPortWidth="292" viewPortHeight="250" showScrollbar="false" overflow="Hidden" visible="true" positionType="absolute">
						                <jforms:rectangle bindsTo="panel1.RECTANGLE0" borderType="Normal" fill="false" fillColor="879bd3" height="27" width="89" left="100" top="41" lineWidth="1" borderColor="000000"/>
	                <jforms:rectangle bindsTo="panel1.RECTANGLE1" borderType="Normal" fill="false" fillColor="879bd3" height="38" width="162" left="62" top="89" lineWidth="1" borderColor="000000"/>
	                <jforms:roundedRectangle bindsTo="panel1.ROUNDED_RECTANGLE0" borderColor="000000" fill="false" fillColor="879bd3" height="142" width="210" left="39" top="28" lineWidth="1" xRadious="10" yRadious="10"/>	                <jforms:textGraphic bindsTo="panel1.TEXT_GRAPHIC0" height="19" width="79" left="107" cssStyle="" top="45" fill="false" fillColor="ffffff" font="Arial,1,16" fontColor="000000" text="Par�metro"/>
	                <jforms:textGraphic bindsTo="panel1.TEXT_GRAPHIC1" height="15" width="49" left="72" cssStyle="" top="100" fill="false" fillColor="ffffff" font="Arial,0,12" fontColor="000000" text="Periodo :"/>
						                <jforms:textField bindsTo="DATA.PARAMETER_FIELD0" height="19" width="84" top="99" left="129" backgroundColor="ffffff" foregroundColor="000000" maxSize="20" placeHolder="null" echoChar="null" helpList="" tooltip="a�o del cual se requiere informe de venta total" prompt="null" promptDistance="2,4" promptPosition="left" promptDisplayStyle="AllRecords" promptBackground="000000" promptForeground="000000" promptOpaque="false" nOfRecDisplayed="1" recordDistance="0" formatMask="null" promptCssStyle="null" caseRestriction="Normal" horizontalAlignment="Alg_Left" keyboardNavigable="true" mouseNavigable="true" cssStyle="" cursorStyle="Normal" visible="true" editable="true" enabled="true" validateFromList="false" htmlTooltip="null">
						<jforms:font family="Arial" style="0" size="12"/>
						<jforms:promptFont family="Arial" style="0" size="12"/>
					</jforms:textField>
				</jforms:stackedPanel>
            </jforms:frame>
        </jforms:desktopContainer>
    </jforms:desktop>
<jforms:statusBar top="230" width="292" showStatusBar="true"/>
</f:view>
</body>
</html>
</jsp:root>