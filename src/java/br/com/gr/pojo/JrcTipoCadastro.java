package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoCadastro generated by hbm2java
 */
public class JrcTipoCadastro  implements java.io.Serializable {


     private long idTipoCadastro;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private boolean indAtivo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private byte ordem;
     private boolean indDesabilitaConsistencias;
     private boolean indPermiteEndDesc;
     private boolean indObrigaEndPrincipal;
     private boolean indObrigaUmDocAdicional;
     private boolean indObrigaUmTipoEndereco;
     private boolean indObrigaUmTipoTelefone;
     private boolean indObrigaUmTipoVinculo;
     private boolean indObrigaUmTipoPesveic;
     private boolean indObrigaUmTipoRenda;
     private boolean indObrigaUmTipoAnexo;
     private boolean indObrigaUmTipoCartao;
     private boolean indObrigaUmTipoConta;
     private boolean indConsisteCharEsp;
     private Set jrcPedidoVendasForPeIdTipoCadastro = new HashSet(0);
     private Set jrcFormaPagamentos = new HashSet(0);
     private Set jrcPessoas = new HashSet(0);
     private Set jrcTipoServicos = new HashSet(0);
     private Set jrcPedidoVendasForIdTipoCadastroMinimo = new HashSet(0);

    public JrcTipoCadastro() {
    }

	
    public JrcTipoCadastro(long idTipoCadastro, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, byte ordem, boolean indDesabilitaConsistencias, boolean indPermiteEndDesc, boolean indObrigaEndPrincipal, boolean indObrigaUmDocAdicional, boolean indObrigaUmTipoEndereco, boolean indObrigaUmTipoTelefone, boolean indObrigaUmTipoVinculo, boolean indObrigaUmTipoPesveic, boolean indObrigaUmTipoRenda, boolean indObrigaUmTipoAnexo, boolean indObrigaUmTipoCartao, boolean indObrigaUmTipoConta, boolean indConsisteCharEsp) {
        this.idTipoCadastro = idTipoCadastro;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.indAtivo = indAtivo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.ordem = ordem;
        this.indDesabilitaConsistencias = indDesabilitaConsistencias;
        this.indPermiteEndDesc = indPermiteEndDesc;
        this.indObrigaEndPrincipal = indObrigaEndPrincipal;
        this.indObrigaUmDocAdicional = indObrigaUmDocAdicional;
        this.indObrigaUmTipoEndereco = indObrigaUmTipoEndereco;
        this.indObrigaUmTipoTelefone = indObrigaUmTipoTelefone;
        this.indObrigaUmTipoVinculo = indObrigaUmTipoVinculo;
        this.indObrigaUmTipoPesveic = indObrigaUmTipoPesveic;
        this.indObrigaUmTipoRenda = indObrigaUmTipoRenda;
        this.indObrigaUmTipoAnexo = indObrigaUmTipoAnexo;
        this.indObrigaUmTipoCartao = indObrigaUmTipoCartao;
        this.indObrigaUmTipoConta = indObrigaUmTipoConta;
        this.indConsisteCharEsp = indConsisteCharEsp;
    }
    public JrcTipoCadastro(long idTipoCadastro, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, boolean indAtivo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, byte ordem, boolean indDesabilitaConsistencias, boolean indPermiteEndDesc, boolean indObrigaEndPrincipal, boolean indObrigaUmDocAdicional, boolean indObrigaUmTipoEndereco, boolean indObrigaUmTipoTelefone, boolean indObrigaUmTipoVinculo, boolean indObrigaUmTipoPesveic, boolean indObrigaUmTipoRenda, boolean indObrigaUmTipoAnexo, boolean indObrigaUmTipoCartao, boolean indObrigaUmTipoConta, boolean indConsisteCharEsp, Set jrcPedidoVendasForPeIdTipoCadastro, Set jrcFormaPagamentos, Set jrcPessoas, Set jrcTipoServicos, Set jrcPedidoVendasForIdTipoCadastroMinimo) {
       this.idTipoCadastro = idTipoCadastro;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.indAtivo = indAtivo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.ordem = ordem;
       this.indDesabilitaConsistencias = indDesabilitaConsistencias;
       this.indPermiteEndDesc = indPermiteEndDesc;
       this.indObrigaEndPrincipal = indObrigaEndPrincipal;
       this.indObrigaUmDocAdicional = indObrigaUmDocAdicional;
       this.indObrigaUmTipoEndereco = indObrigaUmTipoEndereco;
       this.indObrigaUmTipoTelefone = indObrigaUmTipoTelefone;
       this.indObrigaUmTipoVinculo = indObrigaUmTipoVinculo;
       this.indObrigaUmTipoPesveic = indObrigaUmTipoPesveic;
       this.indObrigaUmTipoRenda = indObrigaUmTipoRenda;
       this.indObrigaUmTipoAnexo = indObrigaUmTipoAnexo;
       this.indObrigaUmTipoCartao = indObrigaUmTipoCartao;
       this.indObrigaUmTipoConta = indObrigaUmTipoConta;
       this.indConsisteCharEsp = indConsisteCharEsp;
       this.jrcPedidoVendasForPeIdTipoCadastro = jrcPedidoVendasForPeIdTipoCadastro;
       this.jrcFormaPagamentos = jrcFormaPagamentos;
       this.jrcPessoas = jrcPessoas;
       this.jrcTipoServicos = jrcTipoServicos;
       this.jrcPedidoVendasForIdTipoCadastroMinimo = jrcPedidoVendasForIdTipoCadastroMinimo;
    }
   
    public long getIdTipoCadastro() {
        return this.idTipoCadastro;
    }
    
