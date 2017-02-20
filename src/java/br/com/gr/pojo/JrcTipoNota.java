package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTipoNota generated by hbm2java
 */
public class JrcTipoNota  implements java.io.Serializable {


     private long idTipoNota;
     private JrcFinConta jrcFinContaByIdFinContaPagto;
     private JrcFinConta jrcFinContaByIdFinContaRecdes;
     private JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfPis;
     private JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfCofins;
     private JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfEstoque;
     private JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfIcmsDr;
     private JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfEstoqueDr;
     private JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNf;
     private JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfIcms;
     private JrcEmpresa jrcEmpresa;
     private JrcModeloNota jrcModeloNota;
     private JrcPrivilegio jrcPrivilegioByIdPrivilegioEmi;
     private JrcPrivilegio jrcPrivilegioByIdPrivilegioCan;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private String flagOperacaoEs;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private String flagTipoNota;
     private String flagEmitente;
     private String flagDestinatario;
     private Boolean indCalcCustoEntrada;
     private String flagMovimentoEstoque;
     private String flagTributacao;
     private String flagValorNf;
     private Boolean indFornecedor;
     private String codigoRef;
     private Boolean indObrPedidoCompra;
     private Boolean indCalcPrecoCompra;
     private String codigoRefDebIcms;
     private String codigoRefCreIcms;
     private String codigoRefDebPis;
     private String codigoRefCrePis;
     private String codigoRefDebCofins;
     private String codigoRefCreCofins;
     private String flagFinContaRecdes;
     private String flagFinContaPagto;
     private String codigoRefDebEstoque;
     private String codigoRefCreEstoque;
     private String codigoRefDebIcmsDr;
     private String codigoRefCreIcmsDr;
     private String codigoRefDebEstoqueDr;
     private String codigoRefCreEstoqueDr;
     private Boolean indAjustaTribEntrada;
     private String flagFinalidade;
     private Set jrcTipoNotaEstoques = new HashSet(0);
     private Set jrcNotaFiscals = new HashSet(0);
     private Set jrcFinLancamentos = new HashSet(0);

