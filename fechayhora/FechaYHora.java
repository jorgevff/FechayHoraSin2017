
public class FechaYHora
{

    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;
    
    
    public FechaYHora()
    {
        dia = 1;
        mes = 1;
        anio = 1;
        hora = 0;
        minuto = 0;
       
    }
    
    public String getFechaYHora()
    {
        String muestraFechaYHora = "";
        String nuevoDia = "";
        String nuevoMes = "";
        String nuevoAnio = "";
        String nuevaHora = "";
        String nuevoMinuto = "";
        
        if(dia < 10){
            nuevoDia = "0" + dia;
        }
        else{
            nuevoDia = "" + dia;
        }
        if(mes < 10){
            nuevoMes = "0" + mes;
        }
        else{
            nuevoMes = "" + mes;
        }
        if(anio < 10){
            nuevoAnio = "0" + anio;
        }
        else{
            nuevoAnio = "" + anio;
        }
        if(hora < 10){
            nuevaHora = "0" + hora;
        }
        else{
            nuevaHora = "" + hora;
        }
        if(minuto < 10){
            nuevoMinuto = "0" + minuto;
        }
        else{
            nuevoMinuto = "" + minuto;
        }
        
        return nuevoDia + "-" +  nuevoMes + "-" + nuevoAnio + " " + nuevaHora + ":" + nuevoMinuto;
        
        
    }
    
    public void avanzar()
    {
        minuto += 1;
        if(minuto == 60){
            hora += 1;
            minuto = 0;
            if(hora == 24){
                dia += 1;
                hora = 0;
                if(dia == 31){
                    mes += 1;
                    dia = 1;
                    if(mes == 13){
                        anio += 1;
                    }
                }
            }
        }
    
    }
    
    public void fijarFechaYHora(int nuevoDia, int nuevoMes, int nuevoAnio, int nuevaHora, int nuevoMinuto)
    {
        if((nuevoDia > 0 && nuevoDia < 31) && (nuevoMes > 0 && nuevoMes < 13) && (nuevoAnio > 0 && nuevoAnio < 100) && (nuevaHora >= 0 && nuevaHora < 24) && (nuevoMinuto >= 0 && nuevoMinuto < 60))
        {
           dia = nuevoDia;
           mes = nuevoMes;
           anio = nuevoAnio;
           hora = nuevaHora;
           minuto = nuevoMinuto;
        }
    }
    







}    