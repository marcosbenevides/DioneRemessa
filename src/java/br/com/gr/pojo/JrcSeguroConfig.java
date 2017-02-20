package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JrcSeguroConfig generated by hbm2java
 */
public class JrcSeguroConfig  implements java.io.Serializable {


     private long idSeguroConfig;
     private JrcCapitalizacao jrcCapitalizacao;
     private JrcBeneficiario jrcBeneficiario;
     private JrcEmpresa jrcEmpresa;
     private JrcEstipulante jrcEstipulante;
     private JrcSeguradora jrcSeguradora;
     private JrcUsuario jrcUsuario;
     private JrcSubestipulante jrcSubestipulante;
     private JrcCorretora jrcCorretora;
     private String foneSac;
     private String apolice;
     private String susep;
     private Date dtInicioPeriodo;
     private Date dtFimPeriodo;
     private Date dtInclusao;
     private Date dtAlteracao;
     private long versaoSistema;
     private long versaoRegistro;
     private BigDecimal percComissao;
     private String susepInscricao;
     private String foneSinistro;
     private Boolean indOrganizacao;
     private String urlAtivacao;
     private String foneSacEsp;
     private String foneAssist24hr;
     private String foneOuvidoria;
     private String foneSinistroLoc;
     private String foneOuvidoriaEsp;
     private String apolice2;
     private String susep2;
     private String foneSusep;
     private String siteSusep;
     private String emailSac;
     private String emailOuvidoria;
     private String descricao;
     private Set jrcServicoPrecos = new HashSet(0);

    public JrcSeguroConfig() {
    }

	
    public JrcSeguroConfig(long idSeguroConfig, JrcEmpresa jrcEmpresa, JrcEstipulante jrcEstipulante, JrcSeguradora jrcSeguradora, JrcUsuario jrcUsuario, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, String descricao) {
        this.idSeguroConfig = idSeguroConfig;
        this.jrcEmpresa = jrcEmpresa;
        this.jrcEstipulante = jrcEstipulante;
        this.jrcSeguradora = jrcSeguradora;
        this.jrcUsuario = jrcUsuario;
        this.dtInicioPeriodo = dtInicioPeriodo;
        this.dtFimPeriodo = dtFimPeriodo;
        this.dtInclusao = dtInclusao;
        this.dtAlteracao = dtAlteracao;
        this.versaoSistema = versaoSistema;
        this.versaoRegistro = versaoRegistro;
        this.descricao = descricao;
    }
    public JrcSeguroConfig(long idSeguroConfig, JrcCapitalizacao jrcCapitalizacao, JrcBeneficiario jrcBeneficiario, JrcEmpresa jrcEmpresa, JrcEstipulante jrcEstipulante, JrcSeguradora jrcSeguradora, JrcUsuario jrcUsuario, JrcSubestipulante jrcSubestipulante, JrcCorretora jrcCorretora, String foneSac, String apolice, String susep, Date dtInicioPeriodo, Date dtFimPeriodo, Date dtInclusao, Date dtAlteracao, long versaoSistema, long versaoRegistro, BigDecimal percComissao, String susepInscricao, String foneSinistro, Boolean indOrganizacao, String urlAtivacao, String foneSacEsp, String foneAssist24hr, String foneOuvidoria, String foneSinistroLoc, String foneOuvidoriaEsp, String apolice2, String susep2, String foneSusep, String siteSusep, String emailSac, String emailOuvidoria, String descricao, Set jrcServicoPrecos) {
       this.idSeguroConfig = idSeguroConfig;
       this.jrcCapitalizacao = jrcCapitalizacao;
       this.jrcBeneficiario = jrcBeneficiario;
       this.jrcEmpresa = jrcEmpresa;
       this.jrcEstipulante = jrcEstipulante;
       this.jrcSeguradora = jrcSeguradora;
       this.jrcUsuario = jrcUsuario;
       this.jrcSubestipulante = jrcSubestipulante;
       this.jrcCorretora = jrcCorretora;
       this.foneSac = foneSac;
       this.apolice = apolice;
       this.susep = susep;
       this.dtInicioPeriodo = dtInicioPeriodo;
       this.dtFimPeriodo = dtFimPeriodo;
       this.dtInclusao = dtInclusao;
       this.dtAlteracao = dtAlteracao;
       this.versaoSistema = versaoSistema;
       this.versaoRegistro = versaoRegistro;
       this.percComissao = percComissao;
       this.susepInscricao = susepInscricao;
       this.foneSinistro = foneSinistro;
       this.indOrganizacao = indOrganizacao;
       this.urlAtivacao = urlAtivacao;
       this.foneSacEsp = foneSacEsp;
       this.foneAssist24hr = foneAssist24hr;
       this.foneOuvidoria = foneOuvidoria;
       this.foneSinistroLoc = foneSinistroLoc;
       this.foneOuvidoriaEsp = foneOuvidoriaEsp;
       this.apolice2 = apolice2;
       this.susep2 = susep2;
       this.foneSusep = foneSusep;
       this.siteSusep = siteSusep;
       this.emailSac = emailSac;
       this.emailOuvidoria = emailOuvidoria;
       this.descricao = descricao;
       this.jrcServicoPrecos = jrcServicoPrecos;
    }
   
    public long getIdSeguroConfig() {
        return this.idSeguroConfig;
    }
    
    public void setIdSeguroConfig(long idSeguroConfig) {
        this.idSeguroConfig = idSeguroConfig;
    }
    public JrcCapitalizacao getJrcCapitalizacao() {
        return this.jrcCapitalizacao;
    }
    
