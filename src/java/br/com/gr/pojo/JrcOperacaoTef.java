package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcOperacaoTef generated by hbm2java
 */
public class JrcOperacaoTef  implements java.io.Serializable {


     private long idOperacaoTef;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String flagOperacaoTef;
     private String flagComportamentoTef;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcTransacaoTefs = new HashSet(0);

    public JrcOperacaoTef() {
    }

	
    public JrcOperacaoTef(long idOperacaoTef, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String flagOperacaoTef, String flagComportamentoTef, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idOperacaoTef = idOperacaoTef;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.flagOperacaoTef = flagOperacaoTef;
        this.flagComportamentoTef = flagComportamentoTef;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcOperacaoTef(long idOperacaoTef, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String flagOperacaoTef, String flagComportamentoTef, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcTransacaoTefs) {
       this.idOperacaoTef = idOperacaoTef;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.flagOperacaoTef = flagOperacaoTef;
       this.flagComportamentoTef = flagComportamentoTef;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcTransacaoTefs = jrcTransacaoTefs;
    }
   
    public long getIdOperacaoTef() {
        return this.idOperacaoTef;
    }
    
    public void setIdOperacaoTef(long idOperacaoTef) {
        this.idOperacaoTef = idOperacaoTef;
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
    public String getFlagOperacaoTef() {
        return this.flagOperacaoTef;
    }
    
    public void setFlagOperacaoTef(String flagOperacaoTef) {
        this.flagOperacaoTef = flagOperacaoTef;
    }
    public String getFlagComportamentoTef() {
        return this.flagComportamentoTef;
    }
    
    public void setFlagComportamentoTef(String flagComportamentoTef) {
        this.flagComportamentoTef = flagComportamentoTef;
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
    public Set getJrcTransacaoTefs() {
        return this.jrcTransacaoTefs;
    }
    
    public void setJrcTransacaoTefs(Set jrcTransacaoTefs) {
        this.jrcTransacaoTefs = jrcTransacaoTefs;
    }




}


