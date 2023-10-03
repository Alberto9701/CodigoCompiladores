package Clases;

import java.util.HashSet;

public class AFN {
    public static HashSet<AFN> ConjDeAFNs = new HashSet<AFN>();
    private Estado EdoIni;
    private HashSet<Estado> EdosAFN = new HashSet<Estado>();
    private HashSet<Estado> EdosAcept = new HashSet<Estado>();
    private HashSet<Character> Alfabeto = new HashSet<Character>();
    //private boolean SeAgregoAFNUnionLexico;
    public int IdAFN;
    public AFN(){
        this.IdAFN = 0;
        this.EdoIni = null;
        this.EdosAFN = new HashSet<>();
        this.EdosAcept = new HashSet<>();
        this.Alfabeto = new HashSet<>();
        //SeAgregoAFNUnionLexico = false;
    }

    public AFN CrearAFNBasico(char s){
        Transicion t;
        Estado e1, e2;
        e1 = new Estado();
        e2= new Estado();
        t = new Transicion(s, e2);
        e1.getTrans().add(t);
        e2.setEdoAcept(true);
        this.Alfabeto.add(s);
        this.EdoIni = e1;
        this.EdosAFN.add(e1);
        this.EdosAFN.add(e2);
        this.EdosAcept.add(e2);
        //SeAgregoAFNUnionLexico = false;
        return this;

    }

    //este es un nuevo comentario

    //este es un nuevo comentario para el segundo commit


}
