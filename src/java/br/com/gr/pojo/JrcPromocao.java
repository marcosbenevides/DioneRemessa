package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcPromocao generated by hbm2java
 */
public class JrcPromocao  implements java.io.Serializable {


     private long idPromocao;
     private JrcTipoPromocao jrcTipoPromocao;
     private JrcEmpresa jrcEmpresa;
     private JrcLoja jrcLoja;
     private JrcStatusPromocao jrcStatusPromocao;
     private JrcUsuario jrcUsuarioByIdUsuarioAprovou;
     private JrcUsuario jrcUsuarioByIdUsuarioCriou;
     private String descBreve;
     private String descLonga;
     private boolean indGrupoLoja;
     private boolean indTipoCliente;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private boolean indOrganizacao;
     private boolean indClassificacaoLoja;
     private boolean indLoja;
     private boolean indTipoVenda;
     private boolean indTabfin;
     private String flagEstoquePromocao;
     private Set jrcPedidoVendaItems = new HashSet(0);
     private Set jrcPromocaoItems = new HashSet(0);
     private Set jrcPromocaoGerals = new HashSet(0);

    public JrcPromocao() {
    }

	
    public JrcPromocao(long idPromocao, JrcTipoPromocao jrcTipoPromocao, JrcEmpresa jrcEmpresa, JrcLoja jrcLoja, JrcStatusPromocao jrcStatusPromocao, JrcUsuario jrcUsuarioByIdUsuarioCriou, String descBreve, boolean indGrupoLoja, boolean indTipoCliente, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indOrganizacao, boolean indClassificacaoLoja, boolean indLoja, boolean indTipoVenda, boolean indTabfin) {
        this.idPromocao = idPromocao;
        this.jrcTipoPromocao = jrcTipoPromocao;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcLoja = jrcLoja;
        this.jrcStatusPromocao = jrcStatusPromocao;
        this.jrcUsuarioByIdUsuarioCriou = jrcUsuarioByIdUsuarioCriou;
        this.descBreve = descBreve;
        this.indGrupoLoja = indGrupoLoja;
        this.indTipoCliente = indTipoCliente;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.indOrganizacao = indOrganizacao;
        this.indClassificacaoLoja = indClassificacaoLoja;
        this.indLoja = indLoja;
        this.indTipoVenda = indTipoVenda;
        this.indTabfin = indTabfin;
    }
    public JrcPromocao(long idPromocao, JrcTipoPromocao jrcTipoPromocao, JrcEmpresa jrcEmpresa, JrcLoja jrcLoja, JrcStatusPromocao jrcStatusPromocao, JrcUsuario jrcUsuarioByIdUsuarioAprovou, JrcUsuario jrcUsuarioByIdUsuarioCriou, String descBreve, String descLonga, boolean indGrupoLoja, boolean indTipoCliente, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, boolean indOrganizacao, boolean indClassificacaoLoja, boolean indLoja, boolean indTipoVenda, boolean indTabfin, String flagEstoquePromocao, Set jrcPedidoVendaItems, Set jrcPromocaoItems, Set jrcPromocaoGerals) {
       this.idPromocao = idPromocao;
       this.jrcTipoPromocao = jrcTipoPromocao;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcLoja = jrcLoja;
       this.jrcStatusPromocao = jrcStatusPromocao;
       this.jrcUsuarioByIdUsuarioAprovou = jrcUsuarioByIdUsuarioAprovou;
       this.jrcUsuarioByIdUsuarioCriou = jrcUsuarioByIdUsuarioCriou;
       this.descBreve = descBreve;
       this.descLonga = descLonga;
       this.indGrupoLoja = indGrupoLoja;
       this.indTipoCliente = indTipoCliente;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.indOrganizacao = indOrganizacao;
       this.indClassificacaoLoja = indClassificacaoLoja;
       this.indLoja = indLoja;
       this.indTipoVenda = indTipoVenda;
       this.indTabfin = indTabfin;
       this.flagEstoquePromocao = flagEstoquePromocao;
       this.jrcPedidoVendaItems = jrcPedidoVendaItems;
       this.jrcPromocaoItems = jrcPromocaoItems;
       this.jrcPromocaoGerals = jrcPromocaoGerals;
    }
   
    public long getIdPromocao() {
        return this.idPromocao;
    }
    
    public void setIdPromocao(long idPromocao) {
        this.idPromocao = idPromocao;
    }
    public JrcTipoPromocao getJrcTipoPromocao() {
        return this.jrcTipoPromocao;
    }
    
    public void setJrcTipoPromocao(JrcTipoPromocao jrcTipoPromocao) {
        this.jrcTipoPromocao = jrcTipoPromocao;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcLoja getJrcLoja() {
        return this.jrcLoja;
    }
    
    public void setJrcLoja(JrcLoja jrcLoja) {
        this.jrcLoja = jrcLoja;
    }
    public JrcStatusPromocao getJrcStatusPromocao() {
        return this.jrcStatusPromocao;
    }
    
    public void setJrcStatusPromocao(JrcStatusPromocao jrcStatusPromocao) {
        this.jrcStatusPromocao = jrcStatusPromocao;
    }
    public JrcUsuario getJrcUsuarioByIdUsuarioAprovou() {
        return this.jrcUsuarioByIdUsuarioAprovou;
    }
    
    public void setJrcUsuarioByIdUsuarioAprovou(JrcUsuario jrcUsuarioByIdUsuarioAprovou) {
        this.jrcUsuarioByIdUsuarioAprovou = jrcUsuarioByIdUsuarioAprovou;
    }
    public JrcUsuario getJrcUsuarioByIdUsuarioCriou() {
        return this.jrcUsuarioByIdUsuarioCriou;
    }
    
    public void setJrcUsuarioByIdUsuarioCriou(JrcUsuario jrcUsuarioByIdUsuarioCriou) {
        this.jrcUsuarioByIdUsuarioCriou = jrcUsuarioByIdUsuarioCriou;
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
    public boolean isIndLoja() {
        return this.indLoja;
    }
    
    public void setIndLoja(boolean indLoja) {
        this.indLoja = indLoja;
    }
    public boolean isIndTipoVenda() {
        return this.indTipoVenda;
    }
    
    public void setIndTipoVenda(boolean indTipoVenda) {
        this.indTipoVenda = indTipoVenda;
    }
    public boolean isIndTabfin() {
        return this.indTabfin;
    }
    
    public void setIndTabfin(boolean indTabfin) {
        this.indTabfin = indTabfin;
    }
    public String getFlagEstoquePromocao() {
        return this.flagEstoquePromocao;
    }
    
    public void setFlagEstoquePromocao(String flagEstoquePromocao) {
        this.flagEstoquePromocao = flagEstoquePromocao;
    }
    public Set getJrcPedidoVendaItems() {
        return this.jrcPedidoVendaItems;
    }
    
    public void setJrcPedidoVendaItems(Set jrcPedidoVendaItems) {
        this.jrcPedidoVendaItems = jrcPedidoVendaItems;
    }
    public Set getJrcPromocaoItems() {
        return this.jrcPromocaoItems;
    }
    
    public void setJrcPromocaoItems(Set jrcPromocaoItems) {
        this.jrcPromocaoItems = jrcPromocaoItems;
    }
    public Set getJrcPromocaoGerals() {
        return this.jrcPromocaoGerals;
    }
    
    public void setJrcPromocaoGerals(Set jrcPromocaoGerals) {
        this.jrcPromocaoGerals = jrcPromocaoGerals;
    }




}

