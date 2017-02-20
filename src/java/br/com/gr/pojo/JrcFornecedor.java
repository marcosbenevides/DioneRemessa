package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcFornecedor generated by hbm2java
 */
public class JrcFornecedor  implements java.io.Serializable {


     private long idFornecedor;
     private JrcEmpresa jrcEmpresa;
     private JrcPessoa jrcPessoa;
     private JrcUsuario jrcUsuario;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String codigoRef;
     private Set jrcRecebimentos = new HashSet(0);
     private Set jrcNotaFiscals = new HashSet(0);

    public JrcFornecedor() {
    }

	
    public JrcFornecedor(long idFornecedor, JrcEmpresa jrcEmpresa, JrcPessoa jrcPessoa, JrcUsuario jrcUsuario, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idFornecedor = idFornecedor;
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
    public JrcFornecedor(long idFornecedor, JrcEmpresa jrcEmpresa, JrcPessoa jrcPessoa, JrcUsuario jrcUsuario, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String codigoRef, Set jrcRecebimentos, Set jrcNotaFiscals) {
       this.idFornecedor = idFornecedor;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcPessoa = jrcPessoa;
       this.jrcUsuario = jrcUsuario;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.codigoRef = codigoRef;
       this.jrcRecebimentos = jrcRecebimentos;
       this.jrcNotaFiscals = jrcNotaFiscals;
    }
   
    public long getIdFornecedor() {
        return this.idFornecedor;
    }
    
    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
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
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public Set getJrcRecebimentos() {
        return this.jrcRecebimentos;
    }
    
    public void setJrcRecebimentos(Set jrcRecebimentos) {
        this.jrcRecebimentos = jrcRecebimentos;
    }
    public Set getJrcNotaFiscals() {
        return this.jrcNotaFiscals;
    }
    
    public void setJrcNotaFiscals(Set jrcNotaFiscals) {
        this.jrcNotaFiscals = jrcNotaFiscals;
    }




}


