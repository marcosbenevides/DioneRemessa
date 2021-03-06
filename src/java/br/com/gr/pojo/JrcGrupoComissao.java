package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcGrupoComissao generated by hbm2java
 */
public class JrcGrupoComissao  implements java.io.Serializable {


     private long idGrupoComissao;
     private JrcEmpresa jrcEmpresa;
     private JrcTipoGrupo jrcTipoGrupo;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private BigDecimal percComissao;
     private BigDecimal vrComissao;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcServicoPrecos = new HashSet(0);

    public JrcGrupoComissao() {
    }

	
    public JrcGrupoComissao(long idGrupoComissao, JrcEmpresa jrcEmpresa, JrcTipoGrupo jrcTipoGrupo, JrcUsuario jrcUsuario, String descBreve, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idGrupoComissao = idGrupoComissao;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcTipoGrupo = jrcTipoGrupo;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcGrupoComissao(long idGrupoComissao, JrcEmpresa jrcEmpresa, JrcTipoGrupo jrcTipoGrupo, JrcUsuario jrcUsuario, String descBreve, String descLonga, BigDecimal percComissao, BigDecimal vrComissao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcServicoPrecos) {
       this.idGrupoComissao = idGrupoComissao;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcTipoGrupo = jrcTipoGrupo;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.percComissao = percComissao;
       this.vrComissao = vrComissao;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcServicoPrecos = jrcServicoPrecos;
    }
   
    public long getIdGrupoComissao() {
        return this.idGrupoComissao;
    }
    
    public void setIdGrupoComissao(long idGrupoComissao) {
        this.idGrupoComissao = idGrupoComissao;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcTipoGrupo getJrcTipoGrupo() {
        return this.jrcTipoGrupo;
    }
    
    public void setJrcTipoGrupo(JrcTipoGrupo jrcTipoGrupo) {
        this.jrcTipoGrupo = jrcTipoGrupo;
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
    public BigDecimal getPercComissao() {
        return this.percComissao;
    }
    
    public void setPercComissao(BigDecimal percComissao) {
        this.percComissao = percComissao;
    }
    public BigDecimal getVrComissao() {
        return this.vrComissao;
    }
    
    public void setVrComissao(BigDecimal vrComissao) {
        this.vrComissao = vrComissao;
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
    public Set getJrcServicoPrecos() {
        return this.jrcServicoPrecos;
    }
    
    public void setJrcServicoPrecos(Set jrcServicoPrecos) {
        this.jrcServicoPrecos = jrcServicoPrecos;
    }




}


