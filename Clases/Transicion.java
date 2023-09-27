package Clases;

public class Transicion {
    private char SimbInf;
    private char SimbSup;
    private Estado Edo;

    //constructores
    public Transicion(char simb,Estado e){
        this.SimbInf = simb;
        this.SimbSup = simb;
        this.Edo = e;
    }

    public Transicion(char simb1, char simb2, Estado e){
        this.SimbInf = simb1;
        this.SimbSup = simb2;
        this.Edo = e;
    }

    public Transicion(){
        this.Edo=null;
    }

    // estos 2 metodos a continuacion, son muy similares a nuestros constructores
    //sin embargo, estos metodos los usaremos cuando ya tengamos una instancia
    //es decir le queremos colocar informacion
    public void SetTransicion(char s1, char s2, Estado e){
        this.SimbInf = s1;
        this.SimbSup = s2;
        this.Edo = e;
    }
    public void SetTransicion(char s1, Estado e){
        this.SimbInf = s1;
        this.SimbSup = s1;
        this.Edo = e;
    }

    // getters y setters de simbInf y simbSup
    public char getSimbInf() {
        return SimbInf;
    }

    public void setSimbInf(char SimbInf) {
        this.SimbInf = SimbInf;
    }

    public char getSimbSup(){
        return SimbSup;
    }

    public void setSimbSup(char SimbSup){
        this.SimbSup=SimbSup;
    }

    //metodo Get EdoTrans
    //va a recibir un caracter y nos va a indicar si abajo de ese caracter
    //tenemos un estado o una transicion si no la tuviera, nos va a regresar null
    public Estado GetEdoTrans(char s){

        //si el caracter esta entre los simbolos sup y inf, si es asi 
        //va a ver una transicion hacia un estado, el estado que forma el par
        if(SimbInf <= s && s <= SimbSup){
            return Edo;
        }
        return null;
    }



    
}
