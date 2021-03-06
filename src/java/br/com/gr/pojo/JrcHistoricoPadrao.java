package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcHistoricoPadrao generated by hbm2java
 */
public class JrcHistoricoPadrao  implements java.io.Serializable {


     private long idHistoricoPadrao;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String codigo;
     private String descricao;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcFinBancos = new HashSet(0);
     private Set jrcTipoServicos = new HashSet(0);
     private Set jrcTipoNotasForIdHstpadNfPis = new HashSet(0);
     private Set jrcTipoNotasForIdHstpadNfCofins = new HashSet(0);
     private Set jrcTipoNotasForIdHstpadNfEstoque = new HashSet(0);
     private Set jrcTipoNotasForIdHstpadNfIcmsDr = new HashSet(0);
     private Set jrcTipoNotasForIdHstpadNfEstoqueDr = new HashSet(0);
     private Set jrcFinLancamentos = new HashSet(0);
     private Set jrcTipoNotasForIdHstpadNf = new HashSet(0);
     private Set jrcTipoNotasForIdHstpadNfIcms = new HashSet(0);
     private Set jrcFinConfigFormapagtos = new HashSet(0);

    public JrcHistoricoPadrao() {
    }

	
    public JrcHistoricoPadrao(long idHistoricoPadrao, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String codigo, String descricao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idHistoricoPadrao = idHistoricoPadrao;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.codigo = codigo;
        this.descricao = descricao;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcHistoricoPadrao(long idHistoricoPadrao, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String codigo, String descricao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcFinBancos, Set jrcTipoServicos, Set jrcTipoNotasForIdHstpadNfPis, Set jrcTipoNotasForIdHstpadNfCofins, Set jrcTipoNotasForIdHstpadNfEstoque, Set jrcTipoNotasForIdHstpadNfIcmsDr, Set jrcTipoNotasForIdHstpadNfEstoqueDr, Set jrcFinLancamentos, Set jrcTipoNotasForIdHstpadNf, Set jrcTipoNotasForIdHstpadNfIcms, Set jrcFinConfigFormapagtos) {
       this.idHistoricoPadrao = idHistoricoPadrao;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.codigo = codigo;
       this.descricao = descricao;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcFinBancos = jrcFinBancos;
       this.jrcTipoServicos = jrcTipoServicos;
       this.jrcTipoNotasForIdHstpadNfPis = jrcTipoNotasForIdHstpadNfPis;
       this.jrcTipoNotasForIdHstpadNfCofins = jrcTipoNotasForIdHstpadNfCofins;
       this.jrcTipoNotasForIdHstpadNfEstoque = jrcTipoNotasForIdHstpadNfEstoque;
       this.jrcTipoNotasForIdHstpadNfIcmsDr = jrcTipoNotasForIdHstpadNfIcmsDr;
       this.jrcTipoNotasForIdHstpadNfEstoqueDr = jrcTipoNotasForIdHstpadNfEstoqueDr;
       this.jrcFinLancamentos = jrcFinLancamentos;
       this.jrcTipoNotasForIdHstpadNf = jrcTipoNotasForIdHstpadNf;
       this.jrcTipoNotasForIdHstpadNfIcms = jrcTipoNotasForIdHstpadNfIcms;
       this.jrcFinConfigFormapagtos = jrcFinConfigFormapagtos;
    }
   
    public long getIdHistoricoPadrao() {
        return this.idHistoricoPadrao;
    }
    
    public void setIdHistoricoPadrao(long idHistoricoPadrao) {
        this.idHistoricoPadrao = idHistoricoPadrao;
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
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public Set getJrcFinBancos() {
        return this.jrcFinBancos;
    }
    
    public void setJrcFinBancos(Set jrcFinBancos) {
        this.jrcFinBancos = jrcFinBancos;
    }
    public Set getJrcTipoServicos() {
        return this.jrcTipoServicos;
    }
    
    public void setJrcTipoServicos(Set jrcTipoServicos) {
        this.jrcTipoServicos = jrcTipoServicos;
    }
    public Set getJrcTipoNotasForIdHstpadNfPis() {
        return this.jrcTipoNotasForIdHstpadNfPis;
    }
    
    public void setJrcTipoNotasForIdHstpadNfPis(Set jrcTipoNotasForIdHstpadNfPis) {
        this.jrcTipoNotasForIdHstpadNfPis = jrcTipoNotasForIdHstpadNfPis;
    }
    public Set getJrcTipoNotasForIdHstpadNfCofins() {
        return this.jrcTipoNotasForIdHstpadNfCofins;
    }
    
    public void setJrcTipoNotasForIdHstpadNfCofins(Set jrcTipoNotasForIdHstpadNfCofins) {
        this.jrcTipoNotasForIdHstpadNfCofins = jrcTipoNotasForIdHstpadNfCofins;
    }
    public Set getJrcTipoNotasForIdHstpadNfEstoque() {
        return this.jrcTipoNotasForIdHstpadNfEstoque;
    }
    
    public void setJrcTipoNotasForIdHstpadNfEstoque(Set jrcTipoNotasForIdHstpadNfEstoque) {
        this.jrcTipoNotasForIdHstpadNfEstoque = jrcTipoNotasForIdHstpadNfEstoque;
    }
    public Set getJrcTipoNotasForIdHstpadNfIcmsDr() {
        return this.jrcTipoNotasForIdHstpadNfIcmsDr;
    }
    
    public void setJrcTipoNotasForIdHstpadNfIcmsDr(Set jrcTipoNotasForIdHstpadNfIcmsDr) {
        this.jrcTipoNotasForIdHstpadNfIcmsDr = jrcTipoNotasForIdHstpadNfIcmsDr;
    }
    public Set getJrcTipoNotasForIdHstpadNfEstoqueDr() {
        return this.jrcTipoNotasForIdHstpadNfEstoqueDr;
    }
    
    public void setJrcTipoNotasForIdHstpadNfEstoqueDr(Set jrcTipoNotasForIdHstpadNfEstoqueDr) {
        this.jrcTipoNotasForIdHstpadNfEstoqueDr = jrcTipoNotasForIdHstpadNfEstoqueDr;
    }
    public Set getJrcFinLancamentos() {
        return this.jrcFinLancamentos;
    }
    
    public void setJrcFinLancamentos(Set jrcFinLancamentos) {
        this.jrcFinLancamentos = jrcFinLancamentos;
    }
    public Set getJrcTipoNotasForIdHstpadNf() {
        return this.jrcTipoNotasForIdHstpadNf;
    }
    
    public void setJrcTipoNotasForIdHstpadNf(Set jrcTipoNotasForIdHstpadNf) {
        this.jrcTipoNotasForIdHstpadNf = jrcTipoNotasForIdHstpadNf;
    }
    public Set getJrcTipoNotasForIdHstpadNfIcms() {
        return this.jrcTipoNotasForIdHstpadNfIcms;
    }
    
    public void setJrcTipoNotasForIdHstpadNfIcms(Set jrcTipoNotasForIdHstpadNfIcms) {
        this.jrcTipoNotasForIdHstpadNfIcms = jrcTipoNotasForIdHstpadNfIcms;
    }
    public Set getJrcFinConfigFormapagtos() {
        return this.jrcFinConfigFormapagtos;
    }
    
    public void setJrcFinConfigFormapagtos(Set jrcFinConfigFormapagtos) {
        this.jrcFinConfigFormapagtos = jrcFinConfigFormapagtos;
    }




}


