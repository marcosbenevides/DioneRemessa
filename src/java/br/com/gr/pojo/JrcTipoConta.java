package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoConta generated by hbm2java
 */
public class JrcTipoConta  implements java.io.Serializable {


     private long idTipoConta;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private byte mesesValidade;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String flagTipoConta;
     private String codigoRef;
     private Set jrcFinBancos = new HashSet(0);
     private Set jrcPedidoVendaItems = new HashSet(0);
     private Set jrcPessoaBancos = new HashSet(0);

    public JrcTipoConta() {
    }

	
    public JrcTipoConta(long idTipoConta, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, byte mesesValidade, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagTipoConta) {
        this.idTipoConta = idTipoConta;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.mesesValidade = mesesValidade;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.flagTipoConta = flagTipoConta;
    }
    public JrcTipoConta(long idTipoConta, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, byte mesesValidade, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagTipoConta, String codigoRef, Set jrcFinBancos, Set jrcPedidoVendaItems, Set jrcPessoaBancos) {
       this.idTipoConta = idTipoConta;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.mesesValidade = mesesValidade;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.flagTipoConta = flagTipoConta;
       this.codigoRef = codigoRef;
       this.jrcFinBancos = jrcFinBancos;
       this.jrcPedidoVendaItems = jrcPedidoVendaItems;
       this.jrcPessoaBancos = jrcPessoaBancos;
    }
   
    public long getIdTipoConta() {
        return this.idTipoConta;
    }
    
    public void setIdTipoConta(long idTipoConta) {
        this.idTipoConta = idTipoConta;
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
    public byte getMesesValidade() {
        return this.mesesValidade;
    }
    
    public void setMesesValidade(byte mesesValidade) {
        this.mesesValidade = mesesValidade;
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
    public String getFlagTipoConta() {
        return this.flagTipoConta;
    }
    
    public void setFlagTipoConta(String flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
    }
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public Set getJrcFinBancos() {
        return this.jrcFinBancos;
    }
    
    public void setJrcFinBancos(Set jrcFinBancos) {
        this.jrcFinBancos = jrcFinBancos;
    }
    public Set getJrcPedidoVendaItems() {
        return this.jrcPedidoVendaItems;
    }
    
    public void setJrcPedidoVendaItems(Set jrcPedidoVendaItems) {
        this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }
    public Set getJrcPessoaBancos() {
        return this.jrcPessoaBancos;
    }
    
    public void setJrcPessoaBancos(Set jrcPessoaBancos) {
        this.jrcPessoaBancos = jrcPessoaBancos;
    }




}


