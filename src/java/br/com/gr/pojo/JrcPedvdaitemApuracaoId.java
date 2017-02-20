package br.com.gr.pojo;
// Generated 19/02/2017 12:53:56 by Hibernate Tools 4.3.1



/**
 * JrcPedvdaitemApuracaoId generated by hbm2java
 */
public class JrcPedvdaitemApuracaoId  implements java.io.Serializable {


     private long idPedidoVenda;
     private int seqPedidoVendaItem;
     private int seqPedvdaitemApuracao;

    public JrcPedvdaitemApuracaoId() {
    }

    public JrcPedvdaitemApuracaoId(long idPedidoVenda, int seqPedidoVendaItem, int seqPedvdaitemApuracao) {
       this.idPedidoVenda = idPedidoVenda;
       this.seqPedidoVendaItem = seqPedidoVendaItem;
       this.seqPedvdaitemApuracao = seqPedvdaitemApuracao;
    }
   
    public long getIdPedidoVenda() {
        return this.idPedidoVenda;
    }
    
    public void setIdPedidoVenda(long idPedidoVenda) {
        this.idPedidoVenda = idPedidoVenda;
    }
    public int getSeqPedidoVendaItem() {
        return this.seqPedidoVendaItem;
    }
    
    public void setSeqPedidoVendaItem(int seqPedidoVendaItem) {
        this.seqPedidoVendaItem = seqPedidoVendaItem;
    }
    public int getSeqPedvdaitemApuracao() {
        return this.seqPedvdaitemApuracao;
    }
    
    public void setSeqPedvdaitemApuracao(int seqPedvdaitemApuracao) {
        this.seqPedvdaitemApuracao = seqPedvdaitemApuracao;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof JrcPedvdaitemApuracaoId) ) return false;
		 JrcPedvdaitemApuracaoId castOther = ( JrcPedvdaitemApuracaoId ) other; 
         
		 return (this.getIdPedidoVenda()==castOther.getIdPedidoVenda())
 && (this.getSeqPedidoVendaItem()==castOther.getSeqPedidoVendaItem())
 && (this.getSeqPedvdaitemApuracao()==castOther.getSeqPedvdaitemApuracao());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getIdPedidoVenda();
         result = 37 * result + this.getSeqPedidoVendaItem();
         result = 37 * result + this.getSeqPedvdaitemApuracao();
         return result;
   }   


}

