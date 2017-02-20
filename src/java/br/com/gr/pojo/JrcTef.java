package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTef generated by hbm2java
 */
public class JrcTef  implements java.io.Serializable {


     private long idTef;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String flagTef;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Boolean indHabilitaConsistencia;
     private Set jrcPdvs = new HashSet(0);
     private Set jrcTransacaoTefs = new HashSet(0);

    public JrcTef() {
    }

	
    public JrcTef(long idTef, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String flagTef, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idTef = idTef;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.flagTef = flagTef;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcTef(long idTef, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String flagTef, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Boolean indHabilitaConsistencia, Set jrcPdvs, Set jrcTransacaoTefs) {
       this.idTef = idTef;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.flagTef = flagTef;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indHabilitaConsistencia = indHabilitaConsistencia;
       this.jrcPdvs = jrcPdvs;
       this.jrcTransacaoTefs = jrcTransacaoTefs;
    }
   
    public long getIdTef() {
        return this.idTef;
    }
    
    public void setIdTef(long idTef) {
        this.idTef = idTef;
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
    public String getFlagTef() {
        return this.flagTef;
    }
    
    public void setFlagTef(String flagTef) {
        this.flagTef = flagTef;
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
    public Boolean getIndHabilitaConsistencia() {
        return this.indHabilitaConsistencia;
    }
    
    public void setIndHabilitaConsistencia(Boolean indHabilitaConsistencia) {
        this.indHabilitaConsistencia = indHabilitaConsistencia;
    }
    public Set getJrcPdvs() {
        return this.jrcPdvs;
    }
    
    public void setJrcPdvs(Set jrcPdvs) {
        this.jrcPdvs = jrcPdvs;
    }
    public Set getJrcTransacaoTefs() {
        return this.jrcTransacaoTefs;
    }
    
    public void setJrcTransacaoTefs(Set jrcTransacaoTefs) {
        this.jrcTransacaoTefs = jrcTransacaoTefs;
    }




}