    public JrcTipoNota() {
    }

	
    public JrcTipoNota(long idTipoNota, JrcEmpresa jrcEmpresa, JrcModeloNota jrcModeloNota, JrcUsuario jrcUsuario, String descBreve, String flagOperacaoEs, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagTipoNota, String flagFinContaRecdes, String flagFinContaPagto) {
        this.idTipoNota = idTipoNota;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcModeloNota = jrcModeloNota;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.flagOperacaoEs = flagOperacaoEs;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.flagTipoNota = flagTipoNota;
        this.flagFinContaRecdes = flagFinContaRecdes;
        this.flagFinContaPagto = flagFinContaPagto;
    }
    public JrcTipoNota(long idTipoNota, JrcFinConta jrcFinContaByIdFinContaPagto, JrcFinConta jrcFinContaByIdFinContaRecdes, JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfPis, JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfCofins, JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfEstoque, JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfIcmsDr, JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfEstoqueDr, JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNf, JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfIcms, JrcEmpresa jrcEmpresa, JrcModeloNota jrcModeloNota, JrcPrivilegio jrcPrivilegioByIdPrivilegioEmi, JrcPrivilegio jrcPrivilegioByIdPrivilegioCan, JrcUsuario jrcUsuario, String descBreve, String descLonga, String flagOperacaoEs, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String flagTipoNota, String flagEmitente, String flagDestinatario, Boolean indCalcCustoEntrada, String flagMovimentoEstoque, String flagTributacao, String flagValorNf, Boolean indFornecedor, String codigoRef, Boolean indObrPedidoCompra, Boolean indCalcPrecoCompra, String codigoRefDebIcms, String codigoRefCreIcms, String codigoRefDebPis, String codigoRefCrePis, String codigoRefDebCofins, String codigoRefCreCofins, String flagFinContaRecdes, String flagFinContaPagto, String codigoRefDebEstoque, String codigoRefCreEstoque, String codigoRefDebIcmsDr, String codigoRefCreIcmsDr, String codigoRefDebEstoqueDr, String codigoRefCreEstoqueDr, Boolean indAjustaTribEntrada, String flagFinalidade, Set jrcTipoNotaEstoques, Set jrcNotaFiscals, Set jrcFinLancamentos) {
       this.idTipoNota = idTipoNota;
       this.jrcFinContaByIdFinContaPagto = jrcFinContaByIdFinContaPagto;
       this.jrcFinContaByIdFinContaRecdes = jrcFinContaByIdFinContaRecdes;
       this.jrcHistoricoPadraoByIdHstpadNfPis = jrcHistoricoPadraoByIdHstpadNfPis;
       this.jrcHistoricoPadraoByIdHstpadNfCofins = jrcHistoricoPadraoByIdHstpadNfCofins;
       this.jrcHistoricoPadraoByIdHstpadNfEstoque = jrcHistoricoPadraoByIdHstpadNfEstoque;
       this.jrcHistoricoPadraoByIdHstpadNfIcmsDr = jrcHistoricoPadraoByIdHstpadNfIcmsDr;
       this.jrcHistoricoPadraoByIdHstpadNfEstoqueDr = jrcHistoricoPadraoByIdHstpadNfEstoqueDr;
       this.jrcHistoricoPadraoByIdHstpadNf = jrcHistoricoPadraoByIdHstpadNf;
       this.jrcHistoricoPadraoByIdHstpadNfIcms = jrcHistoricoPadraoByIdHstpadNfIcms;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcModeloNota = jrcModeloNota;
       this.jrcPrivilegioByIdPrivilegioEmi = jrcPrivilegioByIdPrivilegioEmi;
       this.jrcPrivilegioByIdPrivilegioCan = jrcPrivilegioByIdPrivilegioCan;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.flagOperacaoEs = flagOperacaoEs;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.flagTipoNota = flagTipoNota;
       this.flagEmitente = flagEmitente;
       this.flagDestinatario = flagDestinatario;
       this.indCalcCustoEntrada = indCalcCustoEntrada;
       this.flagMovimentoEstoque = flagMovimentoEstoque;
       this.flagTributacao = flagTributacao;
       this.flagValorNf = flagValorNf;
       this.indFornecedor = indFornecedor;
       this.codigoRef = codigoRef;
       this.indObrPedidoCompra = indObrPedidoCompra;
       this.indCalcPrecoCompra = indCalcPrecoCompra;
       this.codigoRefDebIcms = codigoRefDebIcms;
       this.codigoRefCreIcms = codigoRefCreIcms;
       this.codigoRefDebPis = codigoRefDebPis;
       this.codigoRefCrePis = codigoRefCrePis;
       this.codigoRefDebCofins = codigoRefDebCofins;
       this.codigoRefCreCofins = codigoRefCreCofins;
       this.flagFinContaRecdes = flagFinContaRecdes;
       this.flagFinContaPagto = flagFinContaPagto;
       this.codigoRefDebEstoque = codigoRefDebEstoque;
       this.codigoRefCreEstoque = codigoRefCreEstoque;
       this.codigoRefDebIcmsDr = codigoRefDebIcmsDr;
       this.codigoRefCreIcmsDr = codigoRefCreIcmsDr;
       this.codigoRefDebEstoqueDr = codigoRefDebEstoqueDr;
       this.codigoRefCreEstoqueDr = codigoRefCreEstoqueDr;
       this.indAjustaTribEntrada = indAjustaTribEntrada;
       this.flagFinalidade = flagFinalidade;
       this.jrcTipoNotaEstoques = jrcTipoNotaEstoques;
       this.jrcNotaFiscals = jrcNotaFiscals;
       this.jrcFinLancamentos = jrcFinLancamentos;
    }
   
    public long getIdTipoNota() {
        return this.idTipoNota;
    }
    
    public void setIdTipoNota(long idTipoNota) {
        this.idTipoNota = idTipoNota;
    }
    public JrcFinConta getJrcFinContaByIdFinContaPagto() {
        return this.jrcFinContaByIdFinContaPagto;
    }
    
