package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcBanco generated by hbm2java
 */
public class JrcBanco  implements java.io.Serializable {


     private long idBanco;
     private JrcEmpresa jrcEmpresa;
     private JrcPessoa jrcPessoa;
     private JrcUsuario jrcUsuario;
     private int codigo;
     private String descBreve;
     private String descLonga;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Boolean indCoban;
     private String flagIntCoban;
     private Set jrcBorderoPropostas = new HashSet(0);
     private Set jrcPedidoVendaItemsForIdBancoFin = new HashSet(0);
     private Set jrcTipoVendas = new HashSet(0);
     private Set jrcFinBancos = new HashSet(0);
     private Set jrcServicoPrecos = new HashSet(0);
     private Set jrcPedidoVendaItemsForIdBanco = new HashSet(0);
     private Set jrcPessoaBancos = new HashSet(0);
     private Set jrcApuracaoComissaos = new HashSet(0);

    public JrcBanco() {
    }

	
    public JrcBanco(long idBanco, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, int codigo, String descBreve, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro) {
        this.idBanco = idBanco;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.codigo = codigo;
        this.descBreve = descBreve;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
    }
    public JrcBanco(long idBanco, JrcEmpresa jrcEmpresa, JrcPessoa jrcPessoa, JrcUsuario jrcUsuario, int codigo, String descBreve, String descLonga, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Boolean indCoban, String flagIntCoban, Set jrcBorderoPropostas, Set jrcPedidoVendaItemsForIdBancoFin, Set jrcTipoVendas, Set jrcFinBancos, Set jrcServicoPrecos, Set jrcPedidoVendaItemsForIdBanco, Set jrcPessoaBancos, Set jrcApuracaoComissaos) {
       this.idBanco = idBanco;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcPessoa = jrcPessoa;
       this.jrcUsuario = jrcUsuario;
       this.codigo = codigo;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indCoban = indCoban;
       this.flagIntCoban = flagIntCoban;
       this.jrcBorderoPropostas = jrcBorderoPropostas;
       this.jrcPedidoVendaItemsForIdBancoFin = jrcPedidoVendaItemsForIdBancoFin;
       this.jrcTipoVendas = jrcTipoVendas;
       this.jrcFinBancos = jrcFinBancos;
       this.jrcServicoPrecos = jrcServicoPrecos;
       this.jrcPedidoVendaItemsForIdBanco = jrcPedidoVendaItemsForIdBanco;
       this.jrcPessoaBancos = jrcPessoaBancos;
       this.jrcApuracaoComissaos = jrcApuracaoComissaos;
    }
   
    public long getIdBanco() {
        return this.idBanco;
    }
    
    public void setIdBanco(long idBanco) {
        this.idBanco = idBanco;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcPessoa getJrcPessoa() {
        return this.jrcPessoa;
    }
    
    public void setJrcPessoa(JrcPessoa jrcPessoa) {
        this.jrcPessoa = jrcPessoa;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
    }
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public Boolean getIndCoban() {
        return this.indCoban;
    }
    
    public void setIndCoban(Boolean indCoban) {
        this.indCoban = indCoban;
    }
    public String getFlagIntCoban() {
        return this.flagIntCoban;
    }
    
    public void setFlagIntCoban(String flagIntCoban) {
        this.flagIntCoban = flagIntCoban;
    }
    public Set getJrcBorderoPropostas() {
        return this.jrcBorderoPropostas;
    }
    
    public void setJrcBorderoPropostas(Set jrcBorderoPropostas) {
        this.jrcBorderoPropostas = jrcBorderoPropostas;
    }
    public Set getJrcPedidoVendaItemsForIdBancoFin() {
        return this.jrcPedidoVendaItemsForIdBancoFin;
    }
    
    public void setJrcPedidoVendaItemsForIdBancoFin(Set jrcPedidoVendaItemsForIdBancoFin) {
        this.jrcPedidoVendaItemsForIdBancoFin = jrcPedidoVendaItemsForIdBancoFin;
    }
    public Set getJrcTipoVendas() {
        return this.jrcTipoVendas;
    }
    
    public void setJrcTipoVendas(Set jrcTipoVendas) {
        this.jrcTipoVendas = jrcTipoVendas;
    }
    public Set getJrcFinBancos() {
        return this.jrcFinBancos;
    }
    
    public void setJrcFinBancos(Set jrcFinBancos) {
        this.jrcFinBancos = jrcFinBancos;
    }
    public Set getJrcServicoPrecos() {
        return this.jrcServicoPrecos;
    }
    
    public void setJrcServicoPrecos(Set jrcServicoPrecos) {
        this.jrcServicoPrecos = jrcServicoPrecos;
    }
    public Set getJrcPedidoVendaItemsForIdBanco() {
        return this.jrcPedidoVendaItemsForIdBanco;
    }
    
    public void setJrcPedidoVendaItemsForIdBanco(Set jrcPedidoVendaItemsForIdBanco) {
        this.jrcPedidoVendaItemsForIdBanco = jrcPedidoVendaItemsForIdBanco;
    }
    public Set getJrcPessoaBancos() {
        return this.jrcPessoaBancos;
    }
    
    public void setJrcPessoaBancos(Set jrcPessoaBancos) {
        this.jrcPessoaBancos = jrcPessoaBancos;
    }
    public Set getJrcApuracaoComissaos() {
        return this.jrcApuracaoComissaos;
    }
    
    public void setJrcApuracaoComissaos(Set jrcApuracaoComissaos) {
        this.jrcApuracaoComissaos = jrcApuracaoComissaos;
    }




}


