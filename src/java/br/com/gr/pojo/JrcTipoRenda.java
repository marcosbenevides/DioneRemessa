package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoRenda generated by hbm2java
 */
public class JrcTipoRenda  implements java.io.Serializable {


     private long idTipoRenda;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String flagTipo;
     private boolean indCompoeRenda;
     private byte mesesValidade;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String codigoRef;
     private Set jrcPedidoVendas = new HashSet(0);

    public JrcTipoRenda() {
    }

	
    public JrcTipoRenda(long idTipoRenda, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String flagTipo, boolean indCompoeRenda, byte mesesValidade, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idTipoRenda = idTipoRenda;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.flagTipo = flagTipo;
        this.indCompoeRenda = indCompoeRenda;
        this.mesesValidade = mesesValidade;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcTipoRenda(long idTipoRenda, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String flagTipo, boolean indCompoeRenda, byte mesesValidade, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String codigoRef, Set jrcPedidoVendas) {
       this.idTipoRenda = idTipoRenda;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.flagTipo = flagTipo;
       this.indCompoeRenda = indCompoeRenda;
       this.mesesValidade = mesesValidade;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.codigoRef = codigoRef;
       this.jrcPedidoVendas = jrcPedidoVendas;
    }
   
    public long getIdTipoRenda() {
        return this.idTipoRenda;
    }
    
    public void setIdTipoRenda(long idTipoRenda) {
        this.idTipoRenda = idTipoRenda;
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
    public String getFlagTipo() {
        return this.flagTipo;
    }
    
    public void setFlagTipo(String flagTipo) {
        this.flagTipo = flagTipo;
    }
    public boolean isIndCompoeRenda() {
        return this.indCompoeRenda;
    }
    
    public void setIndCompoeRenda(boolean indCompoeRenda) {
        this.indCompoeRenda = indCompoeRenda;
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
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public Set getJrcPedidoVendas() {
        return this.jrcPedidoVendas;
    }
    
    public void setJrcPedidoVendas(Set jrcPedidoVendas) {
        this.jrcPedidoVendas = jrcPedidoVendas;
    }




}