    public void setJrcFinContaByIdFinContaPagto(JrcFinConta jrcFinContaByIdFinContaPagto) {
        this.jrcFinContaByIdFinContaPagto = jrcFinContaByIdFinContaPagto;
    }
    public JrcFinConta getJrcFinContaByIdFinContaRecdes() {
        return this.jrcFinContaByIdFinContaRecdes;
    }
    
    public void setJrcFinContaByIdFinContaRecdes(JrcFinConta jrcFinContaByIdFinContaRecdes) {
        this.jrcFinContaByIdFinContaRecdes = jrcFinContaByIdFinContaRecdes;
    }
    public JrcHistoricoPadrao getJrcHistoricoPadraoByIdHstpadNfPis() {
        return this.jrcHistoricoPadraoByIdHstpadNfPis;
    }
    
    public void setJrcHistoricoPadraoByIdHstpadNfPis(JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfPis) {
        this.jrcHistoricoPadraoByIdHstpadNfPis = jrcHistoricoPadraoByIdHstpadNfPis;
    }
    public JrcHistoricoPadrao getJrcHistoricoPadraoByIdHstpadNfCofins() {
        return this.jrcHistoricoPadraoByIdHstpadNfCofins;
    }
    
    public void setJrcHistoricoPadraoByIdHstpadNfCofins(JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfCofins) {
        this.jrcHistoricoPadraoByIdHstpadNfCofins = jrcHistoricoPadraoByIdHstpadNfCofins;
    }
    public JrcHistoricoPadrao getJrcHistoricoPadraoByIdHstpadNfEstoque() {
        return this.jrcHistoricoPadraoByIdHstpadNfEstoque;
    }
    
    public void setJrcHistoricoPadraoByIdHstpadNfEstoque(JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfEstoque) {
        this.jrcHistoricoPadraoByIdHstpadNfEstoque = jrcHistoricoPadraoByIdHstpadNfEstoque;
    }
    public JrcHistoricoPadrao getJrcHistoricoPadraoByIdHstpadNfIcmsDr() {
        return this.jrcHistoricoPadraoByIdHstpadNfIcmsDr;
    }
    
    public void setJrcHistoricoPadraoByIdHstpadNfIcmsDr(JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfIcmsDr) {
        this.jrcHistoricoPadraoByIdHstpadNfIcmsDr = jrcHistoricoPadraoByIdHstpadNfIcmsDr;
    }
    public JrcHistoricoPadrao getJrcHistoricoPadraoByIdHstpadNfEstoqueDr() {
        return this.jrcHistoricoPadraoByIdHstpadNfEstoqueDr;
    }
    
    public void setJrcHistoricoPadraoByIdHstpadNfEstoqueDr(JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfEstoqueDr) {
        this.jrcHistoricoPadraoByIdHstpadNfEstoqueDr = jrcHistoricoPadraoByIdHstpadNfEstoqueDr;
    }
    public JrcHistoricoPadrao getJrcHistoricoPadraoByIdHstpadNf() {
        return this.jrcHistoricoPadraoByIdHstpadNf;
    }
    
    public void setJrcHistoricoPadraoByIdHstpadNf(JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNf) {
        this.jrcHistoricoPadraoByIdHstpadNf = jrcHistoricoPadraoByIdHstpadNf;
    }
    public JrcHistoricoPadrao getJrcHistoricoPadraoByIdHstpadNfIcms() {
        return this.jrcHistoricoPadraoByIdHstpadNfIcms;
    }
    
