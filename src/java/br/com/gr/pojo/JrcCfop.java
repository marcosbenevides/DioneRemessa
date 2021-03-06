package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcCfop generated by hbm2java
 */
public class JrcCfop  implements java.io.Serializable {


     private long idCfop;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String cfopOperacao;
     private String cfopDetalhe;
     private String descricao;
     private Set jrcNotaFiscals = new HashSet(0);
     private Set jrcFinLancamentos = new HashSet(0);

    public JrcCfop() {
    }

	
    public JrcCfop(long idCfop, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String cfopOperacao, String cfopDetalhe, String descricao) {
        this.idCfop = idCfop;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.cfopOperacao = cfopOperacao;
        this.cfopDetalhe = cfopDetalhe;
        this.descricao = descricao;
    }
    public JrcCfop(long idCfop, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String cfopOperacao, String cfopDetalhe, String descricao, Set jrcNotaFiscals, Set jrcFinLancamentos) {
       this.idCfop = idCfop;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.cfopOperacao = cfopOperacao;
       this.cfopDetalhe = cfopDetalhe;
       this.descricao = descricao;
       this.jrcNotaFiscals = jrcNotaFiscals;
       this.jrcFinLancamentos = jrcFinLancamentos;
    }
   
    public long getIdCfop() {
        return this.idCfop;
    }
    
    public void setIdCfop(long idCfop) {
        this.idCfop = idCfop;
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
    public String getCfopOperacao() {
        return this.cfopOperacao;
    }
    
    public void setCfopOperacao(String cfopOperacao) {
        this.cfopOperacao = cfopOperacao;
    }
    public String getCfopDetalhe() {
        return this.cfopDetalhe;
    }
    
    public void setCfopDetalhe(String cfopDetalhe) {
        this.cfopDetalhe = cfopDetalhe;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Set getJrcNotaFiscals() {
        return this.jrcNotaFiscals;
    }
    
    public void setJrcNotaFiscals(Set jrcNotaFiscals) {
        this.jrcNotaFiscals = jrcNotaFiscals;
    }
    public Set getJrcFinLancamentos() {
        return this.jrcFinLancamentos;
    }
    
    public void setJrcFinLancamentos(Set jrcFinLancamentos) {
        this.jrcFinLancamentos = jrcFinLancamentos;
    }




}


