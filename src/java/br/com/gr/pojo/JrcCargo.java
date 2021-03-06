package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcCargo generated by hbm2java
 */
public class JrcCargo  implements java.io.Serializable {


     private long idCargo;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String codigoRef;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String flagRemuneracao;
     private String flagWmsOperadorUmv;
     private String flagWmsOperadorUmh;
     private String flagWmsConferente;
     private Set jrcUsuarios = new HashSet(0);

    public JrcCargo() {
    }

	
    public JrcCargo(long idCargo, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagRemuneracao, String flagWmsOperadorUmv, String flagWmsOperadorUmh, String flagWmsConferente) {
        this.idCargo = idCargo;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.flagRemuneracao = flagRemuneracao;
        this.flagWmsOperadorUmv = flagWmsOperadorUmv;
        this.flagWmsOperadorUmh = flagWmsOperadorUmh;
        this.flagWmsConferente = flagWmsConferente;
    }
    public JrcCargo(long idCargo, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String codigoRef, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagRemuneracao, String flagWmsOperadorUmv, String flagWmsOperadorUmh, String flagWmsConferente, Set jrcUsuarios) {
       this.idCargo = idCargo;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.codigoRef = codigoRef;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.flagRemuneracao = flagRemuneracao;
       this.flagWmsOperadorUmv = flagWmsOperadorUmv;
       this.flagWmsOperadorUmh = flagWmsOperadorUmh;
       this.flagWmsConferente = flagWmsConferente;
       this.jrcUsuarios = jrcUsuarios;
    }
   
    public long getIdCargo() {
        return this.idCargo;
    }
    
    public void setIdCargo(long idCargo) {
        this.idCargo = idCargo;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
    }
    public String getDescBreve() {
        return this.descBreve;
    }
    
    public void setDescBreve(String descBreve) {
        this.descBreve = descBreve;
    }
    public String getDescLonga() {
        return this.descLonga;
    }
    
    public void setDescLonga(String descLonga) {
        this.descLonga = descLonga;
    }
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public Date getDtInicioPeriodo() {
        return this.dtInicioPeriodo;
    }
    
    public void setDtInicioPeriodo(Date dtInicioPeriodo) {
        this.dtInicioPeriodo = dtInicioPeriodo;
    }
    public Date getDtFimPeriodo() {
        return this.dtFimPeriodo;
    }
    
    public void setDtFimPeriodo(Date dtFimPeriodo) {
        this.dtFimPeriodo = dtFimPeriodo;
    }
    public Date getDtInclusao() {
        return this.dtInclusao;
    }
    
    public void setDtInclusao(Date dtInclusao) {
        this.dtInclusao = dtInclusao;
    }
    public Date getDtAlteracao() {
        return this.dtAlteracao;
    }
    
    public void setDtAlteracao(Date dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }
    public long getVersaoSistema() {
        return this.versaoSistema;
    }
    
    public void setVersaoSistema(long versaoSistema) {
        this.versaoSistema = versaoSistema;
    }
    public long getVersaoRegistro() {
        return this.versaoRegistro;
    }
    
    public void setVersaoRegistro(long versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }
    public String getFlagRemuneracao() {
        return this.flagRemuneracao;
    }
    
    public void setFlagRemuneracao(String flagRemuneracao) {
        this.flagRemuneracao = flagRemuneracao;
    }
    public String getFlagWmsOperadorUmv() {
        return this.flagWmsOperadorUmv;
    }
    
    public void setFlagWmsOperadorUmv(String flagWmsOperadorUmv) {
        this.flagWmsOperadorUmv = flagWmsOperadorUmv;
    }
    public String getFlagWmsOperadorUmh() {
        return this.flagWmsOperadorUmh;
    }
    
    public void setFlagWmsOperadorUmh(String flagWmsOperadorUmh) {
        this.flagWmsOperadorUmh = flagWmsOperadorUmh;
    }
    public String getFlagWmsConferente() {
        return this.flagWmsConferente;
    }
    
    public void setFlagWmsConferente(String flagWmsConferente) {
        this.flagWmsConferente = flagWmsConferente;
    }
    public Set getJrcUsuarios() {
        return this.jrcUsuarios;
    }
    
    public void setJrcUsuarios(Set jrcUsuarios) {
        this.jrcUsuarios = jrcUsuarios;
    }




}


