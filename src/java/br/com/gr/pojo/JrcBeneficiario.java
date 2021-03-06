package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcBeneficiario generated by hbm2java
 */
public class JrcBeneficiario  implements java.io.Serializable {


     private long idBeneficiario;
     private JrcEmpresa jrcEmpresa;
     private JrcPessoa jrcPessoa;
     private JrcUsuario jrcUsuario;
     private String codigoRef;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcSeguroConfigs = new HashSet(0);

    public JrcBeneficiario() {
    }

	
    public JrcBeneficiario(long idBeneficiario, JrcEmpresa jrcEmpresa, JrcPessoa jrcPessoa, JrcUsuario jrcUsuario, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idBeneficiario = idBeneficiario;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcPessoa = jrcPessoa;
        this.jrcUsuario = jrcUsuario;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcBeneficiario(long idBeneficiario, JrcEmpresa jrcEmpresa, JrcPessoa jrcPessoa, JrcUsuario jrcUsuario, String codigoRef, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcSeguroConfigs) {
       this.idBeneficiario = idBeneficiario;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcPessoa = jrcPessoa;
       this.jrcUsuario = jrcUsuario;
       this.codigoRef = codigoRef;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcSeguroConfigs = jrcSeguroConfigs;
    }
   
    public long getIdBeneficiario() {
        return this.idBeneficiario;
    }
    
    public void setIdBeneficiario(long idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcPessoa getJrcPessoa() {
        return this.jrcPessoa;
    }
    
    public void setJrcPessoa(JrcPessoa jrcPessoa) {
        this.jrcPessoa = jrcPessoa;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
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
    public Set getJrcSeguroConfigs() {
        return this.jrcSeguroConfigs;
    }
    
    public void setJrcSeguroConfigs(Set jrcSeguroConfigs) {
        this.jrcSeguroConfigs = jrcSeguroConfigs;
    }




}


