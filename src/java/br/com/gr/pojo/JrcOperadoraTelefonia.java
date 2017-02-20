package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcOperadoraTelefonia generated by hbm2java
 */
public class JrcOperadoraTelefonia  implements java.io.Serializable {


     private long idOperadoraTelefonia;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String codigoRef;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Set jrcServicos = new HashSet(0);
     private Set jrcPessoaTelefones = new HashSet(0);
     private Set jrcPedidoVendaItems = new HashSet(0);

    public JrcOperadoraTelefonia() {
    }

	
    public JrcOperadoraTelefonia(long idOperadoraTelefonia, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idOperadoraTelefonia = idOperadoraTelefonia;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcOperadoraTelefonia(long idOperadoraTelefonia, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, String codigoRef, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Set jrcServicos, Set jrcPessoaTelefones, Set jrcPedidoVendaItems) {
       this.idOperadoraTelefonia = idOperadoraTelefonia;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.codigoRef = codigoRef;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.jrcServicos = jrcServicos;
       this.jrcPessoaTelefones = jrcPessoaTelefones;
       this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }
   
    public long getIdOperadoraTelefonia() {
        return this.idOperadoraTelefonia;
    }
    
    public void setIdOperadoraTelefonia(long idOperadoraTelefonia) {
        this.idOperadoraTelefonia = idOperadoraTelefonia;
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
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
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
    public Set getJrcServicos() {
        return this.jrcServicos;
    }
    
    public void setJrcServicos(Set jrcServicos) {
        this.jrcServicos = jrcServicos;
    }
    public Set getJrcPessoaTelefones() {
        return this.jrcPessoaTelefones;
    }
    
    public void setJrcPessoaTelefones(Set jrcPessoaTelefones) {
        this.jrcPessoaTelefones = jrcPessoaTelefones;
    }
    public Set getJrcPedidoVendaItems() {
        return this.jrcPedidoVendaItems;
    }
    
    public void setJrcPedidoVendaItems(Set jrcPedidoVendaItems) {
        this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }




}

