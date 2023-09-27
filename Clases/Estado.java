package Clases;

import java.util.HashSet;

public class Estado {

    static int ContadorIdEstado =0;
    private int idEstado;
    private boolean EdoAcept;
    private int Token;
    private HashSet<Transicion> Trans = new HashSet<Transicion>();

    public Estado() {
        this.EdoAcept = false;
        this.Token = -1;
        this.idEstado = ContadorIdEstado++;
        this.Trans = new HashSet<>();
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public boolean getEdoAcept() {
        return EdoAcept;
    }

    public void setEdoAcept(boolean EdoAcept) {
        this.EdoAcept = EdoAcept;
    }

    public int getToken() {
        return Token;
    }

    public void setToken(int Token) {
        this.Token = Token;
    }

    public HashSet<Transicion> getTrans() {
        return Trans;
    }

    public void setTrans(HashSet<Transicion> Trans) {
        this.Trans = Trans;
    }

}