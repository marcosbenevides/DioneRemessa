package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcServico generated by hbm2java
 */
public class JrcServico  implements java.io.Serializable {


     private long idServico;
     private JrcOperadoraTelefonia jrcOperadoraTelefonia;
     private JrcEmpresa jrcEmpresa;
     private JrcGrupoImpostoServico jrcGrupoImpostoServico;
     private JrcPessoa jrcPessoa;
     private JrcPrivilegio jrcPrivilegio;
     private JrcStatusServico jrcStatusServico;
     private JrcTipoServico jrcTipoServico;
     private JrcUnidade jrcUnidade;
     private JrcUsuario jrcUsuarioByIdUsuarioAprovou;
     private JrcUsuario jrcUsuarioByIdUsuarioReg;
     private String codigo;
     private String descricao;
     private boolean indObrigatorio;
     private Boolean indPessoaFisica;
     private boolean indAposentado;
     private boolean indQtde;
     private boolean indUtilizaSerie;
     private boolean indAlteraPreco;
     private String flagVinculado;
     private boolean indDevolucao;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private Boolean indVendaAvulsa;
     private boolean indOrganizacao;
     private boolean indClassificacaoLoja;
     private boolean indGrupoLoja;
     private boolean indLoja;
     private Short maxQtde;
     private Integer estoque;
     private String flagIat;
     private String flagIppt;
     private String hash1;
     private String hash2;
     private Boolean indPermiteOtItem;
     private Short maxDiasDevolucao;
     private String hashInc;
     private Short qtdeSugerida;
     private String codigoRef;
     private Set jrcPedidoVendaItems = new HashSet(0);
     private Set jrcServicoPrecos = new HashSet(0);

    public JrcServico() {
    }

	
    public JrcServico(long idServico, JrcEmpresa jrcEmpresa, JrcStatusServico jrcStatusServico, JrcTipoServico jrcTipoServico, JrcUsuario jrcUsuarioByIdUsuarioReg, String codigo, String descricao, boolean indObrigatorio, boolean indAposentado, boolean indQtde, boolean indUtilizaSerie, boolean indAlteraPreco, boolean indDevolucao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indOrganizacao, boolean indClassificacaoLoja, boolean indGrupoLoja, boolean indLoja, String flagIat, String flagIppt) {
        this.idServico = idServico;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcStatusServico = jrcStatusServico;
        this.jrcTipoServico = jrcTipoServico;
        this.jrcUsuarioByIdUsuarioReg = jrcUsuarioByIdUsuarioReg;
        this.codigo = codigo;
        this.descricao = descricao;
        this.indObrigatorio = indObrigatorio;
        this.indAposentado = indAposentado;
        this.indQtde = indQtde;
        this.indUtilizaSerie = indUtilizaSerie;
        this.indAlteraPreco = indAlteraPreco;
        this.indDevolucao = indDevolucao;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.indOrganizacao = indOrganizacao;
        this.indClassificacaoLoja = indClassificacaoLoja;
        this.indGrupoLoja = indGrupoLoja;
        this.indLoja = indLoja;
        this.flagIat = flagIat;
        this.flagIppt = flagIppt;
    }
    public JrcServico(long idServico, JrcOperadoraTelefonia jrcOperadoraTelefonia, JrcEmpresa jrcEmpresa, JrcGrupoImpostoServico jrcGrupoImpostoServico, JrcPessoa jrcPessoa, JrcPrivilegio jrcPrivilegio, JrcStatusServico jrcStatusServico, JrcTipoServico jrcTipoServico, JrcUnidade jrcUnidade, JrcUsuario jrcUsuarioByIdUsuarioAprovou, JrcUsuario jrcUsuarioByIdUsuarioReg, String codigo, String descricao, boolean indObrigatorio, Boolean indPessoaFisica, boolean indAposentado, boolean indQtde, boolean indUtilizaSerie, boolean indAlteraPreco, String flagVinculado, boolean indDevolucao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, Boolean indVendaAvulsa, boolean indOrganizacao, boolean indClassificacaoLoja, boolean indGrupoLoja, boolean indLoja, Short maxQtde, Integer estoque, String flagIat, String flagIppt, String hash1, String hash2, Boolean indPermiteOtItem, Short maxDiasDevolucao, String hashInc, Short qtdeSugerida, String codigoRef, Set jrcPedidoVendaItems, Set jrcServicoPrecos) {
       this.idServico = idServico;
       this.jrcOperadoraTelefonia = jrcOperadoraTelefonia;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcGrupoImpostoServico = jrcGrupoImpostoServico;
       this.jrcPessoa = jrcPessoa;
       this.jrcPrivilegio = jrcPrivilegio;
       this.jrcStatusServico = jrcStatusServico;
       this.jrcTipoServico = jrcTipoServico;
       this.jrcUnidade = jrcUnidade;
       this.jrcUsuarioByIdUsuarioAprovou = jrcUsuarioByIdUsuarioAprovou;
       this.jrcUsuarioByIdUsuarioReg = jrcUsuarioByIdUsuarioReg;
       this.codigo = codigo;
       this.descricao = descricao;
       this.indObrigatorio = indObrigatorio;
       this.indPessoaFisica = indPessoaFisica;
       this.indAposentado = indAposentado;
       this.indQtde = indQtde;
       this.indUtilizaSerie = indUtilizaSerie;
       this.indAlteraPreco = indAlteraPreco;
       this.flagVinculado = flagVinculado;
       this.indDevolucao = indDevolucao;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indVendaAvulsa = indVendaAvulsa;
       this.indOrganizacao = indOrganizacao;
       this.indClassificacaoLoja = indClassificacaoLoja;
       this.indGrupoLoja = indGrupoLoja;
       this.indLoja = indLoja;
       this.maxQtde = maxQtde;
       this.estoque = estoque;
       this.flagIat = flagIat;
       this.flagIppt = flagIppt;
       this.hash1 = hash1;
       this.hash2 = hash2;
       this.indPermiteOtItem = indPermiteOtItem;
       this.maxDiasDevolucao = maxDiasDevolucao;
       this.hashInc = hashInc;
       this.qtdeSugerida = qtdeSugerida;
       this.codigoRef = codigoRef;
       this.jrcPedidoVendaItems = jrcPedidoVendaItems;
       this.jrcServicoPrecos = jrcServicoPrecos;
    }
   
