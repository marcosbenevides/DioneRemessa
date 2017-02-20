package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoEstoque generated by hbm2java
 */
public class JrcTipoEstoque  implements java.io.Serializable {


     private long idTipoEstoque;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String flagTipoEstoque;
     private boolean prioridade;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcTipoNotaEstoquesForEmIdTipoEstoque3 = new HashSet(0);
     private Set jrcTipoNotaEstoquesForDrIdTipoEstoque = new HashSet(0);
     private Set jrcTipoNotaEstoquesForEmIdTipoEstoque1 = new HashSet(0);
     private Set jrcTipoNotaEstoquesForEmIdTipoEstoque2 = new HashSet(0);

    public JrcTipoEstoque() {
    }

	
    public JrcTipoEstoque(long idTipoEstoque, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String flagTipoEstoque, boolean prioridade, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idTipoEstoque = idTipoEstoque;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.flagTipoEstoque = flagTipoEstoque;
        this.prioridade = prioridade;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcTipoEstoque(long idTipoEstoque, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String flagTipoEstoque, boolean prioridade, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcTipoNotaEstoquesForEmIdTipoEstoque3, Set jrcTipoNotaEstoquesForDrIdTipoEstoque, Set jrcTipoNotaEstoquesForEmIdTipoEstoque1, Set jrcTipoNotaEstoquesForEmIdTipoEstoque2) {
       this.idTipoEstoque = idTipoEstoque;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.flagTipoEstoque = flagTipoEstoque;
       this.prioridade = prioridade;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcTipoNotaEstoquesForEmIdTipoEstoque3 = jrcTipoNotaEstoquesForEmIdTipoEstoque3;
       this.jrcTipoNotaEstoquesForDrIdTipoEstoque = jrcTipoNotaEstoquesForDrIdTipoEstoque;
       this.jrcTipoNotaEstoquesForEmIdTipoEstoque1 = jrcTipoNotaEstoquesForEmIdTipoEstoque1;
       this.jrcTipoNotaEstoquesForEmIdTipoEstoque2 = jrcTipoNotaEstoquesForEmIdTipoEstoque2;
    }
   
    public long getIdTipoEstoque() {
        return this.idTipoEstoque;
    }
    
    public void setIdTipoEstoque(long idTipoEstoque) {
        this.idTipoEstoque = idTipoEstoque;
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
    public String getFlagTipoEstoque() {
        return this.flagTipoEstoque;
    }
    
    public void setFlagTipoEstoque(String flagTipoEstoque) {
        this.flagTipoEstoque = flagTipoEstoque;
    }
    public boolean isPrioridade() {
        return this.prioridade;
    }
    
    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }
    public boolean isIndAtivo() {
        return this.indAtivo;
    }
    
    public void setIndAtivo(boolean indAtivo) {
        this.indAtivo = indAtivo;
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
    public Set getJrcTipoNotaEstoquesForEmIdTipoEstoque3() {
        return this.jrcTipoNotaEstoquesForEmIdTipoEstoque3;
    }
    
    public void setJrcTipoNotaEstoquesForEmIdTipoEstoque3(Set jrcTipoNotaEstoquesForEmIdTipoEstoque3) {
        this.jrcTipoNotaEstoquesForEmIdTipoEstoque3 = jrcTipoNotaEstoquesForEmIdTipoEstoque3;
    }
    public Set getJrcTipoNotaEstoquesForDrIdTipoEstoque() {
        return this.jrcTipoNotaEstoquesForDrIdTipoEstoque;
    }
    
    public void setJrcTipoNotaEstoquesForDrIdTipoEstoque(Set jrcTipoNotaEstoquesForDrIdTipoEstoque) {
        this.jrcTipoNotaEstoquesForDrIdTipoEstoque = jrcTipoNotaEstoquesForDrIdTipoEstoque;
    }
    public Set getJrcTipoNotaEstoquesForEmIdTipoEstoque1() {
        return this.jrcTipoNotaEstoquesForEmIdTipoEstoque1;
    }
    
    public void setJrcTipoNotaEstoquesForEmIdTipoEstoque1(Set jrcTipoNotaEstoquesForEmIdTipoEstoque1) {
        this.jrcTipoNotaEstoquesForEmIdTipoEstoque1 = jrcTipoNotaEstoquesForEmIdTipoEstoque1;
    }
    public Set getJrcTipoNotaEstoquesForEmIdTipoEstoque2() {
        return this.jrcTipoNotaEstoquesForEmIdTipoEstoque2;
    }
    
    public void setJrcTipoNotaEstoquesForEmIdTipoEstoque2(Set jrcTipoNotaEstoquesForEmIdTipoEstoque2) {
        this.jrcTipoNotaEstoquesForEmIdTipoEstoque2 = jrcTipoNotaEstoquesForEmIdTipoEstoque2;
    }




}

