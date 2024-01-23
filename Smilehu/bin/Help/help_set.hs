<helpset version="1.0">



    <maps>
        <homeID> aplicacion </homeID>
        <mapref location="map.jhm"></mapref>
    </maps>

    <view>
        <name>Tabla de contenidos</name>
        <label>Tabla de contenidos</label>
        <type>javax.help.TOCView</type>
        <data>toc.xml</data>
    </view>

    <view>
        <name>Indice</name>
        <label>Indice</label>
        <type>javax.help.IndexView</type>
        <data>index.xml</data>
    </view>

    <view>
        <name>Buscador</name>
        <label>Buscador</label>
        <type>javax.help.SearchView</type>
        <data engine="com.sun.java.help.search.DefaultSearchEngine">
        Java Help  </data>

    </view>

</helpset>