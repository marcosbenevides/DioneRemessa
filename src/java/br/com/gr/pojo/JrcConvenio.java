package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcConvenio generated by hbm2java
 */
public class JrcConvenio  implements java.io.Serializable {


     private long idConvenio;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String codigo;
     private String descBreve;
     private String descLonga;
     private boolean indImprimeDocAgaCre;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcConveniadas = new HashSet(0);

    public JrcConvenio() {
    }

	
    public JrcConvenio(long idConvenio, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String codigo, String descBreve, boolean indImprimeDocAgaCre, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idConvenio = idConvenio;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.codigo = codigo;
        this.descBreve = descBreve;
        this.indImprimeDocAgaCre = indImprimeDocAgaCre;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcConvenio(long idConvenio, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String codigo, String descBreve, String descLonga, boolean indImprimeDocAgaCre, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcConveniadas) {
       this.idConvenio = idConvenio;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.codigo = codigo;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.indImprimeDocAgaCre = indImprimeDocAgaCre;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcConveniadas = jrcConveniadas;
    }
   
    public long getIdConvenio() {
        return this.idConvenio;
    }
    
    public void setIdConvenio(long idConvenio) {
        this.idConvenio = idConvenio;
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
    public boolean isIndImprimeDocAgaCre() {
        return this.indImprimeDocAgaCre;
    }
    
    public void setIndImprimeDocAgaCre(boolean indImprimeDocAgaCre) {
        this.indImprimeDocAgaCre = indImprimeDocAgaCre;
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
    public Set getJrcConveniadas() {
        return this.jrcConveniadas;
    }
    
    public void setJrcConveniadas(Set jrcConveniadas) {
        this.jrcConveniadas = jrcConveniadas;
    }




}


