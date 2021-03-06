package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoOperacao generated by hbm2java
 */
public class JrcTipoOperacao  implements java.io.Serializable {


     private long idTipoOperacao;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String flagTipoOperacao;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcPedidoVendaItems = new HashSet(0);
     private Set jrcServicoPrecos = new HashSet(0);

    public JrcTipoOperacao() {
    }

	
    public JrcTipoOperacao(long idTipoOperacao, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String flagTipoOperacao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idTipoOperacao = idTipoOperacao;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.flagTipoOperacao = flagTipoOperacao;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcTipoOperacao(long idTipoOperacao, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String flagTipoOperacao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcPedidoVendaItems, Set jrcServicoPrecos) {
       this.idTipoOperacao = idTipoOperacao;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.flagTipoOperacao = flagTipoOperacao;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcPedidoVendaItems = jrcPedidoVendaItems;
       this.jrcServicoPrecos = jrcServicoPrecos;
    }
   
    public long getIdTipoOperacao() {
        return this.idTipoOperacao;
    }
    
    public void setIdTipoOperacao(long idTipoOperacao) {
        this.idTipoOperacao = idTipoOperacao;
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
    public String getFlagTipoOperacao() {
        return this.flagTipoOperacao;
    }
    
    public void setFlagTipoOperacao(String flagTipoOperacao) {
        this.flagTipoOperacao = flagTipoOperacao;
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
    public Set getJrcPedidoVendaItems() {
        return this.jrcPedidoVendaItems;
    }
    
    public void setJrcPedidoVendaItems(Set jrcPedidoVendaItems) {
        this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }
    public Set getJrcServicoPrecos() {
        return this.jrcServicoPrecos;
    }
    
    public void setJrcServicoPrecos(Set jrcServicoPrecos) {
        this.jrcServicoPrecos = jrcServicoPrecos;
    }




}


