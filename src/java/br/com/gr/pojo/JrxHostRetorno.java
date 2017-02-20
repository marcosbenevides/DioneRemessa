package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrxHostRetorno generated by hbm2java
 */
public class JrxHostRetorno  implements java.io.Serializable {


     private long idHostRetorno;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private boolean indSemReferencia;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrxHostTransacaos = new HashSet(0);

    public JrxHostRetorno() {
    }

	
    public JrxHostRetorno(long idHostRetorno, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, boolean indSemReferencia, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idHostRetorno = idHostRetorno;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.indSemReferencia = indSemReferencia;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrxHostRetorno(long idHostRetorno, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, boolean indSemReferencia, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrxHostTransacaos) {
       this.idHostRetorno = idHostRetorno;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.indSemReferencia = indSemReferencia;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrxHostTransacaos = jrxHostTransacaos;
    }
   
    public long getIdHostRetorno() {
        return this.idHostRetorno;
    }
    
    public void setIdHostRetorno(long idHostRetorno) {
        this.idHostRetorno = idHostRetorno;
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
    public boolean isIndSemReferencia() {
        return this.indSemReferencia;
    }
    
    public void setIndSemReferencia(boolean indSemReferencia) {
        this.indSemReferencia = indSemReferencia;
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
    public Set getJrxHostTransacaos() {
        return this.jrxHostTransacaos;
    }
    
    public void setJrxHostTransacaos(Set jrxHostTransacaos) {
        this.jrxHostTransacaos = jrxHostTransacaos;
    }




}

