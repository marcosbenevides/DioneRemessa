package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoNotaEstoque generated by hbm2java
 */
public class JrcTipoNotaEstoque  implements java.io.Serializable {


     private long idTipoNotaEstoque;
     private JrcEmpresa jrcEmpresa;
     private JrcGrupoEstoque jrcGrupoEstoqueByEmIdGrupoEstoque;
     private JrcGrupoEstoque jrcGrupoEstoqueByDrIdGrupoEstoque;
     private JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque3;
     private JrcTipoEstoque jrcTipoEstoqueByDrIdTipoEstoque;
     private JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque1;
     private JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque2;
     private JrcTipoNota jrcTipoNota;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcNotaFiscals = new HashSet(0);

    public JrcTipoNotaEstoque() {
    }

	
    public JrcTipoNotaEstoque(long idTipoNotaEstoque, JrcEmpresa jrcEmpresa, JrcTipoNota jrcTipoNota, JrcUsuario jrcUsuario, String descBreve, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idTipoNotaEstoque = idTipoNotaEstoque;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcTipoNota = jrcTipoNota;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcTipoNotaEstoque(long idTipoNotaEstoque, JrcEmpresa jrcEmpresa, JrcGrupoEstoque jrcGrupoEstoqueByEmIdGrupoEstoque, JrcGrupoEstoque jrcGrupoEstoqueByDrIdGrupoEstoque, JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque3, JrcTipoEstoque jrcTipoEstoqueByDrIdTipoEstoque, JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque1, JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque2, JrcTipoNota jrcTipoNota, JrcUsuario jrcUsuario, String descBreve, String descLonga, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcNotaFiscals) {
       this.idTipoNotaEstoque = idTipoNotaEstoque;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcGrupoEstoqueByEmIdGrupoEstoque = jrcGrupoEstoqueByEmIdGrupoEstoque;
       this.jrcGrupoEstoqueByDrIdGrupoEstoque = jrcGrupoEstoqueByDrIdGrupoEstoque;
       this.jrcTipoEstoqueByEmIdTipoEstoque3 = jrcTipoEstoqueByEmIdTipoEstoque3;
       this.jrcTipoEstoqueByDrIdTipoEstoque = jrcTipoEstoqueByDrIdTipoEstoque;
       this.jrcTipoEstoqueByEmIdTipoEstoque1 = jrcTipoEstoqueByEmIdTipoEstoque1;
       this.jrcTipoEstoqueByEmIdTipoEstoque2 = jrcTipoEstoqueByEmIdTipoEstoque2;
       this.jrcTipoNota = jrcTipoNota;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcNotaFiscals = jrcNotaFiscals;
    }
   
    public long getIdTipoNotaEstoque() {
        return this.idTipoNotaEstoque;
    }
    
    public void setIdTipoNotaEstoque(long idTipoNotaEstoque) {
        this.idTipoNotaEstoque = idTipoNotaEstoque;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcGrupoEstoque getJrcGrupoEstoqueByEmIdGrupoEstoque() {
        return this.jrcGrupoEstoqueByEmIdGrupoEstoque;
    }
    
    public void setJrcGrupoEstoqueByEmIdGrupoEstoque(JrcGrupoEstoque jrcGrupoEstoqueByEmIdGrupoEstoque) {
        this.jrcGrupoEstoqueByEmIdGrupoEstoque = jrcGrupoEstoqueByEmIdGrupoEstoque;
    }
    public JrcGrupoEstoque getJrcGrupoEstoqueByDrIdGrupoEstoque() {
        return this.jrcGrupoEstoqueByDrIdGrupoEstoque;
    }
    
    public void setJrcGrupoEstoqueByDrIdGrupoEstoque(JrcGrupoEstoque jrcGrupoEstoqueByDrIdGrupoEstoque) {
        this.jrcGrupoEstoqueByDrIdGrupoEstoque = jrcGrupoEstoqueByDrIdGrupoEstoque;
    }
    public JrcTipoEstoque getJrcTipoEstoqueByEmIdTipoEstoque3() {
        return this.jrcTipoEstoqueByEmIdTipoEstoque3;
    }
    
    public void setJrcTipoEstoqueByEmIdTipoEstoque3(JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque3) {
        this.jrcTipoEstoqueByEmIdTipoEstoque3 = jrcTipoEstoqueByEmIdTipoEstoque3;
    }
    public JrcTipoEstoque getJrcTipoEstoqueByDrIdTipoEstoque() {
        return this.jrcTipoEstoqueByDrIdTipoEstoque;
    }
    
    public void setJrcTipoEstoqueByDrIdTipoEstoque(JrcTipoEstoque jrcTipoEstoqueByDrIdTipoEstoque) {
        this.jrcTipoEstoqueByDrIdTipoEstoque = jrcTipoEstoqueByDrIdTipoEstoque;
    }
    public JrcTipoEstoque getJrcTipoEstoqueByEmIdTipoEstoque1() {
        return this.jrcTipoEstoqueByEmIdTipoEstoque1;
    }
    
    public void setJrcTipoEstoqueByEmIdTipoEstoque1(JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque1) {
        this.jrcTipoEstoqueByEmIdTipoEstoque1 = jrcTipoEstoqueByEmIdTipoEstoque1;
    }
    public JrcTipoEstoque getJrcTipoEstoqueByEmIdTipoEstoque2() {
        return this.jrcTipoEstoqueByEmIdTipoEstoque2;
    }
    
    public void setJrcTipoEstoqueByEmIdTipoEstoque2(JrcTipoEstoque jrcTipoEstoqueByEmIdTipoEstoque2) {
        this.jrcTipoEstoqueByEmIdTipoEstoque2 = jrcTipoEstoqueByEmIdTipoEstoque2;
    }
    public JrcTipoNota getJrcTipoNota() {
        return this.jrcTipoNota;
    }
    
    public void setJrcTipoNota(JrcTipoNota jrcTipoNota) {
        this.jrcTipoNota = jrcTipoNota;
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
    public Set getJrcNotaFiscals() {
        return this.jrcNotaFiscals;
    }
    
    public void setJrcNotaFiscals(Set jrcNotaFiscals) {
        this.jrcNotaFiscals = jrcNotaFiscals;
    }




}


