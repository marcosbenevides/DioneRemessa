package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcProcessoPdv generated by hbm2java
 */
public class JrcProcessoPdv  implements java.io.Serializable {


     private long idProcessoPdv;
     private JrcEmpresa jrcEmpresa;
     private JrcPdv jrcPdv;
     private JrcProcessoPdv jrcProcessoPdv;
     private JrcTesouraria jrcTesouraria;
     private JrcTransacaoOffline jrcTransacaoOffline;
     private JrcUsuario jrcUsuario;
     private String flagProcesso;
     private String flagStatus;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private Date dtInicioProcessamento;
     private Date dtFinalProcessamento;
     private Date dtCancelamento;
     private long versaoRegistro;
     private Long auto;
     private Set jrcPedidoVendasForIdProcessoPdv = new HashSet(0);
     private Set jrcDevolucaoVendas = new HashSet(0);
     private Set jrcPedidoVendasForIdProcessoPdvDav = new HashSet(0);
     private Set jrcProcessoPdvs = new HashSet(0);

    public JrcProcessoPdv() {
    }

	
    public JrcProcessoPdv(long idProcessoPdv, JrcEmpresa jrcEmpresa, JrcTesouraria jrcTesouraria, String flagProcesso, String flagStatus, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idProcessoPdv = idProcessoPdv;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcTesouraria = jrcTesouraria;
        this.flagProcesso = flagProcesso;
        this.flagStatus = flagStatus;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcProcessoPdv(long idProcessoPdv, JrcEmpresa jrcEmpresa, JrcPdv jrcPdv, JrcProcessoPdv jrcProcessoPdv, JrcTesouraria jrcTesouraria, JrcTransacaoOffline jrcTransacaoOffline, JrcUsuario jrcUsuario, String flagProcesso, String flagStatus, Date dtInclusao, Date dtAlteracao, long versaoSistema, Date dtInicioProcessamento, Date dtFinalProcessamento, Date dtCancelamento, long versaoRegistro, Long auto, Set jrcPedidoVendasForIdProcessoPdv, Set jrcDevolucaoVendas, Set jrcPedidoVendasForIdProcessoPdvDav, Set jrcProcessoPdvs) {
       this.idProcessoPdv = idProcessoPdv;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcPdv = jrcPdv;
       this.jrcProcessoPdv = jrcProcessoPdv;
       this.jrcTesouraria = jrcTesouraria;
       this.jrcTransacaoOffline = jrcTransacaoOffline;
       this.jrcUsuario = jrcUsuario;
       this.flagProcesso = flagProcesso;
       this.flagStatus = flagStatus;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.dtInicioProcessamento = dtInicioProcessamento;
       this.dtFinalProcessamento = dtFinalProcessamento;
       this.dtCancelamento = dtCancelamento;
       this.versaoRegistro = versaoRegistro;
       this.auto = auto;
       this.jrcPedidoVendasForIdProcessoPdv = jrcPedidoVendasForIdProcessoPdv;
       this.jrcDevolucaoVendas = jrcDevolucaoVendas;
       this.jrcPedidoVendasForIdProcessoPdvDav = jrcPedidoVendasForIdProcessoPdvDav;
       this.jrcProcessoPdvs = jrcProcessoPdvs;
    }
   
    public long getIdProcessoPdv() {
        return this.idProcessoPdv;
    }
    
    public void setIdProcessoPdv(long idProcessoPdv) {
        this.idProcessoPdv = idProcessoPdv;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcPdv getJrcPdv() {
        return this.jrcPdv;
    }
    
    public void setJrcPdv(JrcPdv jrcPdv) {
        this.jrcPdv = jrcPdv;
    }
    public JrcProcessoPdv getJrcProcessoPdv() {
        return this.jrcProcessoPdv;
    }
    
    public void setJrcProcessoPdv(JrcProcessoPdv jrcProcessoPdv) {
        this.jrcProcessoPdv = jrcProcessoPdv;
    }
    public JrcTesouraria getJrcTesouraria() {
        return this.jrcTesouraria;
    }
    
    public void setJrcTesouraria(JrcTesouraria jrcTesouraria) {
        this.jrcTesouraria = jrcTesouraria;
    }
    public JrcTransacaoOffline getJrcTransacaoOffline() {
        return this.jrcTransacaoOffline;
    }
    
    public void setJrcTransacaoOffline(JrcTransacaoOffline jrcTransacaoOffline) {
        this.jrcTransacaoOffline = jrcTransacaoOffline;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
    }
    public String getFlagProcesso() {
        return this.flagProcesso;
    }
    
    public void setFlagProcesso(String flagProcesso) {
        this.flagProcesso = flagProcesso;
    }
    public String getFlagStatus() {
        return this.flagStatus;
    }
    
    public void setFlagStatus(String flagStatus) {
        this.flagStatus = flagStatus;
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
    public Date getDtInicioProcessamento() {
        return this.dtInicioProcessamento;
    }
    
    public void setDtInicioProcessamento(Date dtInicioProcessamento) {
        this.dtInicioProcessamento = dtInicioProcessamento;
    }
    public Date getDtFinalProcessamento() {
        return this.dtFinalProcessamento;
    }
    
    public void setDtFinalProcessamento(Date dtFinalProcessamento) {
        this.dtFinalProcessamento = dtFinalProcessamento;
    }
    public Date getDtCancelamento() {
        return this.dtCancelamento;
    }
    
    public void setDtCancelamento(Date dtCancelamento) {
        this.dtCancelamento = dtCancelamento;
    }
    public long getVersaoRegistro() {
        return this.versaoRegistro;
    }
    
    public void setVersaoRegistro(long versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }
    public Long getAuto() {
        return this.auto;
    }
    
    public void setAuto(Long auto) {
        this.auto = auto;
    }
    public Set getJrcPedidoVendasForIdProcessoPdv() {
        return this.jrcPedidoVendasForIdProcessoPdv;
    }
    
    public void setJrcPedidoVendasForIdProcessoPdv(Set jrcPedidoVendasForIdProcessoPdv) {
        this.jrcPedidoVendasForIdProcessoPdv = jrcPedidoVendasForIdProcessoPdv;
    }
    public Set getJrcDevolucaoVendas() {
        return this.jrcDevolucaoVendas;
    }
    
    public void setJrcDevolucaoVendas(Set jrcDevolucaoVendas) {
        this.jrcDevolucaoVendas = jrcDevolucaoVendas;
    }
    public Set getJrcPedidoVendasForIdProcessoPdvDav() {
        return this.jrcPedidoVendasForIdProcessoPdvDav;
    }
    
    public void setJrcPedidoVendasForIdProcessoPdvDav(Set jrcPedidoVendasForIdProcessoPdvDav) {
        this.jrcPedidoVendasForIdProcessoPdvDav = jrcPedidoVendasForIdProcessoPdvDav;
    }
    public Set getJrcProcessoPdvs() {
        return this.jrcProcessoPdvs;
    }
    
    public void setJrcProcessoPdvs(Set jrcProcessoPdvs) {
        this.jrcProcessoPdvs = jrcProcessoPdvs;
    }




}