    public long getIdServico() {
        return this.idServico;
    }
    
    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }
    public JrcOperadoraTelefonia getJrcOperadoraTelefonia() {
        return this.jrcOperadoraTelefonia;
    }
    
    public void setJrcOperadoraTelefonia(JrcOperadoraTelefonia jrcOperadoraTelefonia) {
        this.jrcOperadoraTelefonia = jrcOperadoraTelefonia;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcGrupoImpostoServico getJrcGrupoImpostoServico() {
        return this.jrcGrupoImpostoServico;
    }
    
    public void setJrcGrupoImpostoServico(JrcGrupoImpostoServico jrcGrupoImpostoServico) {
        this.jrcGrupoImpostoServico = jrcGrupoImpostoServico;
    }
    public JrcPessoa getJrcPessoa() {
        return this.jrcPessoa;
    }
    
    public void setJrcPessoa(JrcPessoa jrcPessoa) {
        this.jrcPessoa = jrcPessoa;
    }
    public JrcPrivilegio getJrcPrivilegio() {
        return this.jrcPrivilegio;
    }
    
    public void setJrcPrivilegio(JrcPrivilegio jrcPrivilegio) {
        this.jrcPrivilegio = jrcPrivilegio;
    }
    public JrcStatusServico getJrcStatusServico() {
        return this.jrcStatusServico;
    }
    
    public void setJrcStatusServico(JrcStatusServico jrcStatusServico) {
        this.jrcStatusServico = jrcStatusServico;
    }
    public JrcTipoServico getJrcTipoServico() {
        return this.jrcTipoServico;
    }
    
    public void setJrcTipoServico(JrcTipoServico jrcTipoServico) {
        this.jrcTipoServico = jrcTipoServico;
    }
    public JrcUnidade getJrcUnidade() {
        return this.jrcUnidade;
    }
    
    public void setJrcUnidade(JrcUnidade jrcUnidade) {
        this.jrcUnidade = jrcUnidade;
    }
    public JrcUsuario getJrcUsuarioByIdUsuarioAprovou() {
        return this.jrcUsuarioByIdUsuarioAprovou;
    }
    
    public void setJrcUsuarioByIdUsuarioAprovou(JrcUsuario jrcUsuarioByIdUsuarioAprovou) {
        this.jrcUsuarioByIdUsuarioAprovou = jrcUsuarioByIdUsuarioAprovou;
    }
    public JrcUsuario getJrcUsuarioByIdUsuarioReg() {
        return this.jrcUsuarioByIdUsuarioReg;
    }
    
    public void setJrcUsuarioByIdUsuarioReg(JrcUsuario jrcUsuarioByIdUsuarioReg) {
        this.jrcUsuarioByIdUsuarioReg = jrcUsuarioByIdUsuarioReg;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isIndObrigatorio() {
        return this.indObrigatorio;
    }
    
    public void setIndObrigatorio(boolean indObrigatorio) {
        this.indObrigatorio = indObrigatorio;
    }
    public Boolean getIndPessoaFisica() {
        return this.indPessoaFisica;
    }
    
    public void setIndPessoaFisica(Boolean indPessoaFisica) {
        this.indPessoaFisica = indPessoaFisica;
    }
    public boolean isIndAposentado() {
        return this.indAposentado;
    }
    
    public void setIndAposentado(boolean indAposentado) {
        this.indAposentado = indAposentado;
    }
    public boolean isIndQtde() {
        return this.indQtde;
    }
    
    public void setIndQtde(boolean indQtde) {
        this.indQtde = indQtde;
    }
    public boolean isIndUtilizaSerie() {
        return this.indUtilizaSerie;
    }
    
    public void setIndUtilizaSerie(boolean indUtilizaSerie) {
        this.indUtilizaSerie = indUtilizaSerie;
    }
    public boolean isIndAlteraPreco() {
        return this.indAlteraPreco;
    }
    
    public void setIndAlteraPreco(boolean indAlteraPreco) {
        this.indAlteraPreco = indAlteraPreco;
    }
    public String getFlagVinculado() {
        return this.flagVinculado;
    }
    
    public void setFlagVinculado(String flagVinculado) {
        this.flagVinculado = flagVinculado;
    }
    public boolean isIndDevolucao() {
        return this.indDevolucao;
    }
    
    public void setIndDevolucao(boolean indDevolucao) {
        this.indDevolucao = indDevolucao;
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
    public Boolean getIndVendaAvulsa() {
        return this.indVendaAvulsa;
    }
    
    public void setIndVendaAvulsa(Boolean indVendaAvulsa) {
        this.indVendaAvulsa = indVendaAvulsa;
    }
    public boolean isIndOrganizacao() {
        return this.indOrganizacao;
    }
    
    public void setIndOrganizacao(boolean indOrganizacao) {
        this.indOrganizacao = indOrganizacao;
    }
    public boolean isIndClassificacaoLoja() {
        return this.indClassificacaoLoja;
    }
    
    public void setIndClassificacaoLoja(boolean indClassificacaoLoja) {
        this.indClassificacaoLoja = indClassificacaoLoja;
    }
    public boolean isIndGrupoLoja() {
        return this.indGrupoLoja;
    }
    
    public void setIndGrupoLoja(boolean indGrupoLoja) {
        this.indGrupoLoja = indGrupoLoja;
    }
    public boolean isIndLoja() {
        return this.indLoja;
    }
    
    public void setIndLoja(boolean indLoja) {
        this.indLoja = indLoja;
    }
    public Short getMaxQtde() {
        return this.maxQtde;
    }
    
    public void setMaxQtde(Short maxQtde) {
        this.maxQtde = maxQtde;
    }
    public Integer getEstoque() {
        return this.estoque;
    }
    
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    public String getFlagIat() {
        return this.flagIat;
    }
    
    public void setFlagIat(String flagIat) {
        this.flagIat = flagIat;
    }
    public String getFlagIppt() {
        return this.flagIppt;
    }
    
    public void setFlagIppt(String flagIppt) {
        this.flagIppt = flagIppt;
    }
    public String getHash1() {
        return this.hash1;
    }
    
    public void setHash1(String hash1) {
        this.hash1 = hash1;
    }
    public String getHash2() {
        return this.hash2;
    }
    
    public void setHash2(String hash2) {
        this.hash2 = hash2;
    }
    public Boolean getIndPermiteOtItem() {
        return this.indPermiteOtItem;
    }
    
    public void setIndPermiteOtItem(Boolean indPermiteOtItem) {
        this.indPermiteOtItem = indPermiteOtItem;
    }
    public Short getMaxDiasDevolucao() {
        return this.maxDiasDevolucao;
    }
    
    public void setMaxDiasDevolucao(Short maxDiasDevolucao) {
        this.maxDiasDevolucao = maxDiasDevolucao;
    }
    public String getHashInc() {
        return this.hashInc;
    }
    
    public void setHashInc(String hashInc) {
        this.hashInc = hashInc;
    }
    public Short getQtdeSugerida() {
        return this.qtdeSugerida;
    }
    
    public void setQtdeSugerida(Short qtdeSugerida) {
        this.qtdeSugerida = qtdeSugerida;
    }
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public Set getJrcPedidoVendaItems() {
        return this.jrcPedidoVendaItems;
    }
    
    public void setJrcPedidoVendaItems(Set jrcPedidoVendaItems) {
        this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }
    public Set getJrcServicoPrecos() {
        return this.jrcServicoPrecos;
    }
    
    public void setJrcServicoPrecos(Set jrcServicoPrecos) {
        this.jrcServicoPrecos = jrcServicoPrecos;
    }




}


