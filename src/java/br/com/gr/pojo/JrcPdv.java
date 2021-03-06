package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcPdv generated by hbm2java
 */
public class JrcPdv  implements java.io.Serializable {


     private long idPdv;
     private JrcEmpresa jrcEmpresa;
     private JrcImpressora jrcImpressora;
     private JrcTef jrcTef;
     private JrcTesouraria jrcTesouraria;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private Boolean indObrigatoriedadeEcf;
     private Byte hhMinFechDiaUtil;
     private Byte hhMinFechDiaNaoUtil;
     private Boolean indObrigatoriedadeTef;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private boolean indConsisteOperador;
     private Date dtUltimaAtualizacao;
     private Boolean indOperandoOffline;
     private Short maxDiasValidadeAtualizacao;
     private Date dtUltimoArqmfd;
     private String codigoRef;
     private String flagTipoRelPadrao;
     private String flagDanfeNfc;
     private Set jrcProcessoPdvs = new HashSet(0);
     private Set jrcMovimentoPdvs = new HashSet(0);
     private Set jrcEcfXPdvs = new HashSet(0);

    public JrcPdv() {
    }

	
    public JrcPdv(long idPdv, JrcEmpresa jrcEmpresa, JrcTesouraria jrcTesouraria, JrcUsuario jrcUsuario, String descBreve, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indConsisteOperador) {
        this.idPdv = idPdv;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcTesouraria = jrcTesouraria;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.indConsisteOperador = indConsisteOperador;
    }
    public JrcPdv(long idPdv, JrcEmpresa jrcEmpresa, JrcImpressora jrcImpressora, JrcTef jrcTef, JrcTesouraria jrcTesouraria, JrcUsuario jrcUsuario, String descBreve, String descLonga, Boolean indObrigatoriedadeEcf, Byte hhMinFechDiaUtil, Byte hhMinFechDiaNaoUtil, Boolean indObrigatoriedadeTef, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indConsisteOperador, Date dtUltimaAtualizacao, Boolean indOperandoOffline, Short maxDiasValidadeAtualizacao, Date dtUltimoArqmfd, String codigoRef, String flagTipoRelPadrao, String flagDanfeNfc, Set jrcProcessoPdvs, Set jrcMovimentoPdvs, Set jrcEcfXPdvs) {
       this.idPdv = idPdv;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcImpressora = jrcImpressora;
       this.jrcTef = jrcTef;
       this.jrcTesouraria = jrcTesouraria;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.indObrigatoriedadeEcf = indObrigatoriedadeEcf;
       this.hhMinFechDiaUtil = hhMinFechDiaUtil;
       this.hhMinFechDiaNaoUtil = hhMinFechDiaNaoUtil;
       this.indObrigatoriedadeTef = indObrigatoriedadeTef;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indConsisteOperador = indConsisteOperador;
       this.dtUltimaAtualizacao = dtUltimaAtualizacao;
       this.indOperandoOffline = indOperandoOffline;
       this.maxDiasValidadeAtualizacao = maxDiasValidadeAtualizacao;
       this.dtUltimoArqmfd = dtUltimoArqmfd;
       this.codigoRef = codigoRef;
       this.flagTipoRelPadrao = flagTipoRelPadrao;
       this.flagDanfeNfc = flagDanfeNfc;
       this.jrcProcessoPdvs = jrcProcessoPdvs;
       this.jrcMovimentoPdvs = jrcMovimentoPdvs;
       this.jrcEcfXPdvs = jrcEcfXPdvs;
    }
   
    public long getIdPdv() {
        return this.idPdv;
    }
    
