/*    */ package Modele;
/*    */ 
/*    */ public class UO
/*    */ {
/*    */   private String numcentre;
/*    */   private int serietps;
/*    */   private int serieQu;
/*    */   private String ordre;
/*    */ 
/*    */   public UO(String num, int tps, int qu, String ordre)
/*    */   {
/* 12 */     this.numcentre = num;
/* 13 */     this.serietps = tps;
/* 14 */     this.serieQu = qu;
/* 15 */     this.ordre = ordre;
/*    */   }
/*    */ 
/*    */   public String getNumcentre()
/*    */   {
/* 20 */     return this.numcentre;
/*    */   }
/*    */   public int getSerietps() {
/* 23 */     return this.serietps;
/*    */   }
/*    */   public int getSerieQu() {
/* 26 */     return this.serieQu;
/*    */   }
/*    */   public String getOrdre() {
/* 29 */     return this.ordre;
/*    */   }
/*    */ 
/*    */   public void setNumcentre(String numcentre)
/*    */   {
/* 34 */     this.numcentre = numcentre;
/*    */   }
/*    */ 
/*    */   public void setSerietps(int serietps)
/*    */   {
/* 39 */     this.serietps = serietps;
/*    */   }
/*    */ 
/*    */   public void setSerieQu(int serieQu)
/*    */   {
/* 44 */     this.serieQu = serieQu;
/*    */   }
/*    */ 
/*    */   public void setOrdre(String ordre) {
/* 48 */     this.ordre = ordre;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.UO
 * JD-Core Version:    0.6.2
 */