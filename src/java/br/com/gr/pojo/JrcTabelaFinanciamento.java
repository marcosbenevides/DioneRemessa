package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcTabelaFinanciamento generated by hbm2java
 */
public class JrcTabelaFinanciamento  implements java.io.Serializable {


     private long idTabelaFinanciamento;
     private JrcConveniada jrcConveniada;
     private JrcOrgao jrcOrgao;
     private JrcEmpresa jrcEmpresa;
     private JrcUsuario jrcUsuario;
     private String descBreve;
     private String descLonga;
     private boolean indGrupoLoja;
     private boolean indTipoCliente;
     private boolean indTcAvista;
     private BigDecimal percTc;
     private BigDecimal tcMin;
     private BigDecimal tcMax;
     private boolean indObrigaProduto;
     private Byte venctoPermitidoDe;
     private Byte venctoPermitidoAte;
     private Byte venctoPreferencialDe;
     private Byte venctoPreferencialAte;
     private boolean indVenctoAniversario;
     private Short venctoIntervalo;
     private BigDecimal vrPrestacaoMin;
     private BigDecimal vrSolicitadoMin;
     private BigDecimal vrSolicitadoMax;
     private String flagValorNf;
     private boolean indReversao;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private boolean indRetencao;
     private boolean indOrganizacao;
     private String codigoRef;
     private String codigo;
     private BigDecimal percOt;
     private BigDecimal otMin;
     private BigDecimal otMax;
     private Boolean indTcReversao;
     private String flagPagtoIof;
     private Boolean indDescontoAntecipacao;
     private Boolean indTaxaAdicional;
     private Boolean indRetiraSrvsegTc;
     private Boolean indSimulador;
     private String flagPagtoOt;
     private Set jrcPlanoFinanciamentos = new HashSet(0);
     private Set jrcPromocaoGerals = new HashSet(0);
     private Set jrcPromocaoItems = new HashSet(0);
     private Set jrcPedidoVendaItems = new HashSet(0);

    public JrcTabelaFinanciamento() {
    }

	
    public JrcTabelaFinanciamento(long idTabelaFinanciamento, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, boolean indGrupoLoja, boolean indTipoCliente, boolean indTcAvista, BigDecimal percTc, boolean indObrigaProduto, boolean indVenctoAniversario, boolean indReversao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indRetencao, boolean indOrganizacao, String codigo) {
        this.idTabelaFinanciamento = idTabelaFinanciamento;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcUsuario = jrcUsuario;
        this.descBreve = descBreve;
        this.indGrupoLoja = indGrupoLoja;
        this.indTipoCliente = indTipoCliente;
        this.indTcAvista = indTcAvista;
        this.percTc = percTc;
        this.indObrigaProduto = indObrigaProduto;
        this.indVenctoAniversario = indVenctoAniversario;
        this.indReversao = indReversao;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.indRetencao = indRetencao;
        this.indOrganizacao = indOrganizacao;
        this.codigo = codigo;
    }
    public JrcTabelaFinanciamento(long idTabelaFinanciamento, JrcConveniada jrcConveniada, JrcOrgao jrcOrgao, JrcEmpresa jrcEmpresa, JrcUsuario jrcUsuario, String descBreve, String descLonga, boolean indGrupoLoja, boolean indTipoCliente, boolean indTcAvista, BigDecimal percTc, BigDecimal tcMin, BigDecimal tcMax, boolean indObrigaProduto, Byte venctoPermitidoDe, Byte venctoPermitidoAte, Byte venctoPreferencialDe, Byte venctoPreferencialAte, boolean indVenctoAniversario, Short venctoIntervalo, BigDecimal vrPrestacaoMin, BigDecimal vrSolicitadoMin, BigDecimal vrSolicitadoMax, String flagValorNf, boolean indReversao, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indRetencao, boolean indOrganizacao, String codigoRef, String codigo, BigDecimal percOt, BigDecimal otMin, BigDecimal otMax, Boolean indTcReversao, String flagPagtoIof, Boolean indDescontoAntecipacao, Boolean indTaxaAdicional, Boolean indRetiraSrvsegTc, Boolean indSimulador, String flagPagtoOt, Set jrcPlanoFinanciamentos, Set jrcPromocaoGerals, Set jrcPromocaoItems, Set jrcPedidoVendaItems) {
       this.idTabelaFinanciamento = idTabelaFinanciamento;
       this.jrcConveniada = jrcConveniada;
       this.jrcOrgao = jrcOrgao;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcUsuario = jrcUsuario;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.indGrupoLoja = indGrupoLoja;
       this.indTipoCliente = indTipoCliente;
       this.indTcAvista = indTcAvista;
       this.percTc = percTc;
       this.tcMin = tcMin;
       this.tcMax = tcMax;
       this.indObrigaProduto = indObrigaProduto;
       this.venctoPermitidoDe = venctoPermitidoDe;
       this.venctoPermitidoAte = venctoPermitidoAte;
       this.venctoPreferencialDe = venctoPreferencialDe;
       this.venctoPreferencialAte = venctoPreferencialAte;
       this.indVenctoAniversario = indVenctoAniversario;
       this.venctoIntervalo = venctoIntervalo;
       this.vrPrestacaoMin = vrPrestacaoMin;
       this.vrSolicitadoMin = vrSolicitadoMin;
       this.vrSolicitadoMax = vrSolicitadoMax;
       this.flagValorNf = flagValorNf;
       this.indReversao = indReversao;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indRetencao = indRetencao;
       this.indOrganizacao = indOrganizacao;
       this.codigoRef = codigoRef;
       this.codigo = codigo;
       this.percOt = percOt;
       this.otMin = otMin;
       this.otMax = otMax;
       this.indTcReversao = indTcReversao;
       this.flagPagtoIof = flagPagtoIof;
       this.indDescontoAntecipacao = indDescontoAntecipacao;
       this.indTaxaAdicional = indTaxaAdicional;
       this.indRetiraSrvsegTc = indRetiraSrvsegTc;
       this.indSimulador = indSimulador;
       this.flagPagtoOt = flagPagtoOt;
       this.jrcPlanoFinanciamentos = jrcPlanoFinanciamentos;
       this.jrcPromocaoGerals = jrcPromocaoGerals;
       this.jrcPromocaoItems = jrcPromocaoItems;
       this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }
   