    public void setIdTipoCadastro(long idTipoCadastro) {
        this.idTipoCadastro = idTipoCadastro;
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
    public byte getOrdem() {
        return this.ordem;
    }
    
    public void setOrdem(byte ordem) {
        this.ordem = ordem;
    }
    public boolean isIndDesabilitaConsistencias() {
        return this.indDesabilitaConsistencias;
    }
    
    public void setIndDesabilitaConsistencias(boolean indDesabilitaConsistencias) {
        this.indDesabilitaConsistencias = indDesabilitaConsistencias;
    }
    public boolean isIndPermiteEndDesc() {
        return this.indPermiteEndDesc;
    }
    
    public void setIndPermiteEndDesc(boolean indPermiteEndDesc) {
        this.indPermiteEndDesc = indPermiteEndDesc;
    }
    public boolean isIndObrigaEndPrincipal() {
        return this.indObrigaEndPrincipal;
    }
    
    public void setIndObrigaEndPrincipal(boolean indObrigaEndPrincipal) {
        this.indObrigaEndPrincipal = indObrigaEndPrincipal;
    }
    public boolean isIndObrigaUmDocAdicional() {
        return this.indObrigaUmDocAdicional;
    }
    
    public void setIndObrigaUmDocAdicional(boolean indObrigaUmDocAdicional) {
        this.indObrigaUmDocAdicional = indObrigaUmDocAdicional;
    }
    public boolean isIndObrigaUmTipoEndereco() {
        return this.indObrigaUmTipoEndereco;
    }
    
    public void setIndObrigaUmTipoEndereco(boolean indObrigaUmTipoEndereco) {
        this.indObrigaUmTipoEndereco = indObrigaUmTipoEndereco;
    }
    public boolean isIndObrigaUmTipoTelefone() {
        return this.indObrigaUmTipoTelefone;
    }
    
    public void setIndObrigaUmTipoTelefone(boolean indObrigaUmTipoTelefone) {
        this.indObrigaUmTipoTelefone = indObrigaUmTipoTelefone;
    }
    public boolean isIndObrigaUmTipoVinculo() {
        return this.indObrigaUmTipoVinculo;
    }
    
    public void setIndObrigaUmTipoVinculo(boolean indObrigaUmTipoVinculo) {
        this.indObrigaUmTipoVinculo = indObrigaUmTipoVinculo;
    }
    public boolean isIndObrigaUmTipoPesveic() {
        return this.indObrigaUmTipoPesveic;
    }
    
    public void setIndObrigaUmTipoPesveic(boolean indObrigaUmTipoPesveic) {
        this.indObrigaUmTipoPesveic = indObrigaUmTipoPesveic;
    }
    public boolean isIndObrigaUmTipoRenda() {
        return this.indObrigaUmTipoRenda;
    }
    
    public void setIndObrigaUmTipoRenda(boolean indObrigaUmTipoRenda) {
        this.indObrigaUmTipoRenda = indObrigaUmTipoRenda;
    }
    public boolean isIndObrigaUmTipoAnexo() {
        return this.indObrigaUmTipoAnexo;
    }
    
    public void setIndObrigaUmTipoAnexo(boolean indObrigaUmTipoAnexo) {
        this.indObrigaUmTipoAnexo = indObrigaUmTipoAnexo;
    }
    public boolean isIndObrigaUmTipoCartao() {
        return this.indObrigaUmTipoCartao;
    }
    
    public void setIndObrigaUmTipoCartao(boolean indObrigaUmTipoCartao) {
        this.indObrigaUmTipoCartao = indObrigaUmTipoCartao;
    }
    public boolean isIndObrigaUmTipoConta() {
        return this.indObrigaUmTipoConta;
    }
    
    public void setIndObrigaUmTipoConta(boolean indObrigaUmTipoConta) {
        this.indObrigaUmTipoConta = indObrigaUmTipoConta;
    }
    public boolean isIndConsisteCharEsp() {
        return this.indConsisteCharEsp;
    }
    
    public void setIndConsisteCharEsp(boolean indConsisteCharEsp) {
        this.indConsisteCharEsp = indConsisteCharEsp;
    }
    public Set getJrcPedidoVendasForPeIdTipoCadastro() {
        return this.jrcPedidoVendasForPeIdTipoCadastro;
    }
    
    public void setJrcPedidoVendasForPeIdTipoCadastro(Set jrcPedidoVendasForPeIdTipoCadastro) {
        this.jrcPedidoVendasForPeIdTipoCadastro = jrcPedidoVendasForPeIdTipoCadastro;
    }
    public Set getJrcFormaPagamentos() {
        return this.jrcFormaPagamentos;
    }
    
    public void setJrcFormaPagamentos(Set jrcFormaPagamentos) {
        this.jrcFormaPagamentos = jrcFormaPagamentos;
    }
    public Set getJrcPessoas() {
        return this.jrcPessoas;
    }
    
    public void setJrcPessoas(Set jrcPessoas) {
        this.jrcPessoas = jrcPessoas;
    }
    public Set getJrcTipoServicos() {
        return this.jrcTipoServicos;
    }
    
    public void setJrcTipoServicos(Set jrcTipoServicos) {
        this.jrcTipoServicos = jrcTipoServicos;
    }
    public Set getJrcPedidoVendasForIdTipoCadastroMinimo() {
        return this.jrcPedidoVendasForIdTipoCadastroMinimo;
    }
    
    public void setJrcPedidoVendasForIdTipoCadastroMinimo(Set jrcPedidoVendasForIdTipoCadastroMinimo) {
        this.jrcPedidoVendasForIdTipoCadastroMinimo = jrcPedidoVendasForIdTipoCadastroMinimo;
    }




}