    public void setJrcHistoricoPadraoByIdHstpadNfIcms(JrcHistoricoPadrao jrcHistoricoPadraoByIdHstpadNfIcms) {
        this.jrcHistoricoPadraoByIdHstpadNfIcms = jrcHistoricoPadraoByIdHstpadNfIcms;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcModeloNota getJrcModeloNota() {
        return this.jrcModeloNota;
    }
    
    public void setJrcModeloNota(JrcModeloNota jrcModeloNota) {
        this.jrcModeloNota = jrcModeloNota;
    }
    public JrcPrivilegio getJrcPrivilegioByIdPrivilegioEmi() {
        return this.jrcPrivilegioByIdPrivilegioEmi;
    }
    
    public void setJrcPrivilegioByIdPrivilegioEmi(JrcPrivilegio jrcPrivilegioByIdPrivilegioEmi) {
        this.jrcPrivilegioByIdPrivilegioEmi = jrcPrivilegioByIdPrivilegioEmi;
    }
    public JrcPrivilegio getJrcPrivilegioByIdPrivilegioCan() {
        return this.jrcPrivilegioByIdPrivilegioCan;
    }
    
    public void setJrcPrivilegioByIdPrivilegioCan(JrcPrivilegio jrcPrivilegioByIdPrivilegioCan) {
        this.jrcPrivilegioByIdPrivilegioCan = jrcPrivilegioByIdPrivilegioCan;
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
    public String getFlagOperacaoEs() {
        return this.flagOperacaoEs;
    }
    
    public void setFlagOperacaoEs(String flagOperacaoEs) {
        this.flagOperacaoEs = flagOperacaoEs;
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
    public String getFlagTipoNota() {
        return this.flagTipoNota;
    }
    
    public void setFlagTipoNota(String flagTipoNota) {
        this.flagTipoNota = flagTipoNota;
    }
    public String getFlagEmitente() {
        return this.flagEmitente;
    }
    
    public void setFlagEmitente(String flagEmitente) {
        this.flagEmitente = flagEmitente;
    }
    public String getFlagDestinatario() {
        return this.flagDestinatario;
    }
    
    public void setFlagDestinatario(String flagDestinatario) {
        this.flagDestinatario = flagDestinatario;
    }
    public Boolean getIndCalcCustoEntrada() {
        return this.indCalcCustoEntrada;
    }
    
    public void setIndCalcCustoEntrada(Boolean indCalcCustoEntrada) {
        this.indCalcCustoEntrada = indCalcCustoEntrada;
    }
    public String getFlagMovimentoEstoque() {
        return this.flagMovimentoEstoque;
    }
    
    public void setFlagMovimentoEstoque(String flagMovimentoEstoque) {
        this.flagMovimentoEstoque = flagMovimentoEstoque;
    }
    public String getFlagTributacao() {
        return this.flagTributacao;
    }
    
    public void setFlagTributacao(String flagTributacao) {
        this.flagTributacao = flagTributacao;
    }
    public String getFlagValorNf() {
        return this.flagValorNf;
    }
    
    public void setFlagValorNf(String flagValorNf) {
        this.flagValorNf = flagValorNf;
    }
    public Boolean getIndFornecedor() {
        return this.indFornecedor;
    }
    
    public void setIndFornecedor(Boolean indFornecedor) {
        this.indFornecedor = indFornecedor;
    }
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public Boolean getIndObrPedidoCompra() {
        return this.indObrPedidoCompra;
    }
    
    public void setIndObrPedidoCompra(Boolean indObrPedidoCompra) {
        this.indObrPedidoCompra = indObrPedidoCompra;
    }
    public Boolean getIndCalcPrecoCompra() {
        return this.indCalcPrecoCompra;
    }
    
    public void setIndCalcPrecoCompra(Boolean indCalcPrecoCompra) {
        this.indCalcPrecoCompra = indCalcPrecoCompra;
    }
    public String getCodigoRefDebIcms() {
        return this.codigoRefDebIcms;
    }
    
    public void setCodigoRefDebIcms(String codigoRefDebIcms) {
        this.codigoRefDebIcms = codigoRefDebIcms;
    }
    public String getCodigoRefCreIcms() {
        return this.codigoRefCreIcms;
    }
    
    public void setCodigoRefCreIcms(String codigoRefCreIcms) {
        this.codigoRefCreIcms = codigoRefCreIcms;
    }
    public String getCodigoRefDebPis() {
        return this.codigoRefDebPis;
    }
    
    public void setCodigoRefDebPis(String codigoRefDebPis) {
        this.codigoRefDebPis = codigoRefDebPis;
    }
    public String getCodigoRefCrePis() {
        return this.codigoRefCrePis;
    }
    
    public void setCodigoRefCrePis(String codigoRefCrePis) {
        this.codigoRefCrePis = codigoRefCrePis;
    }
    public String getCodigoRefDebCofins() {
        return this.codigoRefDebCofins;
    }
    
    public void setCodigoRefDebCofins(String codigoRefDebCofins) {
        this.codigoRefDebCofins = codigoRefDebCofins;
    }
    public String getCodigoRefCreCofins() {
        return this.codigoRefCreCofins;
    }
    
    public void setCodigoRefCreCofins(String codigoRefCreCofins) {
        this.codigoRefCreCofins = codigoRefCreCofins;
    }
    public String getFlagFinContaRecdes() {
        return this.flagFinContaRecdes;
    }
    
    public void setFlagFinContaRecdes(String flagFinContaRecdes) {
        this.flagFinContaRecdes = flagFinContaRecdes;
    }
    public String getFlagFinContaPagto() {
        return this.flagFinContaPagto;
    }
    
    public void setFlagFinContaPagto(String flagFinContaPagto) {
        this.flagFinContaPagto = flagFinContaPagto;
    }
    public String getCodigoRefDebEstoque() {
        return this.codigoRefDebEstoque;
    }
    
    public void setCodigoRefDebEstoque(String codigoRefDebEstoque) {
        this.codigoRefDebEstoque = codigoRefDebEstoque;
    }
    public String getCodigoRefCreEstoque() {
        return this.codigoRefCreEstoque;
    }
    
    public void setCodigoRefCreEstoque(String codigoRefCreEstoque) {
        this.codigoRefCreEstoque = codigoRefCreEstoque;
    }
    public String getCodigoRefDebIcmsDr() {
        return this.codigoRefDebIcmsDr;
    }
    
    public void setCodigoRefDebIcmsDr(String codigoRefDebIcmsDr) {
        this.codigoRefDebIcmsDr = codigoRefDebIcmsDr;
    }
    public String getCodigoRefCreIcmsDr() {
        return this.codigoRefCreIcmsDr;
    }
    
    public void setCodigoRefCreIcmsDr(String codigoRefCreIcmsDr) {
        this.codigoRefCreIcmsDr = codigoRefCreIcmsDr;
    }
    public String getCodigoRefDebEstoqueDr() {
        return this.codigoRefDebEstoqueDr;
    }
    
    public void setCodigoRefDebEstoqueDr(String codigoRefDebEstoqueDr) {
        this.codigoRefDebEstoqueDr = codigoRefDebEstoqueDr;
    }
    public String getCodigoRefCreEstoqueDr() {
        return this.codigoRefCreEstoqueDr;
    }
    
    public void setCodigoRefCreEstoqueDr(String codigoRefCreEstoqueDr) {
        this.codigoRefCreEstoqueDr = codigoRefCreEstoqueDr;
    }
    public Boolean getIndAjustaTribEntrada() {
        return this.indAjustaTribEntrada;
    }
    
    public void setIndAjustaTribEntrada(Boolean indAjustaTribEntrada) {
        this.indAjustaTribEntrada = indAjustaTribEntrada;
    }
    public String getFlagFinalidade() {
        return this.flagFinalidade;
    }
    
    public void setFlagFinalidade(String flagFinalidade) {
        this.flagFinalidade = flagFinalidade;
    }
    public Set getJrcTipoNotaEstoques() {
        return this.jrcTipoNotaEstoques;
    }
    
    public void setJrcTipoNotaEstoques(Set jrcTipoNotaEstoques) {
        this.jrcTipoNotaEstoques = jrcTipoNotaEstoques;
    }
    public Set getJrcNotaFiscals() {
        return this.jrcNotaFiscals;
    }
    
    public void setJrcNotaFiscals(Set jrcNotaFiscals) {
        this.jrcNotaFiscals = jrcNotaFiscals;
    }
    public Set getJrcFinLancamentos() {
        return this.jrcFinLancamentos;
    }
    
    public void setJrcFinLancamentos(Set jrcFinLancamentos) {
        this.jrcFinLancamentos = jrcFinLancamentos;
    }




}


