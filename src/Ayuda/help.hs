<?xml version="1.0" encoding='ISO-8859-1' ?>
<!DOCTYPE helpset PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 1.0//EN" "http://java.sun.com/products/javahelp/helpset_1_0.dtd">
 
<helpset version="1.0">
	<title>Ayuda Ejemplo JavaHelp</title>
	<maps>
		<!-- Pagina por defecto al mostrar la ayuda -->
		<homeID>manual</homeID>
		<!-- Que mapa deseamos -->
		<mapref location="mapa.jhm"/>
	</maps>
 
	<!-- Las Vistas que deseamos mostrar en la ayuda -->
	<!-- Vista de contenidos -->
	<view>
		<name>Tabla Contenidos</name>
		<label>Tabla de contenidos</label>
		<type>javax.help.TOCView</type>
		<data>tablacontenidos.xml</data>
	</view>
 
 	<!-- Vista de índice -->
	<view>
		<name>Indice</name>
		<label>El indice</label>
		<type>javax.help.IndexView</type>
		<data>indice.xml</data>
	</view>
 
 	 <!-- Vista de búsqueda -->
	 <view>
		<name>Buscar</name>
		<label>Buscar</label>
		<type>javax.help.SearchView</type>
		<data engine="com.sun.java.help.search.DefaultSearchEngine">
			JavaHelpSearch
		</data>
	</view>
	
	<!-- Vista de favoritos -->
 	<view>
      <name>Favoritos</name>
      <label>Favoritos</label>
      <type>javax.help.FavoritesView</type>
   </view>
   
   <!-- Configuración de la pantalla de ayuda -->
    <presentation default="true" displayviews="false" displayviewimages="true">
		<name>MainWin</name>
		<size width="750" height="850"/>		
		<location x="300" y="200"/>			
		<title></title> 
		<toolbar>	
				<helpaction image="BackwardIco">javax.help.BackAction</helpaction>
				<helpaction image="ForwardIco">javax.help.ForwardAction</helpaction>
				<helpaction image="imgAnhadirFavorito">javax.help.FavoritesAction</helpaction>                        
		</toolbar>
    </presentation>  
</helpset>