    public void setJrcCapitalizacao(JrcCapitalizacao jrcCapitalizacao) {
        this.jrcCapitalizacao = jrcCapitalizacao;
    }
    public JrcBeneficiario getJrcBeneficiario() {
        return this.jrcBeneficiario;
    }
    
    public void setJrcBeneficiario(JrcBeneficiario jrcBeneficiario) {
        this.jrcBeneficiario = jrcBeneficiario;
    }
    public JrcEmpresa getJrcEmpresa() {
        return this.jrcEmpresa;
    }
    
    public void setJrcEmpresa(JrcEmpresa jrcEmpresa) {
        this.jrcEmpresa = jrcEmpresa;
    }
    public JrcEstipulante getJrcEstipulante() {
        return this.jrcEstipulante;
    }
    
    public void setJrcEstipulante(JrcEstipulante jrcEstipulante) {
        this.jrcEstipulante = jrcEstipulante;
    }
    public JrcSeguradora getJrcSeguradora() {
        return this.jrcSeguradora;
    }
    
    public void setJrcSeguradora(JrcSeguradora jrcSeguradora) {
        this.jrcSeguradora = jrcSeguradora;
    }
    public JrcUsuario getJrcUsuario() {
        return this.jrcUsuario;
    }
    
    public void setJrcUsuario(JrcUsuario jrcUsuario) {
        this.jrcUsuario = jrcUsuario;
    }
    public JrcSubestipulante getJrcSubestipulante() {
        return this.jrcSubestipulante;
    }
    
    public void setJrcSubestipulante(JrcSubestipulante jrcSubestipulante) {
        this.jrcSubestipulante = jrcSubestipulante;
    }
    public JrcCorretora getJrcCorretora() {
        return this.jrcCorretora;
    }
    
    public void setJrcCorretora(JrcCorretora jrcCorretora) {
        this.jrcCorretora = jrcCorretora;
    }
    public String getFoneSac() {
        return this.foneSac;
    }
    
    public void setFoneSac(String foneSac) {
        this.foneSac = foneSac;
    }
    public String getApolice() {
        return this.apolice;
    }
    
    public void setApolice(String apolice) {
        this.apolice = apolice;
    }
    public String getSusep() {
        return this.susep;
    }
    
    public void setSusep(String susep) {
        this.susep = susep;
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
    public BigDecimal getPercComissao() {
        return this.percComissao;
    }
    
    public void setPercComissao(BigDecimal percComissao) {
        this.percComissao = percComissao;
    }
    public String getSusepInscricao() {
        return this.susepInscricao;
    }
    
    public void setSusepInscricao(String susepInscricao) {
        this.susepInscricao = susepInscricao;
    }
    public String getFoneSinistro() {
        return this.foneSinistro;
    }
    
    public void setFoneSinistro(String foneSinistro) {
        this.foneSinistro = foneSinistro;
    }
    public Boolean getIndOrganizacao() {
        return this.indOrganizacao;
    }
    
    public void setIndOrganizacao(Boolean indOrganizacao) {
        this.indOrganizacao = indOrganizacao;
    }
    public String getUrlAtivacao() {
        return this.urlAtivacao;
    }
    
    public void setUrlAtivacao(String urlAtivacao) {
        this.urlAtivacao = urlAtivacao;
    }
    public String getFoneSacEsp() {
        return this.foneSacEsp;
    }
    
    public void setFoneSacEsp(String foneSacEsp) {
        this.foneSacEsp = foneSacEsp;
    }
    public String getFoneAssist24hr() {
        return this.foneAssist24hr;
    }
    
    public void setFoneAssist24hr(String foneAssist24hr) {
        this.foneAssist24hr = foneAssist24hr;
    }
    public String getFoneOuvidoria() {
        return this.foneOuvidoria;
    }
    
    public void setFoneOuvidoria(String foneOuvidoria) {
        this.foneOuvidoria = foneOuvidoria;
    }
    public String getFoneSinistroLoc() {
        return this.foneSinistroLoc;
    }
    
    public void setFoneSinistroLoc(String foneSinistroLoc) {
        this.foneSinistroLoc = foneSinistroLoc;
    }
    public String getFoneOuvidoriaEsp() {
        return this.foneOuvidoriaEsp;
    }
    
    public void setFoneOuvidoriaEsp(String foneOuvidoriaEsp) {
        this.foneOuvidoriaEsp = foneOuvidoriaEsp;
    }
    public String getApolice2() {
        return this.apolice2;
    }
    
    public void setApolice2(String apolice2) {
        this.apolice2 = apolice2;
    }
    public String getSusep2() {
        return this.susep2;
    }
    
    public void setSusep2(String susep2) {
        this.susep2 = susep2;
    }
    public String getFoneSusep() {
        return this.foneSusep;
    }
    
    public void setFoneSusep(String foneSusep) {
        this.foneSusep = foneSusep;
    }
    public String getSiteSusep() {
        return this.siteSusep;
    }
    
    public void setSiteSusep(String siteSusep) {
        this.siteSusep = siteSusep;
    }
    public String getEmailSac() {
        return this.emailSac;
    }
    
    public void setEmailSac(String emailSac) {
        this.emailSac = emailSac;
    }
    public String getEmailOuvidoria() {
        return this.emailOuvidoria;
    }
    
    public void setEmailOuvidoria(String emailOuvidoria) {
        this.emailOuvidoria = emailOuvidoria;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Set getJrcServicoPrecos() {
        return this.jrcServicoPrecos;
    }
    
    public void setJrcServicoPrecos(Set jrcServicoPrecos) {
        this.jrcServicoPrecos = jrcServicoPrecos;
    }




}

