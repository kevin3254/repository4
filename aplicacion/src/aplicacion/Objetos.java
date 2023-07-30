package aplicacion;
/**
 *
 * @author HP
 */
public class Objetos {
    
private String numerodeplaca;
private String marcadelvehículo;
private String líneadelvehículo;
private String modelodelvehículo;
private String colordelvehículo;
private String nit;
private String estadoregistro;



public Objetos(){
    
numerodeplaca = "";
marcadelvehículo = "";
líneadelvehículo = "";
modelodelvehículo = ""; 
colordelvehículo = "";
nit = "";
estadoregistro = "";  


    
}


   
 
             

public Objetos(String n, String m,String l,String mo ,String co ,String ni ,String es ){
 numerodeplaca = n;
 marcadelvehículo = m;
 líneadelvehículo = l;
 modelodelvehículo = mo;
 colordelvehículo= co;
 nit= ni;
 estadoregistro = es;     
}

public void setNumerodeplaca(String numerodeplaca){
    this.numerodeplaca = numerodeplaca;
}
public void setMarcadelvehículo(String marcadelvehículo){
    this.marcadelvehículo = marcadelvehículo;
    
    }
public void setLíneadelvehículo(String líneadelvehículo){
    this.líneadelvehículo = líneadelvehículo;
    
    }
public void setModelodelvehículo(String modelodelvehículo){
    this.modelodelvehículo = modelodelvehículo;
    }
public void setColordelvehículo(String colordelvehículo){
    this.colordelvehículo = colordelvehículo;
    
    }
public void setNit(String nit){
    this.nit = nit;
    
    }
public void setEstadoregistro(String estadoregistro){
    this.estadoregistro = estadoregistro;
     
    }

public String getNumerodeplaca(){
    return numerodeplaca;
}
public String getMarcadelvehículo(){
    return marcadelvehículo;
}
public String getLíneadelvehículo(){
    return líneadelvehículo;
}
public String getModelodelvehículo(){
    return modelodelvehículo;
}
public String getColordelvehículo(){
    return colordelvehículo;
}
public String getNit(){
    return nit;
}
public String getEstadoregistro(){
    return estadoregistro;
}
 

@Override
public String toString (){
return
"Registro[Numero de placa "+numerodeplaca+"Marca de vehículo"+marcadelvehículo+"Línea del vehículo"+líneadelvehículo+"Modelo del vehículo"+modelodelvehículo+"Color del vehículo"+colordelvehículo+"Nit"+nit+ "Estado registro"+estadoregistro+"]";

} 

}
