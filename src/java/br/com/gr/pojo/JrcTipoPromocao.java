package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoPromocao generated by hbm2java
 */
public class JrcTipoPromocao  implements java.io.Serializable {


     private long idTipoPromocao;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcPromocaos = new HashSet(0);

    public JrcTipoPromocao() {
    }

	
    public JrcTipoPromocao(long idTipoPromocao, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idTipoPromocao = idTipoPromocao;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcTipoPromocao(long idTipoPromocao, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcPromocaos) {
       this.idTipoPromocao = idTipoPromocao;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcPromocaos = jrcPromocaos;
    }
   
    public long getIdTipoPromocao() {
        return this.idTipoPromocao;
    }
    
    public void setIdTipoPromocao(long idTipoPromocao) {
        this.idTipoPromocao = idTipoPromocao;
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
    public Set getJrcPromocaos() {
        return this.jrcPromocaos;
    }
    
    public void setJrcPromocaos(Set jrcPromocaos) {
        this.jrcPromocaos = jrcPromocaos;
    }




}


