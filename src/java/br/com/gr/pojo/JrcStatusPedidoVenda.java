package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcStatusPedidoVenda generated by hbm2java
 */
public class JrcStatusPedidoVenda  implements java.io.Serializable {


     private long idStatusPedidoVenda;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String flagStatus;
     private byte prioridade;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Boolean indDocEntregue;
     private Boolean indDocExportado;
     private String flagDocAgPag;
     private String flagDocAgAvb;
     private Set jrcPedidoVendas = new HashSet(0);

    public JrcStatusPedidoVenda() {
    }

	
    public JrcStatusPedidoVenda(long idStatusPedidoVenda, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String flagStatus, byte prioridade, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idStatusPedidoVenda = idStatusPedidoVenda;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.flagStatus = flagStatus;
        this.prioridade = prioridade;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcStatusPedidoVenda(long idStatusPedidoVenda, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String flagStatus, byte prioridade, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Boolean indDocEntregue, Boolean indDocExportado, String flagDocAgPag, String flagDocAgAvb, Set jrcPedidoVendas) {
       this.idStatusPedidoVenda = idStatusPedidoVenda;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.flagStatus = flagStatus;
       this.prioridade = prioridade;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indDocEntregue = indDocEntregue;
       this.indDocExportado = indDocExportado;
       this.flagDocAgPag = flagDocAgPag;
       this.flagDocAgAvb = flagDocAgAvb;
       this.jrcPedidoVendas = jrcPedidoVendas;
    }
   
    public long getIdStatusPedidoVenda() {
        return this.idStatusPedidoVenda;
    }
    
    public void setIdStatusPedidoVenda(long idStatusPedidoVenda) {
        this.idStatusPedidoVenda = idStatusPedidoVenda;
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
    public String getFlagStatus() {
        return this.flagStatus;
    }
    
    public void setFlagStatus(String flagStatus) {
        this.flagStatus = flagStatus;
    }
    public byte getPrioridade() {
        return this.prioridade;
    }
    
    public void setPrioridade(byte prioridade) {
        this.prioridade = prioridade;
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
    public Boolean getIndDocEntregue() {
        return this.indDocEntregue;
    }
    
    public void setIndDocEntregue(Boolean indDocEntregue) {
        this.indDocEntregue = indDocEntregue;
    }
    public Boolean getIndDocExportado() {
        return this.indDocExportado;
    }
    
    public void setIndDocExportado(Boolean indDocExportado) {
        this.indDocExportado = indDocExportado;
    }
    public String getFlagDocAgPag() {
        return this.flagDocAgPag;
    }
    
    public void setFlagDocAgPag(String flagDocAgPag) {
        this.flagDocAgPag = flagDocAgPag;
    }
    public String getFlagDocAgAvb() {
        return this.flagDocAgAvb;
    }
    
    public void setFlagDocAgAvb(String flagDocAgAvb) {
        this.flagDocAgAvb = flagDocAgAvb;
    }
    public Set getJrcPedidoVendas() {
        return this.jrcPedidoVendas;
    }
    
    public void setJrcPedidoVendas(Set jrcPedidoVendas) {
        this.jrcPedidoVendas = jrcPedidoVendas;
    }




}