    public long getIdTabelaFinanciamento() {
        return this.idTabelaFinanciamento;
    }
    
    public void setIdTabelaFinanciamento(long idTabelaFinanciamento) {
        this.idTabelaFinanciamento = idTabelaFinanciamento;
    }
    public JrcConveniada getJrcConveniada() {
        return this.jrcConveniada;
    }
    
    public void setJrcConveniada(JrcConveniada jrcConveniada) {
        this.jrcConveniada = jrcConveniada;
    }
    public JrcOrgao getJrcOrgao() {
        return this.jrcOrgao;
    }
    
    public void setJrcOrgao(JrcOrgao jrcOrgao) {
        this.jrcOrgao = jrcOrgao;
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
    public boolean isIndGrupoLoja() {
        return this.indGrupoLoja;
    }
    
    public void setIndGrupoLoja(boolean indGrupoLoja) {
        this.indGrupoLoja = indGrupoLoja;
    }
    public boolean isIndTipoCliente() {
        return this.indTipoCliente;
    }
    
    public void setIndTipoCliente(boolean indTipoCliente) {
        this.indTipoCliente = indTipoCliente;
    }
    public boolean isIndTcAvista() {
        return this.indTcAvista;
    }
    
    public void setIndTcAvista(boolean indTcAvista) {
        this.indTcAvista = indTcAvista;
    }
    public BigDecimal getPercTc() {
        return this.percTc;
    }
    
    public void setPercTc(BigDecimal percTc) {
        this.percTc = percTc;
    }
    public BigDecimal getTcMin() {
        return this.tcMin;
    }
    
    public void setTcMin(BigDecimal tcMin) {
        this.tcMin = tcMin;
    }
    public BigDecimal getTcMax() {
        return this.tcMax;
    }
    
    public void setTcMax(BigDecimal tcMax) {
        this.tcMax = tcMax;
    }
    public boolean isIndObrigaProduto() {
        return this.indObrigaProduto;
    }
    
    public void setIndObrigaProduto(boolean indObrigaProduto) {
        this.indObrigaProduto = indObrigaProduto;
    }
    public Byte getVenctoPermitidoDe() {
        return this.venctoPermitidoDe;
    }
    
    public void setVenctoPermitidoDe(Byte venctoPermitidoDe) {
        this.venctoPermitidoDe = venctoPermitidoDe;
    }
    public Byte getVenctoPermitidoAte() {
        return this.venctoPermitidoAte;
    }
    
    public void setVenctoPermitidoAte(Byte venctoPermitidoAte) {
        this.venctoPermitidoAte = venctoPermitidoAte;
    }
    public Byte getVenctoPreferencialDe() {
        return this.venctoPreferencialDe;
    }
    
    public void setVenctoPreferencialDe(Byte venctoPreferencialDe) {
        this.venctoPreferencialDe = venctoPreferencialDe;
    }
    public Byte getVenctoPreferencialAte() {
        return this.venctoPreferencialAte;
    }
    
    public void setVenctoPreferencialAte(Byte venctoPreferencialAte) {
        this.venctoPreferencialAte = venctoPreferencialAte;
    }
    public boolean isIndVenctoAniversario() {
        return this.indVenctoAniversario;
    }
    
    public void setIndVenctoAniversario(boolean indVenctoAniversario) {
        this.indVenctoAniversario = indVenctoAniversario;
    }
    public Short getVenctoIntervalo() {
        return this.venctoIntervalo;
    }
    
    public void setVenctoIntervalo(Short venctoIntervalo) {
        this.venctoIntervalo = venctoIntervalo;
    }
    public BigDecimal getVrPrestacaoMin() {
        return this.vrPrestacaoMin;
    }
    
    public void setVrPrestacaoMin(BigDecimal vrPrestacaoMin) {
        this.vrPrestacaoMin = vrPrestacaoMin;
    }
    public BigDecimal getVrSolicitadoMin() {
        return this.vrSolicitadoMin;
    }
    
    public void setVrSolicitadoMin(BigDecimal vrSolicitadoMin) {
        this.vrSolicitadoMin = vrSolicitadoMin;
    }
    public BigDecimal getVrSolicitadoMax() {
        return this.vrSolicitadoMax;
    }
    
    public void setVrSolicitadoMax(BigDecimal vrSolicitadoMax) {
        this.vrSolicitadoMax = vrSolicitadoMax;
    }
    public String getFlagValorNf() {
        return this.flagValorNf;
    }
    
    public void setFlagValorNf(String flagValorNf) {
        this.flagValorNf = flagValorNf;
    }
    public boolean isIndReversao() {
        return this.indReversao;
    }
    
    public void setIndReversao(boolean indReversao) {
        this.indReversao = indReversao;
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
    public boolean isIndRetencao() {
        return this.indRetencao;
    }
    
    public void setIndRetencao(boolean indRetencao) {
        this.indRetencao = indRetencao;
    }
    public boolean isIndOrganizacao() {
        return this.indOrganizacao;
    }
    
    public void setIndOrganizacao(boolean indOrganizacao) {
        this.indOrganizacao = indOrganizacao;
    }
    public String getCodigoRef() {
        return this.codigoRef;
    }
    
    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public BigDecimal getPercOt() {
        return this.percOt;
    }
    
    public void setPercOt(BigDecimal percOt) {
        this.percOt = percOt;
    }
    public BigDecimal getOtMin() {
        return this.otMin;
    }
    
    public void setOtMin(BigDecimal otMin) {
        this.otMin = otMin;
    }
    public BigDecimal getOtMax() {
        return this.otMax;
    }
    
    public void setOtMax(BigDecimal otMax) {
        this.otMax = otMax;
    }
    public Boolean getIndTcReversao() {
        return this.indTcReversao;
    }
    
    public void setIndTcReversao(Boolean indTcReversao) {
        this.indTcReversao = indTcReversao;
    }
    public String getFlagPagtoIof() {
        return this.flagPagtoIof;
    }
    
    public void setFlagPagtoIof(String flagPagtoIof) {
        this.flagPagtoIof = flagPagtoIof;
    }
    public Boolean getIndDescontoAntecipacao() {
        return this.indDescontoAntecipacao;
    }
    
    public void setIndDescontoAntecipacao(Boolean indDescontoAntecipacao) {
        this.indDescontoAntecipacao = indDescontoAntecipacao;
    }
    public Boolean getIndTaxaAdicional() {
        return this.indTaxaAdicional;
    }
    
    public void setIndTaxaAdicional(Boolean indTaxaAdicional) {
        this.indTaxaAdicional = indTaxaAdicional;
    }
    public Boolean getIndRetiraSrvsegTc() {
        return this.indRetiraSrvsegTc;
    }
    
    public void setIndRetiraSrvsegTc(Boolean indRetiraSrvsegTc) {
        this.indRetiraSrvsegTc = indRetiraSrvsegTc;
    }
    public Boolean getIndSimulador() {
        return this.indSimulador;
    }
    
    public void setIndSimulador(Boolean indSimulador) {
        this.indSimulador = indSimulador;
    }
    public String getFlagPagtoOt() {
        return this.flagPagtoOt;
    }
    
    public void setFlagPagtoOt(String flagPagtoOt) {
        this.flagPagtoOt = flagPagtoOt;
    }
    public Set getJrcPlanoFinanciamentos() {
        return this.jrcPlanoFinanciamentos;
    }
    
    public void setJrcPlanoFinanciamentos(Set jrcPlanoFinanciamentos) {
        this.jrcPlanoFinanciamentos = jrcPlanoFinanciamentos;
    }
    public Set getJrcPromocaoGerals() {
        return this.jrcPromocaoGerals;
    }
    
    public void setJrcPromocaoGerals(Set jrcPromocaoGerals) {
        this.jrcPromocaoGerals = jrcPromocaoGerals;
    }
    public Set getJrcPromocaoItems() {
        return this.jrcPromocaoItems;
    }
    
    public void setJrcPromocaoItems(Set jrcPromocaoItems) {
        this.jrcPromocaoItems = jrcPromocaoItems;
    }
    public Set getJrcPedidoVendaItems() {
        return this.jrcPedidoVendaItems;
    }
    
    public void setJrcPedidoVendaItems(Set jrcPedidoVendaItems) {
        this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }




}