    public void setIdPdv(long idPdv) {
        this.idPdv = idPdv;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcImpressora getJrcImpressora() {
        return this.jrcImpressora;
    }
    
    public void setJrcImpressora(JrcImpressora jrcImpressora) {
        this.jrcImpressora = jrcImpressora;
    }
    public JrcTef getJrcTef() {
        return this.jrcTef;
    }
    
    public void setJrcTef(JrcTef jrcTef) {
        this.jrcTef = jrcTef;
    }
    public JrcTesouraria getJrcTesouraria() {
        return this.jrcTesouraria;
    }
    
    public void setJrcTesouraria(JrcTesouraria jrcTesouraria) {
        this.jrcTesouraria = jrcTesouraria;
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
    public Boolean getIndObrigatoriedadeEcf() {
        return this.indObrigatoriedadeEcf;
    }
    
    public void setIndObrigatoriedadeEcf(Boolean indObrigatoriedadeEcf) {
        this.indObrigatoriedadeEcf = indObrigatoriedadeEcf;
    }
    public Byte getHhMinFechDiaUtil() {
        return this.hhMinFechDiaUtil;
    }
    
    public void setHhMinFechDiaUtil(Byte hhMinFechDiaUtil) {
        this.hhMinFechDiaUtil = hhMinFechDiaUtil;
    }
    public Byte getHhMinFechDiaNaoUtil() {
        return this.hhMinFechDiaNaoUtil;
    }
    
    public void setHhMinFechDiaNaoUtil(Byte hhMinFechDiaNaoUtil) {
        this.hhMinFechDiaNaoUtil = hhMinFechDiaNaoUtil;
    }
    public Boolean getIndObrigatoriedadeTef() {
        return this.indObrigatoriedadeTef;
    }
    
    public void setIndObrigatoriedadeTef(Boolean indObrigatoriedadeTef) {
        this.indObrigatoriedadeTef = indObrigatoriedadeTef;
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
    public boolean isIndConsisteOperador() {
        return this.indConsisteOperador;
    }
    
    public void setIndConsisteOperador(boolean indConsisteOperador) {
        this.indConsisteOperador = indConsisteOperador;
    }
    public Date getDtUltimaAtualizacao() {
        return this.dtUltimaAtualizacao;
    }
    
    public void setDtUltimaAtualizacao(Date dtUltimaAtualizacao) {
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
    }
    public Boolean getIndOperandoOffline() {
        return this.indOperandoOffline;
    }
    
    public void setIndOperandoOffline(Boolean indOperandoOffline) {
        this.indOperandoOffline = indOperandoOffline;
    }
    public Short getMaxDiasValidadeAtualizacao() {
        return this.maxDiasValidadeAtualizacao;
    }
    
    public void setMaxDiasValidadeAtualizacao(Short maxDiasValidadeAtualizacao) {
        this.maxDiasValidadeAtualizacao = maxDiasValidadeAtualizacao;
    }
    public Date getDtUltimoArqmfd() {
        return this.dtUltimoArqmfd;
    }
    
    public void setDtUltimoArqmfd(Date dtUltimoArqmfd) {
        this.dtUltimoArqmfd = dtUltimoArqmfd;
    }
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public String getFlagTipoRelPadrao() {
        return this.flagTipoRelPadrao;
    }
    
    public void setFlagTipoRelPadrao(String flagTipoRelPadrao) {
        this.flagTipoRelPadrao = flagTipoRelPadrao;
    }
    public String getFlagDanfeNfc() {
        return this.flagDanfeNfc;
    }
    
    public void setFlagDanfeNfc(String flagDanfeNfc) {
        this.flagDanfeNfc = flagDanfeNfc;
    }
    public Set getJrcProcessoPdvs() {
        return this.jrcProcessoPdvs;
    }
    
    public void setJrcProcessoPdvs(Set jrcProcessoPdvs) {
        this.jrcProcessoPdvs = jrcProcessoPdvs;
    }
    public Set getJrcMovimentoPdvs() {
        return this.jrcMovimentoPdvs;
    }
    
    public void setJrcMovimentoPdvs(Set jrcMovimentoPdvs) {
        this.jrcMovimentoPdvs = jrcMovimentoPdvs;
    }
    public Set getJrcEcfXPdvs() {
        return this.jrcEcfXPdvs;
    }
    
    public void setJrcEcfXPdvs(Set jrcEcfXPdvs) {
        this.jrcEcfXPdvs = jrcEcfXPdvs;
    }




}


